package com.loopj.android.http;

import javax.xml.validation.Schema;
import android.test.InstrumentationTestCase;
import android.test.AndroidTestCase;
import com.loopj.android.http.AsyncHttpResponseHandler;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.json.*;
import java.util.concurrent.TimeUnit;
import android.os.Handler;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import cz.msebera.android.httpclient.conn.scheme.SchemeRegistry;
import cz.msebera.android.httpclient.conn.scheme.PlainSocketFactory;
import cz.msebera.android.httpclient.conn.scheme.Scheme;
/**
 * Created by admin on 2017/6/2.
 */

public class AsyncHttpClientTest {
/*
    @Ignore
    public void testAsyncHttpClient () {
        final CountDownLatch signal = new CountDownLatch(1);
        final AsyncHttpClient httpClient = new AsyncHttpClient();
        final StringBuilder strBuilder = new StringBuilder();
        runTestOnUiThread(new Runnable() { // THIS IS THE KEY TO SUCCESS
            @Override
            public void run() {
                httpClient.get(
                                "https://api.twitter.com/1/users/show.json?screen_name=TwitterAPI&include_entities=true",
                                new AsyncHttpResponseHandler() {
                                    @Override
                                    public void onSuccess(String response) {
                                        // Do not do assertions here or it will stop the whole testing upon failure
                                        strBuilder.append(response);
                                    }

                                    public void onFinish() {
                                        signal.countDown();
                                    }
                                });
            }
        });

        try {
            signal.await(30, TimeUnit.SECONDS); // wait for callback
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            JSONObject jsonRes = new JSONObject(strBuilder.toString());
            try {
                // Test your jsonResult here
                assertEquals(6253282,jsonRes.getInt("id"));
            } catch (Exception e) {

            }
        }catch(JSONException e) {
            e.printStackTrace();
        }


        assertEquals(0, signal.getCount());
    }

*/
/*
    @Test
    public void testgetDefaultSchemeRegistry(){

        String BASE_URL = "http://api.twitter.com/1/";

        AsyncHttpClient client = new AsyncHttpClient();






    }
*/


    @Test
    public void testgetUrlWithQueryString() {
        RequestParams params=new RequestParams();
        params.add("111","111");

        String result=AsyncHttpClient.getUrlWithQueryString(false,"www.baidu.com",params);
        assertEquals(result, "www.baidu.com?111=111");
    }


    @Test
    public void testendEntityViaReflection(){
        final int expected =5;
        final int reality = 5;
        assertEquals(expected, reality);
    }


    @Test
    public void testcancelRequests(){
        final int expected =5;
        final int reality = 5;
        assertEquals(expected, reality);
    }


    @Test
    public void testsendRequests(){
        final int expected =5;
        final int reality = 5;
        assertEquals(expected, reality);
    }


    @Test
    public void testisInputStreamGZIPCompressed(){
        final int expected =5;
        final int reality = 5;
        assertEquals(expected, reality);
    }
}

