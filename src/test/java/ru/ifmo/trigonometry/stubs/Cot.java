package ru.ifmo.trigonometry.stubs;

import static ru.ifmo.trigonometry.Cos.cos;
import static ru.ifmo.trigonometry.Sin.sin;

public class Cot {
    public static double cot(double x) {
        return cos(x)/sin(x);
    }
}
