// 
// Decompiled by Procyon v0.6.0
// 

class dgv extends dgt
{
    final /* synthetic */ dgy a;
    
    public dgv(final dgy a) {
        this.a = a;
    }
    
    @Override
    public void b(final int f, final int n, final float h) {
        final dhf d = this.a.d;
        d.f = f;
        d.g = n - f;
        d.h = h;
    }
    
    @Override
    public final void f() {
        this.a.a.setVisibility(8);
        this.a.d.k();
    }
    
    @Override
    public final void g() {
    }
}
