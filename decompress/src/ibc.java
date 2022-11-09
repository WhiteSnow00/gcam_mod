// 
// Decompiled by Procyon v0.6.0
// 

final class ibc extends kwp
{
    final /* synthetic */ kvs a;
    final /* synthetic */ kvw b;
    final /* synthetic */ ibf c;
    
    public ibc(final ibf c, final kvs a, final kvw b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void c() {
        this.a.close();
        final kvv v = this.c.V;
        if (v != null) {
            this.b.l(v);
            final ibf c = this.c;
            c.V = null;
            c.n.execute(new ibb(this));
        }
    }
}
