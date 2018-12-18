package com.digitalhouse.retrofitbase.Controller;

import com.digitalhouse.retrofitbase.DAO.Movies.MovieDao;
import com.digitalhouse.retrofitbase.Model.Movies.Movie;
import com.digitalhouse.retrofitbase.Utils.ResultListener;

import java.util.List;

public class ControllerMovie {

    public void getMovies(final ResultListener<List<Movie>> listenerView){

        MovieDao movieDao = new MovieDao();
        movieDao.getMovies(new ResultListener<List<Movie>>() {
            @Override
            public void finish(List<Movie> resultado) {

                listenerView.finish(resultado);

            }
        });


    }

}
