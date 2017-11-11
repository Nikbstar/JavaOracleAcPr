package ru.nik66.lessons.lesson1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Circle {

    private Point center;
    private int radius;

    // inner class
    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    public class Point {

        private int x;
        private int y;

    }

    public Circle(int x, int y, int radius) {
        setCenter(new Point(x, y));
        setRadius(radius);
    }

}
