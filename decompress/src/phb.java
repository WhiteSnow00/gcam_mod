// 
// Decompiled by Procyon v0.6.0
// 

public enum phb implements oza
{
    a;
    
    public static void e(final psr psr) {
        psr.bY(phb.a);
        psr.cc();
    }
    
    public static void f(final Throwable t, final psr psr) {
        psr.bY(phb.a);
        psr.cd(t);
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final Object bW() {
        return null;
    }
    
    @Override
    public final void bZ() {
    }
    
    @Override
    public final void cb(final long n) {
        phe.g(n);
    }
    
    @Override
    public final boolean i() {
        return true;
    }
    
    @Override
    public final boolean j(final Object o) {
        throw new UnsupportedOperationException("Should not be called!");
    }
    
    @Override
    public final int k() {
        return 2;
    }
    
    @Override
    public final String toString() {
        return "EmptySubscription";
    }
}
