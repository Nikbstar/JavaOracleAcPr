package ru.nik66.lessons.lesson6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        copyFileByteStream("text", "copyText");
    }

    private static void copyFileByteStream(String source, String destination) {
        try {
            FileInputStream is = new FileInputStream(source);
            FileOutputStream os = new FileOutputStream(destination);

            int data;
            while((data = is.read()) != -1) {
                os.write(data);
            }
            is.close();
            os.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
