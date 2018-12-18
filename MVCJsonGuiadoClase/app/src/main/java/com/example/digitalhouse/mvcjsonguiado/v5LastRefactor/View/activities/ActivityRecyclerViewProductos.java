package com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.View.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.digitalhouse.mvcjsonguiado.R;
import com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.Cotroller.ProductoController;
import com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.Model.Producto;
import com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.View.RecyclerAdapter;

import java.util.List;

public class ActivityRecyclerViewProductos extends AppCompatActivity {
    private List<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_final);

        cargarProductos();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        RecyclerView.Adapter adapter = new RecyclerAdapter(productos);
        recyclerView.setAdapter(adapter);

    }

    public void cargarProductos(){
        ProductoController productoController = new ProductoController();
        this.productos = productoController.obtenerProductos();
    }
}


