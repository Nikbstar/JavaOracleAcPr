package ru.nik66.lessons.lesson4;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        // В <> указывается generic, который в классе объекта вставит указанный тип в нужных местах
        Pair<String> pair1 = new Pair<>("first", "Kolya");

        // Несколько generic'ов
        // Могут быть параметризированные типы параметров
        Human<Integer, Sex, Pair<String>> human1 = new Human<>("Kolya", 25, Sex.MALE);

        List<Human<Integer, Sex, Pair<String>>> humans = new ArrayList<>();
        humans.add(human1);

        // вызов метода с джинериком.
        // <String> серый, потому что его писать не обязательно.
        System.out.println(human1.<String>print(new String[]{"1", "4", "2"}));

        // Raw type для совместимости с прдыдущими версиями JDK
        // пользоваться raw type'ом не рекомендуется.
        Human human2 = new Human("Misha", 44, 15);
        // Так как на age стоит ограниение Number, строку в него записать нельзя.
        //Human human2 = new Human("Misha", "mama", 15);

        System.out.println(human1.compareHuman(human2));

        // Если джинерики разные, то их нельзя уже будет сравнить, так как это уже будут два разных типа.
        Human<Double, Sex, Pair<String>> human3 = new Human<>("Kolya", 25., Sex.MALE);
        //System.out.println(human1.compareHuman(human3));

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