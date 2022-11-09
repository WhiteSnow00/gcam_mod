// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.camcorder.ui.modeslider;

import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import android.util.AttributeSet;
import android.content.Context;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import android.widget.LinearLayout;

public class ModeSlider extends LinearLayout implements cov
{
    public final AtomicInteger a;
    public final LinkedHashMap b;
    public final int c;
    public nnx d;
    public nnx e;
    public cou f;
    public cxl g;
    
    public ModeSlider(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new AtomicInteger(-1);
        this.b = new LinkedHashMap();
        this.d = nqq.a;
        this.e = nqq.a;
        this.c = context.getResources().getDimensionPixelSize(2131165845);
    }
    
    public final jbm a(final int n) {
        final Iterator iterator = this.b.keySet().iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final jbm jbm = (jbm)iterator.next();
            if (n2 == n) {
                return jbm;
            }
            ++n2;
        }
        throw new IndexOutOfBoundsException();
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
    
    public final void e(final int n, final boolean b) {
        if (n >= 0) {
            if (n != this.a.get()) {
                for (int i = 0; i < this.getChildCount(); ++i) {
                    final TextView textView = (TextView)this.getChildAt(i);
                    if (i == n) {
                        final Drawable drawable = this.getContext().getDrawable(2131231078);
                        if (drawable != null) {
                            if (this.g.k(cxr.at)) {
                                this.f(textView, 2131296293, neu.c((View)textView, 2130968865));
                                drawable.setTint(neu.c((View)textView, 2130968900));
                            }
                            else {
                                drawable.setTint(this.getContext().getColor(2131100961));
                            }
                            textView.setBackground(drawable);
                        }
                        textView.setSelected(true);
                    }
                    else {
                        textView.setBackground((Drawable)null);
                        if (this.g.k(cxr.at)) {
                            this.f(textView, 2131296293, neu.c((View)textView, 2130968871));
                        }
                        textView.setSelected(false);
                    }
                }
                this.a.set(n);
                final cou f = this.f;
                if (f != null) {
                    if (!b) {
                        f.b(false);
                    }
                    if (b) {
                        jdj.e((View)this);
                    }
                    if (!b) {
                        this.f.a((View)this, false);
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
    
    public final void f(final TextView textView, final int n, final int textColor) {
        gu.c(this.getContext(), n, new coc(textView));
        textView.setTextColor(textColor);
    }
    
    public final void g() {
        this.setVisibility(0);
    }
    
    public final boolean h() {
        return this.getVisibility() == 0;
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return true;
    }
}
