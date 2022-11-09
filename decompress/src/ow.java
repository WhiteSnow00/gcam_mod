import android.graphics.drawable.RippleDrawable;
import android.graphics.PorterDuff$Mode;
import android.view.View;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ow
{
    public tm a;
    private final ImageView b;
    
    public ow(final ImageView b) {
        this.b = b;
    }
    
    public final void a() {
        final Drawable drawable = this.b.getDrawable();
        if (drawable != null) {
            final Rect a = qi.a;
        }
        if (drawable != null) {
            final tm a2 = this.a;
            if (a2 != null) {
                sx.h(drawable, a2, this.b.getDrawableState());
            }
        }
    }
    
    public final void b(final AttributeSet set, int f) {
        final to q = to.q(this.b.getContext(), set, lo.f, f);
        final ImageView b = this.b;
        ik.E((View)b, b.getContext(), lo.f, set, q.b, f, 0);
        try {
            Drawable drawable2;
            final Drawable drawable = drawable2 = this.b.getDrawable();
            if (drawable == null) {
                f = q.f(1, -1);
                drawable2 = drawable;
                if (f != -1) {
                    final Drawable b2 = lp.b(this.b.getContext(), f);
                    if ((drawable2 = b2) != null) {
                        this.b.setImageDrawable(b2);
                        drawable2 = b2;
                    }
                }
            }
            if (drawable2 != null) {
                final Rect a = qi.a;
            }
            if (q.p(2)) {
                this.b.setImageTintList(q.g(2));
            }
            if (q.p(3)) {
                this.b.setImageTintMode(qi.a(q.c(3, -1), null));
            }
        }
        finally {
            q.n();
        }
    }
    
    public final void c(final int n) {
        if (n != 0) {
            final Drawable b = lp.b(this.b.getContext(), n);
            if (b != null) {
                final Rect a = qi.a;
            }
            this.b.setImageDrawable(b);
        }
        else {
            this.b.setImageDrawable((Drawable)null);
        }
        this.a();
    }
    
    public final boolean d() {
        return !(this.b.getBackground() instanceof RippleDrawable);
    }
}
