package ru.ifmo.logarithm;

public class Ln {
    private static final int MAX_ITERATIONS = 5000;
    private static final double eps = 0.000001;

    public static double ln(double x) {
        double sum = 0.0, tmp = 10.0;
        if (x < 0) {
            return Double.NaN;
        }
        if (x == 0) {
            return Double.NEGATIVE_INFINITY;
        }
        if (x == Double.POSITIVE_INFINITY) {
            return x;
        }
        if (x <= 2) {
            x -= 1;
            for ( int i = 1; tmp > eps && i < MAX_ITERATIONS; i += 2 ) {
                tmp = (Math.pow(x, i)/(double) i - Math.pow(x, i + 1)/(double)(i + 1));
                sum += tmp;
            }
        } else {
            x = (x / (x - 1));
            for ( int i = 1; tmp > eps && i < MAX_ITERATIONS; i ++ ) {
                tmp = 1.0 / (i * Math.pow(x, i));
                sum += tmp;
            }
        }
        return sum;
    }
}
