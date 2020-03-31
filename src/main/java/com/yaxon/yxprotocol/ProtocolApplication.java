package com.yaxon.yxprotocol;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

public class ProtocolApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);            // 初始化 JPush



    }
}
