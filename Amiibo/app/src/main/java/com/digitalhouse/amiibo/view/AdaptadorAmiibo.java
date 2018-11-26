package com.digitalhouse.amiibo.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.digitalhouse.amiibo.model.Amiibo;

import java.util.List;

public class AdaptadorAmiibo extends RecyclerView.Adapter<AdaptadorAmiibo.AmiiboHolder> {
    // Atributo
    private List<Amiibo> amiiboList;

    // Constructor
    public AdaptadorAmiibo(List<Amiibo> amiiboList) {
        this.amiiboList = amiiboList;
    }


    @NonNull
    @Override
    public AmiiboHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //TODO Completar
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AmiiboHolder amiiboHolder, int i) {
        //TODO Completar
    }

    @Override
    public int getItemCount() {
        //TODO Completar
        return 0;
    }

    public class AmiiboHolder extends RecyclerView.ViewHolder {
        // ATRIBUTOS
        //TODO Completar


        public AmiiboHolder(@NonNull View itemView) {
            super(itemView);
            //TODO Completar
        }

        public void cargar(Amiibo amiibo) {
            //TODO Completar

        }
    }
}
