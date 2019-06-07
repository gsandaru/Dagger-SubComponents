package com.example.assistedinjecttest;


import android.app.Application;
import android.content.Context;

public class AppTest extends Application {
    private static AppComponent appComponent;
    private static ChatComponent chatComponent;
    private AppTest mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        mContext = this;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public AppTest getmContext() {
        return mContext;
    }

    public ChatComponent plusChatComponent() {
        // always get only one instance
        if (chatComponent == null) {
            // start lifecycle of chatComponent
            chatComponent = appComponent.plusChatComponent(new ChatModule());
        }
        return chatComponent;
    }

    public void clearChatComponent() {
        chatComponent = null;
    }

    public ChatComponent getChatComponent() {
        return chatComponent;
    }
}