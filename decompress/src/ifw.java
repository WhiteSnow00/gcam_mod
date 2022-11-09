import android.graphics.PointF;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ifw implements igo
{
    public final Executor a;
    public final kse b;
    public volatile boolean c;
    public final igo d;
    public volatile niz e;
    private final AtomicInteger f;
    private volatile long g;
    
    public ifw(final igi d, final niz niz, final kse b) {
        this.c = false;
        this.e = nii.a;
        this.f = new AtomicInteger(0);
        this.g = -1L;
        this.b = b;
        njo.d(niz.g());
        this.d = d;
        this.a = (Executor)niz.c();
    }
    
    private final void j(final lju lju) {
        if (lju.d() - this.g < 18000000L) {
            lju.close();
            return;
        }
        if (this.c) {
            lju.close();
            synchronized (this) {
                final int incrementAndGet = this.f.incrementAndGet();
                monitorexit(this);
                if (incrementAndGet > 7) {
                    this.a.execute(new ift(this));
                }
                return;
            }
        }
        this.c = true;
        synchronized (this) {
            this.f.set(0);
            this.g = lju.d();
            monitorexit(this);
            this.a.execute(new ifu(this, lju));
        }
    }
    
    @Override
    public final void a() {
        synchronized (this) {
            if (!this.e.g()) {
                return;
            }
            final lju d = ((fev)this.e.c()).d();
            monitorexit(this);
            if (d != null) {
                this.j(d);
            }
        }
    }
    
    @Override
    public final klj b(final PointF pointF) {
        synchronized (this) {
            this.f.set(0);
            this.g = -1L;
            return this.d.b(pointF);
        }
    }
    
    @Override
    public final void c(final hzf hzf) {
        this.d.c(hzf);
    }
    
    @Override
    public final krc d(final niz e, final niz niz) {
        synchronized (this) {
            this.e = e;
            monitorexit(this);
            return new ifs(this, e, this.d.d(e, niz));
        }
    }
    
    @Override
    public final void e(final ign ign) {
        this.d.e(ign);
    }
    
    @Override
    public final void f(final lju lju) {
        this.j(lju);
    }
    
    @Override
    public final void g(final ign ign) {
        this.d.g(ign);
    }
    
    @Override
    public final void h() {
        this.d.h();
    }
    
    @Override
    public final boolean i() {
        return this.d.i();
    }
}
