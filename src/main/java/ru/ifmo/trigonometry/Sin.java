package ru.ifmo.trigonometry;

import java.math.BigDecimal;

import static java.lang.Math.pow;

public class Sin {
    private static final Double EPS = 10e-5;

    private static double factorial(int x) {
        BigDecimal res = BigDecimal.ONE;

        if (x <= 0) return res.doubleValue();

        for (int i = x; i > 0; i--) {
            res = res.multiply(BigDecimal.valueOf(i));
            //System.out.println(res);
        }
        return res.doubleValue();
    }

    public static double sin(Double x) {
        Double sum = 0.0, tmp = 10.0;

        for (int i = 0; Math.abs(tmp) > EPS && i < 15; i++) {
            tmp = pow(-1, i) * pow(x, 2 * i + 1) / factorial(2 * i + 1);
            //System.out.println("fact= " + factorial(2 * i) + " 2i = "+2*i);
            sum += tmp;
        }

        return sum;
    }
}
