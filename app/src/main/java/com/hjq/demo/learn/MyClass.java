package com.hjq.demo.learn;

import android.util.Log;

public class MyClass implements MyInterface {
    private static final String TAG = "MyClass";
    @Override
    public void myMethod() {
//        System.out.println("Method implemented");
        Log.d(TAG, "Method implemented ");
    }

}
