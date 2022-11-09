import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hvb implements hik
{
    private static final nsd g;
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public List f;
    private final eyt h;
    private final him i;
    private hio j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private boolean q;
    
    static {
        g = nsd.g("com/google/android/apps/camera/stats/CaptureSessionTrace");
    }
    
    public hvb(final eyt h, final him i) {
        this.p = false;
        this.q = false;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void a() {
        if (!this.p) {
            a.k(hvb.g.c(), "onCaptureFinalized invoked without the final result being set!%s", ksc.b(), '\u09d5');
            return;
        }
        this.toString();
    }
    
    @Override
    public final void b() {
    }
    
    @Override
    public final void c(final eza eza) {
        if (this.q) {
            a.k(hvb.g.c(), "onCaptureStarted invoked after stated event was logged!%s", ksc.b(), '\u09de');
            return;
        }
        this.q = true;
        this.a = SystemClock.elapsedRealtimeNanos();
        this.j = eza.a;
        this.toString();
        this.h.p(this.a, eza);
    }
    
    @Override
    public final void d(final Bitmap bitmap) {
        this.l = SystemClock.elapsedRealtimeNanos();
        this.toString();
    }
    
    @Override
    public final void e(final niz niz) {
        if (niz.g()) {
            this.n = ((hwe)niz.c()).c();
            this.o = ((hwe)niz.c()).d();
        }
        this.k = SystemClock.elapsedRealtimeNanos();
        this.toString();
    }
    
    @Override
    public final void f(final int n, final int n2, final Throwable t) {
        if (!this.q) {
            a.k(hvb.g.c(), "onCaptureCanceled invoked before capture was started!%s", ksc.b(), '\u09d0');
            return;
        }
        if (this.p) {
            a.k(hvb.g.c(), "onCaptureCanceled invoked after final event was logged!%s", ksc.b(), '\u09cf');
            return;
        }
        this.p = true;
        this.toString();
        this.h.Z(this.a, this.j, n, n2, t);
    }
    
    @Override
    public final void g(final int n, final int n2, final Throwable t) {
        if (!this.q) {
            a.k(hvb.g.c(), "onCaptureFailed invoked before capture was started!%s", ksc.b(), '\u09d3');
            return;
        }
        if (this.p) {
            a.k(hvb.g.c(), "onCaptureFailed invoked after final event was logged!%s", ksc.b(), '\u09d2');
            return;
        }
        this.p = true;
        this.toString();
        this.h.aa(this.a, this.j, n, n2, t);
    }
    
    @Override
    public final void h(final int n, final int n2) {
        if (!this.q) {
            a.k(hvb.g.c(), "onCapturePersisted invoked before capture was started!%s", ksc.b(), '\u09d9');
            return;
        }
        if (this.p) {
            a.k(hvb.g.c(), "onCapturePersisted invoked after final event was logged!%s", ksc.b(), '\u09d8');
            return;
        }
        this.p = true;
        this.m = SystemClock.elapsedRealtimeNanos();
        this.toString();
        this.h.ab(this.n, this.o, this.a, this.k, this.l, this.b, this.c, this.d, this.e, this.f, this.m, this.j, n, n2);
    }
    
    @Override
    public final void i(final int n, final int n2) {
        if (!this.q) {
            a.k(hvb.g.c(), "onCaptureStartCommitted invoked before capture was started!%s", ksc.b(), '\u09dc');
            return;
        }
        if (this.p) {
            a.k(hvb.g.c(), "onCaptureStartCommitted invoked after final event was logged!%s", ksc.b(), '\u09db');
            return;
        }
        this.toString();
        this.h.ac(this.a, this.j, n, n2);
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.b("shotId", this.i);
        c.f("CaptureStartTimeNs", this.a);
        c.f("ShutterButtonDownTimeNs", this.n);
        c.f("ShutterButtonUpTimeNs", this.o);
        c.f("TinyThumbTimeNs", this.k);
        c.f("MediumThumbTimeNs", this.l);
        c.f("CapturePersistedTimeNs", this.m);
        c.b("SessionType", this.j);
        return c.toString();
    }
}
