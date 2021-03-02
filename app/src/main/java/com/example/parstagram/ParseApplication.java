package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VypYSM8OXtSC7M2jea1N6Z7YhKBblB3h4hXUmlyu")
                .clientKey("J2jSs9yG6UIFF33gNrljGuHycSKg9q6KPl55Ue1n")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
