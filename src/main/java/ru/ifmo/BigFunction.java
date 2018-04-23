package ru.ifmo;

import static ru.ifmo.logarithm.Log.log;
import ru.ifmo.logarithm.LogBigFunction;
import static ru.ifmo.trigonometry.Cos.cos;
import static ru.ifmo.trigonometry.Cot.cot;
import static ru.ifmo.trigonometry.Csc.csc;
import static ru.ifmo.trigonometry.Sin.sin;
import static ru.ifmo.trigonometry.Tan.tan;
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
