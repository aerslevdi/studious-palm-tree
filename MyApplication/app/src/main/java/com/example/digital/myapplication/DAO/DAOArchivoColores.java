package com.example.digital.myapplication.DAO;

import android.content.Context;
import android.content.res.AssetManager;

import com.example.digital.myapplication.Model.ContenedoraColores;
import com.example.digital.myapplication.Model.MiColor;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DAOArchivoColores {

    public List<MiColor> obtenerColores (Context context){
        AssetManager assetManager = context.getAssets();

        try {
            InputStream inputStream = assetManager.open("colores.json");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            Gson gson = new Gson();
            ContenedoraColores contenedoraColores = gson.fromJson(bufferedReader, ContenedoraColores.class);
           List<MiColor> colores = contenedoraColores.getColores();
           return colores;

        }catch (IOException e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
