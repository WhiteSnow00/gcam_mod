// 
// Decompiled by Procyon v0.6.0
// 

class dhc extends dgz
{
    final /* synthetic */ dhf a;
    
    public dhc(final dhf a) {
        this.a = a;
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public void d(final float n, final dgl dgl) {
        this.a.d.aR(true);
        this.a.j.aR(false);
        this.a.l(n, dgl);
    }
    
    @Override
    public final void f() {
    }
    
    @Override
    public final void g() {
        this.a.d.aR(false);
        final dhf a = this.a;
        a.a.removeCallbacks(a.l);
    }
}
