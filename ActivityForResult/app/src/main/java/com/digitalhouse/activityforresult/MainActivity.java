package com.digitalhouse.activityforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final int KEY_OUT_MAIN2ACTIVITY = 100;
    public static final String KEY_TEXTO = "texto";

    private TextView textViewNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNombre = findViewById(R.id.textViewNombre);

        Button button = findViewById(R.id.buttonLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivityForResult(intent, KEY_OUT_MAIN2ACTIVITY);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == Activity.RESULT_OK){
            switch (requestCode){
                case KEY_OUT_MAIN2ACTIVITY:
                    Bundle bundle = data.getExtras();
                    String texto = bundle.getString(KEY_TEXTO);

                    textViewNombre.setText(texto);
                    break;

            }
        }
    }

    public static Intent respuestaLogin(String texto){
        Intent intent = new Intent();

        Bundle bundle = new Bundle();
        bundle.putString(KEY_TEXTO, texto);

        intent.putExtras(bundle);
        return intent;
    }

}
