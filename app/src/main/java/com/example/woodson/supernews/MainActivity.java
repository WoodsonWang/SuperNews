package com.example.woodson.supernews;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.example.woodson.supernews.Adapter.CommonAdapter;
import com.example.woodson.supernews.Adapter.CommonAdapterViewHolder;
import com.example.woodson.supernews.Adapter.MyViewPagerAdapter;

import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageBottomTabLayout;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;

import com.example.woodson.supernews.Entity.newsData;
import com.example.woodson.supernews.Presenter.controlNews;
import com.example.woodson.supernews.View.NewsView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements NewsView{
    private PageNavigationView navigationView;
    private NavigationController controller;
    private ViewPager viewPager;

    private RecyclerView recyclerView;
    private CommonAdapter<newsData> adapter;
    private RequestQueue queue;
    private controlNews controlNews;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        recyclerView = (RecyclerView) findViewById(R.id.recy);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        queue = Volley.newRequestQueue(this);
//        controlNews = new controlNews(this);
//
//        controlNews.getNews(queue);


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

    @Override
    public void showDialog() {

    }

    @Override
    public void hideDialog() {

    }

    @Override
    public void setNews(List<newsData> datas) {
//        adapter = new CommonAdapter<newsData>(this,R.layout.newslistitem,datas) {
//            @Override
//            public void setView(CommonAdapterViewHolder holder, newsData newsData) {
//                TextView category = (TextView) holder.getView(R.id.category);
//                category.setText(newsData.getCategory());
//                TextView title = (TextView) holder.getView(R.id.title);
//                title.setText(newsData.getTitle());
//                ImageView imageView1 = (ImageView) holder.getView(R.id.imageview1);
//                Glide.with(MainActivity.this).load(newsData.getThumbnail_pic_s()).into(imageView1);
//                ImageView imageView2 = (ImageView) holder.getView(R.id.imageview2);
//                Glide.with(MainActivity.this).load(newsData.getThumbnail_pic_s()).into(imageView2);
//                ImageView imageView3 = (ImageView) holder.getView(R.id.imageview3);
//                Glide.with(MainActivity.this).load(newsData.getThumbnail_pic_s()).into(imageView3);
//            }
//
//
//
//        };
//        recyclerView.setAdapter(adapter);
//
    }


}
