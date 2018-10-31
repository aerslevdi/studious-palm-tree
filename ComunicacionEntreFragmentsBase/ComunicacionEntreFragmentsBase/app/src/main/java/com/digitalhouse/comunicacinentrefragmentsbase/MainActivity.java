package com.digitalhouse.comunicacinentrefragmentsbase;



import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (1) Crear una instancia del Fragment Formulario
        FragmentFormulario fragmentFormulario = new FragmentFormulario();
        // TODO (2) Pedirle al MainActivity su FragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();
        // TODO (3) Pedirle al FragmentManager una transacción
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // TODO (4) Configurar la transacción, es decir, decirle que tiene que hacer.
        fragmentTransaction.add(R.id.containerFormulario, fragmentFormulario);
        // TODO (5) Largar la transacción
        fragmentTransaction.commit();
        
    }


    public void click(String username, String password){
        // Ir a la segunda activity
        //Instanciar un intent
       Intent intent = new Intent(MainActivity.this, SecondActivity.class);

       Bundle bundle = new Bundle();
       bundle.putString(WelcomeFragment.KEY_USERNAME, username);
       bundle.putString(WelcomeFragment.KEY_PASSWORD, password);

       intent.putExtras(bundle);
       startActivity(intent);
    }
}
