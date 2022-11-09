// 
// Decompiled by Procyon v0.6.0
// 

public final class ksd implements AutoCloseable
{
    private final kse a;
    
    public ksd(final kse a, final String s) {
        (this.a = a).f(s);
    }
    
    @Override
    public final void close() {
        this.a.g();
    }
}
