package com.digitalhouse.navigationviewturnotarde;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    // Atributo
    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // CREO FRAGMENTS
        final HopeFragment hopeFragment = new HopeFragment();
        final EmpireFragment empireFragment = new EmpireFragment();
        final JediFragment jediFragment = new JediFragment();

        // BUSCO COMPONENTES
        drawerLayout = findViewById(R.id.drawer);
        NavigationView navigationView = findViewById(R.id.navigation);

        // ASOCIO LISTENERS
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                drawerLayout.closeDrawers();

                switch (menuItem.getItemId()){
                    case R.id.item_new_hope:
                        reemplazarFragment(hopeFragment);
                        return true;
                    case R.id.item_empire:
                        reemplazarFragment(empireFragment);
                        return true;
                    case R.id.item_jedi:
                        reemplazarFragment(jediFragment);
                        return true;
                }

                return false;
            }
        });





    }



    private void reemplazarFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commit();
    }



    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(Gravity.START)) {
            drawerLayout.closeDrawers();
        } else {
            super.onBackPressed();
        }
    }
}
