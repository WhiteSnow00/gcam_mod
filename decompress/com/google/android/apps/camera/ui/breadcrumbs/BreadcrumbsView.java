// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.breadcrumbs;

import android.view.View;
import android.os.Trace;
import android.util.AttributeSet;
import android.content.Context;

public class BreadcrumbsView extends itw
{
    public jcb d;
    
    public BreadcrumbsView(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = jcb.a;
    }
    
    public final void d() {
        Trace.beginSection("Breadcrumbs:applyOrientation");
        jvu.r((View)this, this.d);
        Trace.endSection();
    }
    
    @Override
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        Trace.beginSection("Breadcrumbs:onLayout");
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.d();
        }
        Trace.endSection();
    }
    
    @Override
    protected final void onMeasure(final int n, final int n2) {
        Trace.beginSection("Breadcrumbs:onMeasure");
        if (jcb.d(this.d)) {
            super.onMeasure(n, n2);
        }
        else {
            super.onMeasure(n2, n);
        }
        Trace.endSection();
    }
}
