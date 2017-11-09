package com.example.woodson.supernews.Module;

import com.example.woodson.supernews.Presenter.getNewsListener;

/**
 * Created by Woodson on 2017/11/9.
 * 新闻数据的获取
 */

public interface getNews {
    void loadNews(String url, getNewsListener listener);
}
