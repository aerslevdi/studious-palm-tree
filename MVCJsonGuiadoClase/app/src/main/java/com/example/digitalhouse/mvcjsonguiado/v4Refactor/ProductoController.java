package com.example.digitalhouse.mvcjsonguiado.v4Refactor;


import java.util.List;

/**
 * Created by digitalhouse on 24/05/17.
 */

public class ProductoController {

    public List<Producto> obtenerProductos() {
        List<Producto> productos;

        if (hayInternet()) {
            DAOProductoInternet daoProductoInternet = new DAOProductoInternet();
            productos = daoProductoInternet.obtenerProductosDeInternet();
        } else {
            DAOProductoArchivo daoProductoArchivo = new DAOProductoArchivo();
            productos = daoProductoArchivo.obtenerProductosDeArchivo();
        }

        return productos;
    }

    public Boolean hayInternet(){
        return true;
    }

}
