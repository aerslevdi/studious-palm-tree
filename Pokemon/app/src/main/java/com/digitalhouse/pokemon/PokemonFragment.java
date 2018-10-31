package com.digitalhouse.pokemon;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PokemonFragment extends Fragment {
    public static final String KEY_IMAGE = "image";

    public PokemonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bundle bundle = getArguments();
        final Integer pokemon = bundle.getInt(KEY_IMAGE);

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pokemon, container, false);

        ImageView imageViewPokemon = view.findViewById(R.id.imageViewPokemon);
        imageViewPokemon.setImageResource(pokemon);

        imageViewPokemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentInterface)getContext()).yoTeElijo(pokemon);
            }
        });


        return view;

    }



    public interface FragmentInterface {
        void yoTeElijo(Integer pokemon);
    }

}
