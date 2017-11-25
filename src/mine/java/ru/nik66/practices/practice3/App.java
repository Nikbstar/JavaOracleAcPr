package ru.nik66.practices.practice3;

public class App {

    public static void main(String[] args) {
        GenericStorage<Integer, User> userGenericStorage = new GenericStorageAutoIncrement<>();

        userGenericStorage.add(new User("Kolya", "kolya", "1234567", Role.ADMIN));
        userGenericStorage.add(new User("Katya", "katya", "1234567", Role.USER));

        for (GenericStorage.Node<Integer, User> integerUserNode : userGenericStorage) {
            System.out.println(integerUserNode);
        }
    }
    // TODO: Законить объекты, связи между ними и для каждого объекта создать свой GenericStorage
    // TODO: положить туда этот объект, дастать (Создать пять объектов типизированных один юзером,
    // TODO: другой тикетом, третий муви и т.д. (один и тот же класс с разной типизацией).
}
