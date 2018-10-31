package com.digitalhouse.pokemon;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements PokemonFragment.FragmentInterface {
    private ImageView imageViewPoke1;
    private ImageView imageViewPoke2;
    private ImageView imageViewPoke3;
    private Boolean eleccion = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewPoke1 = findViewById(R.id.pokebola1);
        imageViewPoke2 = findViewById(R.id.pokebola2);
        imageViewPoke3 = findViewById(R.id.pokebola3);

        imageViewPoke1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt(PokemonFragment.KEY_IMAGE, R.drawable.bullbasaur);

                PokemonFragment pokemonFragment = new PokemonFragment();
                pokemonFragment.setArguments(bundle);

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contenedor, pokemonFragment)
                        .commit();
            }
        });


        imageViewPoke2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt(PokemonFragment.KEY_IMAGE, R.drawable.charmander);

                PokemonFragment pokemonFragment = new PokemonFragment();
                pokemonFragment.setArguments(bundle);

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contenedor, pokemonFragment)
                        .commit();
            }
        });

        imageViewPoke3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putInt(PokemonFragment.KEY_IMAGE, R.drawable.squirtle);

                PokemonFragment pokemonFragment = new PokemonFragment();
                pokemonFragment.setArguments(bundle);

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contenedor, pokemonFragment)
                        .commit();
            }
        });
    }

    @Override
    public void yoTeElijo(Integer pokemon) {
        if (!eleccion) {
            eleccion = true;

            switch (pokemon) {
                case R.drawable.bullbasaur:
                    imageViewPoke1.setImageResource(R.drawable.poke);
                    break;
                case R.drawable.charmander:
                    imageViewPoke2.setImageResource(R.drawable.poke);
                    break;
                case R.drawable.squirtle:
                    imageViewPoke3.setImageResource(R.drawable.poke);
                    break;
            }

            imageViewPoke1.setEnabled(false);
            imageViewPoke2.setEnabled(false);
            imageViewPoke3.setEnabled(false);
        }

    }
}
