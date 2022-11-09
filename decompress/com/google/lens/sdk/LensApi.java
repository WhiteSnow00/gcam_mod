// 
// Decompiled by Procyon v0.6.0
// 

package com.google.lens.sdk;

import android.content.ServiceConnection;
import android.os.SystemClock;
import android.os.Bundle;
import android.os.Parcelable;
import android.content.Intent;
import android.os.RemoteException;
import android.app.KeyguardManager$KeyguardDismissCallback;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.os.Build$VERSION;
import android.app.Activity;
import android.content.Context;
import android.app.KeyguardManager;
import android.net.Uri;

public class LensApi
{
    static final Uri a;
    public final lpf b;
    public final KeyguardManager c;
    private final lpc e;
    
    static {
        a = Uri.parse("googleapp://lens");
    }
    
    public LensApi(final Context context) {
        this.c = (KeyguardManager)context.getSystemService("keyguard");
        final lpc e = new lpc(context);
        this.e = e;
        this.b = new lpf(context, e);
    }
    
    private final void i(final Activity activity, final LensApi$LensLaunchStatusCallback lensApi$LensLaunchStatusCallback, final Runnable runnable) {
        if (!this.c.isKeyguardLocked()) {
            runnable.run();
            if (lensApi$LensLaunchStatusCallback != null) {
                lensApi$LensLaunchStatusCallback.onLaunchStatusFetched(0);
            }
            return;
        }
        if (activity == null) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            final StringBuilder sb = new StringBuilder(64);
            sb.append("Cannot start Lens when device is locked with Android ");
            sb.append(sdk_INT);
            Log.e("LensApi", sb.toString());
            if (lensApi$LensLaunchStatusCallback != null) {
                lensApi$LensLaunchStatusCallback.onLaunchStatusFetched(1);
            }
            return;
        }
        this.c(activity, lensApi$LensLaunchStatusCallback, runnable);
    }
    
    private final boolean j(final String s) {
        final String c = this.e.g.c;
        if (TextUtils.isEmpty((CharSequence)c)) {
            return true;
        }
        final String[] split = c.split("\\.", -1);
        final String[] split2 = s.split("\\.", -1);
        for (int min = Math.min(split.length, split2.length), i = 0; i < min; ++i) {
            final int int1 = Integer.parseInt(split[i]);
            final int int2 = Integer.parseInt(split2[i]);
            if (int1 < int2) {
                return true;
            }
            if (int1 > int2) {
                return false;
            }
        }
        return split.length < split2.length;
    }
    
    public final jky a() {
        final lpf b = this.b;
        lpy.b();
        lpy.c(b.a.f(), "getLensCapabilities() called when Lens is not ready.");
        jky jky;
        if (!b.a.f()) {
            jky = jky.c;
        }
        else {
            final lph a = b.a;
            lpy.b();
            final lpo lpo = (lpo)a;
            lpy.c(lpo.l(), "Attempted to use LensCapabilities before ready.");
            jky = lpo.g;
        }
        return jky;
    }
    
    public final void b(final Bitmap b, final oiv oiv) {
        if (this.b.e() != 2) {
            return;
        }
        final oiu c = oiv.c();
        c.b = b;
        this.e(c.a());
    }
    
    public final void c(final Activity activity, final LensApi$LensLaunchStatusCallback lensApi$LensLaunchStatusCallback, final Runnable runnable) {
        this.c.requestDismissKeyguard(activity, (KeyguardManager$KeyguardDismissCallback)new ois(runnable, lensApi$LensLaunchStatusCallback));
    }
    
    public void checkArStickersAvailability(final LensApi$LensAvailabilityCallback lensApi$LensAvailabilityCallback) {
        this.e.a(new oit(lensApi$LensAvailabilityCallback, 1));
    }
    
    public void checkLensAvailability(final LensApi$LensAvailabilityCallback lensApi$LensAvailabilityCallback) {
        this.c.isKeyguardLocked();
        if (this.j("8.3")) {
            lensApi$LensAvailabilityCallback.onAvailabilityStatusFetched(6);
            return;
        }
        this.e.a(new oit(lensApi$LensAvailabilityCallback, 0));
    }
    
    public void checkPendingIntentAvailability(final LensApi$LensAvailabilityCallback lensApi$LensAvailabilityCallback) {
        this.c.isKeyguardLocked();
        if (this.j("9.72")) {
            lensApi$LensAvailabilityCallback.onAvailabilityStatusFetched(6);
            return;
        }
        final lpf b = this.b;
        final oin oin = new oin(lensApi$LensAvailabilityCallback, 1);
        lpy.b();
        b.d(new lpd(b, oin, 2));
    }
    
    public void checkPostCaptureAvailability(final LensApi$LensAvailabilityCallback lensApi$LensAvailabilityCallback) {
        this.c.isKeyguardLocked();
        if (this.j("8.19")) {
            lensApi$LensAvailabilityCallback.onAvailabilityStatusFetched(6);
            return;
        }
        final lpf b = this.b;
        final oin oin = new oin(lensApi$LensAvailabilityCallback);
        lpy.b();
        b.d(new lpd(b, oin, 1));
    }
    
    public final void d(final Activity activity) {
        Object o = this.b;
        lpy.b();
        Label_0154: {
            if (((lpf)o).a.f()) {
                final okv okv = (okv)jkr.c.m();
                if (okv.c) {
                    okv.m();
                    okv.c = false;
                }
                final jkr jkr = (jkr)okv.b;
                jkr.b = 347;
                jkr.a |= 0x1;
                final jkr jkr2 = (jkr)okv.h();
                try {
                    final lph a = ((lpf)o).a;
                    o = jkr2.g();
                    lpy.b();
                    lpy.c(((lpo)a).f(), "Attempted to use lensServiceSession before ready.");
                    final jkl j = ((lpo)a).j;
                    lpy.d(j);
                    j.e((byte[])o);
                    break Label_0154;
                }
                catch (final SecurityException o) {}
                catch (final RemoteException ex) {}
                Log.e("LensServiceBridge", "Unable to send prewarm signal.", (Throwable)o);
            }
        }
        final Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(LensApi.a);
        activity.startActivityForResult(intent, 0);
    }
    
    public final void e(oiv ex) {
        if (((oiv)ex).a != null || ((oiv)ex).b != null) {
            final lpf b = this.b;
            if (!b.c(((oiv)ex).a(b.a()))) {
                return;
            }
        }
        final lpf b2 = this.b;
        b2.a();
        final Bundle d = ((oiv)ex).d();
        lpy.b();
        if (b2.a.f()) {
            final okv okv = (okv)jkr.c.m();
            if (okv.c) {
                okv.m();
                okv.c = false;
            }
            final jkr jkr = (jkr)okv.b;
            jkr.b = 355;
            jkr.a |= 0x1;
            final jkr jkr2 = (jkr)okv.h();
            ex = (SecurityException)new jkp((Parcelable)d);
            try {
                b2.a.c(jkr2.g(), (jkp)ex);
                b2.a.d();
                return;
            }
            catch (final SecurityException ex) {}
            catch (final RemoteException ex2) {}
            Log.e("LensServiceBridge", "Failed to start Lens", (Throwable)ex);
        }
        Log.e("LensApi", "Failed to start lens.");
    }
    
    public final boolean f() {
        return (this.a().a & 0x2) != 0x0;
    }
    
    public final boolean g(final Bitmap b, final oiv oiv) {
        if (b == null) {
            Log.w("LensApi", "launchLensActivityWithBitmap: bitmap should not be null.");
        }
        if (this.c.isKeyguardLocked()) {
            Log.e("LensApi", "Cannot start Lens with Bitmap when device is locked.");
            return false;
        }
        if (this.b.e() != 2) {
            return false;
        }
        final oiu c = oiv.c();
        c.b = b;
        this.e(c.a());
        return true;
    }
    
    public final boolean h(oiv ex, final PendingIntentConsumer b) {
        if (this.b.f() != 2) {
            return false;
        }
        final lpf b2 = this.b;
        b2.c(((oiv)ex).a(b2.a()));
        final lpf b3 = this.b;
        b3.a();
        final Bundle d = ((oiv)ex).d();
        lpy.b();
        b3.b = b;
        if (b3.a.f()) {
            final okv okv = (okv)jkr.c.m();
            if (okv.c) {
                okv.m();
                okv.c = false;
            }
            final jkr jkr = (jkr)okv.b;
            jkr.b = 412;
            jkr.a |= 0x1;
            final jkr jkr2 = (jkr)okv.h();
            ex = (SecurityException)new jkp((Parcelable)d);
            try {
                b3.a.c(jkr2.g(), (jkp)ex);
                return true;
            }
            catch (final SecurityException ex) {}
            catch (final RemoteException ex2) {}
            Log.e("LensServiceBridge", "Failed to send Lens service client event", (Throwable)ex);
        }
        Log.e("LensApi", "Failed to request pending intent.");
        return false;
    }
    
    @Deprecated
    public void launchLensActivity(final Activity activity) {
        this.i(activity, null, new oip(this, activity, 1));
    }
    
    @Deprecated
    public void launchLensActivity(final Activity activity, int a) {
        switch (a) {
            default: {
                final StringBuilder sb = new StringBuilder(34);
                sb.append("Invalid lens activity: ");
                sb.append(a);
                Log.w("LensApi", sb.toString());
                return;
            }
            case 1: {
                a = lpy.a(this.e.g.e);
                if (a != 0) {
                    if (a == 2) {
                        final Intent intent = new Intent();
                        intent.setClassName("com.google.ar.lens", "com.google.vr.apps.ornament.app.MainActivity");
                        activity.startActivity(intent);
                    }
                }
                return;
            }
            case 0: {
                this.i(activity, null, new oip(this, activity));
            }
        }
    }
    
    public void launchLensActivity(final Activity activity, final LensApi$LensLaunchStatusCallback lensApi$LensLaunchStatusCallback) {
        this.i(activity, lensApi$LensLaunchStatusCallback, new oiq(this, activity, oiv.b().a()));
    }
    
    public boolean launchLensActivityWithBitmap(final Bitmap bitmap) {
        if (this.c.isKeyguardLocked()) {
            Log.e("LensApi", "Cannot start Lens with Bitmap when device is locked.");
            return false;
        }
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        final oiu b = oiv.b();
        b.c = elapsedRealtimeNanos;
        return this.g(bitmap, b.a());
    }
    
    public boolean launchLensActivityWithBitmapForTranslate(final Bitmap bitmap) {
        if (!this.f()) {
            Log.e("LensApi", "Translate is not supported.");
            return false;
        }
        final okt m = lpw.c.m();
        final lpv a = lpv.a;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final lpw lpw = (lpw)m.b;
        a.getClass();
        lpw.b = a;
        lpw.a = 2;
        final lpw d = (lpw)m.h();
        final oiu b = oiv.b();
        b.f = 5;
        b.d = d;
        return this.g(bitmap, b.a());
    }
    
    public void onPause() {
        final lpf b = this.b;
        lpy.b();
        final lph a = b.a;
        lpy.b();
        final lpo lpo = (lpo)a;
        if (lpo.l()) {
            final okv okv = (okv)jkr.c.m();
            if (okv.c) {
                okv.m();
                okv.c = false;
            }
            final jkr jkr = (jkr)okv.b;
            jkr.b = 345;
            jkr.a |= 0x1;
            final oky oky = okv.h();
            Label_0144: {
                try {
                    final jkl j = ((lpo)a).j;
                    lpy.d(j);
                    j.e(oky.g());
                    break Label_0144;
                }
                catch (final SecurityException oky) {}
                catch (final RemoteException ex) {}
                Log.e("LensServiceConnImpl", "Unable to end Lens service session.", (Throwable)oky);
            }
            lpo.j = null;
            lpo.e = 0;
            lpo.f = null;
            lpo.g = null;
        }
        if (lpo.k()) {
            try {
                ((lpo)a).b.unbindService((ServiceConnection)a);
            }
            catch (final IllegalArgumentException ex2) {
                Log.w("LensServiceConnImpl", "Unable to unbind, service is not registered.");
            }
            lpo.i = null;
        }
        lpo.i(lpo.h = 1);
        b.b = null;
    }
    
    public void onResume() {
        final lpf b = this.b;
        lpy.b();
        ((lpo)b.a).m();
    }
    
    public boolean requestLensActivityPendingIntent(final PendingIntentConsumer pendingIntentConsumer) {
        return this.h(oiv.b().a(), pendingIntentConsumer);
    }
    
    public boolean requestLensActivityPendingIntentWithBitmap(final Bitmap b, final PendingIntentConsumer pendingIntentConsumer) {
        final oiu b2 = oiv.b();
        b2.b = b;
        return this.h(b2.a(), pendingIntentConsumer);
    }
    
    public boolean requestLensActivityPendingIntentWithBitmapUri(final Context context, final Uri a, final PendingIntentConsumer pendingIntentConsumer) {
        if (context != null) {
            context.grantUriPermission("com.google.android.googlequicksearchbox", a, 1);
        }
        final oiu b = oiv.b();
        b.a = a;
        return this.h(b.a(), pendingIntentConsumer);
    }
}
