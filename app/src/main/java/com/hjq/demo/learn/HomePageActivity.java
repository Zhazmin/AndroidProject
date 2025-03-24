package com.hjq.demo.learn;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.gyf.immersionbar.ImmersionBar;
import com.hjq.base.FragmentPagerAdapter;
import com.hjq.demo.R;
import com.hjq.demo.app.AppActivity;
import com.hjq.demo.app.AppFragment;
import com.hjq.demo.manager.ActivityManager;
import com.hjq.demo.other.DoubleClickHelper;
import com.hjq.demo.ui.adapter.NavigationAdapter;
import com.hjq.demo.ui.fragment.FindFragment;
import com.hjq.demo.ui.fragment.HomeFragment;
import com.hjq.demo.ui.fragment.MessageFragment;
import com.hjq.demo.ui.fragment.MineFragment;
import com.hjq.widget.layout.NoScrollViewPager;

import java.util.ArrayList;
import java.util.List;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/AndroidProject
 *    time   : 2018/10/18
 *    desc   : 首页界面
 */
public final class HomePageActivity extends AppActivity
        implements NavigationAdapter.OnNavigationListener {
    private RecyclerView nvRecyclerView;
    private NavigationAdapter NaviRecyclerViewAdapter;
    @Override
    public boolean onNavigationItemSelected(int position) {
        return false;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.home_page_layout;
    }

    @Override
    protected void initView() {
        nvRecyclerView = findViewById(R.id.nv_recycler_view);


        NaviRecyclerViewAdapter = new NavigationAdapter(this);
        nvRecyclerView.setAdapter(NaviRecyclerViewAdapter);
    }

    @Override
    protected void initData() {
        NaviRecyclerViewAdapter.addItem("首页");
        NaviRecyclerViewAdapter.addItem("发现");
        NaviRecyclerViewAdapter.addItem("消息");
        NaviRecyclerViewAdapter.addItem("我的");
    }
}