// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.views;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Trace;
import android.graphics.drawable.Drawable;
import j$.util.function.Consumer;
import java.util.Collection;
import j$.util.Collection$_EL;
import android.view.View;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.AnimatorSet;
import android.widget.ImageView;
import android.widget.ImageButton;
import j$.time.Duration;
import android.widget.FrameLayout;

public class ToggleUi extends FrameLayout
{
    public static final Duration a;
    private static final nsd f;
    public jcb b;
    public ImageButton c;
    public ImageView d;
    public AnimatorSet e;
    
    static {
        f = nsd.g("com/google/android/apps/camera/ui/views/ToggleUi");
        a = Duration.ofMillis(200L);
    }
    
    public ToggleUi(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    private static void g(final ValueAnimator valueAnimator, final ValueAnimator$AnimatorUpdateListener valueAnimator$AnimatorUpdateListener) {
        valueAnimator.addUpdateListener(valueAnimator$AnimatorUpdateListener);
        valueAnimator.setInterpolator((TimeInterpolator)new adh());
    }
    
    public final void a(final jcb b) {
        jvu.r((View)this, this.b = b);
        Collection$_EL.stream((Collection)noi.H(this.c)).forEach((Consumer)new hsp(b, 2));
    }
    
    public final void b() {
        final AnimatorSet e = this.e;
        if (e != null && e.isRunning()) {
            this.e.cancel();
        }
    }
    
    public final void c(final int imageResource) {
        this.d.setImageResource(imageResource);
    }
    
    public final void d(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.c.setImageDrawable(imageDrawable);
            return;
        }
        a.l(ToggleUi.f.b(), "Invalid button image resource.", '\u0bb2');
    }
    
    public final void e(final int n) {
        this.c.setContentDescription((CharSequence)this.getResources().getString(n));
    }
    
    public final void f(final boolean pressed, final int imageAlpha) {
        this.d.setPressed(pressed);
        this.c.setImageAlpha(imageAlpha);
    }
    
    protected final void onFinishInflate() {
        Trace.beginSection("ToggleUi:inflate");
        super.onFinishInflate();
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624166, (ViewGroup)this);
        this.setLayerType(1, (Paint)null);
        Trace.endSection();
        this.c = (ImageButton)this.findViewById(2131428080);
        this.d = (ImageView)this.findViewById(2131428078);
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        g(ofFloat, (ValueAnimator$AnimatorUpdateListener)new iyy(this, 1));
        final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        g(ofFloat2, (ValueAnimator$AnimatorUpdateListener)new iyy(this));
        (this.e = new AnimatorSet()).playTogether(new Animator[] { (Animator)ofFloat, (Animator)ofFloat2 });
        this.e.setDuration(ToggleUi.a.toMillis());
        this.e.addListener((Animator$AnimatorListener)new iyz(this));
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.a(this.b);
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (jcb.d(this.b)) {
            super.onMeasure(n, n2);
            return;
        }
        super.onMeasure(n2, n);
    }
}
