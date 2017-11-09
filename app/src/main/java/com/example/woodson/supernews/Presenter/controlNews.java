package com.example.woodson.supernews.Presenter;

import com.example.woodson.supernews.Module.getNews;
import com.example.woodson.supernews.Module.getNewsNow;
import com.example.woodson.supernews.View.NewsView;

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
    public void getNews(){
        newsView.showDialog();
        getNews.loadNews("",this);
    }

    @Override
    public void Success() {
        newsView.hideDialog();
        //设置界面的操作
    }

    @Override
    public void Error() {

    }
}
