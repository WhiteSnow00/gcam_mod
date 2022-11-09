import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmq
{
    public final kof a;
    public final Executor b;
    public final ConcurrentLinkedQueue c;
    public final Object d;
    public kmp e;
    public kob f;
    
    public kmq(final kof a, final Executor b, final niz niz) {
        this.d = new Object();
        this.f = new kmk(this);
        this.a = a;
        this.b = b;
        this.c = new ConcurrentLinkedQueue();
        this.e = kmp.a;
        if (niz.g()) {
            this.f = (kob)niz.c();
        }
    }
    
    public final void a() {
        synchronized (this.d) {
            njo.s(this.e == kmp.b, "%s is expected but we get %s", kmp.b, this.e);
            this.e = kmp.c;
            ofi.w(this.a.g(), new kmm(this, 1), this.b);
        }
    }
    
    public final void b() {
        synchronized (this.d) {
            final kmp e = this.e;
            final kmp b = kmp.b;
            boolean b2 = true;
            if (e != b) {
                if (this.e != kmp.c) {
                    b2 = false;
                }
            }
            njo.t(b2, "%s or %s is expected but we get %s", kmp.b, kmp.c, this.e);
            this.e = kmp.d;
            ofi.w(this.a.k(), new kml(this), this.b);
        }
    }
}
