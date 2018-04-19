package ru.ifmo.trigonometry;

import static java.lang.StrictMath.sin;

public class Cos {
    public static double cos(double x) {
        return sin(x + Math.PI/2);
    }
}
