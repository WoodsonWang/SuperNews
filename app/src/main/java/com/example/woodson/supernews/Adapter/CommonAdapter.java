package com.example.woodson.supernews.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.woodson.supernews.Entity.newsData;

import java.util.List;

/**
 * Created by Woodson on 2017/11/17.
 */
//定义泛型类
public abstract class CommonAdapter<T> extends RecyclerView.Adapter<CommonAdapterViewHolder> {
    private List<T> datas;
    private View view;
    private Context context;
    private int layoutId;
    public CommonAdapter(Context context,int layoutId,List<T> t){
       this.context = context;
        this.layoutId = layoutId;
        if (null!=datas){
            datas.clear();
        }
        datas = t;


    }
    @Override
    public CommonAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view  = LayoutInflater.from(context).inflate(layoutId,parent,false);
        CommonAdapterViewHolder viewHolder = new CommonAdapterViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CommonAdapterViewHolder holder, int position) {
        setView(holder,datas.get(position));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public  abstract void setView(CommonAdapterViewHolder holder,T t) ;
}
