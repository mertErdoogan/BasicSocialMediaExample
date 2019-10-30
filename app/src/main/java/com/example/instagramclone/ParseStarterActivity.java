package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Your - appID - Here")
                .clientKey("Your - clientKey - Here")
                .server("https://parseapi.back4app.com/")
                .build());

    }
}
