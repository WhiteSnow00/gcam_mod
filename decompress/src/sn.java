import android.util.Log;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sn
{
    public int a;
    private int b;
    private int c;
    private int d;
    private Interpolator e;
    private boolean f;
    private int g;
    
    public sn() {
        this.a = -1;
        this.f = false;
        this.g = 0;
        this.b = 0;
        this.c = 0;
        this.d = Integer.MIN_VALUE;
        this.e = null;
    }
    
    final void a(final RecyclerView recyclerView) {
        final int a = this.a;
        if (a >= 0) {
            this.a = -1;
            recyclerView.E(a);
            this.f = false;
            return;
        }
        if (!this.f) {
            this.g = 0;
            return;
        }
        final Interpolator e = this.e;
        if (e != null && this.d <= 0) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        final int d = this.d;
        if (d > 0) {
            recyclerView.F.b(this.b, this.c, d, e);
            if (++this.g > 10) {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            this.f = false;
            return;
        }
        throw new IllegalStateException("Scroll duration must be a positive number");
    }
    
    public final void b(final int b, final int c, final int d, final Interpolator e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = true;
    }
}
