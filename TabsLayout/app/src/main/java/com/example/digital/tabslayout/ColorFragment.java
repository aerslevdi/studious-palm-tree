package com.example.digital.tabslayout;


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
    private static String KEY_COLOR = "color";
    private static String KEY_IMAGE = "image";


    public ColorFragment() {
        // Required empty public constructor
    }

    public static  ColorFragment fabrica (Dato dato){
        ColorFragment fragment = new ColorFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ColorFragment.KEY_COLOR, dato.getColor());
        bundle.putInt(ColorFragment.KEY_IMAGE, dato.getImage());
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bundle bundle = getArguments();

        String color = bundle.getString(KEY_COLOR);
        Integer image = bundle.getInt(KEY_IMAGE);
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_color, container, false);
        FrameLayout frameLayout = view.findViewById((R.id.root));
        ImageView imageView = view.findViewById(R.id.image);

        frameLayout.setBackgroundColor(Color.parseColor(color));
        imageView.setImageResource(image);
        return view;
    }

}
