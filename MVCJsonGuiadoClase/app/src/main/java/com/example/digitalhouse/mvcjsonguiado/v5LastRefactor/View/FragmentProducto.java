package com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.digitalhouse.mvcjsonguiado.R;
import com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.Model.Producto;

public class FragmentProducto extends Fragment {
    private static final String CLAVE_NOMBRE = "claveNombre";
    private static final String CLAVE_DESCRIPCION = "claveDescripcion";
    private static final String CLAVE_PRECIO = "clavePrecio";

    public static Fragment crearFragment(Producto producto){
        FragmentProducto fragmentProducto = new FragmentProducto();
        Bundle bundle = new Bundle();
        bundle.putString(CLAVE_NOMBRE, producto.getNombre());
        bundle.putString(CLAVE_DESCRIPCION, producto.getDescripcion());
        bundle.putString(CLAVE_PRECIO, producto.getPrecio().toString());
        fragmentProducto.setArguments(bundle);
        return fragmentProducto;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.item, container, false);

            Bundle bundle = getArguments();

            if (bundle != null){
                TextView nombre = view.findViewById(R.id.textViewNombre);
                TextView descripcion = view.findViewById(R.id.textViewDescripcion);
                TextView precio = view.findViewById(R.id.textViewPrecio);

                nombre.setText(bundle.getString(CLAVE_NOMBRE));
                descripcion.setText(bundle.getString(CLAVE_DESCRIPCION));
                precio.setText(bundle.getString(CLAVE_PRECIO));
            }


            return view;
    }

}
