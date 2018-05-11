package ru.ifmo.trigonometry;

import static ru.ifmo.trigonometry.Cos.cos;
import static ru.ifmo.trigonometry.Sin.sin;

public abstract class Tan {
    public static double tan(double x) {
        return sin(x)/cos(x);
    }
}
