package com.example.woodson.supernews.Adapter;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

/**
 * Created by Woodson on 2017/11/17.
 */

public class CommonAdapterViewHolder extends RecyclerView.ViewHolder {
    private SparseArray<View> mViews;
    private View mConvertView;

    public CommonAdapterViewHolder(View itemView) {
        super(itemView);
        mViews = new SparseArray<>();
        mConvertView = itemView;
    }

    //通过viewId 获取控件
    public <T extends View> View getView(int viewId){
        View view = mViews.get(viewId);
        if (view==null){
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId,view);
        }
        return view;
    }


}
