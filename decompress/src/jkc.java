// 
// Decompiled by Procyon v0.6.0
// 

public class jkc extends jjs
{
    final /* synthetic */ jkf b;
    
    public jkc(final jkf b) {
        this.b = b;
    }
    
    @Override
    public void a() {
        this.b.s(true);
    }
    
    @Override
    public void bD() {
    }
    
    @Override
    public void d() {
    }
    
    @Override
    public final void f() {
        this.b.A(3);
        this.b.x();
    }
    
    @Override
    public final void g() {
    }
    
    @Override
    public final void j(final int n) {
        this.b.B(n);
    }
    
    @Override
    public void k() {
    }
    
    @Override
    public void l(final boolean r) {
        this.b.r = r;
    }
    
    @Override
    public void m(final float n, final int n2) {
        this.b.z(jkf.y(n2), (float)this.b.h.aQ(), n);
        final jkf b = this.b;
        b.m.setFloatValues(new float[] { (float)b.h.aQ(), n });
        this.b.m.start();
    }
    
    @Override
    public final void o() {
        final jkf b = this.b;
        if (b.w) {
            final float floatValue = (float)b.h.aQ();
            final jkf b2 = this.b;
            final float t = b2.t;
            if (floatValue < t) {
                b2.h.aR(t);
            }
            this.b.r();
            this.b.w();
        }
    }
    
    @Override
    public final void p() {
        this.b.u();
        this.b.q.a();
        this.b.i.a(true);
        this.b.i.setAccessibilityLiveRegion(2);
        final jkf b = this.b;
        b.z(10, b.t, (float)b.h.aQ());
    }
}
