package com.example.digital.recyclerviewlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter{
    //Atributo

    private List<Pelicula> datos;

    //Constructor


    public PeliculaAdapter(List<Pelicula> datos) {
        this.datos = datos;
    }

    //Metodos

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_layout, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //Dato
       Pelicula pelicula = datos.get(position);

        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.cargar(pelicula);


    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder {
        private TextView titulo;
        private ImageView imagen;
        private TextView valoracion;

        public MyViewHolder(View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.titulo);
            imagen = itemView.findViewById(R.id.imagen);
            valoracion = itemView.findViewById(R.id.valoracion);

        }


        /*public MyViewHolder (RecyclerView.ViewHolder itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.textViewTitulo);
            imagen = itemView.findViewById(R.id.textViewImagen);
            valoracion = itemView.findViewById(R.id.textViewValoracion);

        }*/
        public void  cargar (Pelicula pelicula){
            titulo.setText(pelicula.getTitulo());
            valoracion.setText(pelicula.getValoracion().toString());
            imagen.setImageResource(pelicula.getImagen());
        }

    }

    //
}
