package com.hjq.demo.learn;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NaviRecycle extends FragmentStatePagerAdapter {
    List<String> list = new ArrayList<>();

    public NaviRecycle(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
