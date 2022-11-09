// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

import android.os.IBinder;
import android.content.ComponentName;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.os.IInterface;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import android.os.Looper;
import android.util.SparseArray;
import android.os.Handler;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import android.content.ServiceConnection;

public class ControllerServiceBridge implements ServiceConnection
{
    private static final AtomicInteger i;
    public final Context a;
    public final Handler b;
    final String c;
    public final SparseArray d;
    public otv e;
    public boolean f;
    public oty g;
    private final int j;
    private final otz k;
    
    static {
        i = new AtomicInteger(-1);
    }
    
    public ControllerServiceBridge(final Context context, final ControllerServiceBridge$Callbacks controllerServiceBridge$Callbacks, int j) {
        final otp otp = new otp(j);
        final SparseArray d = new SparseArray();
        this.d = d;
        this.a = context.getApplicationContext();
        final int n = 0;
        final otv e = new otv(controllerServiceBridge$Callbacks, otp, 0);
        this.e = e;
        d.put(e.c, (Object)e);
        this.b = new Handler(Looper.getMainLooper());
        this.k = new otz(this);
        try {
            j = VrCoreUtils.getVrCoreClientApiVersion(context);
        }
        catch (final otd otd) {
            j = n;
        }
        this.j = j;
        j = ControllerServiceBridge.i.incrementAndGet();
        final StringBuilder sb = new StringBuilder(30);
        sb.append("VrCtl.ServiceBridge");
        sb.append(j);
        this.c = sb.toString();
    }
    
    public static final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("This should be running on the main thread.");
    }
    
    private final boolean e(final int n, final otv otv) {
        try {
            final oty g = this.g;
            final String c = this.c;
            final otz otz = new otz(otv, 1);
            final Parcel a = g.a();
            a.writeInt(n);
            a.writeString(c);
            bjg.e(a, (IInterface)otz);
            final Parcel y = g.y(5, a);
            final boolean f = bjg.f(y);
            y.recycle();
            if (f) {
                return true;
            }
        }
        catch (final RemoteException ex) {
            Log.w("VrCtl.ServiceBridge", "RemoteException while registering listener.", (Throwable)ex);
        }
        return false;
    }
    
    public final void a() {
        d();
        if (this.f) {
            d();
            final oty g = this.g;
            if (g != null) {
                try {
                    final String c = this.c;
                    final Parcel a = g.a();
                    a.writeString(c);
                    final Parcel y = g.y(6, a);
                    bjg.f(y);
                    y.recycle();
                }
                catch (final RemoteException ex) {
                    Log.w("VrCtl.ServiceBridge", "RemoteException while unregistering listeners.", (Throwable)ex);
                }
            }
            if (this.j >= 21) {
                try {
                    final oty g2 = this.g;
                    if (g2 != null) {
                        final otz k = this.k;
                        final Parcel a2 = g2.a();
                        bjg.e(a2, (IInterface)k);
                        final Parcel y2 = g2.y(9, a2);
                        final boolean f = bjg.f(y2);
                        y2.recycle();
                        if (!f) {
                            Log.w("VrCtl.ServiceBridge", "Failed to unregister remote service listener.");
                        }
                    }
                }
                catch (final RemoteException ex2) {
                    final String value = String.valueOf(ex2);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 55);
                    sb.append("Exception while unregistering remote service listener: ");
                    sb.append(value);
                    Log.w("VrCtl.ServiceBridge", sb.toString());
                }
            }
            this.a.unbindService((ServiceConnection)this);
            this.g = null;
            this.f = false;
            return;
        }
        Log.w("VrCtl.ServiceBridge", "Service is already unbound.");
    }
    
    public final void b() {
        this.e.a.i();
        final otv e = this.e;
        if (!this.e(e.c, e)) {
            Log.w("VrCtl.ServiceBridge", "Failed to register service listener.");
            this.e.a.f();
            this.a();
            return;
        }
        final SparseArray d = this.d;
        final otv e2 = this.e;
        d.put(e2.c, (Object)e2);
    }
    
    public final void c(final int n, final ots ots) {
        d();
        final oty g = this.g;
        if (g != null) {
            try {
                final Parcel a = g.a();
                a.writeInt(n);
                bjg.c(a, (Parcelable)ots);
                g.z(11, a);
                return;
            }
            catch (final RemoteException ex) {
                Log.w("VrCtl.ServiceBridge", "RemoteException while vibrating the controller.", (Throwable)ex);
                return;
            }
        }
        Log.w("VrCtl.ServiceBridge", "Vibration cancelled: service not connected");
    }
    
    public void controllerHapticsEffect(final int n, final int b, final int c) {
        final okt m = ouc.d.m();
        final okt i = oua.d.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final oua oua = (oua)i.b;
        final int a = oua.a | 0x1;
        oua.a = a;
        oua.b = b;
        oua.a = (a | 0x2);
        oua.c = c;
        final oua c2 = (oua)i.h();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final ouc ouc = (ouc)m.b;
        c2.getClass();
        ouc.c = c2;
        ouc.a |= 0x2;
        final ouc ouc2 = (ouc)m.h();
        final ots ots = new ots();
        ots.a(ouc2);
        this.b.post((Runnable)new otu(this, n, ots, 1));
    }
    
    public boolean createAndConnectController(final int n, final ControllerServiceBridge$Callbacks controllerServiceBridge$Callbacks, int n2) {
        final otp otp = new otp(n2);
        d();
        final oty g = this.g;
        boolean b = false;
        if (g != null) {
            final otv e = new otv(controllerServiceBridge$Callbacks, otp, n);
            if (this.e(e.c, e)) {
                if (e.c == 0) {
                    this.e = e;
                }
                this.d.put(n, (Object)e);
                b = true;
            }
            else {
                if ((n2 = n) == 0) {
                    Log.e("VrCtl.ServiceBridge", "Failed to connect controller 0.");
                    n2 = 0;
                }
                this.d.remove(n2);
            }
        }
        return b;
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        d();
        if (this.f) {
            oty g;
            if (binder == null) {
                g = null;
            }
            else {
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.vr.vrcore.controller.api.IControllerService");
                if (queryLocalInterface instanceof oty) {
                    g = (oty)queryLocalInterface;
                }
                else {
                    g = new oty(binder);
                }
            }
            this.g = g;
            try {
                final Parcel a = g.a();
                a.writeInt(25);
                final Parcel y = g.y(1, a);
                final int int1 = y.readInt();
                y.recycle();
                if (int1 != 0) {
                    String string = null;
                    switch (int1) {
                        default: {
                            final StringBuilder sb = new StringBuilder(45);
                            sb.append("[UNKNOWN CONTROLLER INIT RESULT: ");
                            sb.append(int1);
                            sb.append("]");
                            string = sb.toString();
                            break;
                        }
                        case 3: {
                            string = "FAILED_CLIENT_OBSOLETE";
                            break;
                        }
                        case 2: {
                            string = "FAILED_NOT_AUTHORIZED";
                            break;
                        }
                        case 1: {
                            string = "FAILED_UNSUPPORTED";
                            break;
                        }
                        case 0: {
                            string = "SUCCESS";
                            break;
                        }
                    }
                    final String value = String.valueOf(string);
                    String concat;
                    if (value.length() != 0) {
                        concat = "initialize() returned error: ".concat(value);
                    }
                    else {
                        concat = new String("initialize() returned error: ");
                    }
                    Log.e("VrCtl.ServiceBridge", concat);
                    this.e.a.g(int1);
                    this.a();
                    return;
                }
                if (this.j >= 21) {
                    try {
                        final oty g2 = this.g;
                        final otz k = this.k;
                        final Parcel a2 = g2.a();
                        bjg.e(a2, (IInterface)k);
                        final Parcel y2 = g2.y(8, a2);
                        final boolean f = bjg.f(y2);
                        y2.recycle();
                        if (!f) {
                            Log.e("VrCtl.ServiceBridge", "Failed to register remote service listener.");
                            this.e.a.g(0);
                            this.a();
                            return;
                        }
                    }
                    catch (final RemoteException ex) {
                        final String value2 = String.valueOf(ex);
                        final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 53);
                        sb2.append("Exception while registering remote service listener: ");
                        sb2.append(value2);
                        Log.w("VrCtl.ServiceBridge", sb2.toString());
                    }
                }
                this.b();
            }
            catch (final RemoteException ex2) {
                Log.e("VrCtl.ServiceBridge", "Failed to call initialize() on controller service (RemoteException).", (Throwable)ex2);
                this.e.a.f();
                this.a();
            }
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        d();
        this.g = null;
        this.e.a.e();
    }
    
    public void requestBind() {
        this.b.post((Runnable)new ott(this, 1));
    }
    
    public void requestUnbind() {
        this.b.post((Runnable)new ott(this));
    }
    
    public void vibrateController(final int n, int n2, final int c, final int d) {
        final okt m = ouc.d.m();
        final okt i = oub.e.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final oub oub = (oub)i.b;
        final int a = oub.a | 0x1;
        oub.a = a;
        oub.b = n2;
        n2 = (a | 0x2);
        oub.a = n2;
        oub.c = c;
        oub.a = (n2 | 0x4);
        oub.d = d;
        final oub b = (oub)i.h();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final ouc ouc = (ouc)m.b;
        b.getClass();
        ouc.b = b;
        ouc.a |= 0x1;
        final ouc ouc2 = (ouc)m.h();
        final ots ots = new ots();
        ots.a(ouc2);
        this.b.post((Runnable)new otu(this, n, ots));
    }
}
