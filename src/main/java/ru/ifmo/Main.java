package ru.ifmo;

import ru.ifmo.logarithm.Ln;
import ru.ifmo.logarithm.Log;
import ru.ifmo.logarithm.LogBigFunction;
import ru.ifmo.trigonometry.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Writer writer = new Writer("main.csv");

        while(true) {
            printMenu();
            int option = sc.nextInt();
            Integer fn = option;

            double[] borders = new double[3];
            System.out.println("\nEnter min:");
            borders[0] = sc.nextDouble();
            System.out.println("\nEnter max:");
            borders[1] = sc.nextDouble();
            System.out.println("\nEnter step:");
            borders[2] = sc.nextDouble();
            double min = borders[0], max = borders[1], step = borders[2];
            Double y;
            for (double x = min; x <= max; x += step) {
                y = calculate(fn, x);
                if (y != null) {
                    writer.write(x, y);
                    System.out.println("x = " + x + "\ty = " + y);
                }
            }
            writer.close();
        }

    }

    static private void printMenu() {
        System.out.println("\nEnter number of the function: ");
        System.out.println("1. Ln(x)");
        System.out.println("2. Log_2(x)");
        System.out.println("3. Log_3(x)");
        System.out.println("4. Log_5(x)");
        System.out.println("5. Log_10(x)");
        System.out.println("6. Logarithmic_expression(x)");

        System.out.println("7. Sin(x)");
        System.out.println("8. Cos(x)");
        System.out.println("9. Tan(x)");
        System.out.println("10. Cot(x)");
        System.out.println("11. Csc(x)");
        System.out.println("12. Trigeometric_expression(x)");

        System.out.println("13. Final_system(x)");
    }

    static private Double calculate(int fn, Double x) {
        switch (fn) {
            case 1:     return Ln.ln(x);
            case 2:     return Log.log(x, 2);
            case 3:     return Log.log(x, 3);
            case 4:     return Log.log(x,5);
            case 5:     return Log.log(x,10);
            case 6:     return LogBigFunction.calculate(x);

            case 7:     return Sin.sin(x);
            case 8:     return Cos.cos(x);
            case 9:     return Tan.tan(x);
            case 10:     return Cot.cot(x);
            case 11:     return Csc.csc(x);
            case 12:    return TrigBigFunction.calculate(x);

            case 13:    return BigFunction.calc(x);

            default:    return null;
        }
    }
}
