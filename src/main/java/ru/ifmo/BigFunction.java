package ru.ifmo;

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
        return (((Math.pow((sin(x) / tan(x)),2)) * sin(x)) + tan(x)) * ((cot(x) - cos(x)) * csc(x)));
    }

    private static double csc(double x) {
        return 1/sin(x);
    }

    private static double cos(double x) {
        return sin(x + Math.PI/2);
    }

    private static double cot(double x) {
        return cos(x)/sin(x);
    }

    private static double tan(double x) {
        return sin(x)/cos(x);
    }

    private static double sin(double x) {
        //todo write realisation
    }


    private static double log(double x, double base){
        return ln(x) / ln(base);
    }

    private static double ln(double x) {
        //todo write realisation
    }
}
