import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lhl
{
    public final lhn a;
    public final kmd b;
    private kkz c;
    
    private lhl(final lhn a) {
        this.a = a;
        this.b = new kmd(0L, a.g);
    }
    
    public static lhl f(final lhn lhn) {
        return new lhl(lhn);
    }
    
    public final long a() {
        return this.a.b;
    }
    
    public final klj b() {
        synchronized (this) {
            if (this.c == null) {
                final kkz c = new kkz(0L);
                final lhi lhi = new lhi(this, c);
                this.a.f().a(lhi, odx.a);
                this.b.a(lhi, odx.a);
                this.c = c;
            }
            return this.c;
        }
    }
    
    public final krc c() {
        synchronized (this) {
            return new lhh(this.b.d(), this.a.f.d());
        }
    }
    
    public final lhk d(final long n) {
        final lhn a = this.a;
        njo.k(n > 0L && n <= a.b, "%s is an illegal block size (Must be > 0 and <= %s", n, a.b);
        synchronized (a.a) {
            lhc a2;
            if (!a.e) {
                a2 = a.a(n);
            }
            else {
                a2 = null;
            }
            monitorexit(a.a);
            if (a2 != null) {
                return new lhk(this, a2);
            }
            return null;
        }
    }
    
    public final lhk e(final long n) {
        final lhc b = this.a.b(n);
        if (b != null) {
            return new lhk(this, b);
        }
        return null;
    }
    
    public final oey g(final long n) {
        return odg.h(this.a.c(n), new lhj(this), odx.a);
    }
    
    public final void h(final long n) {
        if (n != 0L) {
            final kmd b = this.b;
            b.c.execute(new kkv(b, new lhg(n)));
        }
    }
}
