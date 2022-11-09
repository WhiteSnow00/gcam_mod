// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.prewarm;

import android.os.IBinder;
import android.content.Intent;
import android.os.Handler;
import android.os.Messenger;
import java.util.concurrent.Executor;
import android.app.Service;

public class ProcessingBoostService extends Service
{
    public dul a;
    public Executor b;
    private final Messenger c;
    
    public ProcessingBoostService() {
        this.c = new Messenger((Handler)new gwg(this));
    }
    
    public final IBinder onBind(final Intent intent) {
        return this.c.getBinder();
    }
}
