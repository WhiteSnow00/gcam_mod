// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jmc extends jmb
{
    private boolean a;
    
    protected jmc(final jmf jmf) {
        super(jmf);
    }
    
    public final void A() {
        this.a();
        this.a = true;
    }
    
    public final boolean B() {
        return this.a;
    }
    
    protected abstract void a();
    
    public final void z() {
        if (this.B()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }
}
