package com;

import android.app.Application;

import com.facebook.ads.AudienceNetworkAds;

public class Myapplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AudienceNetworkAds.initialize(this);
    }
}
