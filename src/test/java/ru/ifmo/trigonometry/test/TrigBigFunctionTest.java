package ru.ifmo.trigonometry.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ru.ifmo.trigonometry.*;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Sin.class, Cos.class, Tan.class, Cot.class, Csc.class})
public class TrigBigFunctionTest {
    private static final double EPS = 1e-5;

    public void mainTestScenario(){
        assertEquals("-8.027", -2.00487, TrigBigFunction.calculate(-8.027), EPS);
        assertEquals("-3.627108", 0.352202, TrigBigFunction.calculate(-3.627108), EPS);
        assertEquals("-1.743824", -2.00487, TrigBigFunction.calculate(-1.743824), EPS);
    }


    @Test
    public void testAllMocked() {
        TrigStubs.mockSin();
        TrigStubs.mockCos();
        TrigStubs.mockCot();
        TrigStubs.mockCsc();
        TrigStubs.mockTan();

        mainTestScenario();
    }

    @Test
    public void testSinCosCotCscMocked() {
        TrigStubs.mockSin();
        TrigStubs.mockCos();
        TrigStubs.mockCot();
        TrigStubs.mockCsc();
        mainTestScenario();
    }
    @Test
    public void testSinCosCotMocked() {
        TrigStubs.mockSin();
        TrigStubs.mockCos();
        TrigStubs.mockCot();

        mainTestScenario();
    }
    @Test
    public void testSinCosMocked() {
        TrigStubs.mockSin();
        TrigStubs.mockCos();

        mainTestScenario();
    }
    @Test
    public void testSinMocked() {
        TrigStubs.mockSin();

        mainTestScenario();
    }

    @Test
    public void testNonMocked(){

        mainTestScenario();
    }
}