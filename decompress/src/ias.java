import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import android.media.MediaCodec$Callback;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ias
{
    public static final nsd a;
    public ley A;
    public kmq B;
    public final AtomicBoolean b;
    public final AtomicBoolean c;
    public final odq d;
    public final AtomicLong e;
    public final AtomicLong f;
    public final AtomicLong g;
    public final AtomicLong h;
    public final AtomicLong i;
    public final AtomicLong j;
    public final AtomicLong k;
    public final AtomicLong l;
    public final AtomicLong m;
    public final AtomicLong n;
    public final AtomicLong o;
    public final AtomicLong p;
    public final cxl q;
    public final MediaCodec$Callback r;
    public final Object s;
    public final klv t;
    public ida u;
    public idd v;
    public niz w;
    public ofn x;
    public idc y;
    public ibh z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/timelapse/TimelapseFrameSelector");
    }
    
    public ias(final cxl q, final klv t) {
        this.b = new AtomicBoolean(false);
        this.c = new AtomicBoolean(false);
        this.d = new odq(null);
        this.e = new AtomicLong(0L);
        this.f = new AtomicLong(0L);
        this.g = new AtomicLong(0L);
        this.h = new AtomicLong(0L);
        this.i = new AtomicLong(0L);
        this.j = new AtomicLong(0L);
        this.k = new AtomicLong(0L);
        this.l = new AtomicLong(0L);
        this.m = new AtomicLong(0L);
        this.n = new AtomicLong(0L);
        this.o = new AtomicLong(0L);
        this.p = new AtomicLong(0L);
        this.s = new Object();
        this.w = nii.a;
        this.q = q;
        this.t = t;
        this.y = idc.a;
        this.r = new iar(this, q);
    }
    
    public final long a() {
        return this.f.get();
    }
    
    public final long b() {
        return this.g.get() - this.f.get();
    }
    
    public final long c() {
        return TimeUnit.SECONDS.toMillis(this.g.get()) / this.e().f;
    }
    
    public final long d() {
        return this.e.get();
    }
    
    final idc e() {
        synchronized (this.s) {
            return this.y;
        }
    }
    
    public final void f() {
        if (this.n.get() > 0L) {
            final AtomicLong o = this.o;
            o.set(o.get() + TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis()) - this.n.get());
        }
    }
}
