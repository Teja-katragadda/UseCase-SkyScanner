package com.example.skyscannerflightdetails;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

import com.example.skyscannerflightdetails.AirlineNetwork.SkyScannerServiceManager;
import com.example.skyscannerflightdetails.SkyScannerModel.Modelnfo;

import javax.inject.Inject;

import dagger.Module;

import static android.content.ContentValues.TAG;

public class SkyScannerViewModel implements LifecycleObserver {

    SkyScannerServiceManager skyScannerServiceManager;
    SkyScannerItemViewModel skyScannerItemViewModel;

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
        Log.d(TAG, "failure:");
    }

    private void onBindViews(Modelnfo modelnfo) {
        skyScannerItemViewModel.setOrigin(modelnfo.getPlaces().get(0).getCountryName());
        skyScannerItemViewModel.setDestination(modelnfo.getPlaces().get(0).getCountryName());

    }


}
