package com.example.digital.pokedex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String KEY_NOMBRE = "nombre";
    public static final String KEY_IMAGEN = "imagen";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String nombre = bundle.getString(KEY_NOMBRE);
        Integer imagen = bundle.getInt(KEY_IMAGEN);

        ImageView imageViewImagen = findViewById(R.id.pokemonView);
        TextView textViewNombre = findViewById(R.id.nombreView);

        imageViewImagen.setImageResource(imagen);
        textViewNombre.setText(nombre);
    }
}
