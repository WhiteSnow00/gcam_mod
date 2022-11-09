// 
// Decompiled by Procyon v0.6.0
// 

public class jjz extends jjs
{
    private float a;
    final /* synthetic */ jkf b;
    
    public jjz(final jkf b) {
        this.b = b;
    }
    
    @Override
    public void a() {
        this.b.s(true);
    }
    
    @Override
    public void b() {
    }
    
    @Override
    public final void f() {
        njo.e(this.b.s != 0.0f, "max zoom value hasn't been initialized properly");
        this.a = (float)this.b.h.aQ();
        final jkf b = this.b;
        float n;
        if (b.r) {
            n = b.s;
        }
        else {
            n = b.t;
        }
        b.l.setFloatValues(new float[] { (float)b.h.aQ(), n });
        final float abs = Math.abs(n - (float)this.b.h.aQ());
        final jkf b2 = this.b;
        b2.l.setDuration((long)(int)(abs / (b2.s - b2.t) * 2000.0f));
        this.b.l.start();
        this.b.A(5);
        this.b.i.setAccessibilityLiveRegion(2);
    }
    
    @Override
    public final void g() {
        final jkf b = this.b;
        b.z(7, this.a, (float)b.h.aQ());
        this.b.l.cancel();
    }
}
