package com.digitalhouse.sharenativo;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton floatingActionButton = findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Creamos un share de tipo ACTION_SENT
                Intent share = new Intent(android.content.Intent.ACTION_SEND);

                //Indicamos que voy a compartir texto
                share.setType("text/plain");

                //Le agrego un título
                share.putExtra(Intent.EXTRA_SUBJECT, "Compartir en Instagram");
                //Le agrego el texto a compartir (Puede ser un link tambien)
                share.putExtra(Intent.EXTRA_TEXT, "Hola como estan");

                //Hacemos un start para que comparta el contenido.
                startActivity(Intent.createChooser(share, "Share link!"));
            }
        });


    }
}
