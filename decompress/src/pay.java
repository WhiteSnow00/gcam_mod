import java.util.NoSuchElementException;

// 
// Decompiled by Procyon v0.6.0
// 

final class pay implements owy, oxp
{
    final oxl a;
    final Object b;
    pss c;
    Object d;
    
    public pay(final oxl a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void bX() {
        this.c.a();
        this.c = phe.a;
    }
    
    @Override
    public final void bY(final pss c) {
        if (phe.h(this.c, c)) {
            this.c = c;
            this.a.bV(this);
            c.cb(Long.MAX_VALUE);
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void cc() {
        this.c = phe.a;
        final Object d = this.d;
        if (d != null) {
            this.d = null;
            this.a.d(d);
            return;
        }
        final Object b = this.b;
        if (b != null) {
            this.a.d(b);
            return;
        }
        this.a.b(new NoSuchElementException());
    }
    
    @Override
    public final void cd(final Throwable t) {
        this.c = phe.a;
        this.d = null;
        this.a.b(t);
    }
    
    @Override
    public final void ce(final Object d) {
        this.d = d;
    }
}
