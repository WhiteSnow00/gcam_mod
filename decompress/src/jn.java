import android.view.MotionEvent;
import android.os.SystemClock;
import android.view.animation.AnimationUtils;

// 
// Decompiled by Procyon v0.6.0
// 

final class jn implements Runnable
{
    final /* synthetic */ jo a;
    
    public jn(final jo a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final jo a = this.a;
        if (!a.e) {
            return;
        }
        if (a.c) {
            a.c = false;
            final jm a2 = a.a;
            final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            a2.e = currentAnimationTimeMillis;
            a2.g = -1L;
            a2.f = currentAnimationTimeMillis;
            a2.h = 0.5f;
        }
        final jm a3 = this.a.a;
        if ((a3.g > 0L && AnimationUtils.currentAnimationTimeMillis() > a3.g + a3.i) || !this.a.b()) {
            this.a.e = false;
            return;
        }
        final jo a4 = this.a;
        if (a4.d) {
            a4.d = false;
            final long uptimeMillis = SystemClock.uptimeMillis();
            final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            a4.b.onTouchEvent(obtain);
            obtain.recycle();
        }
        if (a3.f != 0L) {
            final long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            final float a5 = a3.a(currentAnimationTimeMillis2);
            final long f = a3.f;
            a3.f = currentAnimationTimeMillis2;
            this.a.f.scrollListBy((int)((currentAnimationTimeMillis2 - f) * (-4.0f * a5 * a5 + a5 * 4.0f) * a3.d));
            ik.A(this.a.b, this);
            return;
        }
        throw new RuntimeException("Cannot compute scroll delta before calling start()");
    }
}
