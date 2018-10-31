package com.example.digital.drawerlayout;




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

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ElectricFragment electricFragment = new ElectricFragment();
        final BugFragment bugFragment = new BugFragment();
        final FireFragment fireFragment = new FireFragment();

        drawerLayout = findViewById(R.id.drawer);
        NavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawers();

                switch (item.getItemId()) {
                    case R.id.item_bug:
                        reemplazarFragment(bugFragment);
                        return true;
                    case R.id.item_electric:
                        reemplazarFragment(electricFragment);
                        return true;
                    case R.id.item_fire:
                        reemplazarFragment(fireFragment);
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
        //Cierro el drawer si esta abierto en vez de ir para atras en la activity
        if (drawerLayout.isDrawerOpen(Gravity.START)){
            drawerLayout.closeDrawers();
        }else {
        super.onBackPressed(); }
    }
}
