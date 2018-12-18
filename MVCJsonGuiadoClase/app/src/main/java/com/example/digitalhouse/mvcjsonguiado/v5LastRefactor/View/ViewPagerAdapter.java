package com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.View;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.digitalhouse.mvcjsonguiado.v5LastRefactor.Model.Producto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 02/06/17.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> listaDeFragment = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm, List<Producto> datos) {
        super(fm);
        for (Producto producto : datos){
            listaDeFragment.add(FragmentProducto.crearFragment(producto));
        }
    }

    @Override
    public Fragment getItem(int position) {
        return listaDeFragment.get(position);
    }

    @Override
    public int getCount() {
        return listaDeFragment.size();
    }
}
