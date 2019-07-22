package com.example.skyscannerflightdetails.AirlineNetwork;

import com.example.skyscannerflightdetails.SkyScannerModel.Modelnfo;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ServiceData {

    @Headers({
            "X-RapidAPI-Key: 4fc318d903mshf57c0a4b90734bep15668djsn0fa8ed47953a",
    })

    @GET("browsequotes/v1.0/{country}/{currency}/{locale}/{originplace}/{destinationplace}/{outboundpartialdate}")
    Observable<Modelnfo> getQuotes(
            @Path("country") String country,
            @Path("currency") String currency,
            @Path("locale") String locale,
            @Path("originplace") String originplace,
            @Path("destinationplace") String destinationplace,
            @Path("outboundpartialdate") String outboundpartialdate,
            @Query("inboundpartialdate") String inboundpartialdate);

    @Headers({
            "X-RapidAPI-Key: 4fc318d903mshf57c0a4b90734bep15668djsn0fa8ed47953a",
    })
    @GET("/browseroutes/v1.0/{country}/{currency}/{locale}/{originplace}/{destinationplace}/{outboundpartialdate}")
    Observable<Modelnfo> getRoutes(
            @Path("country") String country,
            @Path("currency") String currency,
            @Path("locale") String locale,
            @Path("originplace") String originplace,
            @Path("destinationplace") String destinationplace,
            @Path("outboundpartialdate") String outboundpartialdate,
            @Query("inboundpartialdate") String inboundpartialdate);
}

