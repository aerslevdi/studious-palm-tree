package com.digitalhouse.viewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Datos
        List<Dato> datos = new ArrayList<>();
        datos.add(new Dato("Rojo", R.drawable.tai, "#FF0000"));
        datos.add(new Dato("Verde", R.drawable.matt, "#00FF00"));
        datos.add(new Dato("Azul", R.drawable.izzy, "#0000FF"));

        // Buscamos el ViewPager en el Layout
        ViewPager viewPager = findViewById(R.id.viewPager);

        // Adapter
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), datos);
        viewPager.setAdapter(adapter);

        viewPager.setCurrentItem(1);
        viewPager.setClipToPadding(false);

        // TabLayout
        TabLayout tabLayout = findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);

    }
}
