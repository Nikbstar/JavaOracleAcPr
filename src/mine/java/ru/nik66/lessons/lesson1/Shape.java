package ru.nik66.lessons.lesson1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Shape {

    // static nested class
    // Использование lombok для создания стандартных методов
    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    public static class Color {

        private int r;
        private int g;
        private int b;

    }

}
