package com.example.woodson.supernews.Module;

import com.android.volley.RequestQueue;
import com.example.woodson.supernews.Presenter.getNewsListener;

/**
 * Created by Woodson on 2017/11/9.
 * 新闻数据的获取
 */
/**
 * http://v.juhe.cn/toutiao/index?type=top&key=c28aba04b99502296759f040886eabb2
 * appkey  c28aba04b99502296759f040886eabb2
 */

public interface getNews {
    void loadNews(String url, RequestQueue queue,getNewsListener listener);
}
