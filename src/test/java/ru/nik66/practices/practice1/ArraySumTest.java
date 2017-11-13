package ru.nik66.practices.practice1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumTest {

    public double[] arrayDoubles;
    public static double DELTA = 0.000001d;

    @Before
    public void arrayInit() {
        arrayDoubles = new double[]{2., 1.5};
    }

    @Test
    public void whenAddArrayToStaticSumThenReturnArraySum() throws Exception {
        double actual = ArraySum.sum(arrayDoubles);
        double expected = 3.5d;
        assertEquals("whenAddArrayToStaticSumThenReturnArraySum", expected, actual, DELTA);
    }

    @Test
    public void whenAddArrayInConstructorAndUseSumThenReturnArraySum() throws Exception {
        ArraySum as = new ArraySum(arrayDoubles);
        double actual = as.sum();
        double expected = 3.5d;
        assertEquals("whenAddArrayInConstructorAndUseSumThenReturnArraySum", expected, actual, DELTA);
    }

    @Test(expected = NullPointerException.class)
    public void whenAddNullInStaticSumThenReturnException() throws Exception {
        ArraySum.sum(null);
    }

}