package com.example.digitalhouse.mvcjsonguiado.v4Refactor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.digitalhouse.mvcjsonguiado.R;

import java.util.List;

public class ActivityRecyclerViewProductos extends AppCompatActivity {
    private List<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_v4);

        cargarProductos();
    }

    public void cargarProductos(){
        ProductoController productoController = new ProductoController();
        this.productos = productoController.obtenerProductos();
    }
}


