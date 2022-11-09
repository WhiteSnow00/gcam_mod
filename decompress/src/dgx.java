// 
// Decompiled by Procyon v0.6.0
// 

class dgx extends dgt
{
    final /* synthetic */ dgy a;
    
    public dgx(final dgy a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        if (this.a.a.getAlpha() != 0.0f) {
            this.a.c.reverse();
        }
    }
    
    @Override
    public void c(final boolean b) {
        if (b) {
            if (this.a.a.getAlpha() != 0.0f) {
                this.a.c.reverse();
            }
            return;
        }
        this.a.a.setAlpha(0.0f);
        this.a.c.cancel();
    }
    
    @Override
    public void d(final boolean b, final boolean b2) {
        this.a.i(false, b2);
    }
    
    @Override
    public final void f() {
        this.a.a.setVisibility(0);
        this.a.b.setEnabled(true);
        this.a.e.aR(true);
    }
    
    @Override
    public final void g() {
        this.a.b.setEnabled(false);
        this.a.e.aR(false);
    }
}
