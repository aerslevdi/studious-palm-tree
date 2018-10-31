package com.digitalhouse.fragments;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // LLAMO A LOS BOTONES
        Button buttonGreen = findViewById(R.id.buttonGreen);
        Button buttonRed = findViewById(R.id.buttonRed);

        // Instancio un Fragment
        final GreenFragment greenFragment = new GreenFragment();
        final RedFragment redFragment = new RedFragment();


        // LES ASIGNO LISTENERS A LOS BOTONES
        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //COLOCAR EL FRAGMENTO EN EL ESPACIO DISPONIBLE
                FragmentManager fragmentManager = getSupportFragmentManager();
                // PIDO UNA TRANSACCIÓN
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                // CONFIGURO LA TRANSACCION
                fragmentTransaction.replace(R.id.containerFragment, greenFragment);
                // LARGO LA TRANSACCION
                fragmentTransaction.commit();


            }
        });


        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //COLOCAR EL FRAGMENTO EN EL ESPACIO DISPONIBLE
                FragmentManager fragmentManager = getSupportFragmentManager();
                // PIDO UNA TRANSACCIÓN
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                // CONFIGURO LA TRANSACCION
                fragmentTransaction.replace(R.id.containerFragment, redFragment);
                // LARGO LA TRANSACCION
                fragmentTransaction.commit();
            }
        });




    }
}
