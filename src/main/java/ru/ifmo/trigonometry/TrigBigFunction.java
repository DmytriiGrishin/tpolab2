package ru.ifmo.trigonometry;

import static ru.ifmo.trigonometry.Cos.cos;
import static ru.ifmo.trigonometry.Cot.cot;
import static ru.ifmo.trigonometry.Csc.csc;
import static ru.ifmo.trigonometry.Sin.sin;
import static ru.ifmo.trigonometry.Tan.tan;

public abstract class TrigBigFunction {
    public static double calculate(double x){
        return (((Math.pow((sin(x) / tan(x)),2)) * sin(x)) + tan(x)) * ((cot(x) - cos(x)) * csc(x));
    }
}
