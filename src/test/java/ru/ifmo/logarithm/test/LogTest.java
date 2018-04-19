package ru.ifmo.logarithm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.*;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ru.ifmo.logarithm.Ln;

import static org.junit.Assert.assertEquals;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.configuration.ConfigurationType.PowerMock;
import static ru.ifmo.logarithm.Ln.ln;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Ln.class)
public class LogTest {

    private static final double EPS = 1e-5;
    @Test
    public void logStubTest(){
        PowerMockito.mockStatic(Ln.class);

        when(Ln.ln(0)).thenReturn(1.0);
        assertEquals(Ln.ln(0), 1.0, EPS);
    }
}
