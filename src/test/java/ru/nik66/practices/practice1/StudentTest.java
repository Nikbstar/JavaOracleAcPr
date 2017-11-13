package ru.nik66.practices.practice1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student student;

    @Before
    public void setStudent() {
        student = new Student("Nikolay", "Kotkin", new Group("P-22bn", "IVT"));
    }

    @Test
    public void whenAddExamThenExamAddedInList() throws Exception {
        fail();
    }

    @Test
    public void whenRemoveExamThenExamDeletedFromList() throws Exception {
        fail();
    }

    @Test
    public void whenRemoveWrongExamThenReturnException() throws Exception {
        fail();
    }

    @Test
    public void whenAllSubjectTitleThenReturnMaxEval() throws Exception {
        fail();
    }

}