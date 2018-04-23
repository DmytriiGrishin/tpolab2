package ru.ifmo.trigonometry.test;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ru.ifmo.trigonometry.Sin;

import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Sin.class)
public class CosTest {

    @Test
    @Ignore
    public void cosStubTest() {
        PowerMockito.mockStatic(Sin.class);
        when(Sin.sin(0.0)).thenReturn(100500.0);

    }

}
