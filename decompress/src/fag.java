import android.animation.TimeInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

final class fag implements hhz
{
    final /* synthetic */ fah a;
    
    public fag(final fah a) {
        this.a = a;
    }
    
    @Override
    public final void l(final long duration) {
        final fah a = this.a;
        if (!a.c && a.d) {
            fah.f(a);
            final fah a2 = this.a;
            final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { 178, 0 });
            ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new faf(a2));
            ofInt.setInterpolator((TimeInterpolator)new AccelerateInterpolator());
            ofInt.setDuration(duration);
            ofInt.start();
        }
    }
    
    @Override
    public final void m(final Bitmap bitmap) {
        final fah a = this.a;
        if (a.d) {
            fah.f(a);
            final fah a2 = this.a;
            a2.a.b(jct.b(bitmap, a2.e));
        }
    }
}
