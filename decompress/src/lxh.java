import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lxh implements lwh
{
    public volatile Object a;
    public volatile lwi b;
    private lxd c;
    private lxd d;
    
    private lxh() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
    
    public static lxh i() {
        return new lxh();
    }
    
    public static void j(final Object o, final lva lva, final lxh lxh) {
        try {
            lxh.k(lva.a(o));
        }
        catch (final lwi lwi) {
            lxh.l(lwi);
        }
        finally {
            final Throwable t;
            lxh.l(lwi.a(t));
        }
    }
    
    public static void n(final Object o, final lwl lwl, final Executor executor, final lxh lxh) {
        try {
            lwl.a(o, executor).c(odx.a, new lxf(lxh), new lxe(lxh)).h(lvm.a);
        }
        catch (final lwi lwi) {
            lxh.l(lwi);
        }
        finally {
            final Throwable t;
            lxh.l(lwi.a(t));
        }
    }
    
    private final void o() {
        monitorenter(this);
        try {
            lxd lxd = this.c;
            this.c = null;
            this.d = null;
            this.notifyAll();
            monitorexit(this);
            while (lxd != null) {
                try {
                    lxd.b.execute(lxd.c);
                }
                finally {
                    final lxh d = lxd.d;
                    if (d == null) {
                        continue;
                    }
                    final Throwable t;
                    d.l(lwi.a(t));
                }
                lxd = lxd.a;
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void p(final Executor executor, final Runnable runnable, final lxh lxh) {
        synchronized (this) {
            if (!this.f()) {
                final lxd d = new lxd(executor, runnable, lxh);
                final lxd d2 = this.d;
                if (d2 != null) {
                    d2.a = d;
                }
                else {
                    this.c = d;
                }
                this.d = d;
                return;
            }
            throw new IllegalStateException("Should not be delaying execution when done");
        }
    }
    
    private static void q(final lwi lwi, final lva lva, final Executor executor, final lxh lxh) {
        try {
            executor.execute(new lxb(lwi, lva, lxh));
        }
        finally {
            final Throwable t;
            lxh.l(lwi.a(t));
        }
    }
    
    private static void r(final Object o, final lva lva, final Executor executor, final lxh lxh) {
        try {
            executor.execute(new lxb(o, lva, lxh));
        }
        finally {
            final Throwable t;
            lxh.l(lwi.a(t));
        }
    }
    
    private static void s(final lwi lwi, final lwl lwl, final Executor executor, final lxh lxh, final lza lza) {
        try {
            executor.execute(new lxc(lwi, lwl, executor, lxh, lza, null, null));
        }
        finally {
            final Throwable t;
            lxh.l(lwi.a(t));
        }
    }
    
    private static void t(final Object o, final lwl lwl, final Executor executor, final lxh lxh, final lza lza) {
        try {
            executor.execute(new lxc(o, lwl, executor, lxh, lza, null, null));
        }
        finally {
            final Throwable t;
            lxh.l(lwi.a(t));
        }
    }
    
    @Override
    public final lwh a(final Executor executor, final lva lva) {
        final lxh i = i();
        final Object a = this.a;
        if (a != null) {
            r(a, lva, executor, i);
            return i;
        }
        lwi lwi = this.b;
        if (lwi != null) {
            i.l(lwi);
            return i;
        }
        synchronized (this) {
            final Object a2 = this.a;
            if (a2 == null && (lwi = this.b) == null) {
                this.p(executor, new lwx(this, lva, i), i);
                return i;
            }
            monitorexit(this);
            if (a2 != null) {
                r(a2, lva, executor, i);
            }
            else {
                i.l(lwi);
            }
            return i;
        }
    }
    
    @Override
    public final lwh b(final Executor executor, final lwl lwl) {
        final lza a = lxi.a;
        final lxh i = i();
        final Object a2 = this.a;
        if (a2 != null) {
            t(a2, lwl, executor, i, a);
            return i;
        }
        lwi lwi = this.b;
        if (lwi != null) {
            i.l(lwi);
            return i;
        }
        synchronized (this) {
            final Object a3 = this.a;
            if (a3 == null && (lwi = this.b) == null) {
                this.p(executor, new lwz(this, lwl, executor, i, a, null, null), i);
                return i;
            }
            monitorexit(this);
            if (a3 != null) {
                t(a3, lwl, executor, i, a);
            }
            else {
                i.l(lwi);
            }
            return i;
        }
    }
    
    @Override
    public final lwh c(final Executor executor, final lva lva, final lva lva2) {
        final lxh i = i();
        final Object a = this.a;
        if (a != null) {
            r(a, lva, executor, i);
            return i;
        }
        lwi lwi = this.b;
        if (lwi != null) {
            q(lwi, lva2, executor, i);
            return i;
        }
        synchronized (this) {
            final Object a2 = this.a;
            if (a2 == null && (lwi = this.b) == null) {
                this.p(executor, new lwy(this, lva, i, lva2), i);
                return i;
            }
            monitorexit(this);
            if (a2 != null) {
                r(a2, lva, executor, i);
            }
            else {
                q(lwi, lva2, executor, i);
            }
            return i;
        }
    }
    
    @Override
    public final oey d() {
        return new lxg(this);
    }
    
    @Override
    public final Object e() {
        final Object a = this.a;
        if (a != null) {
            return a;
        }
        if (this.b == null) {
            synchronized (this) {
                while (!this.f()) {
                    this.wait();
                }
                final Object a2 = this.a;
                if (a2 != null) {
                    return a2;
                }
                throw this.b;
            }
        }
        throw this.b;
    }
    
    @Override
    public final boolean f() {
        return this.a != null || this.b != null;
    }
    
    @Override
    public final lwh g(final Executor executor, final mdg mdg) {
        final lwu lwu = new lwu(this, mdg);
        final lwv lwv = new lwv(this, mdg);
        final lza a = lxi.a;
        final lxh i = i();
        final Object a2 = this.a;
        if (a2 != null) {
            t(a2, lwu, executor, i, a);
            return i;
        }
        lwi lwi = this.b;
        if (lwi != null) {
            s(lwi, lwv, executor, i, a);
            return i;
        }
        synchronized (this) {
            final Object a3 = this.a;
            if (a3 == null && (lwi = this.b) == null) {
                this.p(executor, new lxa(this, lwu, executor, i, a, lwv, null, null), i);
                monitorexit(this);
            }
            else {
                monitorexit(this);
                if (a3 != null) {
                    t(a3, lwu, executor, i, a);
                }
                else {
                    s(lwi, lwv, executor, i, a);
                }
            }
            return i;
        }
    }
    
    @Override
    public final void h(final lvm lvm) {
        if (this.a != null) {
            return;
        }
        final lwi b = this.b;
        if (b == null) {
            synchronized (this) {
                final Object a = this.a;
                lwi lwi;
                if (a == null) {
                    final lwi b2 = this.b;
                    if (b2 == null) {
                        this.m(odx.a, new lww(this, lvm));
                        return;
                    }
                    lwi = b2;
                }
                else {
                    lwi = b;
                }
                monitorexit(this);
                if (a != null) {
                    return;
                }
                throw njt.a(lwi);
            }
        }
        throw njt.a(b);
    }
    
    public final void k(final Object a) {
        if (this.f()) {
            return;
        }
        synchronized (this) {
            if (this.f()) {
                return;
            }
            this.a = a;
            monitorexit(this);
            this.o();
        }
    }
    
    public final void l(final lwi b) {
        if (this.f()) {
            return;
        }
        synchronized (this) {
            if (this.f()) {
                return;
            }
            this.b = b;
            monitorexit(this);
            this.o();
        }
    }
    
    public final void m(final Executor executor, final Runnable runnable) {
        synchronized (this) {
            if (!this.f()) {
                final lxd d = new lxd(executor, runnable);
                final lxd d2 = this.d;
                if (d2 != null) {
                    d2.a = d;
                }
                else {
                    this.c = d;
                }
                this.d = d;
                return;
            }
            throw new IllegalStateException("Should not be delaying execution when done");
        }
    }
}
