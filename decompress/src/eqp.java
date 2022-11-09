// 
// Decompiled by Procyon v0.6.0
// 

final class eqp implements eip
{
    final /* synthetic */ equ a;
    
    public eqp(final equ a) {
        this.a = a;
    }
    
    @Override
    public final void d(final boolean b) {
        final flv x = this.a.X;
        if (x != null && (boolean)x.b().aQ()) {
            if (b) {
                this.a.g.onShutterTouchStart();
            }
            else {
                final equ a = this.a;
                a.L = true;
                a.g.onShutterButtonClick();
            }
        }
        this.a.x.A(b);
    }
    
    @Override
    public final void e(final boolean b) {
        if (b) {
            this.a.s.z();
        }
    }
    
    @Override
    public final void f(final boolean b) {
        if (b) {
            this.a.s.A();
        }
    }
}
