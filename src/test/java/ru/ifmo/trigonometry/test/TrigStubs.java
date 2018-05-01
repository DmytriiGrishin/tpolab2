package ru.ifmo.trigonometry.test;

import org.powermock.api.mockito.PowerMockito;
import ru.ifmo.trigonometry.*;

import static org.mockito.Mockito.when;

public class TrigStubs {

    public static void mockSin(){
        PowerMockito.mockStatic(Sin.class);

        when(Sin.sin(-8.027)).thenReturn(Math.sin(-8.027));
        when(Sin.sin(-3.627108)).thenReturn(Math.sin(-3.627108));
        when(Sin.sin(-1.743824)).thenReturn(Math.sin(-1.743824));
    }

    public static void mockCos(){
        PowerMockito.mockStatic(Cos.class);

        when(Cos.cos(-8.027)).thenReturn(Math.cos(-8.027));
        when(Cos.cos(-3.627108)).thenReturn(Math.cos(-3.627108));
        when(Cos.cos(-1.743824)).thenReturn(Math.cos(-1.743824));
    }

    public static void mockTan(){
        PowerMockito.mockStatic(Tan.class);

        when(Tan.tan(-8.027)).thenReturn(Math.tan(-8.027));
        when(Tan.tan(-3.627108)).thenReturn(Math.tan(-3.627108));
        when(Tan.tan(-1.743824)).thenReturn(Math.tan(-1.743824));
    }
    
    public static void mockCot(){
        PowerMockito.mockStatic(Cot.class);

        when(Cot.cot(-8.027)).thenReturn(Math.cos(-8.027)/Math.sin(-8.027));
        when(Cot.cot(-3.627108)).thenReturn(Math.cos(-3.627108)/Math.sin(-3.627108));
        when(Cot.cot(-1.743824)).thenReturn(Math.cos(-1.743824)/Math.sin(-1.743824));
    }

    public static void mockCsc(){
        PowerMockito.mockStatic(Csc.class);

        when(Csc.csc(-8.027)).thenReturn(1/Math.sin(-8.027));
        when(Csc.csc(-3.627108)).thenReturn(1/Math.sin(-3.627108));
        when(Csc.csc(-1.743824)).thenReturn(1/Math.sin(-1.743824));
    }
}
