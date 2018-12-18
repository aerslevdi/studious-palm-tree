package com.example.digital.room.dao.database;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.digital.room.model.Movie;


@Database(entities = {Movie.class}, version = 1, exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {
    public abstract DaoMovie getDaoMovie();
}
