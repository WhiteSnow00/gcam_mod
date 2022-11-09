import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.Map;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class goq implements kvw
{
    public static final nsd a;
    public final ReentrantLock b;
    public final List c;
    public String d;
    public kvw e;
    public kvu f;
    public boolean g;
    public final kvv h;
    private final kwd i;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/commands/PckDynamicRawFrameBuffer");
    }
    
    public goq(final kwd i, final Map map, final klj klj, final kjk kjk, final Executor executor, final int n) {
        this.b = new ReentrantLock(true);
        this.c = new ArrayList();
        final goo h = new goo(this);
        this.h = h;
        njo.d(true ^ map.isEmpty());
        this.i = i;
        final kzl kzl = map.get(gti.c);
        kzl.getClass();
        (this.e = i.r(kzl, n)).k(h);
        final lfj j = grd.i(kzl);
        j.getClass();
        this.d = j.a;
        final HashMap hashMap = new HashMap();
        final Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            final kzl kzl2 = map.get(iterator.next());
            if (kzl2 != null) {
                final lfj k = grd.i(kzl2);
                if (k == null) {
                    continue;
                }
                hashMap.put(k.a, kzl2);
            }
        }
        kjk.c(klj.a(new gon(this, hashMap, i, executor), odx.a));
    }
    
    private static void t(final kwd kwd, final kvw kvw) {
        if (kvw != null) {
            kvw.close();
            for (final kwz kwz : ((kxz)kvw).h.c) {
                if (grd.g(kwz)) {
                    kwd.d(kwz);
                }
            }
        }
    }
    
    @Override
    public final int a() {
        return this.e.a();
    }
    
    @Override
    public final int b() {
        return this.e.b();
    }
    
    @Override
    public final kvs c() {
        return this.e.c();
    }
    
    @Override
    public final void close() {
        if (this.g) {
            return;
        }
        synchronized (this) {
            this.c.clear();
            monitorexit(this);
            final krc r = this.r();
            try {
                this.g = true;
                this.e.l(this.h);
                t(this.i, this.e);
                r.close();
            }
            finally {
                try {
                    r.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    t.addSuppressed(t2);
                }
            }
        }
    }
    
    @Override
    public final kvs d(final njc njc) {
        return this.e.d(njc);
    }
    
    @Override
    public final kvs e() {
        return this.e.e();
    }
    
    @Override
    public final kvs f(final njc njc) {
        return this.e.f(njc);
    }
    
    @Override
    public final kvs g() {
        return this.e.g();
    }
    
    @Override
    public final kvs h() {
        return this.e.h();
    }
    
    @Override
    public final List i() {
        return this.e.i();
    }
    
    @Override
    public final List j() {
        return this.e.j();
    }
    
    @Override
    public final void k(final kvv kvv) {
        synchronized (this) {
            this.c.add(kvv);
        }
    }
    
    @Override
    public final void l(final kvv kvv) {
        synchronized (this) {
            this.c.remove(kvv);
        }
    }
    
    @Override
    public final void m(final int n) {
        this.e.m(n);
    }
    
    @Override
    public final void n(final kvu f) {
        this.f = f;
        this.e.n(f);
    }
    
    @Override
    public final boolean o(final kvx kvx) {
        return this.e.o(kvx);
    }
    
    @Override
    public final boolean p() {
        return this.e.p();
    }
    
    @Override
    public final kzl q() {
        return ((kxz)this.e).h;
    }
    
    public final krc r() {
        this.b.lock();
        return new gom(this, new AtomicBoolean(true));
    }
}
