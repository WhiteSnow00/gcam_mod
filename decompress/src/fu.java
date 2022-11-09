// 
// Decompiled by Procyon v0.6.0
// 

final class fu implements aex, ad
{
    public aew a;
    public i b;
    private final ac c;
    
    public fu(final ac c) {
        this.b = null;
        this.a = null;
        this.c = c;
    }
    
    @Override
    public final aev A() {
        this.d();
        return this.a.a;
    }
    
    @Override
    public final i aD() {
        this.d();
        return this.b;
    }
    
    @Override
    public final ac bg() {
        this.d();
        return this.c;
    }
    
    final void c(final g g) {
        this.b.c(g);
    }
    
    final void d() {
        if (this.b == null) {
            this.b = new i(this);
            this.a = aew.a(this);
        }
    }
}
