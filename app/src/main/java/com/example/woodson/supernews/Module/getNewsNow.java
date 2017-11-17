package com.example.woodson.supernews.Module;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.woodson.supernews.Entity.newsData;
import com.example.woodson.supernews.Presenter.getNewsListener;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Woodson on 2017/11/9.
 */

public class getNewsNow implements getNews {

    final List<newsData> datas = new ArrayList<>();

    @Override
    public void loadNews(final String url, final RequestQueue queue, final getNewsListener listener) {
        Log.i("hello","你好");//Request.Method.GET,


        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                Log.i("hello",response);

                Gson gson  = new Gson();
                JsonParser parser = new JsonParser();
                JsonObject jsonObject = parser.parse(response).getAsJsonObject();
                JsonObject jsonObject1 = jsonObject.getAsJsonObject("result");
                JsonArray jsonArray = jsonObject1.getAsJsonArray("data");
                if (null!=datas){
                    datas.clear();
                }
               for (JsonElement element:jsonArray){
                   newsData newsData = gson.fromJson(element, com.example.woodson.supernews.Entity.newsData.class);
                   datas.add(newsData);
                   Log.i("hello1",newsData.getTitle());
               }
                listener.Success(datas);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i("hello","失败"+error.toString()+url);
                listener.Error();
            }
        });

        queue.add(stringRequest);

    }
}
