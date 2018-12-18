package com.example.digital.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.digital.myapplication.Controller.ColoresController;
import com.example.digital.myapplication.Model.MiColor;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ColoresController coloresController = new ColoresController();
        List<MiColor> colores = coloresController.obtenerColores(MainActivity.this);
        Toast.makeText(this, colores.toString(), Toast.LENGTH_LONG).show();
    }
}
