// 
// Decompiled by Procyon v0.6.0
// 

public final class pcg extends oxk
{
    final oxb a;
    final Object b;
    
    public pcg(final oxb a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    protected final void n(final oxl oxl) {
        this.a.b(new pcf(oxl, this.b));
    }
}
