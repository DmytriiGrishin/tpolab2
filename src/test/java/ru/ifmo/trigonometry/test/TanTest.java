package ru.ifmo.trigonometry.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ru.ifmo.trigonometry.Cos;
import ru.ifmo.trigonometry.Sin;
import ru.ifmo.trigonometry.Tan;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Sin.class, Cos.class})
public class TanTest {
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
    public void testNoneStubbed(){
        mainTestScenario();
    }

    private void mainTestScenario(){
        assertEquals("-8.027", Math.tan(-8.027), Tan.tan(-8.027), EPS);
        assertEquals("-3.627108", Math.tan(-3.627108), Tan.tan(-3.627108), EPS);
        assertEquals("-1.743824", Math.tan(-1.743824), Tan.tan(-1.743824), EPS);
    }
}
