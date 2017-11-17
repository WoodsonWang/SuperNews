package com.example.woodson.supernews.View;

import com.example.woodson.supernews.Entity.newsData;

import java.util.List;

/**
 * Created by Woodson on 2017/11/9.
 *
 * 设置新闻界面
 */

public interface NewsView {
    void showDialog();
    void hideDialog();
    void setNews(List<newsData> datas);
}
