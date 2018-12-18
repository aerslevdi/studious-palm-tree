package com.example.digital.fbapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private CallbackManager callbackManager;
    private LoginButton loginButton;
    private ImageView imageViewFB;
    private TextView textViewFB;

    @Override
    protected void onStart() {
        super.onStart();
        AccessToken accessToken = AccessToken.getCurrentAccessToken();
        boolean isLoggedIn = accessToken != null && !accessToken.isExpired();

        if (isLoggedIn){
            cargarPerfil();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        imageViewFB = findViewById(R.id.imageViewFacebook);
        textViewFB = findViewById(R.id.textViewFacebook);


        callbackManager = CallbackManager.Factory.create();

        loginButton = findViewById(R.id.login_button);
        loginButton.setReadPermissions("email");
        // If you are using in a fragment, call loginButton.setFragment(this);

        // Callback registration
        LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("email","public_profile"));
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                cargarPerfil();
                Toast.makeText(MainActivity.this, "exito", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancel() {
                Toast.makeText(MainActivity.this, "nope", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(FacebookException exception) {
                Toast.makeText(MainActivity.this, "Get Reckt" , Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }
    public void cargarPerfil(){
        Toast.makeText(MainActivity.this, "Cargando perfil", Toast.LENGTH_LONG).show();
       Profile profile = Profile.getCurrentProfile();
        if (profile != null){
            textViewFB.setText(profile.getName());
            Uri uri = profile.getProfilePictureUri(500,500);
            Glide.with(this).load(uri).into(imageViewFB);

        }
    }
}
