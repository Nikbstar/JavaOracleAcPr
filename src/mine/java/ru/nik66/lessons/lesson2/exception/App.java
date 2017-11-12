package ru.nik66.lessons.lesson2.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {
        System.out.println(readConsole());
        System.out.println(readConsole());

        // Проводим ошибку через родительский метод
        System.in.close();
        B b = new B();
        try {
            b.read();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("=============");
            // printStackTrace exception'а причины
            e.getCause().printStackTrace();
        }
    }

    public static String readConsole() {
        String result = null;
        System.out.println("Input string: ");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new UncloseInputStream(System.in)))) {
            result = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}

class A {

    public String read() {
        return "";
    }

}

// Чтобы передать exception, которого нету в родительском методе
// можно его передать обернув в unchecked exception например RuntimeException
class B extends A {

    @Override
    public String read() {
        String result = null;
        System.out.println("Input string: ");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new UncloseInputStream(System.in)))) {
            result = br.readLine();
        } catch (IOException e) {
            // MyReadException extends RuntimeException
            throw new MyReadException(e);
        }
        return result;
    }
}