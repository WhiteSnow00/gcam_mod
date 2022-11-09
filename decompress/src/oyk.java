// 
// Decompiled by Procyon v0.6.0
// 

public enum oyk implements oyy
{
    a("INSTANCE", 0), 
    b("NEVER", 1);
    
    private oyk(final String s, final int n) {
    }
    
    public static void e(final oxg oxg) {
        oxg.bV(oyk.a);
        oxg.bU();
    }
    
    public static void f(final Throwable t, final owu owu) {
        owu.bV(oyk.a);
        owu.b(t);
    }
    
    public static void g(final Throwable t, final oxg oxg) {
        oxg.bV(oyk.a);
        oxg.b(t);
    }
    
    public static void h(final Throwable t, final oxl oxl) {
        oxl.bV(oyk.a);
        oxl.b(t);
    }
    
    @Override
    public final Object bW() {
        return null;
    }
    
    @Override
    public final void bX() {
    }
    
    @Override
    public final void bZ() {
    }
    
    @Override
    public final boolean ca() {
        throw null;
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
}
