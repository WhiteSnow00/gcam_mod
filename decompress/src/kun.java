import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class kun implements ktb
{
    public final lfj a;
    public final kty b;
    public final ktd c;
    public final krr d;
    public boolean e;
    public boolean f;
    public boolean g;
    private final Executor h;
    private final kuq i;
    private final kuu j;
    private final kso k;
    private final kse l;
    private final kuf m;
    private final kjk n;
    private kup o;
    private boolean p;
    private kuh q;
    
    public kun(final lfj a, final kuq i, final ktd c, final kuu j, final Executor executor, final kso k, final krr d, final kse l, final kuf m, final kjk n) {
        this.e = false;
        this.f = false;
        this.g = false;
        this.p = false;
        this.h = ofi.e(executor);
        this.a = a;
        this.i = i;
        this.c = c;
        this.j = j;
        this.k = k;
        this.d = d;
        this.l = l;
        this.b = ((kti)c).i;
        this.m = m;
        (this.n = n).c(new kui(this));
    }
    
    @Override
    public final void a() {
        final kuh q = this.q;
        if (q != null) {
            this.k.c(q);
            this.q = null;
        }
        this.m.f(this.a);
        this.g(kst.l);
    }
    
    @Override
    public final void b() {
        this.g(kst.k);
    }
    
    @Override
    public final void c(final kst kst) {
        final kuh q = this.q;
        if (q != null) {
            this.k.c(q);
            this.q = null;
        }
        this.g(kst);
        synchronized (this) {
            final lfj a = this.a;
            final boolean p = this.p;
            final kst a2 = kst.a;
            ksz ksz = null;
            switch (kst.ordinal()) {
                default: {
                    ksz = new ksz(a, kst, p);
                    break;
                }
                case 17: {
                    ksz = new ksx(a, kst, p);
                    break;
                }
                case 16: {
                    ksz = new ksu(a, kst, p);
                    break;
                }
                case 15: {
                    ksz = new ksv(a, kst, p);
                    break;
                }
                case 14: {
                    ksz = new ksy(a, kst, p);
                    break;
                }
                case 13: {
                    ksz = new ksw(a, kst, p);
                    break;
                }
            }
            this.m.d(this.a, kst, this.p);
            monitorexit(this);
            this.d.h(njb.c(ksz.getMessage()));
            this.j.c(ksz);
        }
    }
    
    @Override
    public final void d(final ljg ljg) {
        synchronized (this) {
            this.p = true;
            final krr d = this.d;
            final String value = String.valueOf(this);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 7);
            sb.append(value);
            sb.append(" Opened");
            d.f(sb.toString());
            final kuh q = new kuh(ljg, this.d);
            this.q = q;
            this.k.b(q);
            this.m.e(this.a);
        }
    }
    
    public final void e(final ktb ktb) {
        synchronized (this) {
            if (!this.e && !this.f) {
                final kup o = this.o;
                if (o != null) {
                    final krr d = this.d;
                    final String value = String.valueOf(this);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 26);
                    sb.append(value);
                    sb.append(" passed to a new listener.");
                    d.b(sb.toString());
                    this.h.execute(new kul(this, o));
                }
                final kup o2 = new kup();
                o2.e(ktb);
                this.o = o2;
                this.h.execute(new kum(this, o2));
                return;
            }
            this.h.execute(new kuj(ktb));
        }
    }
    
    final void f() {
        synchronized (this) {
            if (!this.e && !this.f) {
                final krr d = this.d;
                final String value = String.valueOf(this);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 36);
                sb.append(value);
                sb.append(" closeAsync, queueing shutdown task.");
                d.b(sb.toString());
                this.e = true;
                this.i.e(this);
                this.h.execute(new kuk(this));
            }
        }
    }
    
    public final void g(final kst kst) {
        synchronized (this) {
            if (this.f) {
                return;
            }
            this.e = false;
            this.f = true;
            this.i.e(this);
            monitorexit(this);
            final kse l = this.l;
            final String value = String.valueOf(this);
            final String value2 = String.valueOf(kst);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 11 + String.valueOf(value2).length());
            sb.append(value);
            sb.append("#shutdown(");
            sb.append(value2);
            sb.append(")");
            l.f(sb.toString());
            final krr d = this.d;
            final String value3 = String.valueOf(this);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value3).length() + 8);
            sb2.append(value3);
            sb2.append(" Closing");
            d.b(sb2.toString());
            this.c.close();
            this.b.a();
            final kuq i = this.i;
            Object o = i.a;
            synchronized (o) {
                if (i.b == this) {
                    i.b = null;
                }
                i.c.remove(this);
                monitorexit(o);
                this.n.close();
                o = this.d;
                final String value4 = String.valueOf(this);
                final String b = kst.b();
                final StringBuilder sb3 = new StringBuilder(String.valueOf(value4).length() + 10 + String.valueOf(b).length());
                sb3.append(value4);
                sb3.append(" Closed (");
                sb3.append(b);
                sb3.append(")");
                ((krr)o).f(sb3.toString());
                this.l.g();
            }
        }
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a.a);
        String concat;
        if (value.length() != 0) {
            concat = "Camera ".concat(value);
        }
        else {
            concat = new String("Camera ");
        }
        return concat;
    }
}
