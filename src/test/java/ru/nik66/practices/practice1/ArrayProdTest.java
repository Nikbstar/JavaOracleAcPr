package ru.nik66.practices.practice1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayProdTest {

    public double[] arrayDoubles;
    public static double DELTA = 0.000001d;

    @Before
    public void arrayInit() {
        arrayDoubles = new double[]{2., 1.5};
    }

    @Test
    public void whenAddArrayToStaticProdThenReturnArrayProd() throws Exception {
        double actual = ArrayProd.prod(arrayDoubles);
        double expected = 3.;
        assertEquals("whenAddArrayToStaticProdThenReturnArrayProd", expected, actual, DELTA);
    }

    @Test
    public void whenAddArrayInConstructorAndUseProdThenReturnArrayProd() throws Exception {
        ArrayProd ap = new ArrayProd(arrayDoubles);
        double actual = ap.prod();
        double expected = 3.;
        assertEquals("whenAddArrayInConstructorAndUseProdThenReturnArrayProd", expected, actual, DELTA);
    }

    @Test(expected = NullPointerException.class)
    public void whenAddNullInStaticProdThenReturnException() throws Exception {
        ArraySum.sum(null);
    }


}