// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.legacy.lightcycle.panorama;

import java.util.Map;

public class LightCycle$LightCycleProgressCallback
{
    public static void onProgress(final int n, final int n2) {
        final Map c = esh.c;
        final Integer value = n;
        if (c.containsKey(value)) {
            final etg etg = esh.c.get(value);
            synchronized (etg.d.b) {
                if (etg.d.b.get()) {
                    return;
                }
                etg.d.a.b.b(krd.c(n2));
                final long length = etg.c.length();
                if (length != etg.a) {
                    etg.d.a.b.K();
                    etg.a = length;
                }
                monitorexit(etg.d.b);
                etg.d.h();
            }
        }
    }
}
