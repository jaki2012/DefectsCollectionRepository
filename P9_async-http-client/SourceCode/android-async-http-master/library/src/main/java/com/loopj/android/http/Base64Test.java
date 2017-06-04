package com.loopj.android.http;

import android.test.AndroidTestCase;
import android.test.InstrumentationTestCase;

import org.junit.Test;
import java.lang.String;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import com.loopj.android.http.Base64;
import com.loopj.android.http.Base64.Decoder;

/**
 * Created by admin on 2017/6/2.
 */

public class Base64Test{

    @Test
    public void testenCode (){

        byte[] buffer1= {'a','b','c','d','e','f'};
        String result1="YWJjZGVm\n";
        byte[] output1= Base64.encode(buffer1,0,buffer1.length,Base64.DEFAULT);
        String outputstr1=new String(output1);

        assertEquals(outputstr1,result1);

    }

    @Test
    public void testdeCode (){

        byte[] buffer1= {'Y','W','J','j','Z','G','V','m','\n'};
        String result1="abcdef";
        byte[] output1= Base64.decode(buffer1,0,buffer1.length,Base64.DEFAULT);
        String outputstr1=new String(output1);

        assertEquals(outputstr1,result1);
    }

    @Test
    public void testprocess(){

        byte[] input1={'a','b','c','d','e','f'};
        byte[] output1={'a'};
        Decoder decoder=new Decoder(1,output1);
        boolean result1= decoder.process(input1,0,input1.length,false);

        assertEquals(output1,result1);
    }
}
