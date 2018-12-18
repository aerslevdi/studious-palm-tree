package com.digitalhouse.facebookturnotarde;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
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

    private TextView textViewNombreFacebook;
    private ImageView imageViewFacebook;

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


        // BUCAR COMPONENTES
        imageViewFacebook = findViewById(R.id.imageViewFacebook);
        textViewNombreFacebook = findViewById(R.id.textViewNombreFacebook);


        //LOGIN CON FACEBOOK
        callbackManager = CallbackManager.Factory.create();


        loginButton = findViewById(R.id.login_button);
        loginButton.setReadPermissions("email");
        // If using in a fragment
        //loginButton.setFragment(this);

        // Callback registration
        LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("email", "public_profile"));
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                // App code

                cargarPerfil();


                Toast.makeText(MainActivity.this,"Exito", Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onCancel() {
                // App code
                Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onError(FacebookException exception) {
                // App code
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();

            }
        });
    }


    public void cargarPerfil(){

        Toast.makeText(MainActivity.this, "Cargando Perfil", Toast.LENGTH_SHORT).show();

        Profile profile = Profile.getCurrentProfile();
        if (profile != null){


            textViewNombreFacebook.setText(profile.getName());

            Uri uri = profile.getProfilePictureUri(500, 500);
            Glide.with(this).load(uri).into(imageViewFacebook);


        }

    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }
}











