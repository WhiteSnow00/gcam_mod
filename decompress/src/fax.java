// 
// Decompiled by Procyon v0.6.0
// 

class fax extends fau
{
    final /* synthetic */ fbb b;
    
    public fax(final fbb b) {
        this.b = b;
    }
    
    @Override
    public void a() {
        this.b.i.i();
        this.b.j.o(true);
        this.b.k.setClickable(true);
        this.b.n.v(true);
        this.b.n.h();
    }
    
    @Override
    public void bo() {
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public void d() {
    }
    
    @Override
    public final void f() {
        this.b.i.j();
        this.b.j.o(false);
        this.b.k.setClickable(false);
        this.b.n.g();
        this.b.n.v(false);
        if (this.b.m.m()) {
            this.b.g.J();
            return;
        }
        this.b.g.Q();
    }
}
