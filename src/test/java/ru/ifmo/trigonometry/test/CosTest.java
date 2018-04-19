package ru.ifmo.trigonometry.test;

import static java.lang.StrictMath.sin;

public class CosTest {
    public static double cos(double x) {
        return sin(x + Math.PI/2);
    }
}
