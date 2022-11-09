import android.graphics.Color;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ndx
{
    private static final int c;
    public final boolean a;
    public final int b;
    private final int d;
    private final int e;
    private final float f;
    
    static {
        c = (int)Math.round(5.1000000000000005);
    }
    
    public ndx(final Context context) {
        final boolean f = neu.f(context, 2130969049, false);
        final int c = neq.c(context, 2130969048, 0);
        final int c2 = neq.c(context, 2130969047, 0);
        final int c3 = neq.c(context, 2130968905, 0);
        final float density = context.getResources().getDisplayMetrics().density;
        this.a = f;
        this.d = c;
        this.e = c2;
        this.b = c3;
        this.f = density;
    }
    
    public final int a(int n, float min) {
        final float f = this.f;
        if (f > 0.0f) {
            if (min <= 0.0f) {
                min = 0.0f;
            }
            else {
                min = Math.min(((float)Math.log1p(min / f) * 4.5f + 2.0f) / 100.0f, 1.0f);
            }
        }
        else {
            min = 0.0f;
        }
        final int alpha = Color.alpha(n);
        n = neq.d(gv.c(n, 255), this.d, min);
        if (min > 0.0f) {
            final int e = this.e;
            if (e != 0) {
                n = gv.b(gv.c(e, ndx.c), n);
            }
        }
        return gv.c(n, alpha);
    }
}
