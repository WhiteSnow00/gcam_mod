import android.graphics.drawable.Drawable$Callback;
import android.view.View;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

// 
// Decompiled by Procyon v0.6.0
// 

final class pe extends oz
{
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff$Mode e;
    private boolean f;
    private boolean g;
    
    public pe(final SeekBar b) {
        super((ProgressBar)b);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = b;
    }
    
    private final void b() {
        final Drawable c = this.c;
        if (c != null && (this.f || this.g)) {
            final Drawable mutate = c.mutate();
            this.c = mutate;
            if (this.f) {
                mutate.setTintList(this.d);
            }
            if (this.g) {
                this.c.setTintMode(this.e);
            }
            if (this.c.isStateful()) {
                this.c.setState(this.b.getDrawableState());
            }
        }
    }
    
    @Override
    public final void a(final AttributeSet set, final int n) {
        super.a(set, 2130969620);
        final to q = to.q(this.b.getContext(), set, lo.g, 2130969620);
        final SeekBar b = this.b;
        ik.E((View)b, b.getContext(), lo.g, set, q.b, 2130969620, 0);
        final Drawable i = q.i(0);
        if (i != null) {
            this.b.setThumb(i);
        }
        final Drawable h = q.h(1);
        final Drawable c = this.c;
        if (c != null) {
            c.setCallback((Drawable$Callback)null);
        }
        if ((this.c = h) != null) {
            h.setCallback((Drawable$Callback)this.b);
            h.setLayoutDirection(ik.f((View)this.b));
            if (h.isStateful()) {
                h.setState(this.b.getDrawableState());
            }
            this.b();
        }
        this.b.invalidate();
        if (q.p(3)) {
            this.e = qi.a(q.c(3, -1), this.e);
            this.g = true;
        }
        if (q.p(2)) {
            this.d = q.g(2);
            this.f = true;
        }
        q.n();
        this.b();
    }
}
