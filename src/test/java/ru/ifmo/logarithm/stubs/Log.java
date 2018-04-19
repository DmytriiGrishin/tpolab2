package ru.ifmo.logarithm.stubs;

import static ru.ifmo.logarithm.Ln.ln;

public class Log {
    public static double log(double x, double base){
        return ln(x) / ln(base);
    }
}
