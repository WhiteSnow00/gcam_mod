import android.view.animation.Interpolator;
import android.view.View;
import android.util.DisplayMetrics;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rq extends sp
{
    final /* synthetic */ rr a;
    
    public rq(final rr a, final Context context) {
        this.a = a;
        super(context);
    }
    
    @Override
    protected final float a(final DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
    
    @Override
    protected final int b(final int n) {
        return Math.min(100, super.b(n));
    }
    
    @Override
    protected final void c(final View view, final sn sn) {
        final rr a = this.a;
        final int[] d = a.d(a.a.l, view);
        final int n = d[0];
        final int n2 = d[1];
        final int g = this.g(Math.max(Math.abs(n), Math.abs(n2)));
        if (g > 0) {
            sn.b(n, n2, g, (Interpolator)this.j);
        }
    }
}
