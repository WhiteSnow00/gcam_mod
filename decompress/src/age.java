import android.view.View;
import android.graphics.Rect;
import androidx.viewpager.widget.ViewPager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class age implements ie
{
    final /* synthetic */ ViewPager a;
    private final Rect b;
    
    public age(final ViewPager a) {
        this.a = a;
        this.b = new Rect();
    }
    
    @Override
    public final ix a(final View view, ix s) {
        s = ik.s(view, s);
        if (s.r()) {
            return s;
        }
        final Rect b = this.b;
        b.left = s.b();
        b.top = s.d();
        b.right = s.c();
        b.bottom = s.a();
        for (int childCount = this.a.getChildCount(), i = 0; i < childCount; ++i) {
            final ix q = ik.q(this.a.getChildAt(i), s);
            b.left = Math.min(q.b(), b.left);
            b.top = Math.min(q.d(), b.top);
            b.right = Math.min(q.c(), b.right);
            b.bottom = Math.min(q.a(), b.bottom);
        }
        final iq iq = new iq(s);
        hh.f(gw.b(b), iq);
        return hh.e(iq);
    }
}
