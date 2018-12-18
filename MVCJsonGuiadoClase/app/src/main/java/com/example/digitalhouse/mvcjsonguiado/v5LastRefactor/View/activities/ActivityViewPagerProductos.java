package com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.View.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.digitalhouse.mvcjsonguiado.R;
import com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.Cotroller.ProductoController;
import com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.Model.Producto;
import com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.View.ViewPagerAdapter;

import java.util.List;

public class ActivityViewPagerProductos extends AppCompatActivity {

    private List<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_deportivos_final);

        cargarProductos();

        ViewPager viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), productos);
        viewPager.setAdapter(viewPagerAdapter);
    }

    public void cargarProductos() {
        ProductoController productoController = new ProductoController();
        this.productos = productoController.obtenerProductos();
    }
}



