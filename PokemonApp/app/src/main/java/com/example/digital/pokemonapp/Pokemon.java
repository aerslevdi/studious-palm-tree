package com.example.digital.pokemonapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Pokemon extends Fragment {


    public Pokemon() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.pokemon_fragment, container, false);
        ImageView pokemon = view.findViewById(R.id.bulbasaur);
        Bundle bundle = getArguments();

        return view;
    }

}
