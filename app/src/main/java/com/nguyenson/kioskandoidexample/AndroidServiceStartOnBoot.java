package com.nguyenson.kioskandoidexample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AndroidServiceStartOnBoot extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // here you can add whatever you want this service to do
    }

}