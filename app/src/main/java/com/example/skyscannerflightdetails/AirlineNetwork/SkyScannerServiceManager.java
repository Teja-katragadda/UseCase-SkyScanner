package com.example.skyscannerflightdetails.AirlineNetwork;

import com.example.skyscannerflightdetails.SkyScannerModel.Modelnfo;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class SkyScannerServiceManager {

    ServiceData serviceData;

    @Inject
    public SkyScannerServiceManager(ServiceData serviceData) {
        this.serviceData = serviceData;
    }

    @Inject
    public Observable<Modelnfo> getQuotes(String country, String currency, String locale, String originplace, String destinationplace, String outboundpartialdate, String inboundpartialdate) {
        return serviceData.getQuotes(country, currency, locale, originplace, destinationplace, outboundpartialdate, inboundpartialdate).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}
