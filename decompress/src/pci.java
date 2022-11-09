// 
// Decompiled by Procyon v0.6.0
// 

public final class pci extends oxc
{
    final oxm a;
    final oyf b;
    
    public pci(final oxm a, final oyf b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    protected final void g(final oxg oxg) {
        final pch pch = new pch(oxg, this.b);
        oxg.bV(pch);
        this.a.m(pch);
    }
}
