package ru.ifmo.trigonometry.test;

import static ru.ifmo.trigonometry.Cos.cos;
import static ru.ifmo.trigonometry.Sin.sin;

public class TanTest {
    public static double tan(double x) {
        return sin(x)/cos(x);
    }
}
