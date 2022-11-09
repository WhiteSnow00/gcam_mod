// 
// Decompiled by Procyon v0.6.0
// 

final class dts implements dwc
{
    final /* synthetic */ gen a;
    final /* synthetic */ dtv b;
    
    public dts(final dtv b, final gen a) {
        this.b = b;
        this.a = a;
    }
    
    private final void d() {
        this.a.c.f();
        this.a.a.f.close();
        if (this.b.c.c()) {
            ((fve)this.b.c.b()).f(this.a.b.h());
        }
    }
    
    @Override
    public final void b(final hvc hvc, final dua dua) {
        this.b.k.f("ShotStatus-ShotCompleted");
        if (hvc != null) {
            this.a.b.k().j(new ezf(dua, hvc.a, hvc.b));
        }
        else {
            this.a.b.k().j(new ezf(dua, null, null));
        }
        this.b.k.g();
    }
    
    @Override
    public final void c(final dxh dxh, final dvv dvv) {
        this.b.l.c("Shot threw an error:", dvv);
        this.d();
    }
    
    @Override
    public final void n(final dxh dxh) {
        this.b.l.b("Shot aborted.");
        this.d();
    }
}
