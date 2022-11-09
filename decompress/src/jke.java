// 
// Decompiled by Procyon v0.6.0
// 

public class jke extends jjs
{
    final /* synthetic */ jkf b;
    
    public jke(final jkf b) {
        this.b = b;
    }
    
    @Override
    public final void f() {
        final float s = this.b.s;
        final boolean b = true;
        njo.e(s != 0.0f, "max zoom value hasn't been initialized properly");
        if (!this.b.v.k(cxr.R)) {
            njo.e(this.b.t >= 1.0f && b, "min zoom value hasn't been initialized properly");
        }
        final jkf b2 = this.b;
        if (b2.w && !b2.x) {
            b2.u();
        }
        this.b.A(2);
        this.b.i.setAccessibilityLiveRegion(2);
    }
    
    @Override
    public final void g() {
    }
    
    @Override
    public void n() {
        final jkf b = this.b;
        if (b.w) {
            b.r();
            this.b.w();
        }
    }
    
    @Override
    public void o() {
        final jkf b = this.b;
        if (b.w) {
            b.r();
            this.b.w();
        }
    }
    
    @Override
    public final void q(float s) {
        final float n = ((float)this.b.h.aQ() + 0.33f) * s * s - 0.33f;
        final jkf b = this.b;
        s = b.s;
        if (n <= s) {
            final float t = b.t;
            s = n;
            if (n < t) {
                s = t;
            }
        }
        b.h.aR(s);
        this.b.r();
    }
}
