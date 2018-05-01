package ru.ifmo;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ru.ifmo.logarithm.LogBigFunction;
import ru.ifmo.trigonometry.TrigBigFunction;

@RunWith(PowerMockRunner.class)
@PrepareForTest({LogBigFunction.class, TrigBigFunction.class})
public class BigFunctionTest {

    private static final double EPS = 1e-5;

    private void mockLog(){
        PowerMockito.mockStatic(LogBigFunction.class);
        when(LogBigFunction.calculate(0.66174)).thenReturn(0.869052);
        when(LogBigFunction.calculate(0.5)).thenReturn(0.929393);
        when(LogBigFunction.calculate(1.2)).thenReturn(1.14119);

    }
    private void mockTrig(){
        PowerMockito.mockStatic(TrigBigFunction.class);
        when(TrigBigFunction.calculate(-8.027)).thenReturn(-2.00487);
        when(TrigBigFunction.calculate(-3.627108)).thenReturn(0.352202);
        when(TrigBigFunction.calculate(-1.743824)).thenReturn(-2.00487);

    }

    public void mainTestScenario(){
        double result = BigFunction.calc(-8.027);
        assertEquals("-8.027",-2.00487, result, EPS);
        result = BigFunction.calc(-3.627108);
        assertEquals("-3.627108", 0.352202, result, EPS);
        result = BigFunction.calc(-1.743824);
        assertEquals("-1.743824", -2.00487, result, EPS);
        

        result = BigFunction.calc(0.66174);
        assertEquals("0.66174", 0.869052, result, EPS);
        result = BigFunction.calc(0.5);
        assertEquals("0.5", 0.929393, result, EPS);
        result = BigFunction.calc(1.2);
        assertEquals("1.2", 1.14119, result, EPS);
    }

    @Test
    public void testWithAllMocked(){
        mockLog();
        mockTrig();
        mainTestScenario();
    }

    @Test
    public void testWithLogMocked(){
        mockLog();
        mainTestScenario();
    }

    @Test
    public void testWithTrigMocked(){
        mockTrig();
        mainTestScenario();
    }

    @Test
    public void testRouteForLog(){
        mockLog();
        double res = BigFunction.calc(1);
        PowerMockito.verifyStatic(LogBigFunction.class);
        LogBigFunction.calculate(1);
        PowerMockito.verifyStatic(TrigBigFunction.class, times(0));
        TrigBigFunction.calculate(1);
    }

    @Test
    public void testRouteForTrig(){
        mockTrig();
        double res = BigFunction.calc(-1);
        PowerMockito.verifyStatic(TrigBigFunction.class);
        TrigBigFunction.calculate(-1);
        PowerMockito.verifyStatic(LogBigFunction.class, times(0));
        LogBigFunction.calculate(-1);
    }

}
