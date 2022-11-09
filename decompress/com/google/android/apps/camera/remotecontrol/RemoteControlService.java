// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.remotecontrol;

import android.os.IBinder;
import android.os.Binder;
import android.os.RemoteException;
import android.content.Intent;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.app.Service;

public class RemoteControlService extends Service
{
    public static final nsd a;
    public ewn b;
    public boolean c;
    public int d;
    public cxl e;
    public cyn f;
    public hbm g;
    public jle h;
    private PackageManager i;
    private int j;
    private aec k;
    private final ServiceConnection l;
    private final hbl m;
    
    static {
        a = nsd.g("com/google/android/apps/camera/remotecontrol/RemoteControlService");
    }
    
    public RemoteControlService() {
        this.j = Integer.MIN_VALUE;
        this.h = null;
        this.c = false;
        this.l = (ServiceConnection)new hbo(this);
        this.m = new hbl(this);
    }
    
    protected final cxl a() {
        synchronized (this) {
            if (this.e == null) {
                final Context applicationContext = this.getApplicationContext();
                applicationContext.getClass();
                ((hbp)((egp)applicationContext).c(hbp.class)).p(this);
            }
            return this.e;
        }
    }
    
    protected final cyn b() {
        synchronized (this) {
            if (this.f == null) {
                final Context applicationContext = this.getApplicationContext();
                applicationContext.getClass();
                ((hbp)((egp)applicationContext).c(hbp.class)).p(this);
            }
            return this.f;
        }
    }
    
    public final hbm c() {
        synchronized (this) {
            if (this.g == null) {
                final Context applicationContext = this.getApplicationContext();
                applicationContext.getClass();
                ((hbp)((egp)applicationContext).c(hbp.class)).p(this);
            }
            return this.g;
        }
    }
    
    public final void d(final int n, final boolean b) {
        final Intent intent = new Intent("com.google.android.apps.camera.remotecontrol.remotekey");
        intent.putExtra("key_value", n);
        intent.putExtra("key_down", b);
        this.k.d(intent);
    }
    
    public final void e(final boolean b) {
        if (this.c) {
            final jle h = this.h;
            if (h != null) {
                Label_0030: {
                    if (!b) {
                        break Label_0030;
                    }
                    try {
                        h.A(1, h.a());
                        return;
                        h.A(2, h.a());
                    }
                    catch (final RemoteException ex) {
                        a.l(RemoteControlService.a.b(), "Error when calling into Photos service", '\u08b9');
                        ex.printStackTrace();
                    }
                }
            }
        }
    }
    
    public final boolean f() {
        final int callingUid = Binder.getCallingUid();
        final boolean k = this.a().k(cxr.aW);
        final boolean b = false;
        if (!k) {
            a.l(RemoteControlService.a.b(), "Feature not enabled.", '\u08bd');
            return false;
        }
        if (this.j == callingUid) {
            return true;
        }
        final String[] packagesForUid = this.i.getPackagesForUid(callingUid);
        if (packagesForUid != null && packagesForUid.length != 0) {
            if (this.b() != cyn.a) {
                final int a = hbq.a;
                if (!hbq.a(packagesForUid[0], this.i)) {
                    a.l(RemoteControlService.a.b(), "Failed to verify calling package.", '\u08bc');
                    return false;
                }
            }
            final int checkPermission = this.i.checkPermission("android.permission.CAMERA", packagesForUid[0]);
            final int checkPermission2 = this.i.checkPermission("android.permission.RECORD_AUDIO", packagesForUid[0]);
            final int checkPermission3 = this.i.checkPermission("android.permission.ACCESS_FINE_LOCATION", packagesForUid[0]);
            boolean b2 = b;
            if (checkPermission == 0) {
                b2 = b;
                if (checkPermission2 == 0) {
                    b2 = b;
                    if (checkPermission3 == 0) {
                        b2 = true;
                    }
                }
            }
            if (b2) {
                this.j = callingUid;
            }
            return b2;
        }
        a.l(RemoteControlService.a.b(), "Failed to get calling package name.", '\u08bb');
        return false;
    }
    
    public final IBinder onBind(final Intent intent) {
        if (!this.a().k(cxr.aW)) {
            return null;
        }
        this.j = Integer.MIN_VALUE;
        return (IBinder)this.m;
    }
    
    public final void onCreate() {
        this.i = this.getPackageManager();
        this.b = ((exs)this.getApplication()).k;
        super.onCreate();
        this.k = aec.a((Context)this);
        this.d = 0;
        final hbm c = this.c();
        c.a = false;
        c.c = Integer.MIN_VALUE;
        c.d = Float.MIN_VALUE;
        c.e = 0L;
        c.f = Float.MIN_VALUE;
        c.g = 0L;
        this.g.a(true);
        final Intent intent = new Intent();
        intent.setClassName("com.google.android.apps.photos", "com.google.android.apps.photos.cameraassistant.CameraAssistantService");
        this.bindService(intent, this.l, 1);
    }
    
    public final void onDestroy() {
        final ServiceConnection l = this.l;
        nov.z(l);
        this.unbindService(l);
        this.g.a(false);
        super.onDestroy();
    }
}
