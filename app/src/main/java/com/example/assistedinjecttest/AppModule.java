package com.example.assistedinjecttest;

import android.app.Application;

import com.squareup.inject.assisted.dagger2.AssistedModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final Application application;
    private static final String BASE_URL = "BASE_URL";

    AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Application application() {
        return application;
    }


    @Provides
    @Named(BASE_URL)
    String providesBASE_URL() {
        return "URL";
    }
}

