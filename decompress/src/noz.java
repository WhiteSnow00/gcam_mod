// 
// Decompiled by Procyon v0.6.0
// 

final class noz extends nrw
{
    static final nrw a;
    private final Object[] b;
    
    static {
        a = new noz(new Object[0]);
    }
    
    public noz(final Object[] b) {
        super(0, 0);
        this.b = b;
    }
    
    @Override
    protected final Object a(final int n) {
        return this.b[n];
    }
}
