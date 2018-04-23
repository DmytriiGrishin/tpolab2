package ru.ifmo.trigonometry.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import ru.ifmo.trigonometry.Sin;

import static ru.ifmo.trigonometry.Sin.sin;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Sin.class)
public class CscTest {
    @Test
    public void testWithStub(){
        PowerMockito.mockStatic(Sin.class);

    }
}
