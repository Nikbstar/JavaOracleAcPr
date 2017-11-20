package ru.nik66.lessons.lesson4;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
// Рекомендации: T - Type, E - Element, K - Key, V- Value, S, U - используются, если есть вторыеБ третьи и более типы.
// Вместо T вставится любой тип, описанный при создании объекта
public class Pair<T> {

   private T key;
   private T value;

}
