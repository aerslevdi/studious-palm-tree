package com.digitalhouse.vauquita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.editText);

        Button button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = editText.getText().toString();

                // CREO EL INTENT
                Intent intent = new Intent(MainActivity.this, ReceptorActivity.class);

                // COMPRO LA VALIJA VACIAtextView
                Bundle bundle = new Bundle();

                // LLENO LA VALIJA
                bundle.putString(ReceptorActivity.KEY_TEXT, texto);

                // HICE CHECKIN
                intent.putExtras(bundle);

                // SE FUE EL AVION
                startActivity(intent);

            }
        });

    }


}

