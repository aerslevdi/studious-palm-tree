package com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by digitalhouse on 01/06/17.
 */

public class ClaseContenedora {
    @SerializedName("products")
    private List<Producto> listaDeProductos;

    public List<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    @Override
    public String toString() {
        return "ClaseContenedora{" +
                "listaDeProductos=" + listaDeProductos +
                '}';
    }
}
