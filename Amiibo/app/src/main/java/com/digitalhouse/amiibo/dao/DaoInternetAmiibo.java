package com.digitalhouse.amiibo.dao;


import com.digitalhouse.amiibo.model.Amiibo;
import com.digitalhouse.amiibo.model.ContenedoraAmiibo;
import com.digitalhouse.amiibo.utils.ResultListener;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DaoInternetAmiibo extends DaoHelper {
    private static final String BASE_URL = "http://www.amiiboapi.com/";

    private ServiceAmiibo serviceAmiibo;

    // Constructor
    public DaoInternetAmiibo() {
        super(BASE_URL);

        serviceAmiibo = retrofit.create(ServiceAmiibo.class);
    }


    public void traerAmiibos(final ResultListener<List<Amiibo>> listenerController) {

        Call<ContenedoraAmiibo> call = serviceAmiibo.traerAmiibos();

        call.enqueue(new Callback<ContenedoraAmiibo>() {
            @Override
            public void onResponse(Call<ContenedoraAmiibo> call, Response<ContenedoraAmiibo> response) {
                //TODO Completar

            }

            @Override
            public void onFailure(Call<ContenedoraAmiibo> call, Throwable t) {
                //TODO Completar

            }
        });
    }


    public void traerAmiibosPorNombre(String nombre, final ResultListener<List<Amiibo>> listenerController) {

        Call<ContenedoraAmiibo> call = serviceAmiibo.traerAmiibosPorNombre(nombre);

        call.enqueue(new Callback<ContenedoraAmiibo>() {
            @Override
            public void onResponse(Call<ContenedoraAmiibo> call, Response<ContenedoraAmiibo> response) {
                //TODO Completar
            }

            @Override
            public void onFailure(Call<ContenedoraAmiibo> call, Throwable t) {
                //TODO Completar

            }
        });
    }


    public void traerAmiibosPorSerie(String serie, final ResultListener<List<Amiibo>> listenerController) {

        Call<ContenedoraAmiibo> call = serviceAmiibo.traerAmiibosPorSerie(serie);

        call.enqueue(new Callback<ContenedoraAmiibo>() {
            @Override
            public void onResponse(Call<ContenedoraAmiibo> call, Response<ContenedoraAmiibo> response) {
                //TODO Completar
            }

            @Override
            public void onFailure(Call<ContenedoraAmiibo> call, Throwable t) {
                //TODO Completar

            }
        });
    }

    public void traerAmiibosPorGameSerie(String gameSerie, final ResultListener<List<Amiibo>> listenerController) {

        Call<ContenedoraAmiibo> call = serviceAmiibo.traerAmiibosPorGameSerie(gameSerie);

        call.enqueue(new Callback<ContenedoraAmiibo>() {
            @Override
            public void onResponse(Call<ContenedoraAmiibo> call, Response<ContenedoraAmiibo> response) {
                //TODO Completar
            }

            @Override
            public void onFailure(Call<ContenedoraAmiibo> call, Throwable t) {
                //TODO Completar

            }
        });

    }

    public void traerAmiibosPorCharacter(String character, final ResultListener<List<Amiibo>> listenerController) {
        Call<ContenedoraAmiibo> call = serviceAmiibo.traerAmiibosPorCharacter(character);

        call.enqueue(new Callback<ContenedoraAmiibo>() {
            @Override
            public void onResponse(Call<ContenedoraAmiibo> call, Response<ContenedoraAmiibo> response) {
                //TODO Completar
            }

            @Override
            public void onFailure(Call<ContenedoraAmiibo> call, Throwable t) {
                //TODO Completar
            }
        });
    }


}
