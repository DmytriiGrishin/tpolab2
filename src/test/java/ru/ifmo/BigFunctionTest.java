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
import ru.ifmo.trigonometry.Cos;
import ru.ifmo.trigonometry.Csc;
import ru.ifmo.trigonometry.Sin;
import ru.ifmo.trigonometry.TrigBigFunction;
import ru.ifmo.trigonometry.test.TrigStubs;

@RunWith(PowerMockRunner.class)
@PrepareForTest({LogBigFunction.class, TrigBigFunction.class, Sin.class, Cos.class, Csc.class})
public class BigFunctionTest {

    private Writer writer;
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
        writer.write(-8.027, result);
        result = BigFunction.calc(-3.627108);
        assertEquals("-3.627108", 0.352202, result, EPS);
        writer.write(-3.627108, result);
        result = BigFunction.calc(-1.743824);
        assertEquals("-1.743824", -2.00487, result, EPS);
        writer.write(-1.743824, result);


        result = BigFunction.calc(0.66174);
        assertEquals("0.66174", 0.869052, result, EPS);
        writer.write(0.66174, result);
        result = BigFunction.calc(0.5);
        assertEquals("0.5", 0.929393, result, EPS);
        writer.write(0.5, result);
        result = BigFunction.calc(1.2);
        assertEquals("1.2", 1.14119, result, EPS);
        writer.write(1.2, result);
    }

    @Test
    public void testWithAllMocked(){
        writer = new Writer("BigFuncAllMocked.csv");
        mockLog();
        mockTrig();
        mainTestScenario();
        writer.close();
    }

    @Test
    public void testWithLogMocked(){
        writer = new Writer("BigFuncLogMocked.csv");
        mockLog();
        mainTestScenario();
        writer.close();
    }

    @Test
    public void testWithTrigMocked(){
        writer = new Writer("BigFuncTrigMocked.csv");
        mockTrig();
        mainTestScenario();
        writer.close();
    }

    @Test
    public void testWithNoneMocked(){
        writer = new Writer("BigFuncNoneMocked.csv");
        mainTestScenario();
        writer.close();
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


    @Test
    public void graphSinCosCscMocked(){
        TrigStubs.mockSin();
        TrigStubs.mockCos();
        TrigStubs.mockCsc();

        writer = new Writer("graphSinCosCscMocked.csv");
        for (double x = -6; x < 4; x+=0.5){
            double res = BigFunction.calc(x);
            writer.write(x, res);
        }
        double result = BigFunction.calc(-8.027);
        assertEquals("-8.027",-2.00487, result, EPS);
        writer.write(-8.027, result);
        result = BigFunction.calc(-3.627108);
        assertEquals("-3.627108", 0.352202, result, EPS);
        writer.write(-3.627108, result);
        result = BigFunction.calc(-1.743824);
        assertEquals("-1.743824", -2.00487, result, EPS);
        writer.write(-1.743824, result);


        result = BigFunction.calc(0.66174);
        assertEquals("0.66174", 0.869052, result, EPS);
        writer.write(0.66174, result);
        result = BigFunction.calc(0.5);
        assertEquals("0.5", 0.929393, result, EPS);
        writer.write(0.5, result);
        result = BigFunction.calc(1.2);
        assertEquals("1.2", 1.14119, result, EPS);
        writer.write(1.2, result);
        writer.close();
    }
    @Test
    public void graphTrigMocked(){
        mockTrig();
        writer = new Writer("graphTrigMock.csv");
        for (double x = -6; x < 4; x+=0.5){
            double res = BigFunction.calc(x);
            writer.write(x, res);
        }
        double result = BigFunction.calc(-8.027);
        assertEquals("-8.027",-2.00487, result, EPS);
        writer.write(-8.027, result);
        result = BigFunction.calc(-3.627108);
        assertEquals("-3.627108", 0.352202, result, EPS);
        writer.write(-3.627108, result);
        result = BigFunction.calc(-1.743824);
        assertEquals("-1.743824", -2.00487, result, EPS);
        writer.write(-1.743824, result);


        result = BigFunction.calc(0.66174);
        assertEquals("0.66174", 0.869052, result, EPS);
        writer.write(0.66174, result);
        result = BigFunction.calc(0.5);
        assertEquals("0.5", 0.929393, result, EPS);
        writer.write(0.5, result);
        result = BigFunction.calc(1.2);
        assertEquals("1.2", 1.14119, result, EPS);
        writer.write(1.2, result);
        writer.close();
    }


    @Test
    public void graphAllMocked(){
        mockLog();
        mockTrig();
        writer = new Writer("graphAllMock.csv");
        for (double x = -6; x < 4; x+=0.5){
            double res = BigFunction.calc(x);
            writer.write(x, res);
        }
        double result = BigFunction.calc(-8.027);
        assertEquals("-8.027",-2.00487, result, EPS);
        writer.write(-8.027, result);
        result = BigFunction.calc(-3.627108);
        assertEquals("-3.627108", 0.352202, result, EPS);
        writer.write(-3.627108, result);
        result = BigFunction.calc(-1.743824);
        assertEquals("-1.743824", -2.00487, result, EPS);
        writer.write(-1.743824, result);


        result = BigFunction.calc(0.66174);
        assertEquals("0.66174", 0.869052, result, EPS);
        writer.write(0.66174, result);
        result = BigFunction.calc(0.5);
        assertEquals("0.5", 0.929393, result, EPS);
        writer.write(0.5, result);
        result = BigFunction.calc(1.2);
        assertEquals("1.2", 1.14119, result, EPS);
        writer.write(1.2, result);
        writer.close();
    }

}
