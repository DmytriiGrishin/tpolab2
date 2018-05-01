package ru.ifmo.trigonometry.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ru.ifmo.trigonometry.Cos;
import ru.ifmo.trigonometry.Sin;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Sin.class)
public class CosTest {

    private static final double EPS = 1e-5;

    @Test
    public void testSinStub() {
        TrigStubs.mockSin();

        mainTestScenario();
    }

    @Test
    public void testNoneStubbed() {
        mainTestScenario();
    }


    private void mainTestScenario(){
        assertEquals("-8.027", Math.cos(-8.027), Cos.cos(-8.027), EPS);
        assertEquals("-3.627108", Math.cos(-3.627108), Cos.cos(-3.627108), EPS);
        assertEquals("-1.743824", Math.cos(-1.743824), Cos.cos(-1.743824), EPS);
    }
}
