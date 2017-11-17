package com.example.woodson.supernews.Presenter;

import com.android.volley.RequestQueue;
import com.example.woodson.supernews.Entity.newsData;
import com.example.woodson.supernews.Module.getNews;
import com.example.woodson.supernews.Module.getNewsNow;
import com.example.woodson.supernews.View.NewsView;

import java.util.List;

/**
 * Created by Woodson on 2017/11/9.
 */

public class controlNews implements getNewsListener{
    /*Presenter作为中间层，持有View和Model的引用*/
    private getNews getNews;
    private NewsView newsView;

    public controlNews(NewsView newsView){
        this.newsView = newsView;
        getNews = new getNewsNow();
    }

    //该方法可以抽象出来
    //volley访问百度要加 https  =====   http不能访问
    public void getNews(RequestQueue queue){
        newsView.showDialog();
        getNews.loadNews("http://v.juhe.cn/toutiao/index?type=top&key=c28aba04b99502296759f040886eabb2",queue,this);
    }


    @Override
    public void Success(List<newsData> dataList) {
        newsView.setNews(dataList);
    }

    @Override
    public void Error() {

    }
}
