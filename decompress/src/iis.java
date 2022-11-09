// 
// Decompiled by Procyon v0.6.0
// 

class iis extends iio
{
    final /* synthetic */ iit a;
    private kjk b;
    
    public iis(final iit a) {
        this.a = a;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public final void f() {
        this.b = new kjk();
        this.a.b.a();
        this.a.c.a();
        final fxu e = this.a.e;
        e.getClass();
        if (e.E()) {
            final iit a = this.a;
            a.d.f(a.e.e(), this.a.e.d(), this.a.e.a());
        }
    }
    
    @Override
    public final void g() {
        this.a.d.c();
        this.b.close();
        this.a.e = null;
    }
}
