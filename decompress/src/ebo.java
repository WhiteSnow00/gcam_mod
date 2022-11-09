import com.google.android.libraries.vision.opengl.Texture;
import android.os.SystemClock;
import java.util.EnumMap;
import java.util.Map;
import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ebo implements edr
{
    public final edx a;
    public final eai b;
    public double c;
    public float d;
    public final AtomicBoolean e;
    public double f;
    public double g;
    public final float[] h;
    public boolean i;
    public final lmm j;
    public double k;
    public final jda l;
    public long m;
    public int n;
    public double o;
    public final Object p;
    public float q;
    public ebm r;
    private final edy s;
    private double t;
    private final TrackerStats u;
    private double v;
    private double w;
    private double x;
    private final Map y;
    
    public ebo(final edy s, final edx a, final lmm j) {
        this.b = new eai();
        this.c = 0.0;
        this.t = 0.0;
        this.u = new TrackerStats();
        this.d = 0.0f;
        this.v = 0.0;
        this.f = 0.0;
        this.g = 0.0;
        this.h = new float[9];
        this.i = false;
        this.k = 0.0;
        this.l = new jda(10);
        this.m = 0L;
        this.n = 0;
        this.o = 0.0;
        this.w = 0.0;
        this.x = 0.0;
        this.p = new Object();
        final EnumMap y = new EnumMap((Class<K>)ebn.class);
        this.y = y;
        this.s = s;
        this.a = a;
        this.j = j;
        this.e = new AtomicBoolean(false);
        y.put((Object)ebn.a, 25.0f);
        y.put((Object)ebn.b, 35.0f);
    }
    
    @Override
    public final void a(final float[] array, long elapsedRealtime) {
        if (!this.e.get()) {
            return;
        }
        this.a.d.getTrackerStats(this.u);
        this.i(this.i);
        final float captureProgress = this.a.d.getCaptureProgress();
        final float d = this.d;
        float n = 0.0f;
        Label_0104: {
            Label_0100: {
                if (captureProgress < 0.0f) {
                    if (captureProgress >= d) {
                        break Label_0100;
                    }
                    this.d = captureProgress;
                }
                else {
                    if (captureProgress <= d) {
                        break Label_0100;
                    }
                    this.d = captureProgress;
                }
                n = captureProgress;
                break Label_0104;
            }
            n = d;
        }
        if ((d >= 0.0f && n < 0.0f) || (d < 0.0f && n >= 0.0f)) {
            this.t = this.c;
        }
        final ebm r = this.r;
        if (r == null) {
            return;
        }
        final int n2 = 1;
        if (n >= 1.0f || n <= -1.0f) {
            final eby eby = (eby)r;
            eby.g.execute(new ebt(eby, 1));
            return;
        }
        nov.z(r);
        final double f = this.w - this.v;
        this.f = f;
        if (Math.abs(f) > 25.0 || Math.abs(this.w) > 60.0) {
            r.a(3);
            this.e.set(false);
            return;
        }
        final double a = this.b.a(this.x);
        elapsedRealtime = SystemClock.elapsedRealtime();
        final long n3 = elapsedRealtime - this.m;
        if (n3 != 0L) {
            final double k = this.k;
            this.m = elapsedRealtime;
            this.k = a;
            final jda l = this.l;
            final double n4 = (double)n3;
            Double.isNaN(n4);
            l.a((float)((a - k) / n4 * 1000.0));
        }
        double abs = Math.abs(a - this.c);
        final double abs2 = Math.abs(this.t - this.c);
        if (abs > abs2) {
            this.t = a;
        }
        else {
            abs = abs2;
        }
        final double abs3 = Math.abs(a - this.t);
        this.g = abs3;
        if (abs > 30.0 && abs3 > 30.0) {
            r.a(5);
            this.e.set(false);
            return;
        }
        if (Math.abs(this.l.a) >= 140.0f) {
            r.a(6);
            this.e.set(false);
            return;
        }
        if (Math.abs(this.o) > 18.0) {
            r.a(4);
            this.e.set(false);
            return;
        }
        this.h(this.y);
        final Float n5 = this.y.get(ebn.b);
        float floatValue;
        if (n5 != null) {
            floatValue = n5;
        }
        else {
            floatValue = 35.0f;
        }
        int n6;
        if (Math.abs(this.f()) >= floatValue) {
            n6 = 6;
        }
        else if (Math.abs(this.o) >= 10.0) {
            n6 = 4;
        }
        else if (Math.abs(this.f) < 10.0 && Math.abs(this.w) <= 50.0) {
            n6 = n2;
            if (abs > 30.0) {
                n6 = n2;
                if (this.g > 10.0) {
                    n6 = 5;
                }
            }
        }
        else {
            n6 = 3;
        }
        switch (n6 - 1) {
            case 5: {
                final eby eby2 = (eby)r;
                eby2.e(eby2.v);
                break;
            }
            case 4: {
                final eby eby3 = (eby)r;
                eby3.e(eby3.w);
                break;
            }
            case 3: {
                final eby eby4 = (eby)r;
                eby4.e(eby4.x);
                break;
            }
            case 2: {
                final eby eby5 = (eby)r;
                irf irf;
                if (eby5.f.k()) {
                    irf = eby5.z;
                }
                else {
                    irf = eby5.y;
                }
                eby5.e(irf);
                break;
            }
        }
        ((eby)r).q = captureProgress;
    }
    
    @Override
    public final void b(final int n, final int n2) {
    }
    
    @Override
    public final void c(final Texture texture, final edq edq) {
    }
    
    @Override
    public final void d() {
    }
    
    @Override
    public final void e(final eap eap) {
    }
    
    public final float f() {
        return this.l.a;
    }
    
    public final float g() {
        if (this.e.get()) {
            return this.d;
        }
        return 0.0f;
    }
    
    public final void h(final Map map) {
        synchronized (this.p) {
            final float q = this.q;
            monitorexit(this.p);
            final float max = Math.max(8.0f, 25.0f - q);
            final float max2 = Math.max(20.0f, 35.0f - q);
            map.put(ebn.a, max);
            map.put(ebn.b, max2);
        }
    }
    
    public final void i(final boolean b) {
        synchronized (this.h) {
            this.s.d(this.h);
            this.w = this.s.b();
            this.x = this.s.a();
            this.o = Math.toDegrees(Math.asin(this.h[4]));
            if (this.k() && this.n == 270) {
                this.o = -this.o;
            }
            if (b) {
                this.i = false;
                final double a = this.b.a(this.x);
                this.c = a;
                this.k = a;
                this.t = a;
                this.v = this.w;
            }
        }
    }
    
    public final boolean j() {
        return this.e.get();
    }
    
    public final boolean k() {
        return this.n != 0;
    }
}
