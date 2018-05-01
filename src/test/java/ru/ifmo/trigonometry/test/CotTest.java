package ru.ifmo.trigonometry.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ru.ifmo.trigonometry.Cos;
import ru.ifmo.trigonometry.Cot;
import ru.ifmo.trigonometry.Sin;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Sin.class, Cos.class})
public class CotTest {

    private static final double EPS = 1e-5;

    @Test
    public void testAllStubs(){
        TrigStubs.mockSin();
        TrigStubs.mockCos();

        mainTestScenario();
    }

    @Test
    public void testSinStub(){
        TrigStubs.mockSin();

        mainTestScenario();
    }

    @Test
    public void testCosStub(){
        TrigStubs.mockCos();

        mainTestScenario();
    }

    @Test
    public void testNonStubbed(){
        mainTestScenario();
    }

    private void mainTestScenario(){
        assertEquals("-8.027", Math.cos(-8.027)/Math.sin(-8.027), Cot.cot(-8.027), EPS);
        assertEquals("-3.627108", Math.cos(-3.627108)/Math.sin(-3.627108), Cot.cot(-3.627108), EPS);
        assertEquals("-1.743824", Math.cos(-1.743824)/Math.sin(-1.743824), Cot.cot(-1.743824), EPS);
    }
}
