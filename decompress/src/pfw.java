import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

final class pfw implements pgp
{
    final int a;
    long b;
    final pgk[] c;
    
    public pfw(final int a, final ThreadFactory threadFactory) {
        this.a = a;
        this.c = new pgk[a];
        for (int i = 0; i < a; ++i) {
            this.c[i] = new pgk(threadFactory);
        }
    }
    
    public final void a() {
        final pgk[] c = this.c;
        for (int length = c.length, i = 0; i < length; ++i) {
            c[i].bX();
        }
    }
    
    @Override
    public final void b(final int n, final peg peg) {
        final int a = this.a;
        int i = 0;
        if (a == 0) {
            while (i < n) {
                peg.a(i, pfx.f);
                ++i;
            }
            return;
        }
        int n2 = (int)this.b % a;
        for (int j = 0; j < n; ++j) {
            peg.a(j, new pfv(this.c[n2]));
            if (++n2 == a) {
                n2 = 0;
            }
        }
        this.b = n2;
    }
    
    public final pgk c() {
        final int a = this.a;
        if (a == 0) {
            return pfx.f;
        }
        final pgk[] c = this.c;
        final long b = this.b;
        this.b = 1L + b;
        return c[(int)(b % a)];
    }
}
