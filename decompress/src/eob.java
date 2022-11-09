// 
// Decompiled by Procyon v0.6.0
// 

final class eob implements eip
{
    final /* synthetic */ eok a;
    
    public eob(final eok a) {
        this.a = a;
    }
    
    @Override
    public final void d(final boolean b) {
        if (this.a.G()) {
            if (b) {
                this.a.g.onShutterTouchStart();
            }
            else {
                final eok a = this.a;
                a.H = true;
                a.g.onShutterButtonClick();
            }
        }
        this.a.v.A(b);
    }
    
    @Override
    public final void e(final boolean b) {
        if (this.a.G() && b) {
            this.a.k.z();
        }
    }
    
    @Override
    public final void f(final boolean b) {
        if (this.a.G() && b) {
            this.a.k.A();
        }
    }
}
