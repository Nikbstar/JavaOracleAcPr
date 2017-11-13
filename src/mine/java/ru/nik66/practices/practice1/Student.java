package ru.nik66.practices.practice1;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Student {

    private String name;
    private String fam;
    private Group group;
    private List<Exam> exams = new ArrayList<>();

    public void addExam(Exam exam) {
        exams.add(exam);
    }

    public void removeExam(Exam exam) {
        // TODO
    }

    public int maxEval(String subjectTitle) {
        // TODO
        return 0;
    }

    public Student(String name, String fam, Group group) {
        setName(name);
        setFam(fam);
        setGroup(group);
    }

}

