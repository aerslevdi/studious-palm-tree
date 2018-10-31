package com.digitalhouse.floatinglabels;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextInputLayout textInputLayoutUsuario = findViewById(R.id.textInputUsuario);
        final TextInputLayout textInputLayoutContrasenia = findViewById(R.id.textInputContrasenia);

        final EditText editTextUsuario = findViewById(R.id.editTextUsuario);
        final EditText editTextContrasenia = findViewById(R.id.editTextContrasenia);

        Button button = findViewById(R.id.buttonRegister);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = editTextUsuario.getText().toString();
                String contrasenia = editTextContrasenia.getText().toString();

                Boolean isOk = true;

                if (usuario.isEmpty()){
                    textInputLayoutUsuario.setError("El usuario no debe ser vacio");
                    isOk = false;
                } else {
                    textInputLayoutUsuario.setError(null);
                }

                if (contrasenia.length() < 10){
                    textInputLayoutContrasenia.setError("Debe contener más de 10 caracteres");
                    isOk = false;
                } else {
                    textInputLayoutContrasenia.setError(null);
                }

                if (isOk){
                    Toast.makeText(MainActivity.this, "Registrado", Toast.LENGTH_SHORT).show();
                }


            }
        });








    }
}
