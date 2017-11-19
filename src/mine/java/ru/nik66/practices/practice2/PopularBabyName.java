package ru.nik66.practices.practice2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class PopularBabyName {

    private int num;
    private String maleName;
    private String femaleName;

}
