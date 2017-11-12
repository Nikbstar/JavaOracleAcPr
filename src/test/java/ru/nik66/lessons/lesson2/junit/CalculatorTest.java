package ru.nik66.lessons.lesson2.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    // Данное действие будет выполняться перед каждым тестом
    @Before
    public void initCalculator() {
        calculator = new Calculator();
    }

    // Действие, которое будет выполняться после каждого теста
    @After
    public void delCalculator() {
        calculator = null;
    }

    @Test
    public void dev() throws Exception {
        // Заглушка для пустого теста
        //fail();

        int actual = calculator.dev(4, 2);
        int expected = 2;
        assertEquals("CalculatorTest.dev()", expected, actual);
    }

    // Тест на выброс исключения
    @Test (expected = ArithmeticException.class)
    public void devByZero() throws Exception {
        // Заглушка для пустого теста
        //fail();

        calculator.dev(4, 0);
    }

    @Test
    public void sum() throws Exception {
        int actual = calculator.sum(2, 3);
        int expected = 5;
        assertEquals("CalculatorTest.sum()", expected, actual);
    }

}