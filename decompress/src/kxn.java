import android.hardware.camera2.params.MeteringRectangle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxn implements kvq
{
    static final Integer a;
    static final MeteringRectangle[] b;
    public Integer c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public MeteringRectangle[] h;
    public MeteringRectangle[] i;
    public MeteringRectangle[] j;
    
    static {
        a = -1;
        b = new MeteringRectangle[0];
    }
    
    private kxn(final Integer c, final Integer d, final Integer e, final Integer f, final Integer g, final MeteringRectangle[] h, final MeteringRectangle[] i, final MeteringRectangle[] j) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    static kxn c() {
        final Integer a = kxn.a;
        final MeteringRectangle[] b = kxn.b;
        return new kxn(a, a, a, a, a, b, b, b);
    }
    
    @Override
    public final kvr a() {
        return new kxm(this);
    }
    
    @Override
    public final void b(final MeteringRectangle[] j) {
        this.h = j;
        this.i = j;
        this.j = j;
    }
}
