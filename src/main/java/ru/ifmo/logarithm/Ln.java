package ru.ifmo.logarithm;

import static java.lang.Math.abs;

public class Ln {
    private static final double eps = 0.000001;

    private static final double LN_OF_10 = 2.302585092994045684;

    public static double ln(double x) {
        double sum = 0.0;
        if (x < 0) {
            return Double.NaN;
        }
        if (x == 0) {
            return Double.NEGATIVE_INFINITY;
        }
        if (x == Double.POSITIVE_INFINITY) {
            return x;
        }

        if (x < 2) {
            sum = lnLessOrEquals1(x);
        } else {
            while(x > 1){
                x = x/10;
                sum += ln(x) + LN_OF_10;
            }
        }
        return sum;
    }

    private static double lnLessOrEquals1(double x){
        double sum = 0.0, tmp = 10.0, prev = 11.0;
        x -= 1;
        for ( int i = 1; abs(abs(tmp) - abs(prev)) > eps; i += 2 ) {
            prev = tmp;
            tmp = (Math.pow(x, i)/(double) i - Math.pow(x, i + 1)/(double)(i + 1));
            sum += tmp;
        }
        return sum;
    }
}
