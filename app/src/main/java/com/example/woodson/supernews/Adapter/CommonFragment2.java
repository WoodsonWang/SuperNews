package com.example.woodson.supernews.Adapter;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.example.woodson.supernews.Entity.newsData;
import com.example.woodson.supernews.Presenter.controlNews;
import com.example.woodson.supernews.R;
import com.example.woodson.supernews.View.NewsView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CommonFragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CommonFragment2 extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private TextView textView;
    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerView;
    private CommonAdapter<newsData> adapter;
    private RequestQueue queue;
    private controlNews controlNews;

    public CommonFragment2() {
        // Required empty public constructor
    }

    public static CommonFragment2 newInstance(String param1) {
        CommonFragment2 fragment = new CommonFragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_common, container, false);
        TextView textView = view.findViewById(R.id.news_content);
        textView.setText(mParam1);
        return view;
    }







}
