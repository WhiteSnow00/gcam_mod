// 
// Decompiled by Procyon v0.6.0
// 

public final class ozg implements oyy
{
    public final oxg a;
    public final Object[] b;
    int c;
    public boolean d;
    public volatile boolean e;
    
    public ozg() {
    }
    
    public ozg(final oxg a, final Object[] b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object bW() {
        final int c = this.c;
        final Object[] b = this.b;
        if (c != 2) {
            this.c = c + 1;
            final Object o = b[c];
            phn.g(o, "The array element is null");
            return o;
        }
        return null;
    }
    
    @Override
    public final void bX() {
        this.e = true;
    }
    
    @Override
    public final void bZ() {
        this.c = 2;
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final boolean i() {
        return this.c == 2;
    }
    
    @Override
    public final boolean j(final Object o) {
        throw new UnsupportedOperationException("Should not be called");
    }
    
    @Override
    public final int k() {
        this.d = true;
        return 1;
    }
}
