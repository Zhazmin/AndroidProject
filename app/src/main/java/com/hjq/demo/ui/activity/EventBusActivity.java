package com.hjq.demo.ui.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hjq.demo.R;
import com.hjq.demo.eventbus.MessageEvent;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class EventBusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        // 注册EventBus
        org.greenrobot.eventbus.EventBus.getDefault().register(this);

        // 发布事件
        org.greenrobot.eventbus.EventBus.getDefault().post(new MessageEvent("Hello EventBus!"));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 取消注册EventBus
        org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent event) {
        // 处理接收到的事件
//        Toast.makeText(this, event.getMessage(), Toast.LENGTH_SHORT).show();
    }
}