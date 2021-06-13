package com.marysugar.dagger2_retrofit2_sample_java;


import android.app.Application;

public class MyApplication extends Application {

    private ApiComponent mApiComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApiComponent = DaggerApiComponent.builder()
                .appModule(new AppModule(this))
                .apiModule(new ApiModule("https://restcountries.eu/rest/v2/"))
                .build();
    }

    public ApiComponent getNetComponent() {
        return mApiComponent;
    }
}
