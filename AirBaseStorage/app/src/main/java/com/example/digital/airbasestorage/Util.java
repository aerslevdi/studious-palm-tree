package com.example.digital.airbasestorage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Uri;

public class Util {
    public static Boolean isOnline(Context context){
        ConnectivityManager cm =
                (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null &&
                cm.getActiveNetworkInfo().isConnectedOrConnecting();
    }

    public static String getExtension(Uri uri){
        String fileName = uri.getLastPathSegment();
        Integer startExtension = fileName.indexOf(".");
        String extension = fileName.substring(startExtension);
        return extension;
    }
}
