package com.example.woodson.supernews.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Woodson on 2017/11/3.
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {
    private int size;
    public MyViewPagerAdapter(FragmentManager fm,int size) {
        super(fm);
        this.size = size;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position)
        {
            case 0:
               fragment = CommonFragment.newInstance("你好");
                break;
            case 1:
                fragment = CommonFragment.newInstance("北京");
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return size;
    }
}
