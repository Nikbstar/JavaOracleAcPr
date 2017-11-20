package ru.nik66.lessons.lesson4;

public class App {

    public static void main(String[] args) {
        // В <> указывается generic, который в классе объекта вставит указанный тип в нужных местах
        Pair<String> pair1 = new Pair<>("first", "Kolya");

        // Несколько generetic'ов
        Human<Integer, Sex> human = new Human<>("Kolya", 25, Sex.MALE);

    }

}
