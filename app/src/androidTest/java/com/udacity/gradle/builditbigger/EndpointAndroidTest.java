package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.example.android.joketeller.JokeTeller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

@RunWith(AndroidJUnit4.class)
public class EndpointAndroidTest {

    private Context context;

    @Before
    public void setup() {
        context = InstrumentationRegistry.getContext();
    }

    @Test
    public void testVerifyResponse() throws ExecutionException, InterruptedException {
        AsyncTask<Context, Void, String> task = new EndpointAsyncTask().execute(context);
        String joke = task.get();
        assert joke.equals(JokeTeller.tellJoke());
    }
}
