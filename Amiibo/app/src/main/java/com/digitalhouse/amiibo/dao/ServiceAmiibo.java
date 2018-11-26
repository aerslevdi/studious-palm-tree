package com.digitalhouse.amiibo.dao;

import com.digitalhouse.amiibo.model.ContenedoraAmiibo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ServiceAmiibo {

    @GET("api/amiibo")
    Call<ContenedoraAmiibo> traerAmiibos();

    @GET("api/amiibo")
    Call<ContenedoraAmiibo> traerAmiibosPorNombre(@Query("name") String name);

    @GET("api/amiibo")
    Call<ContenedoraAmiibo> traerAmiibosPorSerie(@Query("amiiboSeries") String serie);

    @GET("api/amiibo")
    Call<ContenedoraAmiibo> traerAmiibosPorGameSerie(@Query("gameseries") String gameSerie);

    @GET("api/amiibo")
    Call<ContenedoraAmiibo> traerAmiibosPorCharacter(@Query("character") String character);

}
