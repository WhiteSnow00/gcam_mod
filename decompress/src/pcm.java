// 
// Decompiled by Procyon v0.6.0
// 

public final class pcm extends oxc
{
    final oxe a;
    
    public pcm(final oxe a) {
        this.a = a;
    }
    
    @Override
    protected final void g(final oxg oxg) {
        final pck pck = new pck(oxg);
        oxg.bV(pck);
        try {
            this.a.a(pck);
        }
        finally {
            final Throwable t;
            psn.e(t);
            pck.b(t);
        }
    }
}
