package ru.nik66.practices.practice2;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Parser.popularBabyNamesParser("PopularBabyNamesTop100.htm", "utf-8").forEach(System.out::println);

        Parser.notebooksParser("Notebooks.htm", "utf-8").forEach(System.out::println);

        //List<Notebook> notebooks = Parser.notebooksParser("Notebooks.htm", "utf-8");
        //for (Notebook notebook : notebooks) {
        //    System.out.println("Model: " + notebook.getModel() + " Price: " + notebook.getPrice());
        //}

    }

}
