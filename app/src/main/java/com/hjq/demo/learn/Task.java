package com.hjq.demo.learn;

import android.util.Log;

public class Task {
    private Callback callback;
    private static final String TAG = "Task";
    public Task(Callback callback) {
        this.callback = callback;
    }

    public void execute() {
        // 模拟任务执行
//        System.out.println("Executing task...");
        Log.d(TAG, "Executing task...");
        // 任务完成后调用回调方法
        if (callback != null) {
            callback.onComplete("Task completed successfully!");
        }
    }
}