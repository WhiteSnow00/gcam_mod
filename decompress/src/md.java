import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class md
{
    public final ArrayList a;
    io b;
    public boolean c;
    private long d;
    private Interpolator e;
    private final ip f;
    
    public md() {
        this.d = -1L;
        this.f = new mc(this);
        this.a = new ArrayList();
    }
    
    public final void a() {
        if (!this.c) {
            return;
        }
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            ((in)a.get(i)).a();
        }
        this.c = false;
    }
    
    public final void b() {
        if (this.c) {
            return;
        }
        final ArrayList a = this.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            final in in = (in)a.get(i);
            final long d = this.d;
            if (d >= 0L) {
                in.c(d);
            }
            final Interpolator e = this.e;
            if (e != null) {
                final View view = (View)in.a.get();
                if (view != null) {
                    view.animate().setInterpolator((TimeInterpolator)e);
                }
            }
            if (this.b != null) {
                in.d(this.f);
            }
            final View view2 = (View)in.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.c = true;
    }
    
    public final void c(final in in) {
        if (!this.c) {
            this.a.add(in);
        }
    }
    
    public final void d() {
        if (!this.c) {
            this.d = 250L;
        }
    }
    
    public final void e(final Interpolator e) {
        if (!this.c) {
            this.e = e;
        }
    }
    
    public final void f(final io b) {
        if (!this.c) {
            this.b = b;
        }
    }
}
