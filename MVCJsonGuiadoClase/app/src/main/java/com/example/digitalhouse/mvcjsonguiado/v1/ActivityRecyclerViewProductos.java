package com.example.digitalhouse.mvcjsonguiado.v1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.digitalhouse.mvcjsonguiado.R;

import java.util.List;

public class ActivityRecyclerViewProductos extends AppCompatActivity {

    private List<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_v1);

        cargarProductosEnpantalla();
    }

    public void cargarProductosEnpantalla(){

        this.productos = obtenerProductosDeInternet();

    }

    public List<Producto> obtenerProductosDeInternet(){

        List<Producto> productosInternet = null;
        //Obtengo algun objeto que me permite hacer comunicaciones con Internet
        //Le pido que se conecte con Mercado Abierto
        //esto me devuelve un choclo de texto con tota la informacion
        //tengo que pasarla a una lista de productos y luego devolverla
        return productosInternet;
    }
}
