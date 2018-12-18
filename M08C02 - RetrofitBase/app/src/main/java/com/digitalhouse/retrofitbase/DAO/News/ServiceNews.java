package com.digitalhouse.retrofitbase.DAO.News;

import com.digitalhouse.retrofitbase.Model.News.NewsContainer;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by digitalhouse on 15/01/18.
 */

public interface ServiceNews {
    @GET("/bins/1k5i4")
    Call<NewsContainer> getNewsContainer(
    );
}
