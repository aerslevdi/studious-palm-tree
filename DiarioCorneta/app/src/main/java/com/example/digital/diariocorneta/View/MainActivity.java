package com.example.digital.diariocorneta.View;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.digital.diariocorneta.Controller.ObtenerNoticiaController;
import com.example.digital.diariocorneta.Model.Noticia;
import com.example.digital.diariocorneta.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ObtenerNoticiaController obtenerNoticiaController = new ObtenerNoticiaController();
    List<Noticia> noticias = obtenerNoticiaController.obtenerNoticias();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toast = findViewById(R.id.buttonToast);



        toast.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Toast.makeText(getApplicationContext(), noticias.toString(), Toast.LENGTH_LONG).show();

                                     }
                                 });

    }

}
