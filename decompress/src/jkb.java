// 
// Decompiled by Procyon v0.6.0
// 

public class jkb extends jjs
{
    final /* synthetic */ jkf b;
    
    public jkb(final jkf b) {
        this.b = b;
    }
    
    @Override
    public final void a() {
        this.b.s(false);
    }
    
    @Override
    public void bD() {
        final jkf b = this.b;
        if (!b.x) {
            b.v();
        }
    }
    
    @Override
    public void d() {
    }
    
    @Override
    public final void f() {
        this.b.j.setEnabled(false);
        this.b.i.setEnabled(false);
        this.b.A(1);
        this.b.x();
    }
    
    @Override
    public final void g() {
        this.b.j.setEnabled(true);
        this.b.i.setEnabled(true);
    }
    
    @Override
    public void i() {
        this.b.v();
    }
    
    @Override
    public void j(final int n) {
        this.b.B(n);
    }
    
    @Override
    public final void m(final float n, final int n2) {
        this.b.z(jkf.y(n2), (float)this.b.h.aQ(), n);
        if (n2 != 1) {
            final jkf b = this.b;
            if (b.w) {
                b.v();
            }
        }
        final jkf b2 = this.b;
        b2.n.setFloatValues(new float[] { (float)b2.h.aQ(), n });
        this.b.n.start();
    }
}
