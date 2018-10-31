package com.digitalhouse.comunicacinentrefragmentsbase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment {
    // TODO (14) Declarar la Key a usar en el Bundle como constante públicas de la clase WelcomeFragment


    public static final  String KEY_USERNAME = "username";
    public static final String KEY_PASSWORD = "password";


    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_welcome, container, false);

        TextView textViewWelcome = view.findViewById(R.id.textViewWelcome);

        // Comunicacion entre fragments
        // TODO (15) Pedirle al WelcomeFragment sus Argumentos
        Bundle bundle = getArguments();
        // TODO (16) Extraer el valor mediante la Key


        String username= bundle.getString(KEY_USERNAME);
        String password = bundle.getString(KEY_PASSWORD);


        // Fragments
        // TODO (17) Setear el valor extraido como texto del textViewWelcome


        return view;
    }

}
