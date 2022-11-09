// 
// Decompiled by Procyon v0.6.0
// 

public class jkd extends jjs
{
    private float a;
    final /* synthetic */ jkf b;
    
    public jkd(final jkf b) {
        this.b = b;
    }
    
    @Override
    public void a() {
        this.b.s(true);
    }
    
    @Override
    public final void f() {
        njo.e(this.b.s != 0.0f, "max zoom value hasn't been initialized properly");
        this.b.A(4);
        this.b.r();
        this.b.i.a(true);
        this.b.i.b(true);
        this.a = (float)this.b.h.aQ();
        this.b.i.setAccessibilityLiveRegion(2);
    }
    
    @Override
    public final void g() {
        this.b.i.a(false);
    }
    
    @Override
    public void n() {
        this.b.i.a(false);
        final jkf b = this.b;
        if (b.w) {
            b.r();
            this.b.w();
        }
        final jkf b2 = this.b;
        b2.z(5, this.a, (float)b2.h.aQ());
    }
}
