import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

final class kvy extends kxc
{
    private final nns a;
    
    public kvy(final nns a) {
        this.a = a;
    }
    
    @Override
    public final void aL(final kwz kwz, final long n) {
        final nns a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((kxc)a.get(i)).aL(kwz, n);
        }
    }
    
    @Override
    public final void aM(final lji lji) {
        final nns a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((kxc)a.get(i)).aM(lji);
        }
    }
    
    @Override
    public final void aN(final kvx kvx) {
        final nns a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((kxc)a.get(i)).aN(kvx);
        }
    }
    
    @Override
    public final void aO(final lem lem) {
        final nns a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((kxc)a.get(i)).aO(lem);
        }
    }
    
    @Override
    public final void aV(final long n, final int n2) {
        final nns a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((kxc)a.get(i)).aV(n, n2);
        }
    }
    
    @Override
    public final void aW(final long n, final int n2, final long n3) {
        final nns a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((kxc)a.get(i)).aW(n, n2, n3);
        }
    }
    
    @Override
    public final void b(final ljm ljm) {
        final nns a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((kxc)a.get(i)).b(ljm);
        }
    }
    
    @Override
    public final void h(final long n, final Set set) {
        final nns a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((kxc)a.get(i)).h(n, set);
        }
    }
    
    @Override
    public final void i(final long n, final int n2) {
        final nns a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((kxc)a.get(i)).i(n, n2);
        }
    }
}
