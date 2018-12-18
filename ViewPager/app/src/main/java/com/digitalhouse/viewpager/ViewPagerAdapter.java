package com.digitalhouse.viewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    // Atributo
    private List<Fragment> datos;
    private List<Dato> objetos;

    // Constructor
    public ViewPagerAdapter(FragmentManager fm, List<Dato> objetos) {
        super(fm);

        // List Fragment
        datos = new ArrayList<>();
        for(Dato dato: objetos){
            ColorFragment fragment = ColorFragment.fabrica(dato);
            datos.add(fragment);
        }

        this.objetos = objetos;
    }

    @Override
    public Fragment getItem(int i) {
        return datos.get(i);
    }

    @Override
    public int getCount() {
        return datos.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return objetos.get(position).getTitle();


//        switch (position) {
//            case 0:
//                return "jaja";
//            case 1:
//                return "PAPA";
//            default:
//                return "MAMA";
//        }

    }
}
