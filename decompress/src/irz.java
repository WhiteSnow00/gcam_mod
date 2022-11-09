import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irz
{
    public final View a;
    private final Context b;
    private final int c;
    private final int d;
    private final Rect e;
    private final boolean f;
    
    public irz(final Context b, final View a, final boolean f) {
        this.b = b;
        this.a = a;
        this.e = new Rect();
        this.c = b.getResources().getInteger(2131492951);
        this.d = b.getResources().getInteger(2131492952);
        this.f = f;
    }
    
    public final void a(final boolean b) {
        final Drawable foreground = this.a.getForeground();
        if (b && foreground != null) {
            final ObjectAnimator ofInt = ObjectAnimator.ofInt((Object)foreground, "alpha", new int[] { 255, 0 });
            ofInt.setInterpolator((TimeInterpolator)new LinearInterpolator());
            ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new irx(this));
            ofInt.setDuration((long)this.d);
            ofInt.setStartDelay((long)this.c);
            ofInt.addListener((Animator$AnimatorListener)new iry(this));
            ofInt.start();
            return;
        }
        this.a.setForeground((Drawable)null);
    }
    
    public final void b() {
        final Rect rect = new Rect(this.a.getLeft(), this.a.getTop(), this.a.getRight(), this.a.getBottom());
        Object drawable = this.b.getDrawable(2131231397);
        if (!this.f) {
            drawable = this.b.getDrawable(2131231397);
            ((LayerDrawable)drawable).setDrawableByLayerId(2131427811, this.b.getDrawable(2131231399));
        }
        int n;
        if (this.a.getResources().getConfiguration().getLayoutDirection() == 1) {
            n = 0;
        }
        else {
            n = ((Drawable)drawable).getIntrinsicWidth() / 2;
        }
        this.a.setForeground((Drawable)new InsetDrawable((Drawable)drawable, rect.width() - ((Drawable)drawable).getIntrinsicWidth() - this.e.right + n, this.e.top, this.e.right - n, rect.height() - ((Drawable)drawable).getIntrinsicHeight() - this.e.top));
    }
    
    public final void c(final int n, final int n2, final int n3) {
        this.e.set(n, n2, n3, 0);
    }
}
