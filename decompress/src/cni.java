// 
// Decompiled by Procyon v0.6.0
// 

class cni extends cne
{
    final /* synthetic */ cnk b;
    
    public cni(final cnk b) {
        this.b = b;
    }
    
    @Override
    public final boolean aX() {
        return false;
    }
    
    @Override
    public void c() {
        final cnk b = this.b;
        b.i.b();
        b.e.startRecording();
        b.h.v(false);
        b.h.l(false);
        b.f.Y();
        b.g.d(false);
        if (b.j.g()) {
            ((cpu)b.j.c()).m();
        }
        jgu.c();
    }
    
    @Override
    public final void f() {
        final cnk b = this.b;
        b.l = this;
        b.k.aw = false;
    }
    
    @Override
    public final int j() {
        return 1;
    }
}
