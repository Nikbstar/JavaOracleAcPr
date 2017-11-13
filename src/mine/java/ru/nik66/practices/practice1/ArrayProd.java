package ru.nik66.practices.practice1;

public class ArrayProd {

    private double[] arrayForProd;

    public double prod(){
        return prod(arrayForProd);
    }

    public static double prod(double[] prod) {
        double result = 1;
        for (double v : prod) {
            result *= v;
        }
        return result;
    }

    public ArrayProd(double[] arrayForProd) {
        this.arrayForProd = arrayForProd;
    }

}
