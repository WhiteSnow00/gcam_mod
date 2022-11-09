import android.graphics.RectF;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.graphics.Matrix;
import android.animation.ValueAnimator;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class djj
{
    public final jda a;
    public final jda b;
    public final jda c;
    public final Handler d;
    public float e;
    public int f;
    public boolean g;
    public final ValueAnimator h;
    public final Runnable i;
    private final Matrix j;
    private final ValueAnimator k;
    
    public djj(final gzm gzm, final Matrix j) {
        this.a = new jda(5);
        this.b = new jda(5);
        this.c = new jda(5);
        this.i = new dji(this);
        this.j = j;
        this.b(gzm);
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 1.0f, 1.2f });
        (this.k = ofFloat).setInterpolator((TimeInterpolator)new adh());
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new djg(this, 1));
        ofFloat.addListener((Animator$AnimatorListener)new djh(this));
        final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { 204, 0 });
        (this.h = ofInt).setInterpolator((TimeInterpolator)new adh());
        ofInt.setDuration(500L);
        ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new djg(this));
        this.d = kpo.c();
    }
    
    public final void a() {
        if (!this.k.isStarted()) {
            this.f = 204;
            this.e = this.c.a;
            this.k.start();
            this.g = true;
        }
    }
    
    public final void b(final gzm gzm) {
        final RectF rectF = new RectF(gzm.a);
        this.j.mapRect(rectF);
        this.a.a(rectF.centerX());
        this.b.a(rectF.centerY());
        final float n = rectF.width() * 0.5f;
        this.c.a(n);
        final float a = this.c.a;
        final float n2 = 0.5f * n;
        if (n >= a - n2 && n <= a + n2) {
            return;
        }
        if (this.g) {
            this.d.removeCallbacks(this.i);
            this.d.postDelayed(this.i, 1000L);
            return;
        }
        this.a();
    }
    
    @Override
    public final String toString() {
        return String.format("ViewfinderFace: Center: %f,%f / Radius: %f", this.a.a, this.b.a, this.c.a);
    }
}
