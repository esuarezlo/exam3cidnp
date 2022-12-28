package com.erns.exam3cidnp;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class ChronoService extends Service {

    private static final String TAG = "ChronoService";

    public ChronoService(){
        super();
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);

        String action=intent.getAction();
        Log.d(TAG,startId+",ACTION: "+action);

        Chronometer chronometer =new Chronometer();
        new Thread(chronometer).start();

        return START_NOT_STICKY;
    }


}
