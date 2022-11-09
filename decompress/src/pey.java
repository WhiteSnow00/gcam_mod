// 
// Decompiled by Procyon v0.6.0
// 

public final class pey extends owt
{
    final oxm a;
    final oyf b;
    
    public pey(final oxm a, final oyf b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    protected final void j(final owu owu) {
        final pex pex = new pex(owu, this.b);
        owu.bV(pex);
        this.a.m(pex);
    }
}
