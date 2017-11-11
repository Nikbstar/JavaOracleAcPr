package ru.nik66.lessons.lesson1;

import lombok.*;

public class Shape {

    // static nested class
    // Использование lombok для создания стандартных методов
    // Так же аннотации можно применять к полям.
    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    @NoArgsConstructor
    static class Color {

        private int r;
        private int g;
        private int b;

    }

}
