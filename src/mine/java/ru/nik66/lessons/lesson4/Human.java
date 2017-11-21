package ru.nik66.lessons.lesson4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
// Несколько ждинериков
public class Human<T, S> {

    private String name;
    private T age;
    private S sex;

    public Human(String name, T age, S sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    // Джинерик у метода
    public<T> void print(T[] args) {
        for (T arg : args) {
            System.out.println(arg);
        }
    }

    // ограничение джинериков до чисел
    public<E extends Number> double sum(E[] args) {
        double result = 0;
        for (E arg : args) {
            result += arg.doubleValue();
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human<?, ?> human = (Human<?, ?>) o;

        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        if (age != null ? !age.equals(human.age) : human.age != null) return false;
        return sex != null ? sex.equals(human.sex) : human.sex == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }

}
