package com.example.skyscannerflightdetails;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

import com.example.skyscannerflightdetails.AirlineNetwork.SkyScannerServiceManager;
import com.example.skyscannerflightdetails.SkyScannerModel.Modelnfo;

import javax.inject.Inject;

public class SkyScannerViewModel implements LifecycleObserver {

    SkyScannerServiceManager skyScannerServiceManager;

    public SkyScannerViewModel(SkyScannerServiceManager skyScannerServiceManager) {
        this.skyScannerServiceManager = skyScannerServiceManager;
    }

    @Inject


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void getData(){
        getAirlaneSkyScannerdata();


    }

    private void getAirlaneSkyScannerdata() {
        skyScannerServiceManager.getQuotes().subscribe(this::onBindViews,this::failure);

    }

    private void failure(Throwable throwable) {
    }

    private void onBindViews(Modelnfo modelnfo) {

    }


}
