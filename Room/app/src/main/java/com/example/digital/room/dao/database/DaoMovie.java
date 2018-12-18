package com.example.digital.room.dao.database;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.digital.room.model.Movie;

import java.util.List;

@Dao
public interface DaoMovie {

    @Insert
    void insertarmovie(Movie movie);

    @Query("SELECT * FROM Movies")
    List<Movie> buscarMovies();

}
