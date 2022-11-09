import android.content.ComponentName;
import java.util.concurrent.Semaphore;
import java.util.concurrent.Executor;
import android.app.admin.DevicePolicyManager;
import java.util.HashSet;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqi implements asi, bqu
{
    public static final nsd a;
    public final Handler b;
    public asi c;
    public asx d;
    public lfj e;
    public final HashSet f;
    private final bqe g;
    private final ktc h;
    private final lfh i;
    private final DevicePolicyManager j;
    private final Executor k;
    private final Semaphore l;
    private atn m;
    private final ats n;
    private final deh o;
    
    static {
        a = nsd.g("com/google/android/apps/camera/app/LegacyCameraController");
    }
    
    public bqi(final Handler b, final bqe g, final ktc h, final lfh i, final deh o, final DevicePolicyManager j, final Executor k, final Semaphore l) {
        this.e = null;
        this.f = new HashSet();
        final bqh n = new bqh(this);
        this.n = n;
        this.b = b;
        this.g = g;
        this.j = j;
        this.o = o;
        this.h = h;
        this.i = i;
        this.k = k;
        this.l = l;
        final atn a = g.a();
        this.m = a;
        if (a == null) {
            final asi c = this.c;
            if (c != null) {
                c.c(-1, "GETTING_CAMERA_INFO");
            }
        }
        g.c(new att(n, b));
    }
    
    private final void n(final bqe bqe, final lfj lfj, final Handler handler, final asi asi) {
        try {
            if (!this.j.getCameraDisabled((ComponentName)null)) {
                this.l.acquire();
                bqe.b(handler, lfj.a(), asi);
                return;
            }
            throw new dfw();
        }
        catch (final dfw dfw) {
            handler.post((Runnable)new bqf(asi, lfj));
        }
    }
    
    @Override
    public final void a(final int n) {
        final asi c = this.c;
        if (c != null) {
            c.a(n);
        }
        this.k();
    }
    
    @Override
    public final void b(final asx d) {
        monitorenter(this);
        try {
            final int a = d.a();
            final lfj e = this.e;
            int a2;
            if (e != null) {
                a2 = e.a();
            }
            else {
                a2 = -1;
            }
            if (a2 == a) {
                if (d.g().a() != 1) {
                    final asx d2 = this.d;
                    if (d2 != null && d2.a() != a) {
                        this.m(false);
                    }
                    this.e = null;
                    this.d = d;
                    final asi c = this.c;
                    if (c != null) {
                        c.b(d);
                    }
                }
                else {
                    final asi c2 = this.c;
                    if (c2 != null) {
                        final StringBuilder sb = new StringBuilder(48);
                        sb.append("Camera ");
                        sb.append(a2);
                        sb.append(" opened, but in UNOPENED state");
                        c2.c(a, sb.toString());
                        monitorexit(this);
                        return;
                    }
                }
                monitorexit(this);
                return;
            }
            this.m(false);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void c(final int n, final String s) {
        final asi c = this.c;
        if (c != null) {
            c.c(n, s);
        }
        this.k();
    }
    
    @Override
    public final void d(final int n, final String s) {
        this.g(n);
        final asi c = this.c;
        if (c != null) {
            c.d(n, s);
        }
        this.k();
    }
    
    @Override
    public final int e() {
        final atn m = this.m;
        if (m == null) {
            return -1;
        }
        return m.a();
    }
    
    @Override
    public final atm f(final int n) {
        final atn m = this.m;
        if (m == null) {
            return null;
        }
        return m.b(n);
    }
    
    public final void g(final int n) {
        synchronized (this) {
            final lfj e = this.e;
            if (e != null) {
                e.a();
            }
            final lfj e2 = this.e;
            if (e2 != null && e2.a() == n) {
                this.e = null;
            }
        }
    }
    
    public final void h() {
        synchronized (this) {
            final lfj e = this.e;
            if (e == null) {
                a.l(bqi.a.c(), "doRequestCamera: might be interrupted by early release. return", 'Y');
                return;
            }
            this.o.a(e);
            final bqe g = this.g;
            g.getClass();
            final asx d = this.d;
            if (d == null) {
                this.n(g, e, this.b, this);
            }
            else if (d.a() != e.a()) {
                this.m(false);
                this.n(this.g, e, this.b, this);
            }
            else {
                final Handler b = this.b;
                try {
                    d.h().a(new ast(d, b, this));
                }
                catch (final RuntimeException ex) {
                    d.d().c().c(ex);
                }
            }
            this.m = this.g.a();
        }
    }
    
    @Override
    public final void j(final int n) {
        this.g(n);
        final asx d = this.d;
        if (d == null) {
            bqi.a.c().E(93).p("releaseCamera: Try to release a not-yet-available camera(%s). Wait till it's available", n);
            return;
        }
        final int a = d.a();
        if (a != n) {
            bqi.a.c().E(92).s("releaseCamera: Try to release a camera that is not opened. current=%s id=%s", a, n);
            return;
        }
        final deh o = this.o;
        final lfj c = this.i.c(n);
        synchronized (o.a) {
            final lfj b = o.b;
            if (b != null && b.equals(c)) {
                o.b = null;
            }
        }
    }
    
    public final void k() {
        if (this.l.availablePermits() == 0) {
            this.l.release();
        }
    }
    
    public final void m(final boolean b) {
        final bqe g = this.g;
        g.getClass();
        g.d(b);
        this.k();
    }
}
