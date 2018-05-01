package ru.ifmo;

import ru.ifmo.logarithm.LogBigFunction;
import ru.ifmo.trigonometry.TrigBigFunction;

public class BigFunction {
    public static double calc(double x){
        if(x > 0){
            return LogBigFunction.calculate(x);
        } else {
            return TrigBigFunction.calculate(x);
        }
    }
}
