package com.hjq.demo.learn;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.hjq.demo.R;

public class LearnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        // 获取 FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();
        // 开启一个 FragmentTransaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // 创建 Fragment 对象
        Bundle args= new Bundle();
        args.putString("text", "我是左Fragment");
        MyFragment leftFragment = new MyFragment(args);
        // 将 Fragment 添加到容器中
        fragmentTransaction.add(R.id.leftFragment, leftFragment);
        args.putString("text", "我是右Fragment");
        MyFragment rightFragment = new MyFragment(args);
        fragmentTransaction.add(R.id.rightFragment, rightFragment);
        // 提交事务
        fragmentTransaction.commit();
    }
}