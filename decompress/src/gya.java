import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gya
{
    public lfu a;
    public hio b;
    public kra c;
    public oey d;
    public huz e;
    public Rect f;
    public Long g;
    public hjc h;
    private final lju i;
    private Long j;
    
    public gya(final lju i) {
        this.a = null;
        this.b = hio.a;
        this.c = kra.a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.j = null;
        this.h = hjc.a;
        this.i = i;
        this.f = i.e();
    }
    
    public final gyb a() {
        final Long g = this.g;
        final Long j = this.j;
        Long value = g;
        if (g == null) {
            value = this.i.d();
        }
        Long value2;
        if ((value2 = j) == null) {
            value2 = jdu.a(value);
        }
        final lju i = this.i;
        final hio b = this.b;
        final lfu a = this.a;
        final kra c = this.c;
        final oey d = this.d;
        Rect rect = this.f;
        if (rect == null) {
            rect = i.e();
        }
        return new gyb(i, b, a, c, d, rect, value, value2, this.e, this.h);
    }
    
    public final void b(final long n) {
        this.j = n;
    }
    
    public final void c(final ljm ljm) {
        oey n;
        if (ljm != null) {
            n = ofi.n(ljm);
        }
        else {
            n = null;
        }
        this.d = n;
    }
}
