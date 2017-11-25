package ru.nik66.practices.practice3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Entity<T> {

    private T id;

}
