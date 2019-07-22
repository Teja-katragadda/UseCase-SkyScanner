package com.example.skyscannerflightdetails;

import android.arch.lifecycle.LifecycleOwner;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.skyscannerflightdetails.databinding.ActivityMainBinding;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements LifecycleOwner {

    @Inject
    SkyScannerViewModel skyScannerViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        this.getLifecycle().addObserver(skyScannerViewModel);
        activityMainBinding.setViewModel(skyScannerViewModel);
    }
}
