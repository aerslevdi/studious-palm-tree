package com.example.digital.pokemonapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView pokebolaBulbsaur = findViewById(R.id.pokebolaBulbasaur);
        ImageView pokebolaCharmander = findViewById(R.id.pokebolaCharmander);
        ImageView pokebolaSquirtle = findViewById(R.id.pokebolaSquirtle);

        final Pokemon bulbasaur = new Pokemon();

        pokebolaBulbsaur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                FragmentManager fragmentManager = getSupportFragmentManager();

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.add(R.id.pokemonContainer, bulbasaur);

                fragmentTransaction.commit();


            }
        });

    }
}
