// 
// Decompiled by Procyon v0.6.0
// 

final class nno extends nrw
{
    private final nns a;
    
    public nno(final nns a, final int n) {
        super(a.size(), n);
        this.a = a;
    }
    
    @Override
    protected final Object a(final int n) {
        return this.a.get(n);
    }
}
