// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.widget;

import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.content.Context;
import android.widget.FrameLayout;

public class TracedFrameLayout extends FrameLayout
{
    private final izg a;
    
    public TracedFrameLayout(final Context context) {
        super(context);
        this.a = a((View)this);
    }
    
    public TracedFrameLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = a((View)this);
    }
    
    public TracedFrameLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = a((View)this);
    }
    
    public TracedFrameLayout(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.a = a((View)this);
    }
    
    private static izg a(final View view) {
        final Object tag = view.getTag();
        if (tag == null) {
            return izf.a;
        }
        return new izh(tag.toString());
    }
    
    public final void draw(final Canvas canvas) {
        this.a.a("draw");
        super.draw(canvas);
        this.a.b();
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.a.a("onLayout");
        super.onLayout(b, n, n2, n3, n4);
        this.a.b();
    }
    
    protected final void onMeasure(final int n, final int n2) {
        this.a.a("onMeasure");
        super.onMeasure(n, n2);
        this.a.b();
    }
}
