// 
// Decompiled by Procyon v0.6.0
// 

final class eps implements eip
{
    final /* synthetic */ eqa a;
    
    public eps(final eqa a) {
        this.a = a;
    }
    
    @Override
    public final void d(final boolean b) {
        if (b) {
            this.a.c.onShutterTouchStart();
            return;
        }
        if (this.a.r.c()) {
            this.a.w();
            return;
        }
        this.a.c.onShutterButtonClick();
    }
    
    @Override
    public final void e(final boolean b) {
        if (b && !this.a.r.c()) {
            this.a.d.z();
        }
    }
    
    @Override
    public final void f(final boolean b) {
        if (b && !this.a.r.c()) {
            this.a.d.A();
        }
    }
}
