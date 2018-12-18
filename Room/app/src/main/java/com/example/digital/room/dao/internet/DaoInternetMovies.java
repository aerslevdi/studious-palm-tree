package com.example.digital.room.dao.internet;

import android.content.Context;

import com.example.digital.room.model.Movie;
import com.example.digital.room.util.ResultListener;

import java.util.ArrayList;
import java.util.List;

import okhttp3.internal.Util;

public class DaoInternetMovies {

    public void obtenerMoviesFromInternet(Context context, ResultListener<List<Movie>> listenerDelController){




        List<Movie> lista = new ArrayList<>();
        lista.add(new Movie(1,"12","jdnondocwnodcw"));
        listenerDelController.finish(lista);
    }
}
