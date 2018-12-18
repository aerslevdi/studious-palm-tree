package com.digitalhouse.viewpager;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {
    private static final String KEY_COLOR = "color";
    private static final String KEY_IMAGE = "image";



    public static ColorFragment fabrica(Dato dato){
        ColorFragment fragment = new ColorFragment();

        Bundle bundle = new Bundle();

        bundle.putString(ColorFragment.KEY_COLOR, dato.getColor());
        bundle.putInt(ColorFragment.KEY_IMAGE, dato.getImage());

        fragment.setArguments(bundle);

        return fragment;
    }



    public ColorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Obtengo el bundle
        Bundle bundle = getArguments();
        // Datos
        String color = bundle.getString(KEY_COLOR);
        Integer imagen = bundle.getInt(KEY_IMAGE);

        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_color, container, false);

        // Busco componentes
        FrameLayout frameLayout = view.findViewById(R.id.root);
        ImageView imageView = view.findViewById(R.id.imageView);

        // Seteo los datos
        frameLayout.setBackgroundColor(Color.parseColor(color));
        imageView.setImageResource(imagen);

        return view;
    }

}
