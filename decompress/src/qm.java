import android.animation.ValueAnimator;

// 
// Decompiled by Procyon v0.6.0
// 

final class qm implements Runnable
{
    final /* synthetic */ qq a;
    
    public qm(final qq a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final qq a = this.a;
        switch (a.q) {
            default: {
                return;
            }
            case 1: {
                a.p.cancel();
            }
            case 2: {
                a.q = 3;
                final ValueAnimator p = a.p;
                p.setFloatValues(new float[] { (float)p.getAnimatedValue(), 0.0f });
                a.p.setDuration(500L);
                a.p.start();
            }
        }
    }
}
