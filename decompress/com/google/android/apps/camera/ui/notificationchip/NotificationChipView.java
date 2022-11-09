// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.notificationchip;

import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.widget.FrameLayout$LayoutParams;
import android.content.Context;

public class NotificationChipView extends pt
{
    public final Context a;
    public final irk b;
    public int c;
    public boolean d;
    public ire e;
    public long f;
    public Runnable g;
    private FrameLayout$LayoutParams h;
    
    public NotificationChipView(final Context a, final AttributeSet set) {
        super(a, set);
        this.b = new irk();
        this.a = a;
    }
    
    public final void a() {
        this.removeCallbacks(this.g);
    }
    
    public final void b() {
        if (this.getDisplay() == null || this.h == null) {
            return;
        }
        final jcb a = jcb.a(this.getDisplay(), this.a);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)this.getLayoutParams();
        FrameLayout$LayoutParams h;
        if (a == jcb.a) {
            final int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(2131166069);
            h = new FrameLayout$LayoutParams(this.h);
            h.topMargin = dimensionPixelSize;
        }
        else if (a == jcb.c) {
            h = new FrameLayout$LayoutParams(this.h);
            h.bottomMargin = this.h.topMargin;
            h.gravity = 81;
        }
        else {
            h = this.h;
        }
        if (frameLayout$LayoutParams.topMargin == h.topMargin && frameLayout$LayoutParams.bottomMargin == h.bottomMargin && frameLayout$LayoutParams.gravity == h.gravity) {
            return;
        }
        this.setLayoutParams((ViewGroup$LayoutParams)h);
    }
    
    public final void c(final int n) {
        this.postDelayed(this.g, (long)n);
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h = (FrameLayout$LayoutParams)this.getLayoutParams();
    }
}
