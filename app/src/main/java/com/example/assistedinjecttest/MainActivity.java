package com.example.assistedinjecttest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((AppTest) getApplication()).getAppComponent().inject(this);
        ((AppTest) getApplication()).plusChatComponent();
        getSupportFragmentManager().beginTransaction().add(R.id.container,new HomeFragment()).commit();
    }
}
