package ru.ifmo.trigonometry;

import static ru.ifmo.trigonometry.Sin.sin;

public abstract class Csc {
    public static double csc(double x) {
        return 1/sin(x);
    }
}
