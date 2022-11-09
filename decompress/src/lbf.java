import android.hardware.camera2.params.MeteringRectangle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lbf implements kvq
{
    public Integer a;
    public Integer b;
    public Integer c;
    public Integer d;
    public Integer e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public MeteringRectangle[] i;
    public MeteringRectangle[] j;
    public MeteringRectangle[] k;
    
    public lbf(final Integer a, final Integer b, final Integer c, final Integer d, final Integer e, final MeteringRectangle[] i, final MeteringRectangle[] j, final MeteringRectangle[] k, final Boolean f, final Boolean g, final Boolean h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.i = i;
        this.j = j;
        this.k = k;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static lbf c(final kvr kvr) {
        final Integer d = kvr.d();
        final Integer b = kvr.b();
        final Integer a = kvr.a();
        final Integer c = kvr.c();
        final Integer e = kvr.e();
        final MeteringRectangle[] g = kvr.g();
        final MeteringRectangle[] f = kvr.f();
        final MeteringRectangle[] h = kvr.h();
        final Boolean value = false;
        return new lbf(d, b, a, c, e, g, f, h, value, value, value);
    }
    
    public static lbf d(final lbg lbg) {
        final lbf c = c(lbg);
        c.f = lbg.a;
        c.g = lbg.b;
        c.h = lbg.c;
        return c;
    }
    
    public final lbg e() {
        return new lbg(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }
}
