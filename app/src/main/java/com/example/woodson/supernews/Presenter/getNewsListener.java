package com.example.woodson.supernews.Presenter;

import com.example.woodson.supernews.Entity.newsData;

import java.util.List;

/**
 * Created by Woodson on 2017/11/9.
 * 在Presenter层实现，给Model层回调，更改View层的状态，确保Model层不直接操作View层
 */

public interface getNewsListener {
    void Success(List<newsData> dataList);
    void Error();
}
