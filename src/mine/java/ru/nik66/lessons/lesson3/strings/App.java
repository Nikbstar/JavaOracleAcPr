package ru.nik66.lessons.lesson3.strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        String s1 = "mama mila ramu";

        // сравнить начало или конец строки
        String suffix = "ramu";
        System.out.println(s1.endsWith(suffix));
        String prefix = "ma";
        System.out.println(s1.startsWith(prefix));
        // Сравнить начало со смещением
        s1.startsWith(prefix, 2);

        // Сравнить s1 начиная с 5 символа с s2 начиная с 6 символа, сравнить 3 символа.
        String s2 = "Vasya mil mashinu";
        System.out.println(s1.regionMatches(5, s2, 6, 3));

        // Поиск в строке
        System.out.println(s1.indexOf("mi"));
        // s1.indexOf("mi", 3);
        // s1.lastIndexOf("mi");

        // Разделене по символу пробел (в кавычках список разделителей)
        // !Устарело!
        StringTokenizer st = new StringTokenizer(s1, " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        // Разделение строки на лексемы (в кавычках регулярное выражение)
        String s3 = "3 4 7 2, 44 5";
        Scanner sc = new Scanner(s3).useDelimiter(" ");
        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt() + 2);
        }

        // Разбить строку в массив по регулярному выражению
        String[] strings = s3.split("[ ,]+");
        System.out.println(Arrays.toString(strings));

        String s4 = "mama and papa mili ramu";

        Pattern pattern = Pattern.compile("[mp]a[mp]a");

    }

}
