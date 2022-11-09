// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.processing;

import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.IBinder;
import android.content.Intent;
import java.util.Iterator;
import android.app.NotificationChannel;
import java.util.concurrent.TimeUnit;
import android.os.Handler;
import android.os.PowerManager;
import android.app.NotificationManager;
import android.app.Notification$Builder;
import android.app.Service;

public class ProcessingService extends Service implements gxd
{
    private static final long s;
    public Notification$Builder a;
    public final Object b;
    public gxe c;
    public gxc d;
    public volatile boolean e;
    public final Object f;
    public boolean g;
    public boolean h;
    public boolean i;
    public NotificationManager j;
    public gxa k;
    public PowerManager l;
    public aec m;
    public kse n;
    public kjm o;
    public Handler p;
    public liy q;
    public eys r;
    private final gwz t;
    private Thread u;
    private boolean v;
    
    static {
        s = TimeUnit.SECONDS.toMillis(60L);
    }
    
    public ProcessingService() {
        this.t = new gwz(this);
        this.b = new Object();
        this.e = false;
        this.f = new Object();
    }
    
    private final void d() {
        if (this.v) {
            return;
        }
        this.v = true;
        ((gwy)((egp)this.getApplication()).c(gwy.class)).o(this);
        if (this.q.d) {
            this.j.deleteNotificationChannel("camera");
            final Iterator iterator = this.j.getNotificationChannels().iterator();
            while (iterator.hasNext()) {
                if ("processing".equals(((NotificationChannel)iterator.next()).getId())) {
                    return;
                }
            }
            final NotificationChannel notificationChannel = new NotificationChannel("processing", this.getText(2131952554), 2);
            notificationChannel.setShowBadge(false);
            this.j.createNotificationChannel(notificationChannel);
        }
    }
    
    public final void a(final krd krd) {
        this.a.setProgress(100, krd.e, false);
        this.c();
    }
    
    public final void b(final iwv iwv) {
        this.a.setContentText((CharSequence)iwv.a(this.getResources()));
        this.c();
    }
    
    public final void c() {
        synchronized (this.f) {
            if (this.g && !this.i) {
                this.j.notify(2, this.a.build());
                this.g = false;
                this.h = false;
                this.p.postDelayed((Runnable)new gww(this), 1000L);
            }
            else {
                this.h = true;
            }
        }
    }
    
    public final IBinder onBind(final Intent intent) {
        return null;
    }
    
    public final void onCreate() {
        this.d();
        super.onCreate();
        synchronized (this.f) {
            this.g = true;
            this.h = false;
            this.i = false;
            monitorexit(this.f);
            this.n.f("ProcessingService#onCreate");
            this.n.f("WakeLock#new");
            (this.c = new gxe(this.l, ProcessingService.s)).a("onCreate");
            this.n.g();
            final IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.apps.camera.legacy.app.processing.PAUSE");
            intentFilter.addAction("com.google.android.apps.camera.legacy.app.processing.RESUME");
            this.m.b(this.t, intentFilter);
            Notification$Builder notification$Builder;
            if (this.q.d) {
                notification$Builder = new Notification$Builder((Context)this, "processing");
            }
            else {
                notification$Builder = new Notification$Builder((Context)this);
            }
            this.a = notification$Builder.setSmallIcon(2131231291).setColor(this.getResources().getColor(2131101065)).setWhen(System.currentTimeMillis()).setOngoing(true).setContentTitle(this.getText(2131951740));
            this.n.g();
        }
    }
    
    public final void onDestroy() {
        this.c.b();
        this.m.c(this.t);
        this.stopForeground(true);
        final gxa k = this.k;
        synchronized (k.b) {
            k.g = 3;
            final krr a = k.a;
            String s;
            if (!k.d) {
                s = "No";
            }
            else {
                s = "Yes";
            }
            String concat;
            if (s.length() != 0) {
                concat = "Service destroyed, restarting? ".concat(s);
            }
            else {
                concat = new String("Service destroyed, restarting? ");
            }
            a.f(concat);
            ofn f;
            if (k.d) {
                k.d = false;
                k.b();
                f = null;
            }
            else {
                if (!k.c.isEmpty()) {
                    throw new IllegalStateException("Service destroyed, not restarting but queue has items.");
                }
                f = k.f;
                k.f = ofn.f();
            }
            monitorexit(k.b);
            if (f != null) {
                f.o(Object.class);
            }
        }
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        this.d();
        this.startForeground(2, this.a.build());
        if (this.u == null) {
            (this.u = new kiw(9, new gwx(this, new eyr(this.r)), "CameraProcessingThread")).start();
        }
        return 1;
    }
}
