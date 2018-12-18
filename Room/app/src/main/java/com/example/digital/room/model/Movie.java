package com.example.digital.room.model;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Movies")
public class Movie {

    @PrimaryKey
    private Integer id;
    @ColumnInfo(name = "otroId")
    private String imbd_id;
    private String overview;
    @Embedded
    private Genre genre;

    public Movie(Integer id, String imbd_id, String overview) {
        this.id = id;
        this.imbd_id = imbd_id;
        this.overview = overview;
    }
}
