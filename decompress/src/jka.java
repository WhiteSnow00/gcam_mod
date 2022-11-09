// 
// Decompiled by Procyon v0.6.0
// 

public class jka extends jjs
{
    final /* synthetic */ jkf b;
    
    public jka(final jkf b) {
        this.b = b;
    }
    
    @Override
    public void a() {
        this.b.s(true);
    }
    
    @Override
    public void c() {
    }
    
    @Override
    public final void f() {
        njo.e(this.b.s != 0.0f, "max zoom value hasn't been initialized properly");
        njo.e(this.b.t != 0.0f, "min zoom value hasn't been initialized properly");
        final jkf b = this.b;
        if (b.w && !b.x) {
            b.u();
        }
        float n;
        if (((jbm)this.b.u.aQ()).equals(jbm.g)) {
            n = this.b.t;
        }
        else {
            n = (float)this.b.o.aQ();
        }
        float floatValue;
        if (((jbm)this.b.u.aQ()).equals(jbm.g)) {
            floatValue = (float)this.b.v.g(cyc.h).c();
        }
        else {
            floatValue = n + n;
        }
        if ((float)this.b.h.aQ() != n) {
            floatValue = n;
        }
        if (floatValue == n) {
            final jkf b2 = this.b;
            b2.z(3, (float)b2.h.aQ(), floatValue);
        }
        else {
            final jkf b3 = this.b;
            b3.z(2, (float)b3.h.aQ(), floatValue);
        }
        final jkf b4 = this.b;
        b4.k.setFloatValues(new float[] { (float)b4.h.aQ(), floatValue });
        this.b.k.start();
        this.b.A(6);
        this.b.i.setAccessibilityLiveRegion(2);
    }
    
    @Override
    public final void g() {
        this.b.k.cancel();
    }
}
