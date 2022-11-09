// 
// Decompiled by Procyon v0.6.0
// 

final class pot extends pow
{
    private final pnd a;
    private final pky f;
    
    public pot(final pky f) {
        this.f = f;
        this.a = plv.h();
    }
    
    @Override
    public final void c(final Throwable t) {
        if (this.a.c(0, 1)) {
            this.f.a(t);
        }
    }
}
