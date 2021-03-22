package com.example.nhiinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("smnMgqySPPEN0PTuXXhkJtIp0wFfq90BGV313r8M")
                .clientKey("g0gvWJajfu3ciOz4lE7V7oMdEqkU8tSdDkwXiHhe")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}