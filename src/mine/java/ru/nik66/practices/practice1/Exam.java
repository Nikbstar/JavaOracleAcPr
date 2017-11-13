package ru.nik66.practices.practice1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Exam {

    private String subjectTitle;
    private int evaluation;
    private Date date;

}
