package ru.ifmo.trigonometry.test;

import static ru.ifmo.trigonometry.Cos.cos;
import static ru.ifmo.trigonometry.Sin.sin;

public class CotTest {
    public static double cot(double x) {
        return cos(x)/sin(x);
    }
}
