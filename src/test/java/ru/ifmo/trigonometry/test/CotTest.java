package ru.ifmo.trigonometry.test;

import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ru.ifmo.trigonometry.Cos;
import ru.ifmo.trigonometry.Sin;

import static ru.ifmo.trigonometry.Cos.cos;
import static ru.ifmo.trigonometry.Sin.sin;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Sin.class, Cos.class})
public class CotTest {

    public void testAllStubs(){
        PowerMockito.mockStatic(Sin.class);
        PowerMockito.mockStatic(Cos.class);

    }

    public void testSinStub(){
        PowerMockito.mockStatic(Sin.class);

    }

    public void testCosStub(){
        PowerMockito.mockStatic(Cos.class);

    }
}
