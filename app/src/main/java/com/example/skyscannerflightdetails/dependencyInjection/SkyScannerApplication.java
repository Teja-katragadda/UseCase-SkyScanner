package com.example.skyscannerflightdetails.dependencyInjection;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class SkyScannerApplication extends Application implements HasActivityInjector {
   @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        SkyScannerComponent skyScannerComponent = DaggerSkyScannerComponent.create();
        skyScannerComponent.inject(this);

    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
