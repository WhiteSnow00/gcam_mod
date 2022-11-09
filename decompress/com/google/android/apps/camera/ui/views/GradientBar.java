// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.views;

import android.os.Trace;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

public class GradientBar extends View
{
    public jcb a;
    
    public GradientBar(final Context context) {
        super(context);
        this.a = jcb.a;
    }
    
    public GradientBar(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = jcb.a;
    }
    
    public final void a() {
        Trace.beginSection("unionBottombar2Navibar:applyOrientation");
        jvu.r(this, this.a);
        Trace.endSection();
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        Trace.beginSection("gradientBar:onLayout");
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.a();
        }
        Trace.endSection();
    }
    
    protected final void onMeasure(final int n, final int n2) {
        Trace.beginSection("unionBottombar2Navibar:onMeasure");
        if (jcb.d(this.a)) {
            super.onMeasure(n, n2);
        }
        else {
            super.onMeasure(n2, n);
        }
        Trace.endSection();
    }
}
