package com.example.assistedinjecttest;

import dagger.Module;
import dagger.Provides;

@Module
public class ChatModule{
    @Provides
    String providesBASE_URL() {
        return "ChatModule";
    }
}
