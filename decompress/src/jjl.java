import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class jjl extends AnimatorListenerAdapter
{
    final /* synthetic */ jjq a;
    
    public jjl(final jjq a) {
        this.a = a;
    }
    
    public final void onAnimationStart(final Animator animator) {
        final jjq a = this.a;
        final int progress = a.G.getProgress();
        if (a.H.r()) {
            final float a2 = a.I.a(progress);
            final jin i = a.I;
            i.e.setFloatValues(new float[] { (float)a.g.aQ(), a2 });
            i.e.start();
            a.s.aR(a2);
            final jin j = a.I;
            j.h(a.H, j.d(a2));
            a.z.z(11, (float)a.g.aQ(), a2);
        }
    }
}
