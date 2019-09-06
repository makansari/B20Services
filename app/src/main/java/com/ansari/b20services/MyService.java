package com.ansari.b20services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    MediaPlayer mp;
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mp = MediaPlayer.create(this,R.raw.maid);

        Log.i("mytag","service created");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.i("mytag","service start");

        mp.start();

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
            mp.stop();
        Log.i("mytag","service destryoed");

    }
}
