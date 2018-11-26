package com.digitalhouse.amiibo.controller;

import android.content.Context;

import com.digitalhouse.amiibo.model.Amiibo;
import com.digitalhouse.amiibo.utils.ResultListener;
import com.digitalhouse.amiibo.utils.Util;

import java.util.List;

public class ControllerAmiibo {

    public void traerAmiibos(Context context, final ResultListener<List<Amiibo>> listenerView) {
        if (Util.isOnline(context)) {
            //TODO Completar
        } else {
            // BASE DE DATOS
        }
    }


    public void traerAmiibosPorNombre(String nombre,
                                      Context context,
                                      final ResultListener<List<Amiibo>> listenerView) {

        if (Util.isOnline(context)) {
            //TODO Completar
        } else {

            // BASE DE DATOS
        }
    }

    public void traerAmiibosPorSerie(String serie,
                                     Context context,
                                     final ResultListener<List<Amiibo>> listenerView) {

        if (Util.isOnline(context)) {
            //TODO Completar
        } else {

            // BASE DE DATOS
        }
    }

    public void traerAmiibosPorGameSerie(String gameSerie,
                                         Context context,
                                         final ResultListener<List<Amiibo>> listenerView) {

        if (Util.isOnline(context)) {
            //TODO Completar
        } else {

            // BASE DE DATOS
        }
    }

    public void traerAmiibosPorCharacter(String character,
                                         Context context,
                                         final ResultListener<List<Amiibo>> listenerView) {

        if (Util.isOnline(context)) {
            //TODO Completar
        } else {

            // BASE DE DATOS
        }
    }
}
