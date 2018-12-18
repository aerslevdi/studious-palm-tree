package com.digitalhouse.comunicacinentrefragmentsbase;


import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Comunicación entre Activities
        // TODO (6) Pedirle a la SecondActivity el Intent con el cual fue llamado
        Intent intent = getIntent();
        // TODO (7) Al Intent, pedirle el Bundle
        Bundle bundle = intent.getExtras();
        //FRAGMENTS
        // TODO (8) Crear una instancia del WelcomeFragment
        WelcomeFragment welcomeFragment = new WelcomeFragment();

        // Comunicacion entre Fragments
        // TODO (9) Agregar el Bundle a la instancia del WelcomeFragment
        welcomeFragment.setArguments(bundle);


        // Fragments
        // TODO (10) Pedirle al SecondActivity su FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();
        // TODO (11) Pedirle al FragmentManager una transacción
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // TODO (12) Configurar la transacción, es decir, decirle que tiene que hacer.
        fragmentTransaction.add(R.id.containerWelcome, welcomeFragment);
        // TODO (13) Largar la transacción
        fragmentTransaction.commit();
    }
}
