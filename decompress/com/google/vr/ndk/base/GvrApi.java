// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.Parcelable;
import java.util.ArrayList;
import android.content.Intent;
import android.app.PendingIntent;
import android.content.Context;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import android.os.Build;

public class GvrApi
{
    static {
        "robolectric".equals(Build.FINGERPRINT);
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            oss.a();
        }
        finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
    
    private static native long nativeGetUserPrefs(final long p0);
    
    private static native boolean nativeIsFeatureSupported(final long p0, final int p1);
    
    public static native boolean nativeUserPrefsIsFeatureEnabled(final long p0, final int p1);
    
    private static void requestFeatures(final Context context, final long n, final int[] array, final int[] array2, final PendingIntent pendingIntent) {
        final osu[] a = osu.a(array);
        final osu[] a2 = osu.a(array2);
        final osv osv = new osv(nativeGetUserPrefs(n));
        final Intent setFlags = new Intent("com.google.intent.action.vr.REQUEST_FEATURE").setComponent(osk.a).setFlags(268435456);
        final ArrayList list = new ArrayList();
        final int length = a.length;
        final int n2 = 0;
        for (final osu osu : a) {
            if (nativeIsFeatureSupported(n, osu.c) && !osv.a(osu)) {
                list.add(osu.d);
            }
        }
        if (!list.isEmpty()) {
            setFlags.putExtra("required_features", (String[])list.toArray(new String[list.size()]));
        }
        final ArrayList<String> list2 = new ArrayList<String>();
        for (int length2 = a2.length, j = n2; j < length2; ++j) {
            final osu osu2 = a2[j];
            if (nativeIsFeatureSupported(n, osu2.c) && !osv.a(osu2)) {
                list2.add(osu2.d);
            }
        }
        if (!list2.isEmpty()) {
            setFlags.putExtra("optional_features", (String[])list2.toArray(new String[list2.size()]));
        }
        if (setFlags.getExtras() != null) {
            setFlags.putExtra("pending_intent", (Parcelable)pendingIntent);
            context.startActivity(setFlags);
        }
    }
    
    public long getNativeGvrContext() {
        throw null;
    }
}
