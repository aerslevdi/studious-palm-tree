package com.example.digitalhouse.appbar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment2 extends Fragment {
    public static final String CLAVE_MENSAJE = "mensaje";
    private String mensaje = "";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Get the arguments
        Bundle bundle = getArguments();
        // Check the arguments
        if (bundle != null){
            mensaje = bundle.getString(CLAVE_MENSAJE);
        }

        // Inflate the layout for this fragment
        View view = inflater.inflate(com.example.digitalhouse.appbar.R.layout.fragment2, container, false);

        // Find the textview component
        TextView textView = view.findViewById(com.example.digitalhouse.appbar.R.id.textViewFragment2);

        // Build a message
        String nuevoMensaje = getResources().getString(com.example.digitalhouse.appbar.R.string.text_fragment2) + " " + mensaje;
        // Set the message
        textView.setText(nuevoMensaje);


        // Return the inflated view.
        return view;
    }
}
