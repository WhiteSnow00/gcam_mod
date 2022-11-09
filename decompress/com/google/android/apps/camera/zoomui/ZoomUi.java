// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.zoomui;

import android.animation.Animator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.animation.AnimationUtils;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.content.res.Resources$Theme;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.graphics.Paint;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.LayoutInflater;
import android.os.Trace;
import j$.util.function.Consumer;
import java.util.Collection;
import j$.util.Collection$_EL;
import android.widget.Space;
import android.widget.SeekBar;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.view.ViewGroup;
import android.graphics.Typeface;
import android.widget.TextView;
import android.animation.TimeInterpolator;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.widget.FrameLayout;

public class ZoomUi extends FrameLayout
{
    public static final Object a;
    public jcb b;
    public boolean c;
    public boolean d;
    public float e;
    public ObjectAnimator f;
    public ObjectAnimator g;
    public ObjectAnimator h;
    public AnimatorSet i;
    public AnimatorSet j;
    public boolean k;
    public int l;
    
    static {
        a = new Object();
    }
    
    public ZoomUi(final Context context, final AttributeSet set) {
        super(context, set);
        this.l = 1;
        this.k = false;
    }
    
    public static ObjectAnimator a(final View view, final boolean b) {
        ObjectAnimator objectAnimator;
        if (b) {
            objectAnimator = ObjectAnimator.ofFloat((Object)view, "alpha", new float[] { 0.0f, 1.0f });
        }
        else {
            objectAnimator = ObjectAnimator.ofFloat((Object)view, "alpha", new float[] { 1.0f, 0.0f });
        }
        objectAnimator.setDuration(100L);
        objectAnimator.setInterpolator((TimeInterpolator)new adh());
        return objectAnimator;
    }
    
    public static final void u(final TextView textView, final int textColor, final float letterSpacing, final Typeface typeface) {
        textView.setTextColor(textColor);
        textView.setLetterSpacing(letterSpacing);
        textView.setTypeface(typeface);
    }
    
    public final ViewGroup b() {
        return (ViewGroup)this.findViewById(2131428217);
    }
    
    public final ImageButton c() {
        return (ImageButton)this.findViewById(2131428213);
    }
    
    public final ImageButton d() {
        return (ImageButton)this.findViewById(2131428214);
    }
    
    public final ImageView e() {
        return (ImageView)this.findViewById(2131427957);
    }
    
    public final ImageView f() {
        return (ImageView)this.findViewById(2131428079);
    }
    
    public final SeekBar g() {
        return (SeekBar)this.findViewById(2131428215);
    }
    
    final Space h() {
        return (Space)this.findViewById(2131428071);
    }
    
    final Space i() {
        return (Space)this.findViewById(2131428069);
    }
    
    public final TextView j() {
        return (TextView)this.findViewById(2131428216);
    }
    
    public final TextView k() {
        return (TextView)this.findViewById(2131428218);
    }
    
    public final TextView l() {
        return (TextView)this.findViewById(2131428219);
    }
    
    public final TextView m() {
        return (TextView)this.findViewById(2131428220);
    }
    
    public final ZoomKnob n() {
        return (ZoomKnob)this.findViewById(2131428208);
    }
    
    public final void o(final jcb b) {
        if (this.b == b && this.isLaidOut()) {
            return;
        }
        jvu.r((View)this, this.b = b);
        Collection$_EL.stream((Collection)noi.M(this.c(), this.d(), this.n(), this.j(), this.l(), this.k(), (View)this.m())).forEach((Consumer)new hsp(b, 3));
        if (this.c) {
            this.setTranslationX(0.0f);
            if (this.b == jcb.b) {
                this.h.end();
                return;
            }
            if (this.b == jcb.c) {
                this.g.end();
                return;
            }
            this.f.end();
        }
    }
    
    protected final void onFinishInflate() {
        Trace.beginSection("zoomUi:inflate");
        super.onFinishInflate();
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624193, (ViewGroup)this);
        final SeekBar g = this.g();
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131166445);
        final int dimensionPixelSize2 = this.getResources().getDimensionPixelSize(2131166419);
        final int layoutDirection = this.getResources().getConfiguration().getLayoutDirection();
        g.setMax(100000);
        final ZoomKnob n = this.n();
        float n2;
        if (this.getResources().getDisplayMetrics().densityDpi >= 500) {
            n2 = 0.85f;
        }
        else {
            n2 = 1.0f;
        }
        this.e = n2;
        final int dimensionPixelSize3 = n.b.getDimensionPixelSize(2131166424);
        final float scaledDensity = n.b.getDisplayMetrics().scaledDensity;
        n.i = g;
        final int dimensionPixelSize4 = n.b.getDimensionPixelSize(2131166420);
        n.setElevation((float)n.b.getDimensionPixelSize(2131166447));
        n.setGravity(17);
        n.setTextAlignment(4);
        n.setTextSize(dimensionPixelSize3 / scaledDensity);
        gu.c(n.getContext(), 2131296290, new jip(n));
        n.f = (g.getLayoutParams().height - n.d) / 2 - dimensionPixelSize4 / 2;
        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)n.getLayoutParams();
        layoutParams.bottomMargin = n.f;
        n.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        g.setSplitTrack(false);
        n.g = n2;
        n.h = true;
        final ImageButton c = this.c();
        final FrameLayout$LayoutParams layoutParams2 = (FrameLayout$LayoutParams)c.getLayoutParams();
        if (layoutDirection == 1) {
            layoutParams2.rightMargin = -(dimensionPixelSize / 2 + dimensionPixelSize2);
        }
        else {
            layoutParams2.leftMargin = -(dimensionPixelSize / 2 + dimensionPixelSize2);
        }
        c.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        final ImageButton d = this.d();
        final FrameLayout$LayoutParams layoutParams3 = (FrameLayout$LayoutParams)d.getLayoutParams();
        if (layoutDirection == 1) {
            layoutParams3.rightMargin = dimensionPixelSize / 2 + dimensionPixelSize2;
        }
        else {
            layoutParams3.leftMargin = dimensionPixelSize / 2 + dimensionPixelSize2;
        }
        d.setLayoutParams((ViewGroup$LayoutParams)layoutParams3);
        this.setLayerType(1, (Paint)null);
        (this.f = ObjectAnimator.ofFloat((Object)this, "translationY", new float[] { (float)jvu.u(52.0f) })).setDuration(300L);
        this.f.setStartDelay(150L);
        this.f.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
        (this.h = ObjectAnimator.ofFloat((Object)this, "translationX", new float[] { (float)jvu.u(52.0f) })).setDuration(300L);
        this.h.setStartDelay(150L);
        this.h.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
        (this.g = ObjectAnimator.ofFloat((Object)this, "translationX", new float[] { (float)(-jvu.u(52.0f)) })).setDuration(300L);
        this.g.setStartDelay(150L);
        this.g.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
        Trace.endSection();
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.o(this.b);
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (jcb.d(this.b)) {
            super.onMeasure(n, n2);
            return;
        }
        super.onMeasure(n2, n);
    }
    
    public final void p(final boolean k, final liz j) {
        if (!(this.k = k)) {
            final SeekBar g = this.g();
            final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131166437);
            final int dimensionPixelSize2 = this.getResources().getDimensionPixelSize(2131166450);
            final int dimensionPixelSize3 = this.getResources().getDimensionPixelSize(2131166469);
            final int n = (this.getResources().getDimensionPixelSize(2131166443) - dimensionPixelSize) / 2;
            g.setPaddingRelative(dimensionPixelSize3, dimensionPixelSize2 + n, dimensionPixelSize3, n - dimensionPixelSize2);
            this.g().setProgressDrawable(this.getResources().getDrawable(2131231087, (Resources$Theme)null));
            this.g().setThumb(this.getResources().getDrawable(2131231342, (Resources$Theme)null));
        }
        final ZoomKnob n2 = this.n();
        if (k) {
            int textColor;
            if (n2.h) {
                textColor = neu.c((View)n2, 2130968865);
            }
            else {
                final Drawable a = aah.a(n2.getContext(), 2131231086);
                if (a != null) {
                    a.setTint(n2.b.getColor(2131101492));
                    n2.setBackground(a);
                }
                textColor = n2.b.getColor(2131101495, (Resources$Theme)null);
            }
            n2.setTextColor(textColor);
        }
        else {
            n2.f = (n2.i.getLayoutParams().height - n2.d) / 2 - n2.b.getDimensionPixelSize(2131166447) / 2;
            final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)n2.getLayoutParams();
            layoutParams.bottomMargin = n2.f;
            n2.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            final InsetDrawable background = new InsetDrawable(n2.b.getDrawable(2131231085, (Resources$Theme)null), n2.c);
            n2.setTextColor(n2.b.getColor(2131101494, (Resources$Theme)null));
            n2.setBackground((Drawable)background);
        }
        n2.invalidate();
        this.n().j = j;
    }
    
    public final void q(final int progress, final AnimatorListenerAdapter listener) {
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131166466);
        final int dimensionPixelSize2 = this.getResources().getDimensionPixelSize(2131166455);
        final Object a = ZoomUi.a;
        monitorenter(a);
        try {
            final int l = this.l;
            int n = 0;
            Label_0180: {
                Label_0132: {
                    switch (progress) {
                        default: {
                            break Label_0180;
                        }
                        case 3: {
                            n = (dimensionPixelSize + dimensionPixelSize2) * 3 / 2;
                            break Label_0180;
                        }
                        case 2: {
                            if (l == 3) {
                                n = dimensionPixelSize + dimensionPixelSize2;
                                break Label_0180;
                            }
                            break;
                        }
                        case 1: {
                            if (l == 2) {
                                break;
                            }
                            if (l == 3) {
                                break Label_0180;
                            }
                            break Label_0132;
                        }
                        case 0: {
                            if (l == 2) {
                                break Label_0132;
                            }
                            if (l == 3) {
                                n = -(dimensionPixelSize + dimensionPixelSize2);
                                break Label_0180;
                            }
                            n = -(dimensionPixelSize + dimensionPixelSize2) * 3 / 2;
                            break Label_0180;
                        }
                    }
                    n = (dimensionPixelSize + dimensionPixelSize2) / 2;
                    break Label_0180;
                }
                n = -(dimensionPixelSize + dimensionPixelSize2) / 2;
            }
            this.f().animate().setListener((Animator$AnimatorListener)listener).translationX((float)n).setInterpolator((TimeInterpolator)AnimationUtils.loadInterpolator(this.getContext(), 17563661)).setDuration(200L).start();
            monitorexit(a);
            this.g().setProgress(progress);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    public final boolean r() {
        synchronized (ZoomUi.a) {
            final int l = this.l;
            boolean b = true;
            if (l != 2 && l != 3) {
                if (l != 4) {
                    b = false;
                }
            }
            return b;
        }
    }
    
    public final AnimatorSet s(int n, final boolean b) {
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131166459);
        final int dimensionPixelSize2 = this.getResources().getDimensionPixelSize(2131166437);
        final int n2 = (int)(this.getResources().getDimensionPixelSize(2131166445) * this.e);
        final int n3 = (this.getResources().getDimensionPixelSize(2131166443) - dimensionPixelSize2) / 2;
        final int dimensionPixelSize3 = this.getResources().getDimensionPixelSize(2131166448);
        final jio a = jio.a;
        final jcb a2 = jcb.a;
        if (n != 0) {
            switch (n - 1) {
                default: {
                    n = this.getResources().getDimensionPixelSize(2131166465);
                    break;
                }
                case 3: {
                    n = this.getResources().getDimensionPixelSize(2131166458);
                    break;
                }
                case 2: {
                    n = this.getResources().getDimensionPixelSize(2131166467);
                    break;
                }
            }
            final ValueAnimator ofInt = ValueAnimator.ofInt(new int[] { n, n2 });
            ofInt.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new jir(this, 3));
            final ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[] { dimensionPixelSize, dimensionPixelSize2 });
            ofInt2.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new jir(this, 1));
            final ValueAnimator ofInt3 = ValueAnimator.ofInt(new int[] { dimensionPixelSize3, dimensionPixelSize3 + (n3 + 1) / 2 });
            ofInt3.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new jir(this));
            final AnimatorSet set = new AnimatorSet();
            ofInt2.setDuration(150L);
            ofInt3.setDuration(150L);
            ofInt.setDuration(200L);
            set.setInterpolator((TimeInterpolator)new adh());
            if (b) {
                set.play((Animator)ofInt2).after((Animator)ofInt);
                set.play((Animator)ofInt3).with((Animator)ofInt2);
            }
            else {
                set.play((Animator)ofInt2).with((Animator)ofInt3);
                set.play((Animator)ofInt).after((Animator)ofInt2);
            }
            return set;
        }
        throw null;
    }
    
    public final void t(final boolean b, final int n) {
        if (b) {
            if (n == 4) {
                this.l().setVisibility(0);
                this.i().setVisibility(0);
                this.k().setVisibility(0);
                this.h().setVisibility(0);
            }
            else if (n == 3) {
                this.l().setVisibility(0);
                this.i().setVisibility(0);
            }
            this.m().setTextAlignment(4);
            this.j().setTextAlignment(4);
            return;
        }
        this.l().setVisibility(8);
        this.k().setVisibility(8);
        this.i().setVisibility(8);
        this.h().setVisibility(8);
        this.m().setTextAlignment(4);
        this.j().setTextAlignment(4);
    }
}
