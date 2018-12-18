package com.example.digital.myapplication.Controller;

import android.content.Context;

import com.example.digital.myapplication.DAO.DAOArchivoColores;
import com.example.digital.myapplication.Model.MiColor;

import java.util.ArrayList;
import java.util.List;

public class ColoresController {

    public List<MiColor> obtenerColores(Context context){
        if (hayInternet()){
            return new ArrayList<>();
        }else {
            DAOArchivoColores daoArchivoColores = new DAOArchivoColores();
            List<MiColor> colores = daoArchivoColores.obtenerColores(context);
            return colores;
        }
        }
        public boolean hayInternet (){
        return false;
    }
    }

