package ru.ifmo.logarithm.test;

import org.junit.Test;
import ru.ifmo.logarithm.Ln;
import ru.ifmo.logarithm.Log;

import static org.junit.Assert.assertEquals;

public class LnTest {
    private static final double EPS = 1e-5;

    public void mainTestScenario(){
        assertEquals("0.66174", Math.log(0.66174), Ln.ln(0.66174), EPS);
        assertEquals("2", Math.log(2), Ln.ln(2), EPS);
        assertEquals("10", Math.log(10), Ln.ln(10), EPS);
        assertEquals("3", Math.log(3), Ln.ln(3), EPS);
        assertEquals("5",  Math.log(5), Ln.ln(5), EPS);
        assertEquals("0.5",  Math.log(0.5), Ln.ln(0.5), EPS);
        assertEquals("1.2", Math.log(1.2), Ln.ln(1.2), EPS);
    }
    @Test
    public void testLn(){
        mainTestScenario();
    }
}
