package com.example.digitalhouse.mvcjsonguiado.v2Refactor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.digitalhouse.mvcjsonguiado.R;

import java.util.List;

public class ActivityViewPagerProductos extends AppCompatActivity {
    private List<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_deportivos_v2);
        cargarProductosEnpantalla();
    }

    public void cargarProductosEnpantalla(){
        DAOProductoInternet daoProductoInternet = new DAOProductoInternet();
        this.productos = daoProductoInternet.obtenerProductosDeInternet();
    }
}
