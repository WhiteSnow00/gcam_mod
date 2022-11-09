// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.util.Log;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import android.os.Looper;
import java.util.List;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicInteger;
import android.content.ServiceConnection;
import java.util.ArrayList;
import android.content.Context;

public class DaydreamApi implements AutoCloseable
{
    private static volatile Boolean g;
    public final Context a;
    public ArrayList b;
    public int c;
    public final ServiceConnection d;
    public otg e;
    public ote f;
    private boolean h;
    private final AtomicInteger i;
    
    static {
        DaydreamApi.g = null;
    }
    
    protected DaydreamApi(final Context a) {
        this.b = new ArrayList();
        this.i = new AtomicInteger();
        this.d = (ServiceConnection)new osl(this);
        this.a = a;
    }
    
    private final void b(final Intent intent) {
        final List queryIntentActivities = this.a.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            return;
        }
        final String value = String.valueOf(intent);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 43);
        sb.append("No activity is available to handle intent: ");
        sb.append(value);
        throw new ActivityNotFoundException(sb.toString());
    }
    
    private final void c() {
        if (!this.h) {
            return;
        }
        throw new IllegalStateException("DaydreamApi object is closed and can no longer be used.");
    }
    
    public static DaydreamApi create(Context context) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("DaydreamApi must only be used from the main thread.");
        }
        if (!context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return null;
        }
        final DaydreamApi daydreamApi = new DaydreamApi(context);
        try {
            final int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(daydreamApi.a);
            daydreamApi.c = vrCoreClientApiVersion;
            if (vrCoreClientApiVersion < 8) {
                final StringBuilder sb = new StringBuilder(69);
                sb.append("VrCore out of date, current version: ");
                sb.append(vrCoreClientApiVersion);
                sb.append(", required version: ");
                sb.append(8);
                Log.e("DaydreamApi", sb.toString());
            }
            else {
                final Intent intent = new Intent("com.google.vr.vrcore.BIND_SDK_SERVICE");
                intent.setPackage("com.google.vr.vrcore");
                if (daydreamApi.a.getApplicationContext() != null) {
                    context = daydreamApi.a.getApplicationContext();
                }
                else {
                    context = daydreamApi.a;
                }
                if (context.bindService(intent, daydreamApi.d, 1)) {
                    return daydreamApi;
                }
                Log.e("DaydreamApi", "Unable to bind to VrCoreSdkService");
            }
        }
        catch (final otd otd) {
            final String value = String.valueOf(otd);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 22);
            sb2.append("VrCore not available: ");
            sb2.append(value);
            Log.e("DaydreamApi", sb2.toString());
        }
        Log.w("DaydreamApi", "Failed to initialize DaydreamApi object.");
        return null;
    }
    
    public static Intent createVrIntent(final ComponentName component) {
        final Intent intent = new Intent();
        intent.setComponent(component);
        setupVrIntent(intent);
        return intent;
    }
    
    private final void d(final PendingIntent pendingIntent, final ComponentName componentName) {
        this.a(new osm(this, pendingIntent, componentName));
    }
    
    public static Intent setupVrIntent(final Intent intent) {
        intent.addCategory("com.google.intent.category.DAYDREAM");
        intent.addFlags(335609856);
        return intent;
    }
    
    protected final void a(final Runnable runnable) {
        if (this.e != null) {
            runnable.run();
            return;
        }
        this.b.add(runnable);
    }
    
    @Override
    public void close() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.a(new oso(this, 1));
    }
    
    public void exitFromVr(final Activity activity, final int n, final Intent intent) {
        this.c();
        Intent intent2 = intent;
        if (intent == null) {
            intent2 = new Intent();
        }
        final PendingIntent pendingResult = activity.createPendingResult(n, intent2, 1073741824);
        this.a(new osr(this, new osq(pendingResult), pendingResult));
    }
    
    public void launchInVr(final PendingIntent pendingIntent) {
        this.c();
        this.d(pendingIntent, null);
    }
    
    public void launchInVr(final ComponentName componentName) {
        this.c();
        if (componentName != null) {
            final Intent vrIntent = createVrIntent(componentName);
            this.b(vrIntent);
            this.d(PendingIntent.getActivity(this.a, 0, vrIntent, 1073741824), vrIntent.getComponent());
            return;
        }
        throw new IllegalArgumentException("Null argument 'componentName' passed to launchInVr");
    }
    
    public void launchInVr(final Intent intent) {
        this.c();
        if (intent != null) {
            this.b(intent);
            this.d(PendingIntent.getActivity(this.a, this.i.incrementAndGet(), intent, 1207959552), intent.getComponent());
            return;
        }
        throw new IllegalArgumentException("Null argument 'intent' passed to launchInVr");
    }
    
    public void launchInVrForResult(final Activity activity, final PendingIntent pendingIntent, final int n) {
        this.c();
        this.a(new osn(this, new otf(activity, pendingIntent, n)));
    }
    
    public void launchVrHomescreen() {
        this.c();
        this.a(new oso(this));
    }
}
