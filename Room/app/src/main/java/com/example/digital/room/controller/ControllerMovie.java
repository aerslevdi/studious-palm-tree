package com.example.digital.room.controller;

import android.content.Context;
import android.net.Uri;

import com.example.digital.room.dao.internet.DaoInternetMovies;
import com.example.digital.room.model.Movie;
import com.example.digital.room.util.InternetConnection;
import com.example.digital.room.util.ResultListener;

import java.util.ArrayList;
import java.util.List;

import okhttp3.internal.Util;

public class ControllerMovie {

    public void obtenerMovies(Context context, ResultListener<List<Movie>> listenerDelController){

        if (InternetConnection.isOnline(context)){
            DaoInternetMovies daoInternetMovies = new DaoInternetMovies();

        }


        List<Movie> lista = new ArrayList<>();
        lista.add(new Movie(1,"12","jdnondocwnodcw"));
        listenerDelController.finish(lista);

    }
}
