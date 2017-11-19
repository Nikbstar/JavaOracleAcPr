package ru.nik66.practices.practice2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Notebook {

    private String model;
    private String description;
    private int price;

}
