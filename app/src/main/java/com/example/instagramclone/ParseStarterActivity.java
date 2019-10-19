package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ZSSaPXgl2PhG9ioQfssc1OfW9HFU50CIPHeoERU3")
                .clientKey("A0pEDywHVvW2ywQLnL1V1LyNiYinaUlWaSHT4FxJ")
                .server("https://parseapi.back4app.com/")
                .build());

    }
}
