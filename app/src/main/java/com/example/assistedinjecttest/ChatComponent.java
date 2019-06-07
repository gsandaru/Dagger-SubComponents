package com.example.assistedinjecttest;

import dagger.Subcomponent;

@Subcomponent(modules = ChatModule.class)
public interface ChatComponent{
    void inject(HomeFragment homeFragment);
}
