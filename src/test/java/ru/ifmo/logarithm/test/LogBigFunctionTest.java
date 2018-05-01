package ru.ifmo.logarithm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ru.ifmo.BigFunction;
import ru.ifmo.logarithm.Ln;
import ru.ifmo.logarithm.Log;
import ru.ifmo.logarithm.LogBigFunction;

import static org.junit.Assert.*;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Log.class)
public class LogBigFunctionTest {

    private static final double EPS = 1e-5;

    private void stubLog(){
        PowerMockito.mockStatic(Log.class);

        when(Log.log(0.66174, 2)).thenReturn(-0.595664);
        when(Log.log(0.66174, 5)).thenReturn(-0.256538);
        when(Log.log(0.66174, 3)).thenReturn(-0.375822);
        when(Log.log(0.66174, 10)).thenReturn(-0.179313);
        when(Log.log(0.5, 2)).thenReturn(-1.0);
        when(Log.log(0.5, 5)).thenReturn(-0.430677);
        when(Log.log(0.5, 10)).thenReturn(-0.30103);
        when(Log.log(0.5, 3)).thenReturn(-0.63093);
        when(Log.log(1.2, 2)).thenReturn(0.263034);
        when(Log.log(1.2, 5)).thenReturn(0.113283);
        when(Log.log(1.2, 10)).thenReturn(0.0791812);
        when(Log.log(1.2, 3)).thenReturn(0.165956);
    }

    @Test
    public void testWithLogStub() {
        stubLog();
        mainTestScenarion();
    }

    @Test
    public void testWithoutLogStub() {
        mainTestScenarion();
    }

    private void mainTestScenarion(){
        double result;
        result = LogBigFunction.calculate(0.66174);
        assertEquals("0.66174", 0.869052, result, EPS);
        result = LogBigFunction.calculate(0.5);
        assertEquals("0.5", 0.929393, result, EPS);
        result = LogBigFunction.calculate(1.2);
        assertEquals("1.2", 1.14119, result, EPS);
    }
}