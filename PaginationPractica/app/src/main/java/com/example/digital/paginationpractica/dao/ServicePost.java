package com.example.digital.paginationpractica.dao;

import com.example.digital.paginationpractica.model.ContenedorPost;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ServicePost {

    @GET("posts/paginated")
    Call<ContenedorPost> getContenedorPost(@Query("offset") Integer offset, @Query("limit") Integer limit);
}
