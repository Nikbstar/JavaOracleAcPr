package ru.nik66.lessons.lesson4;

import lombok.Getter;

public class Buyer<T> {

    private String name;
    private Class<T> clazz;
    private T transport;
    @Getter
    private T[] array;

    public Buyer(String name, Class<T> clazz) {
        this.name = name;
        this.clazz = clazz;
        try {
            transport = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        // Возвращать такой массив нельзя, попытка передать его внаружу приведет к экспшину.
        array = (T[]) new Object[10];
        array[0] = transport;
        for (T t : array) {
            System.out.println(t);
        }
    }


}
