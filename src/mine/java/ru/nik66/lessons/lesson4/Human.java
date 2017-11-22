package ru.nik66.lessons.lesson4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
// Несколько ждинериков.
// Ограничение типа T на Numbers (тоесть в T можно записать только потомка number).
public class Human<T extends Number, S, U> {

    private String name;
    private T age;
    private S sex;
    private List<U> basket = new ArrayList<>();

    public Human(String name, T age, S sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    // Джинерик у метода
    // E существует только у метода
    public<E> String print(E[] args) {
        StringBuilder sb = new StringBuilder();
        for (E arg : args) {
            sb.append(arg).append("\n");
        }
        return sb.toString();
    }

    // ограничение джинериков до чисел
    // делаем сравнение по age, для этого на типе age нужно сделать ограничение
    // T extends Nuvber - которое разрешит в T устанавливать только Number типы
    // и у age появится статический метод doubleValue().
    public int compareHuman(Human<T, S, U> tsuHuman) {
        return Double.compare (this.age.doubleValue(), tsuHuman.getAge().doubleValue());
    }

    public void addToBsket(U stuff) {
        basket.add(stuff);
    }

    public U getToBasket(int index) {
        return basket.get(index);
    }


}
