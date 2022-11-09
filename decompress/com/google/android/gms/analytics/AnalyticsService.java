// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.analytics;

import android.os.IBinder;
import android.content.Intent;
import android.app.job.JobParameters;
import android.content.Context;
import android.app.Service;

public final class AnalyticsService extends Service implements jnt
{
    private jnu a;
    
    private final jnu c() {
        if (this.a == null) {
            this.a = new jnu((Context)this);
        }
        return this.a;
    }
    
    public final boolean a(final int n) {
        return this.stopSelfResult(n);
    }
    
    public final void b(final JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }
    
    public final IBinder onBind(final Intent intent) {
        this.c();
        return null;
    }
    
    public final void onCreate() {
        super.onCreate();
        this.c().a();
    }
    
    public final void onDestroy() {
        this.c().b();
        super.onDestroy();
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        this.c().e(intent, n2);
        return 2;
    }
}
