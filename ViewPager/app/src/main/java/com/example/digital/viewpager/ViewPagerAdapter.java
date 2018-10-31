package com.example.digital.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> datos;

    public ViewPagerAdapter(FragmentManager fm, List<Fragment> datos) {
        super(fm);
        this.datos = datos;
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
