package com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.View;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.digitalhouse.mvcjsonguiado.R;
import com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.Model.Producto;

import java.util.List;

/**
 * Created by digitalhouse on 02/06/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private List<Producto> datos;

    public RecyclerAdapter(List<Producto> datos){
        this.datos = datos;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Producto producto = datos.get(position);
        holder.cargarDatos(producto);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre;
        private TextView descripcion;
        private TextView precio;

        public ViewHolder(View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.textViewNombre);
            descripcion = itemView.findViewById(R.id.textViewDescripcion);
            precio = itemView.findViewById(R.id.textViewPrecio);
        }

        public void cargarDatos(Producto producto){
            nombre.setText(producto.getNombre());
            descripcion.setText(producto.getDescripcion());
            precio.setText(producto.getPrecio().toString());
        }
    }
}
