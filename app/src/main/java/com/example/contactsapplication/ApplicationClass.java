package com.example.contactsapplication;

import android.app.Application;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;

import java.util.List;


public class ApplicationClass extends Application {
    public static final String APPLICATION_ID = "61D53620-D5F1-4A18-FFAE-2E8718DB4E00";
    public static final String API_KEY = "014428E1-73A7-4C85-A72C-C890B74D4E54";
    public static final String SERVER_URL = "http://api.backendless.com";

    public static  BackendlessUser user;
    public static List<Contact> contacts;

    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );

    }
}
