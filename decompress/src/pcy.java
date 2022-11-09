// 
// Decompiled by Procyon v0.6.0
// 

final class pcy extends oze
{
    final oyf e;
    
    public pcy(final oxg oxg, final oyf e) {
        super(oxg);
        this.e = e;
    }
    
    @Override
    public final Object bW() {
        final Object bw = this.c.bW();
        if (bw != null) {
            return this.e.a(bw);
        }
        return null;
    }
    
    @Override
    public final void e(Object a) {
        if (!this.d) {
            try {
                a = this.e.a(a);
                this.a.e(a);
            }
            finally {
                final Throwable t;
                this.f(t);
            }
        }
    }
    
    @Override
    public final int k() {
        return 0;
    }
}
