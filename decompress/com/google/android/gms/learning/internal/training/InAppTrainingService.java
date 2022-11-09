// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.learning.internal.training;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public final class InAppTrainingService extends Service
{
    private static final String TAG = "brella.InAppTrngSvc";
    kal dynamiteImpl;
    
    public IBinder onBind(final Intent intent) {
        final kal dynamiteImpl = this.dynamiteImpl;
        if (dynamiteImpl != null) {
            try {
                return dynamiteImpl.f(intent);
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
                    Log.w("brella.InAppTrngSvc", "RemoteException in IInAppTrainingService.onBind", (Throwable)ex);
                }
            }
        }
        return (IBinder)new kaa("No IInAppTrainingService implementation found");
    }
    
    public void onCreate() {
        super.onCreate();
        try {
            final kal dynamiteImpl = (kal)kaf.a((Context)this, "com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl", kam.d);
            this.dynamiteImpl = dynamiteImpl;
            try {
                dynamiteImpl.g(jww.b(this));
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
                    Log.w("brella.InAppTrngSvc", "RemoteException during onCreate", (Throwable)ex);
                }
            }
        }
        catch (final kad kad) {
            if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
                Log.w("brella.InAppTrngSvc", "LoadingException during onCreate", (Throwable)kad);
            }
        }
    }
    
    public void onDestroy() {
        final kal dynamiteImpl = this.dynamiteImpl;
        if (dynamiteImpl != null) {
            try {
                dynamiteImpl.h();
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
                    Log.w("brella.InAppTrngSvc", "RemoteException in IInAppTrainingService.onDestroy", (Throwable)ex);
                }
            }
        }
        super.onDestroy();
    }
    
    public void onRebind(final Intent intent) {
        final kal dynamiteImpl = this.dynamiteImpl;
        if (dynamiteImpl != null) {
            try {
                dynamiteImpl.i(intent);
                return;
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
                    Log.w("brella.InAppTrngSvc", "RemoteException in IInAppTrainingService.onRebind", (Throwable)ex);
                }
            }
        }
        super.onRebind(intent);
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        final kal dynamiteImpl = this.dynamiteImpl;
        if (dynamiteImpl != null) {
            try {
                return dynamiteImpl.e(intent, n, n2);
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
                    Log.w("brella.InAppTrngSvc", "RemoteException in IInAppTrainingService.onStartCommand", (Throwable)ex);
                }
            }
        }
        return super.onStartCommand(intent, n, n2);
    }
    
    public void onTrimMemory(final int n) {
        final kal dynamiteImpl = this.dynamiteImpl;
        if (dynamiteImpl != null) {
            try {
                dynamiteImpl.j(n);
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
                    Log.w("brella.InAppTrngSvc", "RemoteException in IInAppTrainingService.onTrimMemory", (Throwable)ex);
                }
            }
        }
    }
    
    public boolean onUnbind(final Intent intent) {
        final kal dynamiteImpl = this.dynamiteImpl;
        if (dynamiteImpl != null) {
            try {
                return dynamiteImpl.k(intent);
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppTrngSvc", 5)) {
                    Log.w("brella.InAppTrngSvc", "RemoteException in IInAppTrainingService.onUnbind", (Throwable)ex);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
