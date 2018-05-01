package ru.ifmo.trigonometry.test;

import org.junit.Test;
import ru.ifmo.trigonometry.Sin;

import static org.junit.Assert.assertEquals;

public class SinTest {
    private static final double EPS = 1e-5;


    @Test
    public void testSin(){
        assertEquals("-8.027", Math.sin(-8.027), Sin.sin(-8.027), EPS);
        assertEquals("-3.627108", Math.sin(-3.627108), Sin.sin(-3.627108), EPS);
        assertEquals("-1.743824", Math.sin(-1.743824), Sin.sin(-1.743824), EPS);
    }
}
