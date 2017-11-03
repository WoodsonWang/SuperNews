package com.example.woodson.supernews;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.woodson.supernews.Adapter.MyViewPagerAdapter;

import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageBottomTabLayout;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;

public class MainActivity extends AppCompatActivity {
    private PageNavigationView navigationView;
    private NavigationController controller;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       navigationView = (PageNavigationView) findViewById(R.id.bottom_viewpager);

        controller = navigationView.material()
                .addItem(R.drawable.main,"首页")
                .addItem(R.drawable.mine,"我的")
                .build();
        //初始化viewpager
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        MyViewPagerAdapter myViewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager(),2);
        viewPager.setAdapter(myViewPagerAdapter);

        //自动适配ViewPager页面切换
       controller.setupWithViewPager(viewPager);

        controller.addTabItemSelectedListener(new OnTabItemSelectedListener() {
           @Override
           public void onSelected(int index, int old) {

           }

           @Override
           public void onRepeat(int index) {

           }
       });

    }
}
