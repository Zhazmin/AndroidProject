package com.hjq.demo.learn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hjq.demo.R;


public class MyFragment extends Fragment {
    private String text;
    private View view;
    public MyFragment(Bundle bundle) {
        text=bundle.getString("text");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // 加载 Fragment 的布局文件
        view = inflater.inflate(R.layout.fragment_my, container, false);
        // 获取 TextView 并修改文字
        TextView textView = view.findViewById(R.id.textView);
        textView.setText(text);
        return view;
    }
}