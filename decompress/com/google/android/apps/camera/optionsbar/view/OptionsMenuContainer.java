// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.optionsbar.view;

import android.graphics.drawable.LayerDrawable;
import android.animation.ValueAnimator;
import j$.util.function.Consumer;
import java.util.Collection;
import j$.util.Collection$_EL;
import android.view.MotionEvent;
import android.app.Activity;
import android.view.View$MeasureSpec;
import android.view.View$OnClickListener;
import android.view.View$OnTouchListener;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Trace;
import android.animation.Animator$AnimatorListener;
import android.widget.ImageView;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.animation.AnimatorInflater;
import android.view.GestureDetector$OnGestureListener;
import android.view.View;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.graphics.drawable.VectorDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.animation.Animator;
import android.app.AlertDialog;
import java.util.ArrayList;
import android.content.Context;
import android.view.GestureDetector;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class OptionsMenuContainer extends RelativeLayout
{
    public static final nsd a;
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    public jcb b;
    public final jci c;
    public final ImageButton d;
    public ImageButton e;
    public boolean f;
    public final boolean g;
    public final GestureDetector h;
    public final GestureDetector i;
    public final Context j;
    public final ArrayList k;
    public AlertDialog l;
    public final Animator m;
    public final Animator n;
    public ImageButton o;
    public AnimatedVectorDrawable p;
    public VectorDrawable q;
    public boolean r;
    public hkg s;
    public boolean t;
    public irf u;
    public efm v;
    public int w;
    private int x;
    private Animator y;
    private final DisplayMetrics z;
    
    static {
        a = nsd.g("com/google/android/apps/camera/optionsbar/view/OptionsMenuContainer");
    }
    
    public OptionsMenuContainer(final Context j, final AttributeSet set) {
        super(j, set);
        this.x = 0;
        this.b = jcb.a;
        this.l = null;
        this.z = new DisplayMetrics();
        this.r = false;
        this.t = false;
        this.c = new jci((View)this);
        this.h = new GestureDetector(j, (GestureDetector$OnGestureListener)new gkg(this));
        this.i = new GestureDetector(j, (GestureDetector$OnGestureListener)new gkh(this));
        this.k = new ArrayList();
        this.m = AnimatorInflater.loadAnimator(j, 2130837541);
        this.n = AnimatorInflater.loadAnimator(j, 2130837542);
        this.d = new ImageButton(j, (AttributeSet)null, 0, 2132018617);
        this.j = j;
        if (j instanceof bmp) {
            final cxl a = ((bmp)j).a();
            final cxm a2 = cya.a;
            a.c();
            this.g = a.k(cxr.at);
            return;
        }
        this.g = false;
    }
    
    private final void A(int n) {
        final cxl a = ((bmp)this.j).a();
        final cxc a2 = cxe.a(a, (int)a.a(cxe.a).c());
        final float c = a2.c;
        final int n2 = 0;
        Label_0080: {
            if (c != 0.0f) {
                final float n3 = (float)n;
                if (Math.abs(a2.a - n3 / 2.0f) < n3 / 5.0f) {
                    n = 1;
                    break Label_0080;
                }
            }
            n = n2;
        }
        final FrameLayout d = this.d();
        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)((View)d).getLayoutParams();
        final int gravity = layoutParams.gravity;
        if (n != 0) {
            layoutParams.gravity = 19;
        }
        else {
            layoutParams.gravity = 17;
        }
        if (gravity != layoutParams.gravity) {
            ((View)d).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
    }
    
    private final View z() {
        return this.findViewById(2131427829);
    }
    
    public final View a() {
        return this.findViewById(2131427826);
    }
    
    public final View b() {
        return this.findViewById(2131427830);
    }
    
    public final View c() {
        return this.findViewById(2131427828);
    }
    
    public final FrameLayout d() {
        return (FrameLayout)this.findViewById(2131427820);
    }
    
    public final ImageButton e() {
        return (ImageButton)this.findViewById(2131427781);
    }
    
    public final ImageButton f() {
        return (ImageButton)this.findViewById(2131427822);
    }
    
    public final ImageButton g() {
        return (ImageButton)this.findViewById(2131427892);
    }
    
    public final ImageView h() {
        return (ImageView)this.findViewById(2131427819);
    }
    
    public final ImageView i() {
        return (ImageView)this.findViewById(2131427821);
    }
    
    public final RelativeLayout j() {
        return (RelativeLayout)this.findViewById(2131427825);
    }
    
    public final RelativeLayout k() {
        return (RelativeLayout)this.findViewById(2131427827);
    }
    
    public final OptionsMenuView l() {
        return (OptionsMenuView)this.findViewById(2131427831);
    }
    
    public final oey m() {
        if (this.o != null && this.r) {
            final ofn f = ofn.f();
            this.n.addListener((Animator$AnimatorListener)new gke(this, f));
            this.m.cancel();
            this.n.setTarget((Object)this.q);
            this.n.start();
            this.r = false;
            return f;
        }
        return ofi.n(true);
    }
    
    public final void n(final gjq gjq) {
        if (!this.k.contains(gjq)) {
            this.k.add(gjq);
        }
    }
    
    public final void o(final efm efm, final jcb jcb) {
        if (efm == null) {
            return;
        }
        final hjc a = hjc.a;
        final jcb a2 = jcb.a;
        switch (jcb.ordinal()) {
            default: {
                this.u.s(this.j.getResources().getString(2131951983));
                return;
            }
            case 2: {
                this.u.s(this.j.getResources().getString(2131951982));
                return;
            }
            case 1: {
                this.u.s(this.j.getResources().getString(2131951984));
            }
        }
    }
    
    protected final void onFinishInflate() {
        Trace.beginSection("optionsMenuContainer:inflate");
        super.onFinishInflate();
        this.A = this.getResources().getDimensionPixelSize(2131166318);
        this.w = this.getResources().getDimensionPixelSize(2131166113);
        final int dimensionPixelOffset = this.getResources().getDimensionPixelOffset(2131166106);
        this.B = dimensionPixelOffset + dimensionPixelOffset;
        final int dimensionPixelOffset2 = this.getResources().getDimensionPixelOffset(2131166126);
        this.C = dimensionPixelOffset2 + dimensionPixelOffset2;
        this.D = this.getResources().getDimensionPixelOffset(2131166319);
        this.E = this.getResources().getDimensionPixelSize(2131166123);
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624087, (ViewGroup)this);
        this.setLayerType(1, (Paint)null);
        this.m.addListener((Animator$AnimatorListener)new gkd(this));
        this.d().setOnTouchListener((View$OnTouchListener)new gka(this, 1));
        this.d().setOnClickListener((View$OnClickListener)new gjz(this));
        this.setOnTouchListener((View$OnTouchListener)new gka(this));
        this.d().setAlpha(0.72f);
        this.l().m = new gkc(this);
        this.d().setClickable(true);
        if (this.g) {
            this.i().setBackgroundResource(2131231408);
            this.f().getDrawable().setTint(leg.h((View)this));
        }
        Trace.endSection();
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.p(this.b, this.x);
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (this.f) {
            final int mode = View$MeasureSpec.getMode(n2);
            final int n3 = 0;
            if (mode == 0) {
                this.l().b = 0;
            }
            else {
                int size;
                if (jcb.d(this.b)) {
                    size = View$MeasureSpec.getSize(n2) - this.z().getLayoutParams().height;
                }
                else {
                    size = View$MeasureSpec.getSize(n2);
                }
                if (this.l().a() > 0) {
                    final View child = ((ViewGroup)this.l().getChildAt(0)).getChildAt(0);
                    if (child != null && child.getMeasuredHeight() > 0) {
                        this.E = child.getMeasuredHeight();
                        if (this.l().a() > 1) {
                            final View child2 = ((ViewGroup)this.l().getChildAt(0)).getChildAt(1);
                            if (child2.getMeasuredHeight() > 0 && child2.getMeasuredHeight() < this.E) {
                                this.E = child2.getMeasuredHeight();
                            }
                        }
                    }
                }
                final int a = this.l().a();
                final int e = this.E;
                final int b = this.B;
                final int d = this.D;
                final int a2 = this.A;
                final int c = this.C;
                int b2;
                if (size < a * e + b + d + a2 + c) {
                    final float n4 = (float)e;
                    b2 = (int)(((int)((size - a2 - c - d - b) / n4 - 0.5f) + 0.5f) * n4) + b;
                }
                else {
                    b2 = n3;
                }
                this.l().b = b2;
            }
        }
        else {
            ((Activity)this.j).getWindowManager().getDefaultDisplay().getMetrics(this.z);
            final int heightPixels = this.z.heightPixels;
            final int widthPixels = this.z.widthPixels;
            if (jcb.d(this.b)) {
                final OptionsMenuView l = this.l();
                final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131166126);
                l.b = widthPixels - (dimensionPixelSize + dimensionPixelSize);
            }
            else {
                this.l().b = heightPixels;
            }
        }
        if (jcb.d(this.b)) {
            super.onMeasure(n, n2);
            this.A(this.getMeasuredWidth());
            return;
        }
        super.onMeasure(n2, n);
        this.A(this.getMeasuredHeight());
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return false;
    }
    
    public final void p(final jcb jcb, int max) {
        Trace.beginSection("optionsMenuContainer:applyOrientation");
        this.b = jcb;
        this.x = max;
        final View z = this.z();
        final ViewGroup$LayoutParams layoutParams = z.getLayoutParams();
        final int height = layoutParams.height;
        final int x = this.x;
        if (x > 0) {
            layoutParams.height = x;
        }
        else {
            layoutParams.height = this.getResources().getDimensionPixelSize(2131166113);
        }
        if (layoutParams.height != height) {
            z.setLayoutParams(layoutParams);
        }
        final ViewGroup$LayoutParams layoutParams2 = this.z().getLayoutParams();
        max = Math.max(max, this.w);
        if (layoutParams2.height != max) {
            layoutParams2.height = max;
            this.z().setLayoutParams(layoutParams2);
        }
        jvu.r((View)this, jcb);
        final OptionsMenuView l = this.l();
        Trace.beginSection("OptionsMenuView:applyOrientation");
        l.l = jcb;
        if (l.i != null) {
            final gkk j = l.j;
            if (j != null) {
                Trace.beginSection("OptionsMenuRow:applyOrientation");
                Collection$_EL.stream((Collection)j.d).forEach((Consumer)new hsp(jcb, 1));
                Trace.endSection();
            }
        }
        Trace.endSection();
        final View b = this.b();
        final ValueAnimator q = jvu.q(b, jcb);
        q.addListener((Animator$AnimatorListener)new jbw(b));
        q.start();
        this.o(this.v, jcb);
        Trace.endSection();
    }
    
    public final void q() {
        if (this.q != null && this.p != null) {
            this.m();
        }
        this.o = null;
        this.p = null;
        this.q = null;
    }
    
    public final void r() {
        final Animator y = this.y;
        if (y != null && y.isRunning()) {
            return;
        }
        final FrameLayout d = this.d();
        final boolean f = this.f;
        int i = 0;
        (this.y = new gjv(this, false, f, (View)d).a()).start();
        this.l().fullScroll(33);
        for (ArrayList k = this.k; i < k.size(); ++i) {
            ((gjq)k.get(i)).a();
        }
    }
    
    public final void s() {
        this.setEnabled(false);
        this.d.setEnabled(false);
        this.x();
    }
    
    public final void t() {
        this.setEnabled(true);
        this.d.setEnabled(true);
        this.x();
    }
    
    public final void u(final efm efm) {
        if (efm == null) {
            return;
        }
        efm.h(this.u);
    }
    
    public final void v() {
        if (this.isEnabled() && this.d() != null && this.b() != null) {
            new gjv(this, true, this.f, (View)this.d()).a().start();
            final ArrayList k = this.k;
            for (int size = k.size(), i = 0; i < size; ++i) {
                ((gjq)k.get(i)).c();
            }
        }
    }
    
    public final void w(final ImageButton o) {
        this.o = o;
        this.p = (AnimatedVectorDrawable)((LayerDrawable)o.getDrawable()).getDrawable(0);
        final VectorDrawable q = (VectorDrawable)((LayerDrawable)o.getDrawable()).getDrawable(1);
        this.q = q;
        if (!this.r && q != null) {
            q.setAlpha(0);
        }
    }
    
    public final void x() {
        boolean enabled = true;
        njo.o(true);
        final int a = this.l().a();
        final FrameLayout d = this.d();
        int visibility = 4;
        if (a > 0 && !this.y()) {
            visibility = 0;
        }
        d.setVisibility(visibility);
        if (!this.isEnabled() || a <= 0) {
            enabled = false;
        }
        d.setEnabled(enabled);
    }
    
    public final boolean y() {
        return this.b().getVisibility() == 0;
    }
}
