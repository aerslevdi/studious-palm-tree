package com.example.digital.tabslayout;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> datos;
    private List<Dato> objetos;

    public ViewPagerAdapter(FragmentManager fm, List<Fragment> datos, List<Dato> objetos) {
        super(fm);
        this.datos = datos;
        datos = new ArrayList<>();
        this.objetos = objetos;

        for (Dato dato: objetos) {
            ColorFragment fragment = ColorFragment.fabrica(dato);
            datos.add(fragment);
        }
    }


    @Override
    public Fragment getItem(int i) {
        return datos.get(i);
    }

    @Override
    public int getCount() {
        return datos.size();
    }


}
