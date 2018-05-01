package ru.ifmo.trigonometry;

import com.sun.xml.internal.ws.api.addressing.AddressingVersion;

import static ru.ifmo.trigonometry.Cos.cos;
import static ru.ifmo.trigonometry.Sin.sin;

public class Tan {
    public static double tan(double x) {
        return sin(x)/cos(x);
    }
}
