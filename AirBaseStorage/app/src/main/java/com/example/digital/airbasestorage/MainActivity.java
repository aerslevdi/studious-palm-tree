package com.example.digital.airbasestorage;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;

import pl.aprilapps.easyphotopicker.EasyImage;

public class MainActivity extends AppCompatActivity {
    private FirebaseStorage firebaseStorage;
    private ImageView imageView;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imagen);
        fab = findViewById(R.id.fab);

        firebaseStorage = FirebaseStorage.getInstance();
        StorageReference raiz = firebaseStorage.getReference();
        StorageReference images = raiz.child("images");

        GlideApp.with(this).load(images.child("foto.jpg")).into(imageView);

        //images.child("foto.jpg").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
          //  @Override
            //public void onSuccess(Uri uri) {
            //Glide.with(MainActivity.this).load(uri).into(imageView);
            //}
        //}).addOnFailureListener(new OnFailureListener() {
          //  @Override
            //public void onFailure(@NonNull Exception exception) {
                // Handle any errors
          //  }
        //});

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EasyImage.openChooserWithGallery(MainActivity.this, "Abrir con...", 100);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        EasyImage.handleActivityResult(requestCode, resultCode, data, MainActivity.this, new EasyImage.Callbacks() {
            @Override
            public void onImagePickerError(Exception e, EasyImage.ImageSource source, int type) {

            }

            @Override
            public void onImagePicked(final File imageFile, EasyImage.ImageSource source, int type) {
                File copia = new File(imageFile.getPath());
                final Uri copiaUri = Uri.fromFile(copia);

                StorageReference nube = firebaseStorage.getReference().child("images").child("nombre"+Util.getExtension(copiaUri));
                UploadTask uploadTask = nube.putFile(copiaUri);

                uploadTask.addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        Glide.with(MainActivity.this).load(copiaUri).into(imageView);

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
            }

            @Override
            public void onCanceled(EasyImage.ImageSource source, int type) {

            }
        });
    }
}
