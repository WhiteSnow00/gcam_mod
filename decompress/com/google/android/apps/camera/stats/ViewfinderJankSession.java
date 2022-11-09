// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.stats;

import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import com.google.android.apps.camera.stats.timing.TimingSession;

public class ViewfinderJankSession implements TimingSession
{
    public final Object a;
    public final List b;
    public final List c;
    public int d;
    public int e;
    public int f;
    public int g;
    private nzd h;
    private Runnable i;
    
    public ViewfinderJankSession() {
        this.a = new Object();
        this.b = new ArrayList(30);
        this.c = new ArrayList();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
    }
    
    public static final nzd c(final ljm ljm, final double n, final double n2) {
        final okt m = nzd.i.m();
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzd nzd = (nzd)m.b;
        nzd.a |= 0x1;
        nzd.b = elapsedRealtimeNanos;
        final long b = ljm.b();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzd nzd2 = (nzd)m.b;
        nzd2.a |= 0x4;
        nzd2.d = b;
        final Long n3 = (Long)ljm.d(CaptureResult.SENSOR_TIMESTAMP);
        final Long n4 = (Long)ljm.d(CaptureResult.SENSOR_FRAME_DURATION);
        final Long n5 = (Long)ljm.d(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (n3 != null) {
            final long longValue = n3;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nzd nzd3 = (nzd)m.b;
            nzd3.a |= 0x2;
            nzd3.c = longValue;
        }
        if (n4 != null) {
            final int h = jxc.h(n4);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nzd nzd4 = (nzd)m.b;
            nzd4.a |= 0x8;
            nzd4.e = h;
        }
        if (n5 != null) {
            final int h2 = jxc.h(n5);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nzd nzd5 = (nzd)m.b;
            nzd5.a |= 0x10;
            nzd5.f = h2;
        }
        if (n > 0.0) {
            final int g = jxc.g(n);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nzd nzd6 = (nzd)m.b;
            nzd6.a |= 0x40;
            nzd6.h = g;
        }
        if (n2 > 0.0) {
            final int g2 = jxc.g(n2);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nzd nzd7 = (nzd)m.b;
            nzd7.a |= 0x20;
            nzd7.g = g2;
        }
        return (nzd)m.h();
    }
    
    public final void a(final nzd h) {
        if (this.h == null) {
            this.h = h;
        }
    }
    
    @Override
    public final void b(final Runnable i) {
        this.i = i;
    }
    
    @Override
    public final void close() {
        final Runnable i = this.i;
        if (i != null) {
            i.run();
        }
    }
    
    public int getDelay150PctCount() {
        return this.f;
    }
    
    public int getDelay500PctCount() {
        return this.g;
    }
    
    public int getDelay50PctCount() {
        return this.e;
    }
}
