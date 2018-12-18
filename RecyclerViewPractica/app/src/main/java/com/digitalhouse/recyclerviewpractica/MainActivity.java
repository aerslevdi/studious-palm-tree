package com.digitalhouse.recyclerviewpractica;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

// TODO 28 Hacer que el MainActivity implemente AdapterListener
public class MainActivity extends AppCompatActivity implements RecyclerAdapter.AdapterListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 3 Crear una lista de Versiones de Android.
        List<AndroidVersion> datos = new ArrayList<>();
        datos.add(new AndroidVersion(getResources().getString(R.string.donut), R.drawable.donut));
        datos.add(new AndroidVersion(getResources().getString(R.string.eclair), R.drawable.eclair));
        datos.add(new AndroidVersion(getResources().getString(R.string.froyo), R.drawable.froyo));
        datos.add(new AndroidVersion(getResources().getString(R.string.gingerbread), R.drawable.gingerbread));
        datos.add(new AndroidVersion(getResources().getString(R.string.honeycomb), R.drawable.honeycomb));
        datos.add(new AndroidVersion(getResources().getString(R.string.icecream), R.drawable.icecream));
        datos.add(new AndroidVersion(getResources().getString(R.string.jellybean), R.drawable.jellybean));
        datos.add(new AndroidVersion(getResources().getString(R.string.kitkat), R.drawable.kitkat));
        datos.add(new AndroidVersion(getResources().getString(R.string.lollipop), R.drawable.lollipop));
        datos.add(new AndroidVersion(getResources().getString(R.string.marshmallow), R.drawable.marshmallow));
        datos.add(new AndroidVersion(getResources().getString(R.string.nougat), R.drawable.nougat));
        datos.add(new AndroidVersion(getResources().getString(R.string.oreo), R.drawable.oreo));
        datos.add(new AndroidVersion(getResources().getString(R.string.pie), R.drawable.pie));

        //TODO 4 Buscar el RecyclerView de la vista
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        //TODO 5 Setear al RecyclerView mejora en la performance
        recyclerView.setHasFixedSize(true);

        //TODO 6 Crear un LinearLayoutManager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        //TODO 7 Setear el LinearLayoutManager creado al RecyclerView
        recyclerView.setLayoutManager(layoutManager);

        //TODO 8 Crear un Adaptador para el Recycler y pasarle la lista de datos por constructor
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(this, datos);

        //TODO 9 Setear el Adaptador al RecyclerView
        recyclerView.setAdapter(recyclerAdapter);

    }

    @Override
    public void irDetalle(AndroidVersion version) {
        // TODO 29 Mediante comunicacion entre Activities, ir a DetalleActivity pasando el dato version por Bundle
        Intent intent = new Intent(this, DetalleActivity.class);

        Bundle bundle = new Bundle();
        bundle.putString(DetalleActivity.KEY_NOMBRE, version.getNombre());
        bundle.putInt(DetalleActivity.KEY_IMAGEN, version.getImagen());

        intent.putExtras(bundle);

        startActivity(intent);
    }
}
