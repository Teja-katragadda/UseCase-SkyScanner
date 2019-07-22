package com.example.skyscannerflightdetails.dependencyInjection;

import com.example.skyscannerflightdetails.AirlineNetwork.RetrofitNetwork;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import retrofit2.Retrofit;

@Component(modules ={AndroidInjectionModule.class, RetrofitNetwork.class} )
public interface SkyScannerComponent extends AndroidInjector<SkyScannerApplication> {
}
