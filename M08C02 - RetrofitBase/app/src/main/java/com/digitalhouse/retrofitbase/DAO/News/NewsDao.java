package com.digitalhouse.retrofitbase.DAO.News;

import com.digitalhouse.retrofitbase.DAO.DaoHelper;
import com.digitalhouse.retrofitbase.Model.Movies.Movie;
import com.digitalhouse.retrofitbase.Model.News.NewsContainer;
import com.digitalhouse.retrofitbase.Utils.ResultListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by digitalhouse on 15/01/18.
 */

public class NewsDao extends DaoHelper {
    private ServiceNews serviceNews;

    public NewsDao() {
        super("https://api.myjson.com/");
        serviceNews = retrofit.create(ServiceNews.class);
    }


    public void getNews(final ResultListener<List<Movie>> listenerDelController){
        Call<NewsContainer> call = serviceNews.getNewsContainer();
        call.enqueue(new Callback<NewsContainer>() {
            @Override
            public void onResponse(Call<NewsContainer> call, Response<NewsContainer> response) {
                // TODO Completar

            }

            @Override
            public void onFailure(Call<NewsContainer> call, Throwable t) {
                // TODO Completar
            }
        });
    }
}
