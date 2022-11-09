// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.moments;

import android.hardware.HardwareBuffer;
import java.util.concurrent.Executor;
import com.google.googlex.gcam.Gcam;

public class FastMomentsHdrImpl implements ful
{
    public final krr a;
    public final long b;
    public final Gcam c;
    public final ohs d;
    private final Executor e;
    
    public FastMomentsHdrImpl(final krr krr, final Gcam c, final Executor e, final ohs d) {
        this.a = krr.a("FastMomentsHdr");
        this.c = c;
        this.e = e;
        this.d = d;
        egz.b();
        this.b = createImpl();
    }
    
    private static native long createImpl();
    
    private static native void releaseImpl(final long p0);
    
    @Override
    public final void a() {
        this.e.execute(new fqr(this));
    }
    
    @Override
    public final void b(final lju lju, final fum fum, final fuk fuk, final fuj fuj) {
        final int a = lju.a();
        final boolean b = true;
        njo.j(a == 37, "Wrong format for input ImageProxy. Got %s, expected RAW10 (%s)", lju.a(), 37);
        final HardwareBuffer f = lju.f();
        f.getClass();
        njo.e(fuk.a.a % 4 == 0, "Only multiple of 4 widths are supported!");
        njo.e(fuk.a.b % 2 == 0 && b, "Only multiple of 2 heights are supported!");
        this.e.execute(new fqs(this, lju, fum, fum.c.b(), fum.a, fuk, f, fuj));
    }
    
    @Override
    public final boolean c(kvs e, final gry gry) {
        e = (kvs)gry.a(e).e();
        boolean b = false;
        Label_0028: {
            if (e != null) {
                break Label_0028;
            }
            try {
                this.a.d("No RAW10 image found in frame. Can't use FastMomentsHdr");
                return false;
                while (true) {
                    HardwareBuffer f = null;
                Block_4:
                    while (true) {
                        iftrue(Label_0052:)(f == null);
                        break Block_4;
                        e.close();
                        return b;
                        f = ((lju)e).f();
                        iftrue(Label_0044:)(f == null);
                        b = true;
                        continue;
                    }
                    f.close();
                    continue;
                }
            }
            finally {
                if (e != null) {
                    try {
                        e.close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)gry).addSuppressed(t);
                    }
                }
            }
        }
    }
    
    public final void finalize() {
        final long b = this.b;
        if (b != 0L) {
            releaseImpl(b);
        }
    }
    
    public native void initializeProcessingQueueNative(final long p0, final long p1);
    
    public native HardwareBuffer processRaw10ToRgbaHardwareBufferNative(final long p0, final long p1, final int p2, final long p3, final HardwareBuffer p4, final long p5, final long p6, final long p7, final int p8, final int p9, final long p10, final int p11);
    
    public native HardwareBuffer processRaw10ToYuvHardwareBufferNative(final long p0, final long p1, final int p2, final long p3, final HardwareBuffer p4, final long p5, final long p6, final long p7, final int p8, final int p9, final long p10, final int p11);
    
    public native long processRaw10ToYuvImageNative(final long p0, final long p1, final int p2, final HardwareBuffer p3, final long p4, final long p5, final long p6, final int p7, final int p8, final long p9, final int p10);
}
