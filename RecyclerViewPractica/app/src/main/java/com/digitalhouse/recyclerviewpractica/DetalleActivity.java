package com.digitalhouse.recyclerviewpractica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetalleActivity extends AppCompatActivity {
    // TODO 31 Armar las claves para el Bundle
    // public static final String KEY_EXAMPLE = "keyExample";
    public static final String KEY_NOMBRE = "keyNombre";
    public static final String KEY_IMAGEN = "keyImagen";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        // TODO 30 Mediante comunicacion entre Activities, recuperar el Bundle y desarmarlo
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String nombre = bundle.getString(KEY_NOMBRE);
        Integer imagen = bundle.getInt(KEY_IMAGEN);

        // TODO 32 Buscar los componentes de la view a los que queremos cargarles los datos
        TextView textViewNombre = findViewById(R.id.textViewNombreDetalle);
        ImageView imageViewImagen = findViewById(R.id.imageViewImagenDetalle);

        // TODO 33 Setearle los datos a dichos componentes
        textViewNombre.setText(nombre);
        imageViewImagen.setImageResource(imagen);
    }
}
