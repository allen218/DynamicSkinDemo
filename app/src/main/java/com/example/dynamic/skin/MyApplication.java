package com.example.dynamic.skin;

import android.app.Application;

import com.example.skin.core.SkinManager;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SkinManager.init(this);
    }
}
