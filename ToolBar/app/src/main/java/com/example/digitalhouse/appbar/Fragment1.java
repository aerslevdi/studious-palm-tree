package com.example.digitalhouse.appbar;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment1 extends Fragment {
    private OnFragmentInteractionListener mListener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the view.
        final View view = inflater.inflate(com.example.digitalhouse.appbar.R.layout.fragment1, container, false);
        // Find teh button component
        Button button = view.findViewById(com.example.digitalhouse.appbar.R.id.buttonFragment1);
        // set the listener for the onClick Button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = view.findViewById(com.example.digitalhouse.appbar.R.id.editTextFragment1);
                String nombre = editText.getText().toString();
                if (mListener != null){
                    mListener.onFragmentInteraction(nombre);
                }
            }
        });

        // Return the inflated view.
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        // Check the current attach context was implemented te OnFragmentInteractionListener
        if (context instanceof OnFragmentInteractionListener) {
            // Keep the listener
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        // Free the listener
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String mensaje);
    }
}
