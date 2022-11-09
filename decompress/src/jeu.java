// 
// Decompiled by Procyon v0.6.0
// 

class jeu extends jet
{
    final /* synthetic */ jew b;
    
    public jeu(final jew b) {
        this.b = b;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public final void f() {
        final jey e = this.b.e;
        if (e.d) {
            return;
        }
        e.d = true;
        e.b.postDelayed(e.c, 10L);
    }
    
    @Override
    public final void g() {
        this.b.e.d = false;
    }
}
