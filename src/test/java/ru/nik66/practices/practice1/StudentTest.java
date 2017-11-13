package ru.nik66.practices.practice1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    public static final double DELTA = 0.0000001;
    Student student;

    @Before
    public void setStudent() {
        student = new Student("Nikolay", "Kotkin", new Group("P-22bn", "IVT"));
        student.addExam(new Exam("Русский язык", 4, new Date(1, 1)));
        student.addExam(new Exam("Математика", 5, new Date(1, 1)));
        student.addExam(new Exam("Русский язык", 3, new Date(2, 1)));
        student.addExam(new Exam("Русский язык", 5, new Date(1, 2)));
        student.addExam(new Exam("Математика", 4, new Date(2, 2)));
    }

    @Test
    public void whenAddExamThenExamAddedInList() throws Exception {
        Exam exam = new Exam("Литература", 3, new Date(2, 2));
        student.addExam(exam);
        assertEquals(exam, student.getExams().get(student.getExams().size() - 1));
    }

    @Test
    public void whenRemoveExamThenExamDeletedFromList() throws Exception {
        Exam exam = student.getExams().get(0);
        student.removeExam(exam);
        assertNotEquals(exam, student.getExams().get(0));
    }

    @Test(expected = NoExamExpension.class)
    public void whenRemoveWrongExamThenReturnException() throws Exception {
        Exam exam = new Exam("Литература", 3, new Date(2, 2));
        student.removeExam(exam);
    }

    @Test
    public void whenAllSubjectTitleThenReturnMaxEval() throws Exception {
        int expected = 5;
        int actual = student.maxEval("Русский язык");
        assertEquals("whenAllSubjectTitleThenReturnMaxEval", expected, actual);
    }

    @Test
    public void whenAddEvalReturnCountExams() throws Exception {
        int actual = student.countExamsByEval(5);
        int expected = 2;
        assertEquals("whenAddEvalReturnCountExams", expected, actual);
    }

    @Test
    public void whenAddDateReturnAvgEval() throws Exception {
        double actual = student.avgEval(new Date(1, 1));
        double expected = 4.5;
        assertEquals("whenAddDateReturnAvgEval", expected, actual, DELTA);
    }

}
