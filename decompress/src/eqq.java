// 
// Decompiled by Procyon v0.6.0
// 

final class eqq extends ivr
{
    final /* synthetic */ duq a;
    final /* synthetic */ equ b;
    
    public eqq(final equ b, final duq a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void onShutterButtonClick() {
        final equ b = this.b;
        if (b.X == null) {
            a.l(equ.b.b(), "Not taking picture because there's no active camera.", '\u0550');
            return;
        }
        b.R.f();
        final equ b2 = this.b;
        if (b2.y.c()) {
            b2.u();
            return;
        }
        final int g = ((hjg)b2.z.aQ()).g;
        if (g > 0) {
            b2.x(g);
            return;
        }
        b2.A();
    }
    
    @Override
    public final void onShutterButtonPressedStateChanged(final boolean b) {
        if (!b && (boolean)this.a.a().aQ()) {
            final flv x = this.b.X;
            if (x != null) {
                ((Boolean)((kkz)x.h().g).d).booleanValue();
            }
        }
    }
    
    @Override
    public final void onShutterTouchStart() {
        this.b.R.e();
    }
}
