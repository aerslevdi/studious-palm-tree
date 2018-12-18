package com.digitalhouse.retrofitbase.DAO.Movies;

import com.digitalhouse.retrofitbase.Model.Movies.MovieContainer;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by digitalhouse on 15/01/18.
 */

public interface ServiceMovies {
    @GET("/bins/4sblo")
    Call<MovieContainer> getMovieContainer(
    );
}
