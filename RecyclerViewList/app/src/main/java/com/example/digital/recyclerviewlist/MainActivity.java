package com.example.digital.recyclerviewlist;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Agregar pelicula

        final EditText newMovie = findViewById(R.id.newMovie);
        FloatingActionButton fab = findViewById(R.id.fabButton);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tituloNuevo = newMovie.getText().toString();
                Pelicula peliculaNueva = new Pelicula(tituloNuevo, R.drawable.pochoclin, 0);
            }
        });

        //RecyclerView

        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("Ant-Man",R.drawable.antman,5));
        peliculas.add(new Pelicula("Ant-Man and The Wasp",R.drawable.wasp,4));
        peliculas.add(new Pelicula("Captain America",R.drawable.captain,4));
        peliculas.add(new Pelicula("Spider-Man",R.drawable.spiderman,2));
        peliculas.add(new Pelicula("Infinity Wars",R.drawable.infinity,3));
        peliculas.add(new Pelicula("Ironman",R.drawable.iron1,4));
        peliculas.add(new Pelicula("Ironman 2",R.drawable.iron2,3));

        RecyclerView recyclerView = findViewById(R.id.recycleView);

        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        PeliculaAdapter peliculaAdapter = new PeliculaAdapter(peliculas);
        recyclerView.setAdapter(peliculaAdapter);





    }
}
