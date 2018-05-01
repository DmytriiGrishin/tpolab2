package ru.ifmo.trigonometry.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ru.ifmo.trigonometry.Csc;
import ru.ifmo.trigonometry.Sin;

import static org.junit.Assert.assertEquals;
import static ru.ifmo.trigonometry.Sin.sin;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Sin.class)
public class CscTest {

    private static final double EPS = 1e-5;

    @Test
    public void testWithStub(){
        TrigStubs.mockSin();

        mainTestScenario();
    }

    @Test
    public void testNoneStubbed(){
        mainTestScenario();
    }

    private void mainTestScenario(){
        assertEquals("-8.027", 1/Math.sin(-8.027), Csc.csc(-8.027), EPS);
        assertEquals("-3.627108", 1/Math.sin(-3.627108), Csc.csc(-3.627108), EPS);
        assertEquals("-1.743824", 1/Math.sin(-1.743824), Csc.csc(-1.743824), EPS);
    }
}
