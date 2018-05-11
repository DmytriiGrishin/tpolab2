package ru.ifmo.logarithm;

import static ru.ifmo.logarithm.Ln.ln;

public abstract class Log {
    public static double log(double x, double base){
        return ln(x) / ln(base);
    }
}
