package ru.nik66.lessons.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

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
        // Чтобы писать сокращенней (просто Color) можно сделать статический импорт
        // в данном случае: import static ru.nik66.lessons.lesson1.Shape.Color;
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

        // Лямбда выражения
        List<String> stringList = new ArrayList<>();
        stringList.add("Sveta");
        stringList.add("Misha");
        stringList.add("Sasha");
        stringList.add("Masha");

        stringList.sort(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        });
        // Меализация метода forEach для перебора элементов ArrayList'а
        stringList.forEach(new Consumer<String>() {
            @Override
            // Каждый элемент помещается в s и с ним выполняется какте то действие
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // То же самое с использованием лямбда выражений
        // Если несколько строк кода, то они берутся в фигурные скобки
        // Если строчка одна, то return добавляется автоматически
        stringList.sort((a, b) -> a.compareTo(b));
        // Если нужно только вызвать один метод, то можно просто указать этот метод в качестве реализации
        stringList.forEach(System.out::println);

        // Enum
        // Есть ссылочная переменная типа данных Day, и ее можно проинициализировать только ограниченным набором значений, которые являются константами.
        Day day1 = Day.MONDAY;
        // Получить имя объекта enum
        System.out.println(day1.name());
        // Обратное действие, получение объекта по имени
        System.out.println(Day.valueOf("MONDAY").getNumber());
        // Получаем день по номеру
        System.out.println(Day.getDayByNumber(5));
        System.out.println(Day.getDayByNumberOld(6));
        // Меняем состояние объекта
        System.out.println(day1);
        day1.setNumber(2);
        System.out.println(day1);
    }

}
