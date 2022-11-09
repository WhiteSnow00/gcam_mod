// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.evcomp;

import android.view.View$OnTouchListener;
import java.util.Iterator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.ImageView$ScaleType;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import android.view.accessibility.AccessibilityManager;
import android.widget.CheckBox;
import java.util.ArrayList;
import android.widget.FrameLayout;

public class EvCompView extends FrameLayout
{
    public final ArrayList a;
    public final klv b;
    public final int c;
    public CheckBox d;
    public EvCompSlider e;
    public EvCompSlider f;
    public dgk g;
    public dgk h;
    public float i;
    public float j;
    private final AccessibilityManager k;
    private final AtomicBoolean l;
    private final int m;
    private final int n;
    private final int o;
    private float p;
    
    public EvCompView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new ArrayList();
        this.l = new AtomicBoolean(false);
        this.b = new kkz(dgj.a);
        this.k = (AccessibilityManager)context.getSystemService("accessibility");
        this.n = this.getResources().getDimensionPixelSize(2131165452);
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131165445);
        this.c = dimensionPixelSize;
        this.m = this.getResources().getDimensionPixelSize(2131165447);
        this.o = this.getResources().getDimensionPixelSize(2131165451);
        final int a = this.a();
        final float n = (float)a;
        this.g = this.b(dgl.a, 0.0f, (a - dimensionPixelSize) / n, 2131231233, 2131100789, 2131231073, 2131951768);
        this.h = this.b(dgl.b, dimensionPixelSize / n, 1.0f, 2131231234, 2131100781, 2131231074, 2131952630);
    }
    
    public static String d(final float n) {
        return String.format("%+.1f", n).replaceFirst("^[-+](0(\\.0*)?)$", "$1");
    }
    
    private final float k(final int n, final dgk dgk) {
        return Math.round((1.0f - (n + this.a() / 2.0f - dgk.e * this.a()) / ((dgk.d - dgk.e) * this.a())) * 100.0f) / 100.0f;
    }
    
    private final int l(int n, final float n2, final float n3) {
        final float n4 = this.a() / 2.0f;
        final int n5 = (int)(n2 * this.a() - n4);
        final int n6 = (int)(n3 * this.a() - n4);
        if (n < n5) {
            n = n5;
        }
        else if (n > n6) {
            return n6;
        }
        return n;
    }
    
    public final int a() {
        final dgj a = dgj.a;
        final int ordinal = ((dgj)((kkz)this.b).d).ordinal();
        int n = 0;
        int n2 = 0;
        switch (ordinal) {
            default: {
                n2 = 0;
                break;
            }
            case 2: {
                n2 = this.getResources().getDimensionPixelSize(2131165439);
                break;
            }
            case 0:
            case 1: {
                n2 = this.getResources().getDimensionPixelSize(2131165444);
                break;
            }
        }
        if (this.d != null) {
            if (((dgj)((kkz)this.b).d).equals(dgj.c)) {
                final int c = this.c;
                n = this.d.getMeasuredWidth() + (n2 + n2 + (c + c) + this.getResources().getDimensionPixelSize(2131165442));
            }
            else {
                n = this.c + n2 + this.getResources().getDimensionPixelSize(2131165442) + this.d.getMeasuredWidth();
            }
        }
        int n3 = n2;
        if (n >= this.getMeasuredHeight() * 0.9f) {
            n3 = (int)(n2 * 0.7f);
        }
        return n3;
    }
    
    public final dgk b(final dgl tag, final float e, final float d, final int imageResource, final int n, final int n2, final int n3) {
        final dgk dgk = new dgk(this.getContext());
        dgk.setBackground((Drawable)new InsetDrawable(dgk.getResources().getDrawable(n2, (Resources$Theme)null), (dgk.b - dgk.a) / 2));
        dgk.setImageResource(imageResource);
        dgk.setElevation((float)dgk.getResources().getDimensionPixelSize(2131165446));
        dgk.setScaleType(ImageView$ScaleType.CENTER);
        dgk.setTag((Object)tag);
        dgk.setFocusable(true);
        dgk.setContentDescription(dgk.getResources().getText(n3));
        dgk.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        if (e <= d) {
            dgk.e = e;
            dgk.d = d;
            dgk.getDrawable().setTint(this.getResources().getColor(n, (Resources$Theme)null));
            return dgk;
        }
        throw new IllegalArgumentException("Min value is greater than max value");
    }
    
    public final jcb c() {
        if (((View)this.getParent()).getDisplay() == null) {
            return jcb.a;
        }
        return jcb.a(((View)this.getParent()).getDisplay(), this.getContext());
    }
    
    public final void e(final dgk dgk, final float n) {
        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)dgk.getLayoutParams();
        layoutParams.rightMargin = this.getResources().getDimensionPixelSize(2131165448) + this.n / 2 - (this.m - this.c) / 2;
        layoutParams.leftMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.gravity = 21;
        final float e = dgk.e;
        final float d = dgk.d;
        if (d > 1.0f || d < 0.0f || e < 0.0f || e > 1.0f || e > d) {
            throw new IllegalArgumentException("Invalid min/max");
        }
        if (n <= 1.0f && n >= 0.0f) {
            layoutParams.topMargin = this.l((int)(((d - e) * (1.0f - n) + e) * this.a() - this.a() / 2.0f), e, d);
            dgk.a(n);
            dgk.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            return;
        }
        final StringBuilder sb = new StringBuilder(40);
        sb.append("Fraction is not illegal: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void f(final float n) {
        if (n <= 1.0f && n >= 0.0f) {
            this.e(this.g, n);
            return;
        }
        final StringBuilder sb = new StringBuilder(40);
        sb.append("Fraction is not illegal: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void g(final float i) {
        this.i = i;
        String contentDescription;
        if (((dgj)((kkz)this.b).d).equals(dgj.a)) {
            contentDescription = this.getResources().getString(2131951953, new Object[] { String.valueOf(this.i) });
        }
        else {
            contentDescription = this.getResources().getString(2131951767, new Object[] { String.valueOf(this.i) });
        }
        this.e.setContentDescription((CharSequence)contentDescription);
    }
    
    public final void h() {
        final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
        layoutParams.gravity = 21;
        layoutParams.rightMargin = this.getResources().getDimensionPixelSize(2131165448) + this.c / 2 + this.n / 2 - this.d.getMeasuredWidth() / 2;
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131165442);
        final dgj a = dgj.a;
        switch (((dgj)((kkz)this.b).d).ordinal()) {
            case 2: {
                layoutParams.bottomMargin = this.a() + dimensionPixelSize + this.c;
                break;
            }
            case 0:
            case 1: {
                layoutParams.bottomMargin = this.a() / 2 + dimensionPixelSize + this.c / 2;
                break;
            }
        }
        this.d.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public final void i() {
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131165448);
        final int n = this.c / 2;
        final int n2 = dimensionPixelSize + n - (this.o - this.n) / 2;
        int o2;
        if (this.k.isTouchExplorationEnabled()) {
            final int o = this.o;
            o2 = o + o;
        }
        else {
            o2 = this.o;
        }
        final int n3 = n + n;
        final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(o2, this.a() + n3);
        final FrameLayout$LayoutParams layoutParams2 = new FrameLayout$LayoutParams(o2, this.a() + n3);
        if (((dgj)((kkz)this.b).d).equals(dgj.c)) {
            final int n4 = this.a() / 2 + n;
            this.e.a = this.a();
            this.f.a = this.a();
            layoutParams.bottomMargin = n4;
            layoutParams.gravity = 21;
            layoutParams2.gravity = 21;
            layoutParams2.rightMargin = n2;
            layoutParams2.topMargin = n4;
            this.f.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            this.f.requestLayout();
            this.f.invalidate();
        }
        else {
            this.e.a = this.a();
            layoutParams.height = n3 + this.a();
            layoutParams.gravity = 21;
        }
        layoutParams.rightMargin = n2;
        this.e.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        this.e.requestLayout();
        this.e.invalidate();
    }
    
    public final float[] j(final View view, final MotionEvent motionEvent) {
        final float[] array2;
        final float[] array = array2 = new float[2];
        array2[1] = (array2[0] = -1.0f);
        final dgk dgk = (dgk)view;
        if (motionEvent.getAction() == 0) {
            float p2;
            if (jcb.d(this.c())) {
                p2 = motionEvent.getRawY();
            }
            else {
                p2 = motionEvent.getRawX();
            }
            this.p = p2;
        }
        else if (motionEvent.getAction() == 2) {
            final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)view.getLayoutParams();
            float p3;
            if (jcb.d(this.c())) {
                p3 = motionEvent.getRawY();
            }
            else {
                p3 = motionEvent.getRawX();
            }
            int n;
            if (this.c().equals(jcb.c)) {
                n = (int)(layoutParams.topMargin + this.p - p3);
            }
            else {
                n = (int)(layoutParams.topMargin + p3 - this.p);
            }
            final int l = this.l(n, dgk.e, dgk.d);
            final int topMargin = layoutParams.topMargin;
            layoutParams.topMargin = l;
            niz niz;
            if (((dgj)((kkz)this.b).d).equals(dgj.c)) {
                niz = nii.a;
            }
            else if (this.a.size() <= 1) {
                niz = nii.a;
            }
            else {
                final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)dgk.getLayoutParams();
                niz = nii.a;
                final ArrayList a = this.a;
                for (int size = a.size(), i = 0; i < size; ++i) {
                    final dgk dgk2 = (dgk)a.get(i);
                    if (!dgk2.equals(dgk)) {
                        final FrameLayout$LayoutParams frameLayout$LayoutParams2 = (FrameLayout$LayoutParams)dgk2.getLayoutParams();
                        if (Math.abs(frameLayout$LayoutParams.topMargin - frameLayout$LayoutParams2.topMargin) < this.c) {
                            final int j = this.l(frameLayout$LayoutParams2.topMargin + (l - topMargin), dgk2.e, dgk2.d);
                            frameLayout$LayoutParams2.topMargin = j;
                            niz = niz.i(j);
                        }
                    }
                }
            }
            this.p = p3;
            view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            this.requestLayout();
            this.invalidate();
            final float k = this.k(l, dgk);
            dgk.a(k);
            array[0] = k;
            if (niz.g()) {
                for (final dgk dgk3 : this.a) {
                    if (!dgk3.equals(view)) {
                        final float m = this.k((int)niz.c(), dgk3);
                        dgk3.a(m);
                        array[1] = m;
                    }
                }
            }
        }
        else if (motionEvent.getAction() == 1) {
            this.p = 0.0f;
        }
        return array;
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (CheckBox)this.findViewById(2131427711);
        this.e = (EvCompSlider)this.findViewById(2131427587);
        this.f = (EvCompSlider)this.findViewById(2131427588);
        final gkb b = gkb.b;
        this.e.setOnTouchListener((View$OnTouchListener)b);
        this.f.setOnTouchListener((View$OnTouchListener)b);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (!this.a.isEmpty()) {
            final jcb c = this.c();
            jvu.r((View)this, c);
            jvu.s((View)this.d, c);
            jvu.s((View)this.g, c);
            jvu.s((View)this.h, c);
        }
        Label_0117: {
            if (this.k.isTouchExplorationEnabled()) {
                if (!this.l.get()) {
                    this.l.set(true);
                    break Label_0117;
                }
            }
            else if (this.l.get()) {
                this.l.set(false);
                break Label_0117;
            }
            if (!b) {
                return;
            }
        }
        this.i();
        this.h();
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (jcb.d(this.c())) {
            super.onMeasure(n, n2);
            return;
        }
        super.onMeasure(n2, n);
    }
    
    public final void setVisibility(final int n) {
        super.setVisibility(n);
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((dgk)iterator.next()).setVisibility(n);
        }
    }
}
