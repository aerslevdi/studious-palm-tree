package com.digitalhouse.recyclerviewpractica;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

// TODO 14 Hacer que Recycler View Adapter extienda de RecyclerView.Adapter<MyViewHolder>
public class RecyclerAdapter  extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    // Atributos
    private List<AndroidVersion> datos;
    private  AdapterListener adapterListener;
    // TODO 23 Crear un atributo del tipo AdapterListener


    // TODO 24 Modificar el constructor para pedir por parámetro un objeto del tipo AdapterListener e inicializar el atributo
    // Constructor
    public RecyclerAdapter(List<AndroidVersion> datos, AdapterListener adapterListener) {

        this.datos = datos;
        this.adapterListener = adapterListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // TODO 16 Con el contexto del viewgroup crear un inflador
        Context context = viewGroup.getContext();
        adapterListener = (AdapterListener) context;
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        // TODO 17 Con el inflador inflar una view del layout item_layout
        View view = layoutInflater.inflate(R.layout.item_layout, viewGroup,false);
        // TODO 18 Crear un MyViewHolder pasando por parámetro la vista inflada
        MyViewHolder myViewHolder = new MyViewHolder(view);
        // TODO 19 Devolver el viewholder creado
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        // TODO 20 Con el segundo parametro, usarlo como posición y buscar en la lista de datos el dato de esa posición
        AndroidVersion androidVersion = datos.get(i);
        // TODO 21 Cargar el dato obtenido al viewholder mediante el método cargar.
        myViewHolder.cargar(androidVersion);
    }

    @Override
    public int getItemCount() {
        // TODO 15 Devolver el tamaño de la lista de los datos

        return datos.size();
    }



    // TODO 22 Definir interfaz del Adaptador
    public interface AdapterListener{
        void irDetalle(AndroidVersion version);
    }


    // TODO 10 Hacer que el View Holder extienda de RecyclerView.ViewHolder
    public class MyViewHolder extends RecyclerView.ViewHolder {
        // Atributos
        // TODO 11 Crear un atributo por cada componente de la celda con el cual quiera interactuar
        private ImageView image;

        // Constructor
        public MyViewHolder(View itemView){
            super(itemView);
            //TODO 12 Buscar los componentes dentro de la vista itemView e inicializar los atributos
            image = itemView.findViewById(R.id.imageViewItem);

            // TODO 25 Setear un onClickListener a toda la celda
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // TODO 26 Con la lista de datos y usando el metodo getAdapterPosition, buscar el dato del View holder


                    // TODO 27 Usando el atributo AdapterListener, ejecutar el método irDetalle y pasarle el dato que acabas de conseguir


                }
            });

        }

        //
        public void cargar(AndroidVersion androidVersion){
            // TODO 13 Setear los datos a los atributos
            image.setImageResource(androidVersion.getImagen());
        }
    }
}


