import java.util.List;
import java.util.concurrent.TimeUnit;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkp implements krc
{
    private static final long a;
    private final Rect b;
    private final nns c;
    private final dtb d;
    private final krr e;
    private final String f;
    private long g;
    private float h;
    
    static {
        a = TimeUnit.MILLISECONDS.toNanos(500L);
    }
    
    public bkp(final fxu fxu, final dtb d, final krr e, final String f) {
        this.g = 0L;
        this.h = 0.0f;
        final Rect h = fxu.h();
        this.b = h;
        this.c = nns.p(new float[] { 0.0f, 0.0f }, new float[] { 0.0f, (float)h.height() }, new float[] { (float)h.width(), 0.0f }, new float[] { (float)h.width(), (float)h.height() });
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final ljm ljm) {
        if (!this.d.e()) {
            return;
        }
        final gzn gzn = new gzn(ljm, 0, this.b);
        final long b = gzn.b;
        if (b - this.g < bkp.a) {
            return;
        }
        this.g = b;
        final List b2 = this.d.b(b, gzn);
        final boolean empty = b2.isEmpty();
        float max = 0.0f;
        if (empty) {
            this.e.d("Motion estimator returned empty homography list. Assuming zero motion.");
            this.h = 0.0f;
            return;
        }
        final lyb lyb = b2.get(0);
        final nns c = this.c;
        for (int c2 = ((nql)c).c, i = 0; i < c2; ++i) {
            final float[] array = c.get(i);
            final float[] e = lyb.e(array);
            max = Math.max(max, (float)Math.hypot(e[0] - array[0], e[1] - array[1]));
        }
        this.h = max;
        final krr e2 = this.e;
        final StringBuilder sb = new StringBuilder(42);
        sb.append("Current motion magnitude = ");
        sb.append(max);
        e2.g(sb.toString());
    }
    
    public final void b() {
        this.e.b("Starting MotionSampler");
        this.d.f(new kre(this.b.width(), this.b.height()), this.f);
    }
    
    public final boolean c() {
        return this.d.e() && this.h > 300.0f;
    }
    
    @Override
    public final void close() {
        this.e.b("Closing MotionSampler");
        if (this.d.e()) {
            this.d.c();
        }
    }
}
