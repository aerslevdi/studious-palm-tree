package com.example.digital.pokedex;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class PokemonAdapter extends  RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>{

    //Atributo

    private List<Pokemon>datos;
    private PokemonReceptor receptor;

    //Constructor


    PokemonAdapter(PokemonReceptor receptor, List<Pokemon> datos) {
        this.datos = datos;
        this.receptor = receptor; //En caso de fragment
    }

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();

        receptor = (PokemonReceptor) context;

        LayoutInflater inflador = LayoutInflater.from(context);

        View view = inflador.inflate(R.layout.item_pokemon, parent, false);

        PokemonViewHolder pokemonViewHolder = new PokemonViewHolder(view);

        return pokemonViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {

        Pokemon pokemon = datos.get(position);

        //Cargar

        holder.cargar(pokemon);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    //Defino interfaz

    public interface  PokemonReceptor {
        void recibir (Pokemon pokemon);
    }

    //ViewHolder

    class  PokemonViewHolder  extends RecyclerView.ViewHolder{

        private ImageView image;

        //Constructor ViewHolder

        PokemonViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageViewPokemon);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Pokemon pokemon = datos.get(getAdapterPosition());
                    receptor.recibir(pokemon);

                }
            });
        }

        //Metodo
        void cargar (Pokemon unPokemon){
            image.setImageResource(unPokemon.getImagen());
        }
    }
}
