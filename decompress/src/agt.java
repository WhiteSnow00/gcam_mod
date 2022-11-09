import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agt extends aal
{
    final /* synthetic */ ViewPager2 a;
    
    public agt(final ViewPager2 a) {
        this.a = a;
    }
    
    @Override
    public final void d(int bd) {
        if (bd == 0) {
            final ViewPager2 a = this.a;
            final rr f = a.f;
            if (f == null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            final View c = f.c(a.d);
            if (c != null) {
                bd = se.bd(c);
                if (bd != a.c && a.g.b == 0) {
                    a.h.f(bd);
                }
            }
        }
    }
    
    @Override
    public final void f(final int c) {
        final ViewPager2 a = this.a;
        if (a.c != c) {
            a.c = c;
            a.k.l();
        }
    }
}
