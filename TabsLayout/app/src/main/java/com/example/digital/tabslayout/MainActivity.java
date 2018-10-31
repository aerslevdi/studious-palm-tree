package com.example.digital.tabslayout;

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

        List<Fragment> list = new ArrayList<>();

        List<Dato> datos = new ArrayList<>();
        datos.add(new Dato("Zapdos", R.drawable.zapdos, "#00ff00"));
        datos.add(new Dato("Moltres", R.drawable.moltres, "#ff0000"));
        datos.add(new Dato("Articuno", R.drawable.articuno, "#0000ff"));



        ViewPager viewPager = findViewById(R.id.viewPager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(),datos);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
