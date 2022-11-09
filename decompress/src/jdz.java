import android.view.ViewPropertyAnimator;
import android.animation.TimeInterpolator;
import android.view.View;
import j$.time.Duration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdz
{
    public static final Duration a;
    private static final Duration b;
    private static final Duration c;
    
    static {
        b = Duration.ofMillis(200L);
        c = Duration.ofMillis(100L);
        a = Duration.ofMillis(150L);
    }
    
    public static void a(final int n, final View view) {
        float n2;
        if (n == 0) {
            n2 = 1.0f;
        }
        else {
            n2 = 0.0f;
        }
        view.animate().cancel();
        final boolean b = n == 0;
        view.setClickable(false);
        if (b) {
            view.setVisibility(0);
        }
        final ViewPropertyAnimator alpha = view.animate().alpha(n2);
        Duration duration;
        if (b) {
            duration = jdz.b;
        }
        else {
            duration = jdz.a;
        }
        final ViewPropertyAnimator setDuration = alpha.setDuration(duration.toMillis());
        long millis;
        if (b) {
            millis = jdz.c.toMillis();
        }
        else {
            millis = 0L;
        }
        setDuration.setStartDelay(millis).setInterpolator((TimeInterpolator)new adh()).withEndAction((Runnable)new jdy(view, b, n)).start();
    }
}
