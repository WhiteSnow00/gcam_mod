// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.camcorder.ui.stabilization;

import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuButton;
import android.widget.FrameLayout;

public class StabilizationUi extends FrameLayout
{
    public final nnx a;
    public PopupMenuButton b;
    public FrameLayout c;
    public jcb d;
    private ValueAnimator e;
    
    public StabilizationUi(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = nnx.r(cql.a, 2131231539, cql.b, 2131231536, cql.d, 2131231538, cql.c, 2131231535);
        this.d = jcb.a;
    }
    
    public final void a(final jcb d) {
        jvu.r((View)this, this.d = d);
        jvu.s((View)this.b, d);
    }
    
    public final void b(final boolean b, final boolean b2) {
        float alpha = 1.0f;
        if (!b2) {
            if (b) {
                alpha = 0.7f;
            }
            this.b.setAlpha(alpha);
            return;
        }
        if (b) {
            this.e.start();
            return;
        }
        this.e.cancel();
        this.b.setAlpha(1.0f);
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624157, (ViewGroup)this);
        this.setLayerType(1, (Paint)null);
        this.c = (FrameLayout)this.findViewById(2131428009);
        final PopupMenuButton b = (PopupMenuButton)this.findViewById(2131428008);
        this.b = b;
        final Integer n = (Integer)this.a.get(cql.a);
        n.getClass();
        b.setImageResource(n);
        (this.e = ValueAnimator.ofFloat(new float[] { 1.0f, 0.7f })).setDuration(1000L);
        this.e.setInterpolator((TimeInterpolator)new LinearInterpolator());
        this.e.setRepeatCount(-1);
        this.e.setRepeatMode(2);
        this.e.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new cps(this));
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.a(this.d);
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (jcb.d(this.d)) {
            super.onMeasure(n, n2);
            return;
        }
        super.onMeasure(n2, n);
    }
}
