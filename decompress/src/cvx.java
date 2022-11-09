import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cvx
{
    private static final AtomicBoolean a;
    private final cvb b;
    private final boolean c;
    private final cvg d;
    private final eyt e;
    private final AtomicBoolean f;
    private niz g;
    private niz h;
    
    static {
        a = new AtomicBoolean(false);
    }
    
    public cvx(final cvb b, final eyt e, final cxl cxl) {
        this.f = new AtomicBoolean(false);
        this.g = nii.a;
        this.h = nii.a;
        this.b = b;
        this.e = e;
        this.d = new cvg(0.02f);
        this.c = cxl.k(cww.h);
    }
    
    private final boolean g() {
        final niz a = this.b.a();
        if (!a.g()) {
            return false;
        }
        final gzn b = ((cva)a.c()).a.b();
        return b != null && this.d.a(b.p, b.n);
    }
    
    private final boolean h() {
        return this.h.g() && ((cvw)this.h.c()).a > 15.0f;
    }
    
    final void a() {
        synchronized (this) {
            cvx.a.set(true);
        }
    }
    
    final void b() {
        synchronized (this) {
            this.g = niz.i(SystemClock.uptimeMillis());
            if (this.f.getAndSet(false) && !this.h()) {
                this.e.m();
            }
        }
    }
    
    final void c() {
        synchronized (this) {
            this.e.k();
            this.f.set(true);
        }
    }
    
    final void d(final float n) {
        synchronized (this) {
            this.g();
            this.h = niz.i(new cvw(n));
        }
    }
    
    public final void e() {
        synchronized (this) {
            this.g = nii.a;
            this.h = nii.a;
            this.f.set(false);
        }
    }
    
    public final boolean f() {
        monitorenter(this);
        try {
            final boolean b = this.c && this.g() && this.h() && (!this.g.g() || SystemClock.uptimeMillis() - (long)this.g.c() >= 2000L) && !cvx.a.get();
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
