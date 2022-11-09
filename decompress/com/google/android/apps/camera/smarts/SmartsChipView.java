// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.smarts;

import android.text.method.MovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.view.View$AccessibilityDelegate;
import android.graphics.drawable.Drawable;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.view.ViewPropertyAnimator;
import android.animation.Animator$AnimatorListener;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class SmartsChipView extends LinearLayout
{
    public FrameLayout a;
    public TextView b;
    public FrameLayout c;
    public boolean d;
    public boolean e;
    public Runnable f;
    public Runnable g;
    public CharSequence h;
    int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public kjk m;
    public int n;
    private ImageView o;
    private ImageView p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    
    public SmartsChipView(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = false;
        this.e = false;
        this.h = "";
        this.n = 1;
        this.j = true;
        this.k = true;
        this.m = new kjk();
    }
    
    public final void a(final int n) {
        final ViewPropertyAnimator animate = this.animate();
        float n2;
        if (n == 0) {
            n2 = 1.0f;
        }
        else {
            n2 = 0.0f;
        }
        animate.alpha(n2).setDuration((long)this.u).setListener((Animator$AnimatorListener)new hmr(this, n)).start();
    }
    
    public final void b() {
        this.h = "";
        this.e = false;
        this.d = false;
        this.a(8);
        final Runnable g = this.g;
        if (g != null) {
            g.run();
        }
        final Runnable f = this.f;
        if (f != null) {
            f.run();
        }
        this.m.close();
        this.f = null;
    }
    
    public final void c(final hoz hoz) {
        if (hoz.s()) {
            final hpg b = ((hns)hoz).b;
            final String c = b.c;
            final Drawable d = b.d;
            final Runnable e = b.e;
            final Runnable h = b.h;
            if (c != null) {
                this.b.setText((CharSequence)c);
                this.b.setVisibility(0);
            }
            else {
                this.b.setVisibility(8);
            }
            if (d != null) {
                this.o.setImageDrawable(d);
                this.o.setVisibility(0);
            }
            else {
                this.o.setVisibility(8);
            }
            if (e != null) {
                this.a.setClickable(true);
                final hmk hmk = new hmk(hoz, e);
                final hmm hmm = new hmm(this);
                this.a.setOnClickListener((View$OnClickListener)hmk);
                this.a.setOnTouchListener((View$OnTouchListener)hmm);
                this.b.setOnClickListener((View$OnClickListener)hmk);
                this.b.setOnTouchListener((View$OnTouchListener)hmm);
            }
            else {
                this.a.setClickable(false);
            }
            if (h != null) {
                this.p.setVisibility(0);
                this.p.setClickable(true);
                this.p.setOnClickListener((View$OnClickListener)new hmj(this, hoz, h));
                this.p.setContentDescription((CharSequence)this.getResources().getString(2131951906));
                final TextView b2 = this.b;
                b2.setPaddingRelative(b2.getPaddingLeft(), this.b.getPaddingTop(), 0, this.b.getPaddingBottom());
            }
            else {
                this.p.setVisibility(8);
                this.p.setContentDescription((CharSequence)"");
                final TextView b3 = this.b;
                b3.setPaddingRelative(b3.getPaddingLeft(), this.b.getPaddingTop(), this.t, this.b.getPaddingBottom());
            }
            this.a.setVisibility(0);
            this.a.setContentDescription((CharSequence)b.g);
        }
        else {
            this.a.setVisibility(8);
            this.a.setContentDescription((CharSequence)"");
        }
        this.b.setMaxWidth(this.q);
        this.c.setVisibility(8);
        this.c.setContentDescription((CharSequence)"");
    }
    
    public final void d(final hlq hlq) {
        final hoz a = hlq.a;
        final boolean b = hlq.b;
        this.k = hlq.d;
        this.l = hlq.e;
        this.n = hlq.f;
        this.j = hlq.c;
        final hns hns = (hns)a;
        final int n = hns.f.f().e % 180;
        final int e = hns.f.f().e;
        final boolean l = this.l;
        final int n2 = 1;
        boolean b2;
        if (!l) {
            final int n3 = this.n;
            if (n3 == 0) {
                throw null;
            }
            b2 = (n3 != 1);
        }
        else {
            b2 = true;
        }
        final dgm g = hns.g;
        boolean b3 = false;
        Label_0200: {
            if (e == 90 && (boolean)((kkz)g.a).d) {
                b3 = true;
            }
            else {
                if (n == 0) {
                    final int n4 = this.n;
                    if (n4 == 0) {
                        throw null;
                    }
                    if (n4 == 4) {
                        b3 = true;
                        break Label_0200;
                    }
                }
                b3 = false;
            }
        }
        final boolean b4 = (e == 90 && (boolean)((kkz)g.b).d) || (n == 0 && b2 && this.j) || (n == 0 && this.k);
        final int r = this.r;
        int s;
        if (n == 0 && b2 && this.j && this.k) {
            s = r + this.s;
        }
        else {
            s = r;
            if (n == 0) {
                s = r;
                if (this.k) {
                    s = this.s;
                }
            }
        }
        int i = s;
        if (!b3) {
            i = s;
            if (!b4) {
                i = 0;
            }
        }
        int n5;
        if (!b && hns.h) {
            n5 = n2;
        }
        else {
            n5 = 0;
        }
        if (i != this.i) {
            if (n5 != 0) {
                this.animate().translationY((float)i).setDuration((long)this.u).start();
            }
            else {
                this.setTranslationY((float)i);
            }
            this.i = i;
        }
        if (hns.h) {
            if (b3 && this.getVisibility() == 0) {
                this.a(8);
                return;
            }
            if (!b3 && this.getVisibility() == 8) {
                this.a(0);
            }
        }
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (FrameLayout)this.findViewById(2131427961);
        this.o = (ImageView)this.findViewById(2131427963);
        this.b = (TextView)this.findViewById(2131427964);
        this.p = (ImageView)this.findViewById(2131427962);
        this.c = (FrameLayout)this.findViewById(2131427959);
        final ImageView imageView = (ImageView)this.findViewById(2131427960);
        this.r = this.getContext().getResources().getDimensionPixelSize(2131166279);
        this.s = -jvu.u(56.0f);
        this.u = this.getResources().getInteger(2131492978);
        this.getResources().getDimensionPixelSize(2131166262);
        this.q = this.getResources().getDimensionPixelSize(2131166263);
        this.t = this.getResources().getDimensionPixelSize(2131166266);
        final hmp accessibilityDelegate = new hmp(this);
        this.a.setAccessibilityDelegate((View$AccessibilityDelegate)new hmq(this, accessibilityDelegate));
        this.c.setAccessibilityDelegate((View$AccessibilityDelegate)accessibilityDelegate);
        this.b.setMovementMethod((MovementMethod)new ScrollingMovementMethod());
    }
}
