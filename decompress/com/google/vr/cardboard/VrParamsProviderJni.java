// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.cardboard;

import java.lang.reflect.Field;
import android.view.Display;
import android.content.res.Resources;
import android.util.Log;
import android.content.Context;
import android.util.DisplayMetrics;

public class VrParamsProviderJni
{
    private static void a(final long n, final DisplayMetrics displayMetrics, final float n2, final int n3) {
        nativeUpdateNativeDisplayParamsPointer(n, displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.xdpi, displayMetrics.ydpi, n2, n3);
    }
    
    private static native void nativeUpdateNativeDisplayParamsPointer(final long p0, final int p1, final int p2, final float p3, final float p4, final float p5, final int p6);
    
    private static byte[] readDeviceParams(final Context context) {
        final osi g = psn.g(context);
        final osx b = g.b();
        g.e();
        if (b == null) {
            return null;
        }
        return b.g();
    }
    
    private static void readDisplayParams(final Context context, final long n) {
        orr b = null;
        int n2 = 0;
        if (context == null) {
            Log.w("VrParamsProviderJni", "Missing context for phone params lookup. Results may be invalid.");
            a(n, Resources.getSystem().getDisplayMetrics(), pqf.l(null), 0);
            return;
        }
        final osi g = psn.g(context);
        final osy c = g.c();
        g.e();
        final Display n3 = pqf.n(context);
        final DisplayMetrics m = pqf.m(n3);
        if (c != null) {
            if ((c.a & 0x1) != 0x0) {
                m.xdpi = c.b;
            }
            if ((c.a & 0x2) != 0x0) {
                m.ydpi = c.c;
            }
        }
        final float l = pqf.l(c);
        try {
            final Class<?> forName = Class.forName("android.view.DisplayInfo");
            final Object instance = forName.getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            Display.class.getDeclaredMethod("getDisplayInfo", forName).invoke(n3, instance);
            final Field declaredField = forName.getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            b = orr.b(declaredField.get(instance));
        }
        catch (final Exception ex) {
            final String value = String.valueOf(ex);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 44);
            sb.append("Failed to fetch DisplayCutout from Display: ");
            sb.append(value);
            Log.e("AndroidPCompat", sb.toString());
        }
        if (b != null) {
            if (context.getResources().getConfiguration().orientation == 1) {
                n2 = b.a("getSafeInsetTop") + b.a("getSafeInsetBottom");
            }
            else {
                n2 = b.a("getSafeInsetLeft") + b.a("getSafeInsetRight");
            }
        }
        a(n, m, l, n2);
    }
    
    private static byte[] readSdkConfigurationParams(final Context context) {
        return ost.a(context).g();
    }
    
    private static byte[] readUserPrefs(final Context context) {
        final osi g = psn.g(context);
        final osz d = g.d();
        g.e();
        if (d == null) {
            return null;
        }
        return d.g();
    }
    
    private static boolean writeDeviceParams(final Context context, final byte[] array) {
        final osi g = psn.g(context);
        Label_0036: {
            if (array == null) {
                break Label_0036;
            }
            try {
                try {
                    final osx osx = (osx)oky.t(osx.a, array, okm.b());
                }
                finally {}
            }
            catch (final olm olm) {
                final String value = String.valueOf(olm);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 31);
                sb.append("Error parsing protocol buffer: ");
                sb.append(value);
                Log.w("VrParamsProviderJni", sb.toString());
                g.e();
                return false;
                while (true) {
                    final osx osx2;
                    final boolean f = g.f(osx2);
                    g.e();
                    return f;
                    osx2 = null;
                    continue;
                }
            }
        }
        g.e();
    }
}
