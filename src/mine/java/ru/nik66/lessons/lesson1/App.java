package ru.nik66.lessons.lesson1;

import java.util.Arrays;
import java.util.Comparator;

public class App {

    // Константа без значения
    // Контсанту можно проинициализировать при объявлении, в блоке инициализации или во всех конструкторах.
    final int MAX_AGE;
    // Присвоение значения константе в блоке инициализации
    // блок инициализации загружается при создании объекта
    {
        MAX_AGE = 2;
    }

    public static void main(String[] args) {
        // Локальную константу не обяхательно инициилизировать сразу, но её нельзя использовать, пока она не будет проинициилизирована
        final int MIN_AGE;

        // Использование static nested class
        Shape.Color color = new Shape.Color(135, 35, 200);
        System.out.println(color);

        // Использование inner class
        Circle circle = new Circle(25, 15, 12);
        System.out.println(circle);

        // Так нельзя т.к. к вложенному нестатическому классу можно обращаться только через объект внешнего класса
        // Circle.Point point = new Circle.Point(5, 5);
        // Так можно создавать объекты из inner class'a, но так обычно не делают
        Circle.Point point = circle.new Point(5, 5);
        System.out.println(point);
        System.out.println(circle.getCenter());

        // anonymous class
        String[] strings = {"2", "4", "6", "33", "22", "15"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        System.out.println("~~~~~~~~~~~~~~~~");
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                // через int
                //return Integer.parseInt(s) - Integer.parseInt(t1);
                // через double вычитать нельзя
                return Double.compare(Double.parseDouble(s), Double.parseDouble(t1));
            }
        });
        System.out.println(Arrays.toString(strings));

        // Enum
        Day day1 = Day.MONDAY;
        System.out.println(day1.name());
        System.out.println(day1);
        // Меняем состояние объекта
        day1.setNumbet(2);
        System.out.println(day1);


    }

}
