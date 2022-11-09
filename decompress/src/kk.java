import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class kk implements Runnable
{
    final /* synthetic */ kw a;
    private final /* synthetic */ int b;
    
    public kk(final kw a) {
        this.a = a;
    }
    
    public kk(final kw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                final kw a = this.a;
                if ((a.F & 0x1) != 0x0) {
                    a.A(0);
                }
                final kw a2 = this.a;
                if ((a2.F & 0x1000) != 0x0) {
                    a2.A(108);
                }
                final kw a3 = this.a;
                a3.E = false;
                a3.F = 0;
                return;
            }
            case 0: {
                final kw a4 = this.a;
                a4.n.showAtLocation((View)a4.m, 55, 0, 0);
                this.a.B();
                if (this.a.I()) {
                    this.a.m.setAlpha(0.0f);
                    final kw a5 = this.a;
                    final in p = ik.p((View)a5.m);
                    p.b(1.0f);
                    a5.p = p;
                    this.a.p.d(new kj(this));
                    return;
                }
                this.a.m.setAlpha(1.0f);
                this.a.m.setVisibility(0);
            }
        }
    }
}
