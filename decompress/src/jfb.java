// 
// Decompiled by Procyon v0.6.0
// 

class jfb extends jez
{
    final /* synthetic */ jff b;
    
    public jfb(final jff b) {
        this.b = b;
    }
    
    @Override
    public void b() {
        this.b.e.pause();
    }
    
    @Override
    public void c() {
        this.b.d.b(0);
    }
    
    @Override
    public void d() {
        this.b.e.pause();
    }
    
    @Override
    public final void f() {
        this.b.e.start();
        final jfl jfl = (jfl)this.b.d;
        jfl.m = false;
        if (jfl.n) {
            jfl.c();
        }
        this.b.g.f();
    }
    
    @Override
    public final void g() {
        this.b.g.g();
    }
}
