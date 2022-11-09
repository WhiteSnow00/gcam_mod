// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.zoomlock;

import android.animation.Animator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources$Theme;
import android.animation.ArgbEvaluator;
import android.animation.Animator$AnimatorListener;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Trace;
import android.animation.TimeInterpolator;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ZoomLockView extends RelativeLayout
{
    public ImageView a;
    public ImageView b;
    public AnimatorSet c;
    public ObjectAnimator d;
    public ImageView e;
    public boolean f;
    public jcb g;
    public jbi h;
    private AnimatorSet i;
    
    public ZoomLockView(final Context context) {
        super(context);
        this.g = jcb.a;
    }
    
    public ZoomLockView(final Context context, final AttributeSet set) {
        super(context, set);
        this.g = jcb.a;
    }
    
    private static ObjectAnimator c(final View view) {
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, "alpha", new float[] { 0.0f, 1.0f });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator((TimeInterpolator)new adh());
        ofFloat.setStartDelay(50L);
        return ofFloat;
    }
    
    private final ObjectAnimator d(final View view) {
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, "translationX", new float[] { this.getResources().getDimension(2131166433) });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator((TimeInterpolator)new adh());
        ofFloat.setStartDelay(50L);
        return ofFloat;
    }
    
    public final void a() {
        Trace.beginSection("ZoomLockView:applyOrientation");
        final ImageView a = this.a;
        if (a != null) {
            jvu.s((View)a, this.g);
        }
        Trace.endSection();
    }
    
    public final void b() {
        if (!this.f) {
            this.i.start();
        }
    }
    
    protected final void onFinishInflate() {
        Trace.beginSection("ZoomLockView:inflate");
        super.onFinishInflate();
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624192, (ViewGroup)this, true);
        this.setLayerType(1, (Paint)null);
        this.a = (ImageView)this.findViewById(2131428210);
        this.b = (ImageView)this.findViewById(2131427712);
        this.e = (ImageView)this.findViewById(2131428209);
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.b, "scaleX", new float[] { 1.5f });
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)this.b, "scaleY", new float[] { 1.5f });
        ofFloat.setDuration(200L);
        ofFloat2.setDuration(200L);
        ofFloat.setInterpolator((TimeInterpolator)new adh());
        ofFloat2.setInterpolator((TimeInterpolator)new adh());
        ofFloat.addListener((Animator$AnimatorListener)new jbc(this));
        final ValueAnimator ofObject = ValueAnimator.ofObject((TypeEvaluator)new ArgbEvaluator(), new Object[] { this.getResources().getColor(2131101497, (Resources$Theme)null), this.getResources().getColor(2131101496, (Resources$Theme)null) });
        ofObject.setDuration(200L);
        ofObject.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new jbd(this));
        ofObject.addListener((Animator$AnimatorListener)new jbe(this));
        ofObject.setStartDelay(50L);
        final ObjectAnimator d = this.d((View)this.e);
        final ObjectAnimator d2 = this.d((View)this.a);
        final ObjectAnimator c = c((View)this.e);
        final ObjectAnimator c2 = c((View)this.a);
        c.addListener((Animator$AnimatorListener)new jbf(this));
        final AnimatorSet c3 = new AnimatorSet();
        this.c = c3;
        c3.play((Animator)ofFloat).with((Animator)ofFloat2);
        this.c.play((Animator)ofObject).after((Animator)ofFloat);
        this.c.play((Animator)d).with((Animator)ofObject);
        this.c.play((Animator)c).with((Animator)ofObject);
        this.c.play((Animator)d2).with((Animator)ofObject);
        this.c.play((Animator)c2).with((Animator)ofObject);
        (this.d = ObjectAnimator.ofFloat((Object)this, "alpha", new float[] { 1.0f, 0.0f })).setDuration(200L);
        this.d.setInterpolator((TimeInterpolator)new adh());
        this.d.addListener((Animator$AnimatorListener)new jbg(this));
        final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)this.b, "scaleX", new float[] { 1.0f });
        final ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat((Object)this.b, "scaleY", new float[] { 1.0f });
        ofFloat3.setDuration(200L);
        ofFloat4.setDuration(200L);
        ofFloat3.setInterpolator((TimeInterpolator)new adh());
        ofFloat4.setInterpolator((TimeInterpolator)new adh());
        final AnimatorSet i = new AnimatorSet();
        this.i = i;
        i.play((Animator)ofFloat3).with((Animator)ofFloat4);
        this.i.addListener((Animator$AnimatorListener)new jbh(this));
        Trace.endSection();
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        Trace.beginSection("ZoomLockView:onLayout");
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.a();
        }
        Trace.endSection();
    }
}
