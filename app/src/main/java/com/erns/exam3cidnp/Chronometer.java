package com.erns.exam3cidnp;

import android.util.Log;

public class Chronometer implements Runnable {
    private final String TAG="Cronometer";
    public void Start(){

    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Log.d(TAG,Thread.currentThread().getId()+":"+i);
                Thread.sleep(500);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
