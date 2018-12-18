package com.digitalhouse.retrofitbase.Model.Movies;

public class Id {
    private Integer tmdb;

    public Integer getTmdb() {
        return tmdb;
    }

    @Override
    public String toString() {
        return "Id{" +
                "tmdb=" + tmdb +
                '}';
    }
}
