// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed;

import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import android.util.AttributeSet;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import android.widget.LinearLayout;

public class RecordSpeedSlider extends LinearLayout implements cov
{
    public final AtomicInteger a;
    public final int b;
    public nle c;
    public cou d;
    public cxl e;
    public int f;
    public int g;
    public int h;
    
    public RecordSpeedSlider(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new AtomicInteger(-1);
        this.c = nle.v();
        this.b = this.getResources().getDimensionPixelSize(2131166194);
    }
    
    public final int a() {
        return this.a.get();
    }
    
    public final void b() {
        this.setEnabled(false);
    }
    
    public final void c() {
        this.setEnabled(true);
    }
    
    public final void d() {
        this.setVisibility(8);
    }
    
    public final int e(final int n) {
        if (n == this.f) {
            final StringBuilder sb = new StringBuilder(40);
            sb.append(n);
            sb.append(" is the index for back option");
            throw new IllegalArgumentException(sb.toString());
        }
        final int h = this.h;
        if (h == 0) {
            throw null;
        }
        if (h == 1) {
            return n - 1;
        }
        return n;
    }
    
    public final void f(final int n) {
        this.i(n, false);
    }
    
    public final void g() {
        this.setVisibility(0);
    }
    
    public final boolean h() {
        return this.getVisibility() == 0;
    }
    
    public final void i(final int n, final boolean b) {
        if (n >= 0) {
            if (n != this.a.get()) {
                for (int i = 0; i < this.getChildCount(); ++i) {
                    final TextView textView = (TextView)this.getChildAt(i);
                    if (i == n) {
                        final GradientDrawable background = (GradientDrawable)this.getContext().getDrawable(2131231080);
                        if (background != null) {
                            if (this.e.k(cxr.at)) {
                                this.j(textView, 2131296293, neu.c((View)textView, 2130968865));
                                background.setTint(neu.c((View)textView, 2130968900));
                            }
                            else {
                                background.setTint(this.getContext().getColor(2131101413));
                            }
                            textView.setBackground((Drawable)background);
                        }
                        textView.setSelected(true);
                        textView.sendAccessibilityEvent(4);
                        if (n == this.f) {
                            if (this.e.k(cxr.at)) {
                                textView.getCompoundDrawables()[0].setTint(neu.c((View)textView, 2130968865));
                            }
                        }
                        else {
                            final Drawable drawable = this.getContext().getDrawable(this.g);
                            if (this.e.k(cxr.at)) {
                                final int c = neu.c((View)textView, 2130968865);
                                if (drawable != null) {
                                    drawable.setTint(c);
                                }
                            }
                            final int dimensionPixelSize = this.getResources().getDimensionPixelSize(2131166185);
                            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable)null, (Drawable)null, (Drawable)null);
                            textView.setCompoundDrawablePadding(dimensionPixelSize);
                            textView.setPadding(this.getResources().getDimensionPixelSize(2131166182), 0, this.b, 0);
                        }
                    }
                    else {
                        if (this.e.k(cxr.at)) {
                            this.j(textView, 2131296293, neu.c((View)textView, 2130968871));
                        }
                        textView.setBackground((Drawable)null);
                        textView.setSelected(false);
                        if (i == this.f) {
                            if (this.e.k(cxr.at)) {
                                textView.getCompoundDrawables()[0].setTint(neu.c((View)textView, 2130968871));
                            }
                        }
                        else {
                            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)null, (Drawable)null, (Drawable)null, (Drawable)null);
                            textView.setCompoundDrawablePadding(0);
                            final int b2 = this.b;
                            textView.setPadding(b2, 0, b2, 0);
                        }
                    }
                }
                this.a.set(n);
                final cou d = this.d;
                if (d != null) {
                    if (!b) {
                        d.b(false);
                    }
                    final coy coy = (coy)this.d;
                    final coz b3 = coy.b;
                    if (!b3.d) {
                        b3.f.k(b3.g, n);
                    }
                    if (b && coy.b.f.m) {
                        jdj.e((View)this);
                    }
                    if (!b) {
                        this.d.a((View)this, false);
                    }
                }
            }
            return;
        }
        final StringBuilder sb = new StringBuilder(26);
        sb.append("Illegal index: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void j(final TextView textView, final int n, final int textColor) {
        gu.c(this.getContext(), n, new cpe(textView));
        textView.setTextColor(textColor);
    }
    
    public final boolean k() {
        return this.getChildAt(this.f) != null && this.getChildAt(this.f).getVisibility() == 0;
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return true;
    }
}
