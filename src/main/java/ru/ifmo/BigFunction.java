package ru.ifmo;

import static ru.ifmo.logarithm.Log.log;
import static ru.ifmo.trigonometry.Cos.cos;
import static ru.ifmo.trigonometry.Cot.cot;
import static ru.ifmo.trigonometry.Csc.csc;
import static ru.ifmo.trigonometry.Sin.sin;
import static ru.ifmo.trigonometry.Tan.tan;

public class BigFunction {
    public static double calc(double x){
        if(x > 0){
            return logPart(x);
        } else {
            return trigPart(x);
        }
    }

    private static double logPart(double x){
        return (
                (
                        (
                                (
                                        log(x, 2) - log(x, 5)
                                ) - log(x, 5)
                        ) + log(x, 10)
                ) + (
                        log(x,10)/log(x, 10)
                )
        ) + (
                log(x, 2) * (
                        log(x, 2) - log(x, 3)
                )
        );
    }

    private static double trigPart(double x){
        return (((Math.pow((sin(x) / tan(x)),2)) * sin(x)) + tan(x)) * ((cot(x) - cos(x)) * csc(x));
    }
}
