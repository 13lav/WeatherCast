package com.example.kush.weathercast;

import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by saini on 27-Jul-16.
 */
public class DSAPIClient {
    private static DSAPIInterface service;

    public static DSAPIInterface getService() {
        Retrofit r = new Retrofit.Builder().baseUrl("https://api.forecast.io/forecast/b4fb23509199a6e36938e4513c34fdd1").
                addConverterFactory(GsonConverterFactory.create(
                        new GsonBuilder().create()))
                .build();
        service = r.create(DSAPIInterface.class);
        return service;
    }
}
