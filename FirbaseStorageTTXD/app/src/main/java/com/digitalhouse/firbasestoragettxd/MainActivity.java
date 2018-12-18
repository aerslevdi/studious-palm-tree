package com.digitalhouse.firbasestoragettxd;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;
import java.util.List;

import pl.aprilapps.easyphotopicker.EasyImage;

public class MainActivity extends AppCompatActivity {
    private FirebaseStorage firebaseStorage;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageViewAmigo);

        firebaseStorage = FirebaseStorage.getInstance();
        StorageReference raiz = firebaseStorage.getReference();

        StorageReference imagenes = raiz.child("imagenes");

        // VIA URI
//        imagenes.child("your_name.jpg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
//            @Override
//            public void onSuccess(Uri uri) {
//                Glide.with(MainActivity.this).load(uri).into(imageView);
//            }
//        }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception exception) {
//                // Handle any errors
//            }
//        });


        // VIA FIREBASE-UI
        GlideApp.with(this).load(imagenes.child("your_name.jpg")).into(imageView);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // LANZO EL PEDIDO A LA GALLERIA Y A LA CAMARA CON UN CODIGO DE SALIDA
                EasyImage.openChooserWithGallery(MainActivity.this, "Abrir con...", 100);


            }
        });
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // MANEJO LA VUELTA
        EasyImage.handleActivityResult(requestCode, resultCode, data, MainActivity.this, new EasyImage.Callbacks() {
            @Override
            public void onImagePickerError(Exception e, EasyImage.ImageSource imageSource, int i) {

            }

            @Override
            public void onImagesPicked(@NonNull List<File> list, EasyImage.ImageSource imageSource, int i) {
                if (!list.isEmpty()) {
                    File imagen = list.get(0);
                    File copia = new File(imagen.getPath());
                    // URI A SUBIR
                    final Uri copia_uri = Uri.fromFile(copia);

                    // REFERENCIA AL STORAGE DONDE SUBIR
                    StorageReference nube = firebaseStorage
                            .getReference()
                            .child("imagenes")
                            .child("nombre" + Util.getExtension(copia_uri));
                            //.child(copia_uri.getLastPathSegment());

                    // SUBIRLO
                    UploadTask uploadTask = nube.putFile(copia_uri);

                    uploadTask.addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            // CARGO LA IMAGEN QUE SUBI
                            Glide.with(MainActivity.this).load(copia_uri).into(imageView);

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {

                        }
                    });

                }
            }

            @Override
            public void onCanceled(EasyImage.ImageSource imageSource, int i) {

            }
        });

    }
}
