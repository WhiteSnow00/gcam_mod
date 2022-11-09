import java.util.concurrent.locks.LockSupport;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pom extends pol
{
    private final pnc b;
    public final pnf e;
    public final pnf f;
    
    public pom() {
        this.e = plv.g(null);
        this.f = plv.g(null);
        this.b = plv.i();
    }
    
    @Override
    public final void cj(final pjq pjq, final Runnable runnable) {
        pjq.getClass();
        runnable.getClass();
        this.s(runnable);
    }
    
    @Override
    public final long j() {
        final boolean p = this.p();
        final long n = 0L;
        if (p) {
            return 0L;
        }
        final pqj pqj = (pqj)this.f.a;
        Runnable runnable = null;
        if (pqj != null) {
            throw null;
        }
        final pnf e = this.e;
        while (true) {
            final Object a = e.a;
            if (a == null) {
                break;
            }
            if (a instanceof ppz) {
                final ppz ppz = (ppz)a;
                final Object b = ppz.b();
                if (b != ppz.a) {
                    runnable = (Runnable)b;
                    break;
                }
                this.e.c(a, ppz.c());
            }
            else {
                if (a == pon.a) {
                    break;
                }
                if (this.e.c(a, null)) {
                    runnable = (Runnable)a;
                    break;
                }
                continue;
            }
        }
        if (runnable == null) {
            final ppm d = super.d;
            long n2;
            if (d != null) {
                if (d.a()) {
                    n2 = Long.MAX_VALUE;
                }
                else {
                    n2 = 0L;
                }
            }
            else {
                n2 = Long.MAX_VALUE;
            }
            long n3;
            if (n2 == 0L) {
                n3 = n;
            }
            else {
                final Object a2 = this.e.a;
                if (a2 != null) {
                    if (a2 instanceof ppz) {
                        if (!((ppz)a2).e()) {
                            n3 = n;
                            return n3;
                        }
                    }
                    else {
                        if (a2 == pon.a) {
                            n3 = Long.MAX_VALUE;
                            return n3;
                        }
                        return 0L;
                    }
                }
                final pqj pqj2 = (pqj)this.f.a;
                if (pqj2 != null) {
                    monitorenter(pqj2);
                    monitorexit(pqj2);
                    return Long.MAX_VALUE;
                }
                n3 = Long.MAX_VALUE;
            }
            return n3;
        }
        runnable.run();
        return 0L;
    }
    
    @Override
    protected final void n() {
        final ThreadLocal a = ppg.a;
        ppg.a.set(null);
        this.b.c();
        final boolean a2 = pod.a;
        final pnf e = this.e;
        while (true) {
            final Object a3 = e.a;
            if (a3 == null) {
                if (this.e.c(null, pon.a)) {
                    break;
                }
                continue;
            }
            else {
                if (a3 instanceof ppz) {
                    ((ppz)a3).d();
                    break;
                }
                if (a3 == pon.a) {
                    break;
                }
                final ppz ppz = new ppz(8, true);
                ppz.a(a3);
                if (this.e.c(a3, ppz)) {
                    break;
                }
                continue;
            }
        }
        while (true) {
            if (this.j() > 0L) {
                System.nanoTime();
                final pqj pqj = (pqj)this.f.a;
                if (pqj == null) {
                    break;
                }
                synchronized (pqj) {
                    throw null;
                }
            }
        }
    }
    
    public final void s(final Runnable runnable) {
        runnable.getClass();
        final pnf e = this.e;
        Label_0174: {
        Label_0157:
            while (true) {
                final Object a = e.a;
                if (this.b.a()) {
                    break Label_0174;
                }
                if (a == null) {
                    if (this.e.c(null, runnable)) {
                        break;
                    }
                    continue;
                }
                else if (a instanceof ppz) {
                    final ppz ppz = (ppz)a;
                    switch (ppz.a(runnable)) {
                        default: {
                            break Label_0174;
                        }
                        case 1: {
                            this.e.c(a, ppz.c());
                            continue;
                        }
                        case 0: {
                            break Label_0157;
                        }
                    }
                }
                else {
                    if (a == pon.a) {
                        break Label_0174;
                    }
                    final ppz ppz2 = new ppz(8, true);
                    ppz2.a(a);
                    ppz2.a(runnable);
                    if (this.e.c(a, ppz2)) {
                        break;
                    }
                    continue;
                }
            }
            final Thread h = this.h();
            if (Thread.currentThread() != h) {
                LockSupport.unpark(h);
            }
            return;
        }
        pof.b.s(runnable);
    }
    
    protected final boolean t() {
        final ppm d = super.d;
        boolean e = false;
        if (d != null && !d.a()) {
            return false;
        }
        if (this.f.a == null) {
            final Object a = this.e.a;
            if (a == null) {
                e = true;
            }
            else if (a instanceof ppz) {
                e = ((ppz)a).e();
            }
            else if (a == pon.a) {
                return true;
            }
            return e;
        }
        throw null;
    }
}
