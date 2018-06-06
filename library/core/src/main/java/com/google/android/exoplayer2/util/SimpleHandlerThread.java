package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.HandlerThread;

/**
 * Created by leoliu on 2018/6/6.
 */

public class SimpleHandlerThread extends HandlerThread {

    private Handler mHandler;

    public SimpleHandlerThread(String name, int priority) {
        super(name, priority);
    }

    @Override
    public synchronized void start() {
        super.start();
        mHandler = new Handler(getLooper());
    }

    public void postJob(Runnable runnable) {
        mHandler.post(runnable);
    }
}