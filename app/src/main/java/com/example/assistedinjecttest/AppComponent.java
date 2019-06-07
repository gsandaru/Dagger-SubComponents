package com.example.assistedinjecttest;

import android.app.Application;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.inject.assisted.Assisted;
import com.squareup.inject.assisted.AssistedInject;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules ={AppModule.class  })
public interface AppComponent {
    void inject(MainActivity mainActivity);
    ChatComponent plusChatComponent(ChatModule chatModule);
}


