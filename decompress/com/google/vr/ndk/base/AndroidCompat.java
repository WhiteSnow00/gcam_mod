// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.app.Activity;

public final class AndroidCompat
{
    private AndroidCompat() {
    }
    
    public static void setSustainedPerformanceMode(final Activity activity, final boolean b) {
        orq.a(activity, b);
    }
    
    public static boolean setVrModeEnabled(final Activity activity, final boolean b) {
        return orq.b(activity, b);
    }
}
