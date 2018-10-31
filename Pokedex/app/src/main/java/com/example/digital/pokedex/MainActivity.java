package com.example.digital.pokedex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PokemonAdapter.PokemonReceptor{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Datos
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon("Bulbasaur", R.drawable.bullbasaur));
        pokemons.add(new Pokemon("Eeve", R.drawable.char_eevee));
        pokemons.add(new Pokemon("Charmander", R.drawable.charmander));
        pokemons.add(new Pokemon("Chespin", R.drawable.chespin));
        pokemons.add(new Pokemon("Chicorita", R.drawable.chicorita));
        pokemons.add(new Pokemon("Cindaquil", R.drawable.cindaquil));
        pokemons.add(new Pokemon("Fenekin", R.drawable.fenekin));
        pokemons.add(new Pokemon("Froakie", R.drawable.froakie));
        pokemons.add(new Pokemon("Litten", R.drawable.litten));
        pokemons.add(new Pokemon("Maril", R.drawable.maril));
        pokemons.add(new Pokemon("Mimikyu", R.drawable.mimikyu));
        pokemons.add(new Pokemon("Pichu", R.drawable.pichu));
        pokemons.add(new Pokemon("Pikachu", R.drawable.pikachu));
        pokemons.add(new Pokemon("Piplup", R.drawable.piplup));
        pokemons.add(new Pokemon("Popplio", R.drawable.popplio));
        pokemons.add(new Pokemon("Raichu", R.drawable.raichu));
        pokemons.add(new Pokemon("Raichu Alolla", R.drawable.raichu_alolla));
        pokemons.add(new Pokemon("Rowlet", R.drawable.rowlet));
        pokemons.add(new Pokemon("Squirtle", R.drawable.squirtle));
        pokemons.add(new Pokemon("Totodile", R.drawable.totodile));

       RecyclerView recyclerPokemon = findViewById(R.id.recyclerPokemon);

       //Adapter

        PokemonAdapter pokemonAdapter = new PokemonAdapter(this, pokemons);
        recyclerPokemon.setAdapter(pokemonAdapter);

        //LayoutManager

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerPokemon.setLayoutManager(layoutManager);

        recyclerPokemon.setHasFixedSize(true);

            }

    @Override
    public void recibir(Pokemon pokemon) {
        //Cambio de activity

        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(SecondActivity.KEY_NOMBRE, pokemon.getNombre());
        bundle.putInt(SecondActivity.KEY_IMAGEN, pokemon.getImagen());
        intent.putExtras(bundle);
        startActivity(intent);

    }
}
