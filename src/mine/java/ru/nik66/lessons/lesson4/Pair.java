package ru.nik66.lessons.lesson4;

import lombok.*;

@Getter
@Setter
@ToString
// Рекомендации: T - Type, E - Element, K - Key, V- Value, S, U - используются, если есть вторые, третьи и более типы.
// Вместо T вставится любой тип, описанный при создании объекта
public class Pair<T> {

    private T key;
    private T value;

    // Везде подставляется "тип заполнитель", вместо которого подставится параметризирующий тип.
    public Pair(T key, T value) {
        this.key = key;
        this.value = value;
    }
}
