package com.digitalhouse.retrofitbase.DAO.Movies;

import com.digitalhouse.retrofitbase.DAO.DaoHelper;
import com.digitalhouse.retrofitbase.Model.Movies.Movie;
import com.digitalhouse.retrofitbase.Model.Movies.MovieContainer;
import com.digitalhouse.retrofitbase.Utils.ResultListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by digitalhouse on 15/01/18.
 */

public class MovieDao extends DaoHelper {
    private ServiceMovies serviceMovies;

    public MovieDao() {
        super("https://api.myjson.com/");
        serviceMovies = retrofit.create(ServiceMovies.class);
    }


    public void getMovies(final ResultListener<List<Movie>> listenerDelController){
        Call<MovieContainer> call = serviceMovies.getMovieContainer();
        call.enqueue(new Callback<MovieContainer>() {
            @Override
            public void onResponse(Call<MovieContainer> call, Response<MovieContainer> response) {
                // TODO Completar
            }

            @Override
            public void onFailure(Call<MovieContainer> call, Throwable t) {
                // TODO Completar
            }
        });
    }
}
