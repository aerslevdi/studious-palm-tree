package com.digitalhouse.vauquita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceptorActivity extends AppCompatActivity {
    public static final String KEY_TEXT = "text";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);

        // BUSCO EL TEXTVIEW A MODIFICAR
        TextView textView = findViewById(R.id.textViewReceptor);

        // ATERRIZA EL AVION
        Intent intent = getIntent();

        // SACO LAS MALETAS
        Bundle bundle = intent.getExtras();

        // Consegui el valor
        String texto = bundle.getString(KEY_TEXT);

        // SETEO EL TEXTO AL TEXTVIEW
        textView.setText(texto);


    }
}
