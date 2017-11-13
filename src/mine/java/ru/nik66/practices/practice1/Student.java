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

    public void removeExam(Exam exam) throws NoExamExpension {
        for (int i = 0; i < exams.size(); i++) {
            if (exams.get(i) == exam) {
                exams.remove(i);
                return;
            }
        }
        throw new NoExamExpension("Student don't have that exam.");
    }

    public int maxEval(String subjectTitle) {
        int result = 0;
        for (Exam exam : exams) {
            if (exam.getSubjectTitle() == subjectTitle && exam.getEvaluation() > result) {
                result = exam.getEvaluation();
            }
        }
        return result;
    }

    public int countExamsByEval(int eval) {
        int result = 0;
        for (Exam exam : exams) {
            if (exam.getEvaluation() == eval) {
                result++;
            }
        }
        return result;
    }

    public double avgEval(Date date) {
        double result = 0.;
        int check = 0;
        for (Exam exam : exams) {
            if (exam.getDate().equals(date)) {
                result += exam.getEvaluation();
                check++;
            }
        }
        return result / check;
    }

    public Student(String name, String fam, Group group) {
        setName(name);
        setFam(fam);
        setGroup(group);
    }

}

