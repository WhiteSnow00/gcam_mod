import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dph
{
    public final FocusIndicatorRingView a;
    public final dos b;
    public final dou c;
    
    public dph(final FocusIndicatorRingView a, final dos b, final dou c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final ValueAnimator$AnimatorUpdateListener a() {
        return (ValueAnimator$AnimatorUpdateListener)new dpg(this, 1);
    }
    
    public final ValueAnimator$AnimatorUpdateListener b() {
        return (ValueAnimator$AnimatorUpdateListener)new dpg(this);
    }
    
    public final ValueAnimator$AnimatorUpdateListener c() {
        return (ValueAnimator$AnimatorUpdateListener)new dpg(this, 2);
    }
    
    public final ValueAnimator$AnimatorUpdateListener d() {
        return (ValueAnimator$AnimatorUpdateListener)new dpg(this, 3);
    }
}
