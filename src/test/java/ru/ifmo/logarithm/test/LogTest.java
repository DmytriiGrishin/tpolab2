package ru.ifmo.logarithm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.*;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ru.ifmo.logarithm.Ln;
import ru.ifmo.logarithm.Log;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Ln.class)
public class LogTest {

    private static final double EPS = 1e-5;


    public void stubLn(){
        PowerMockito.mockStatic(Ln.class);

        when(Ln.ln(2)).thenReturn(Math.log(2));
        when(Ln.ln(5)).thenReturn(Math.log(5));
        when(Ln.ln(10)).thenReturn(Math.log(10));
        when(Ln.ln(3)).thenReturn(Math.log(3));
        when(Ln.ln(0.66174)).thenReturn(Math.log(0.66174));
        when(Ln.ln(0.5)).thenReturn(Math.log(0.5));
        when(Ln.ln(1.2)).thenReturn(Math.log(1.2));
    }

    @Test
    public void testWithLnStub(){
        stubLn();
        mainTestScenario();
    }

    @Test
    public void testLog(){
        mainTestScenario();
    }

    public void mainTestScenario(){
        assertEquals("0.66174_2", Log.log(0.66174, 2), -0.595664, EPS);
        assertEquals("0.66174_5", Log.log(0.66174, 5), -0.256538, EPS);
        assertEquals("0.66174_3", Log.log(0.66174, 3), -0.375822, EPS);
        assertEquals("0.66174_10", Log.log(0.66174, 10), -0.179313, EPS);
        assertEquals("0.5_2", Log.log(0.5, 2), -1, EPS);
        assertEquals("0.5_5", Log.log(0.5, 5), -0.430677, EPS);
        assertEquals("0.5_3", Log.log(0.5, 10), -0.30103, EPS);
        assertEquals("0.5_10", Log.log(0.5, 3), -0.63093, EPS);
        assertEquals("1.2_2", Log.log(1.2, 2), Math.log(1.2)/Math.log(2), EPS);
        assertEquals("1.2_5", Log.log(1.2, 5), 0.113283, EPS);
        assertEquals("1.2_10", Log.log(1.2, 10), 0.0791812, EPS);
        assertEquals("1.2_3", Log.log(1.2, 3), 0.165956, EPS);
    }
}
