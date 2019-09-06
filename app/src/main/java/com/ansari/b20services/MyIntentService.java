package com.ansari.b20services;

import android.app.IntentService;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

public class MyIntentService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     */
    public MyIntentService() {
        super("mythread");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        Log.i("mytag", "onHandle method");

        for(int i=0; i<=7;i++){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Toast.makeText(this, "Created", Toast.LENGTH_SHORT).show();
        Log.i("mytag", "IntentService created");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.i("mytag", "IntentService start");
        Toast.makeText(this, "start", Toast.LENGTH_SHORT).show();


        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "destryoed", Toast.LENGTH_SHORT).show();

        Log.i("mytag", "IntentService destryoed");
    }

}
