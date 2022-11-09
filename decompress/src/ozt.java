// 
// Decompiled by Procyon v0.6.0
// 

final class ozt implements owy, oxp
{
    final owu a;
    pss b;
    
    public ozt(final owu a) {
        this.a = a;
    }
    
    @Override
    public final void bX() {
        this.b.a();
        this.b = phe.a;
    }
    
    @Override
    public final void bY(final pss b) {
        if (phe.h(this.b, b)) {
            this.b = b;
            this.a.bV(this);
            b.cb(Long.MAX_VALUE);
        }
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    @Override
    public final void cc() {
        this.a.e();
    }
    
    @Override
    public final void cd(final Throwable t) {
        this.a.b(t);
    }
    
    @Override
    public final void ce(final Object o) {
    }
}
