import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixu implements exn, exl
{
    private final Interpolator a;
    private final kkz b;
    private final kkz c;
    private final kkz d;
    private final kkz e;
    private long f;
    
    public ixu(final Interpolator a) {
        this.b = new kkz(Boolean.FALSE);
        this.c = new kkz(0);
        this.d = new kkz(1.0f);
        this.e = new kkz(0.0f);
        njo.d(true);
        njo.d(true);
        njo.d(true);
        this.a = a;
        this.f = 300L;
    }
    
    @Override
    public final void bk() {
        this.f = 0L;
        boolean b = true;
        njo.o(true);
        final long f = this.f;
        float n;
        if (f >= 300L) {
            n = 1.0f;
        }
        else {
            n = f / 300.0f;
        }
        final float n2 = 1.0f - this.a.getInterpolation(n);
        this.c.aR((int)(16.0f * n2));
        this.d.aR(n2 * 0.20000005f + 1.0f);
        this.e.aR(0.8f * n + 0.2f);
        final kkz b2 = this.b;
        if (n >= 1.0f) {
            b = false;
        }
        b2.aR(b);
    }
}
