package ru.nik66.lessons.lesson1;

import java.util.HashMap;
import java.util.Map;

public enum Day {

    // Это объкеты, и этот список и есть вызов конструктора, поэтому в скобочках ставятся аргументы конструктора.
    MONDAY(1), FRIDAY(5), SATURDAY(6);

    // Получить день по номеру, правильный вариант
    private static Map<Integer, Day> dayMap = new HashMap<>();
    static {
        for (Day day : values()) {
            dayMap.put(day.number, day);
        }
    }

    // у каждого из перечисленных выше объектов есть поле number
    private int number;

    // и private или package конструктор, вызывать который нельзя
    Day(int number) {
        setNumber(number);
    }

    // Получить день по номеру (устарелый вариань) медленный
    public static Day getDayByNumberOld(int number) {
        Day result = null;
        for (Day day : values()) {
            if (day.getNumber() == number) {
                result = day;
                break;
            }
        }
        return result;
    }

    public static Day getDayByNumber(int number) {
        return dayMap.get(number);
    }

    @Override
    public String toString() {
        return "Day{" +
                "name=" + name() +
                ", number=" + number +
                '}';
    }

    public int getNumber() {
        return number;
    }

    // Состояние объектв, при необходимости можно менять
    public void setNumber(int number) {
        this.number = number;
    }
}
