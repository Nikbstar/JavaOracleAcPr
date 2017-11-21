package ru.nik66.lessons.lesson4;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        // В <> указывается generic, который в классе объекта вставит указанный тип в нужных местах
        Pair<String> pair1 = new Pair<>("first", "Kolya");

        // Несколько generic'ов
        Human<Integer, Sex> human1 = new Human<>("Kolya", 25, Sex.MALE);
        Human<String, String> human2 = new Human<>("Katya", "22", "female");

        // Могут быть параметризированные типы параметров
        List<Human<Integer, Sex>> humanList = new ArrayList<>();
        humanList.add(human1);
        // Не подходит
        //humanList.add(human2);

        // Raw type для совместимости с прдыдущими версиями JDK
        Human human3 = new Human("Misga", "mama", 15);

        human1.<String>print(new String[] {"1", "2", "3"});

        // Wildcard
        calculate(new Demo<B>());

    }
    //
    // ? должне быть родителем по отношению к B.
    public static void calculate(Demo<? super B> demo) {

    }

}

class Demo<T> {

}
class A{

}
class B extends A{

}
class C extends B{

}