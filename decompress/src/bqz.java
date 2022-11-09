import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqz
{
    public final Object a;
    public final kjk b;
    public kjk c;
    private kiz d;
    private kjk e;
    private kiz f;
    private btf g;
    private btf h;
    
    public bqz() {
        final kjk b = new kjk();
        this.b = b;
        this.a = new Object();
        final kjk b2 = b.b();
        this.e = b2;
        this.f = this.d(b2);
        final kjk b3 = this.e.b();
        this.c = b3;
        this.d = this.d(b3);
        b.c(new btf());
        final kjk e = this.e;
        final btf h = new btf();
        e.c(h);
        this.h = h;
        final kjk c = this.c;
        final btf g = new btf();
        c.c(g);
        this.g = g;
    }
    
    private final kiz d(final kjk kjk) {
        final kiz kiz = new kiz(new bqy(this, kjk), ofi.c(), null);
        kjk.c(kiz);
        return kiz;
    }
    
    public final kjk a(final kjk kjk) {
        final kjk b = kjk.b();
        synchronized (this.a) {
            if (this.g.a()) {
                (this.c = this.e.b()).c(bqx.b);
                this.d = this.d(this.c);
                final kjk c = this.c;
                final btf g = new btf();
                c.c(g);
                this.g = g;
            }
            final krc a = this.d.a();
            if (a != null) {
                b.c(a);
            }
            return b;
        }
    }
    
    public final kjk b() {
        return this.b.b();
    }
    
    public final kjk c(final kjk kjk) {
        final kjk b = kjk.b();
        synchronized (this.a) {
            if (this.h.a()) {
                (this.e = this.b.b()).c(bqx.a);
                this.f = this.d(this.e);
                final kjk e = this.e;
                final btf h = new btf();
                e.c(h);
                this.h = h;
                (this.c = this.e.b()).c(bqx.c);
                this.d = this.d(this.c);
                final kjk c = this.c;
                final btf g = new btf();
                c.c(g);
                this.g = g;
            }
            final krc a = this.f.a();
            if (a != null) {
                b.c(a);
            }
            return b;
        }
    }
}
