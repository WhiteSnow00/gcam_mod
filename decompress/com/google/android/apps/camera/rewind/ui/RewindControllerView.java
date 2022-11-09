// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.rewind.ui;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class RewindControllerView extends FrameLayout
{
    public jcb a;
    
    public RewindControllerView(final Context context) {
        super(context);
    }
    
    public RewindControllerView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public RewindControllerView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final void a() {
        jvu.r((View)this, this.a);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.a != null && b) {
            this.a();
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        final jcb a = this.a;
        if (a != null && !jcb.d(a)) {
            super.onMeasure(n2, n);
            return;
        }
        super.onMeasure(n, n2);
    }
}
