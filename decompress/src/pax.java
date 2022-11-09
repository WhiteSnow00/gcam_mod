// 
// Decompiled by Procyon v0.6.0
// 

public final class pax extends owx implements ozb
{
    private final Object b;
    
    public pax(final Object b) {
        this.b = b;
    }
    
    @Override
    public final Object call() {
        return this.b;
    }
    
    @Override
    protected final void k(final psr psr) {
        psr.bY(new phc(psr, this.b));
    }
}
