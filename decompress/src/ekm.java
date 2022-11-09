// 
// Decompiled by Procyon v0.6.0
// 

final class ekm implements eip
{
    final /* synthetic */ ekw a;
    
    public ekm(final ekw a) {
        this.a = a;
    }
    
    @Override
    public final void a(final boolean b) {
        if (this.a.m.f.getThumbnailButton().getVisibility() != 0) {
            return;
        }
        if (b) {
            ((ihp)this.a.l.get()).d(false);
        }
    }
    
    @Override
    public final void b(final boolean b) {
        if (b && this.a.H.q()) {
            this.a.H.u(2, true);
        }
    }
    
    @Override
    public final void d(final boolean b) {
        if (this.a.t.A()) {
            this.a.t.f();
        }
    }
}
