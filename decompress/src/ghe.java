import android.util.Pair;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ghe implements ghr, kkt
{
    private static final nsd a;
    private final dvj b;
    private final njp c;
    private final Object d;
    private lgb e;
    private ljm f;
    private boolean g;
    
    static {
        a = nsd.g("com/google/android/apps/camera/one/smartmetering/LazySmartMeteringProcessor");
    }
    
    public ghe(final dvj b, final njp c) {
        this.b = b;
        this.c = c;
        this.d = new Object();
        this.e = null;
        this.f = null;
        this.g = false;
    }
    
    @Override
    public final niz a() {
        synchronized (this) {
            synchronized (this.d) {
                final lgb e = this.e;
                niz niz;
                if (e != null) {
                    niz = niz.h(e.k());
                    e.l();
                }
                else {
                    niz = nii.a;
                }
                return niz;
            }
        }
    }
    
    @Override
    public final njp b() {
        synchronized (this.d) {
            return nov.G(Pair.create((Object)null, (Object)this.f));
        }
    }
    
    @Override
    public final String c() {
        return "LazySmartMeteringProcessor";
    }
    
    @Override
    public final void close() {
        synchronized (this.d) {
            if (this.g) {
                return;
            }
            this.g = true;
            final ljm f = this.f;
            if (f != null) {
                this.b.v(this.b.a(f));
            }
            this.d();
            this.f = null;
        }
    }
    
    @Override
    public final void d() {
        synchronized (this.d) {
            final lgb e = this.e;
            if (e != null) {
                e.l();
                this.e = null;
            }
        }
    }
    
    @Override
    public final void e(final gaa gaa, final ljm f) {
        synchronized (this.d) {
            if (this.g) {
                gaa.close();
                return;
            }
            if (!gaa.m()) {
                ghe.a.c().E(1813).o("No Image Data! Ignoring the metering frames.");
                gaa.close();
                return;
            }
            final lgb e = this.e;
            if (e != null) {
                e.l();
            }
            final lgb e2 = new lgb(gaa);
            this.f = f;
            if (this.c.a()) {
                final lju k = e2.k();
                if (k != null) {
                    this.b.q(this.b.a(f), k, f);
                }
            }
            this.e = e2;
        }
    }
}
