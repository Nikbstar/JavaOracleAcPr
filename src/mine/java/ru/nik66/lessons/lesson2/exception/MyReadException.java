package ru.nik66.lessons.lesson2.exception;

public class MyReadException extends RuntimeException {
    public MyReadException(Exception e) {
        super(e);
    }
}
