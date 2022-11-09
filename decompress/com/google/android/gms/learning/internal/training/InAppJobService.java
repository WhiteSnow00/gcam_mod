// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.learning.internal.training;

import android.content.Intent;
import java.util.concurrent.ExecutorService;
import android.os.RemoteException;
import android.util.Log;
import android.content.Context;
import android.os.PowerManager;
import android.app.job.JobParameters;
import android.app.job.JobService;

public class InAppJobService extends JobService
{
    static final String TAG = "brella.InAppJobSvc";
    kai dynamiteImpl;
    
    private boolean isIdleConstraintMet(final JobParameters jobParameters) {
        return !((PowerManager)this.getSystemService("power")).isInteractive() || jobParameters.getExtras().getInt("waive_idle_requirement", 0) == 1;
    }
    
    private boolean tryLoadDynamiteImpl() {
        if (this.dynamiteImpl != null) {
            return true;
        }
        try {
            final kai dynamiteImpl = (kai)kaf.a((Context)this, "com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl", kam.a);
            try {
                if (!dynamiteImpl.i(jww.b(this), jww.b(this.getBgExecutor()))) {
                    if (Log.isLoggable("brella.InAppJobSvc", 5)) {
                        Log.w("brella.InAppJobSvc", "IInAppJobService.init failed");
                    }
                    return false;
                }
                this.dynamiteImpl = dynamiteImpl;
                return true;
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppJobSvc", 5)) {
                    Log.w("brella.InAppJobSvc", "RemoteException in IInAppJobService.init", (Throwable)ex);
                }
                return false;
            }
        }
        catch (final kad kad) {
            if (Log.isLoggable("brella.InAppJobSvc", 5)) {
                Log.w("brella.InAppJobSvc", "LoadingException during tryLoadDynamiteImpl", (Throwable)kad);
            }
            return false;
        }
    }
    
    public ExecutorService getBgExecutor() {
        return kan.a;
    }
    
    public void onDestroy() {
        final kai dynamiteImpl = this.dynamiteImpl;
        if (dynamiteImpl != null) {
            try {
                dynamiteImpl.f();
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppJobSvc", 5)) {
                    Log.w("brella.InAppJobSvc", "RemoteException in IInAppJobService.onDestroy", (Throwable)ex);
                }
            }
        }
        super.onDestroy();
    }
    
    public void onRebind(final Intent intent) {
        final kai dynamiteImpl = this.dynamiteImpl;
        if (dynamiteImpl != null) {
            try {
                dynamiteImpl.g(intent);
                return;
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppJobSvc", 5)) {
                    Log.w("brella.InAppJobSvc", "RemoteException in IInAppJobService.onRebind", (Throwable)ex);
                }
            }
        }
        super.onRebind(intent);
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        final kai dynamiteImpl = this.dynamiteImpl;
        if (dynamiteImpl != null) {
            try {
                return dynamiteImpl.e(intent, n, n2);
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppJobSvc", 5)) {
                    Log.w("brella.InAppJobSvc", "RemoteException in IInAppJobService.onStartCommand", (Throwable)ex);
                }
            }
        }
        return super.onStartCommand(intent, n, n2);
    }
    
    public boolean onStartJob(final JobParameters jobParameters) {
        synchronized (this) {
            if (!this.isIdleConstraintMet(jobParameters)) {
                kag.a((Context)this, jobParameters);
                return false;
            }
            if (!this.tryLoadDynamiteImpl()) {
                kag.a((Context)this, jobParameters);
                return false;
            }
            try {
                return this.dynamiteImpl.j(jobParameters);
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppJobSvc", 5)) {
                    Log.w("brella.InAppJobSvc", "RemoteException in IInAppJobService.onStartJob", (Throwable)ex);
                }
                kag.a((Context)this, jobParameters);
                return false;
            }
        }
    }
    
    public boolean onStopJob(final JobParameters jobParameters) {
        final kai dynamiteImpl = this.dynamiteImpl;
        if (dynamiteImpl != null) {
            try {
                return dynamiteImpl.k(jobParameters);
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppJobSvc", 5)) {
                    Log.w("brella.InAppJobSvc", "RemoteException in IInAppJobService.onStopJob", (Throwable)ex);
                }
            }
        }
        return false;
    }
    
    public void onTrimMemory(final int n) {
        final kai dynamiteImpl = this.dynamiteImpl;
        if (dynamiteImpl != null) {
            try {
                dynamiteImpl.h(n);
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppJobSvc", 5)) {
                    Log.w("brella.InAppJobSvc", "RemoteException in IInAppJobService.onTrimMemory", (Throwable)ex);
                }
            }
        }
    }
    
    public boolean onUnbind(final Intent intent) {
        final kai dynamiteImpl = this.dynamiteImpl;
        if (dynamiteImpl != null) {
            try {
                return dynamiteImpl.l(intent);
            }
            catch (final RemoteException ex) {
                if (Log.isLoggable("brella.InAppJobSvc", 5)) {
                    Log.w("brella.InAppJobSvc", "RemoteException in IInAppJobService.onUnbind", (Throwable)ex);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
