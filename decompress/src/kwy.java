import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kwy extends kxc
{
    private boolean a;
    private final kxc b;
    
    public kwy(final kxc b, final byte[] array, final byte[] array2) {
        this.a = false;
        this.b = b;
    }
    
    @Override
    public final void aL(final kwz kwz, final long n) {
        this.b.aL(kwz, n);
    }
    
    @Override
    public final void aM(final lji lji) {
        this.b.aM(lji);
    }
    
    @Override
    public final void aN(final kvx kvx) {
        this.b.aN(kvx);
    }
    
    @Override
    public final void aO(final lem lem) {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            monitorexit(this);
            this.b.aO(lem);
        }
    }
    
    @Override
    public final void aV(final long n, final int n2) {
        this.b.aV(n, n2);
    }
    
    @Override
    public final void aW(final long n, final int n2, final long n3) {
        this.b.aW(n, n2, n3);
    }
    
    @Override
    public final void b(final ljm ljm) {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            monitorexit(this);
            this.b.b(ljm);
        }
    }
    
    @Override
    public final void h(final long n, final Set set) {
        this.b.h(n, set);
    }
    
    @Override
    public final void i(final long n, final int n2) {
        this.b.i(n, n2);
    }
}
