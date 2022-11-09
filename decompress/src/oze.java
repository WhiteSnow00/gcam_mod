// 
// Decompiled by Procyon v0.6.0
// 

public abstract class oze implements oxg, oyy
{
    protected final oxg a;
    protected oxp b;
    protected oyy c;
    protected boolean d;
    
    public oze(final oxg a) {
        this.a = a;
    }
    
    @Override
    public void b(final Throwable t) {
        if (this.d) {
            pip.g(t);
            return;
        }
        this.d = true;
        this.a.b(t);
    }
    
    @Override
    public void bU() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.bU();
    }
    
    @Override
    public final void bV(final oxp b) {
        if (oyj.f(this.b, b)) {
            this.b = b;
            if (b instanceof oyy) {
                this.c = (oyy)b;
            }
            this.a.bV(this);
        }
    }
    
    @Override
    public final void bX() {
        this.b.bX();
    }
    
    @Override
    public void bZ() {
        this.c.bZ();
    }
    
    @Override
    public final boolean ca() {
        throw null;
    }
    
    protected final void f(final Throwable t) {
        psn.e(t);
        this.b.bX();
        this.b(t);
    }
    
    @Override
    public final boolean i() {
        return this.c.i();
    }
    
    @Override
    public final boolean j(final Object o) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
