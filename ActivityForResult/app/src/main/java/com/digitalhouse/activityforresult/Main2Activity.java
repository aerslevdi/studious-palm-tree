package com.digitalhouse.activityforresult;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.buttonBack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = editText.getText().toString();

                Intent data = MainActivity.respuestaLogin(texto);
                setResult(Activity.RESULT_OK, data);
                finish();
            }
        });

    }
}
