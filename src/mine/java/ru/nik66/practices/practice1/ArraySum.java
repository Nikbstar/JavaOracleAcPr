package ru.nik66.practices.practice1;

public class ArraySum {

    private double[] arrayForSum;

    public double sum(){
        return sum(arrayForSum);
    }

    public static double sum(double[] sum) {
        double result = 0;
        for (double v : sum) {
            result += v;
        }
        return result;
    }

    public ArraySum(double[] arrayForSum) {
        this.arrayForSum = arrayForSum;
    }
}
