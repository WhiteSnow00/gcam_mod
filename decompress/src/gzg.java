// 
// Decompiled by Procyon v0.6.0
// 

class gzg extends gzd
{
    final /* synthetic */ gzh b;
    
    public gzg(final gzh b) {
        this.b = b;
    }
    
    @Override
    public void b() {
    }
    
    @Override
    public final void f() {
        this.b.a.setVisibility(0);
        final gzh b = this.b;
        b.b = true;
        b.c.start();
    }
    
    @Override
    public final void g() {
        final gzh b = this.b;
        b.b = false;
        b.c.stop();
        this.b.a.setVisibility(8);
    }
}
