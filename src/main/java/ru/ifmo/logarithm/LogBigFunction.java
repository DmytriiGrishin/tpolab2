package ru.ifmo.logarithm;

import static ru.ifmo.logarithm.Log.log;

public abstract class LogBigFunction {

    public static double calculate(double x){
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
}
