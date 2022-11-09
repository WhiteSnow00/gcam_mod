// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.popupmenu;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class PopupMenuViewContainer extends FrameLayout
{
    private jcb a;
    
    public PopupMenuViewContainer(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = jcb.a;
    }
    
    public final void a(final jcb a) {
        jvu.r((View)this, this.a = a);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.a(this.a);
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (jcb.d(this.a)) {
            super.onMeasure(n, n2);
            return;
        }
        super.onMeasure(n2, n);
    }
}
