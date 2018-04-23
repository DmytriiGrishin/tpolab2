package ru.ifmo;

import org.junit.Test;
import org.junit.runner.RunWith;
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


    private void mockLog(){
        PowerMockito.mockStatic(LogBigFunction.class);
        when(LogBigFunction.calculate(1)).thenReturn(1.444);
    }
    private void mockTrig(){
        PowerMockito.mockStatic(TrigBigFunction.class);
        when(TrigBigFunction.calculate(0)).thenReturn(0.0);
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
        double res = BigFunction.calc(0);
        PowerMockito.verifyStatic(TrigBigFunction.class);
        TrigBigFunction.calculate(0);
        PowerMockito.verifyStatic(LogBigFunction.class, times(0));
        LogBigFunction.calculate(0);
    }
}
