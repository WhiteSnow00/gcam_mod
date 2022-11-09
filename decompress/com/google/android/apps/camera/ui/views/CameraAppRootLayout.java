// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.views;

import android.util.AttributeSet;
import android.content.Context;
import com.google.android.apps.camera.ui.layout.GcaLayout;

public class CameraAppRootLayout extends GcaLayout
{
    public CameraAppRootLayout(final Context context) {
        super(context);
    }
    
    public CameraAppRootLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public CameraAppRootLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final void onLayout(final boolean b, int stableInsetTop, final int n, final int n2, final int n3) {
        super.onLayout(b, stableInsetTop, n, n2, n3);
        if (iwu.d(this.getContext())) {
            stableInsetTop = this.getRootWindowInsets().getStableInsetTop();
        }
        else {
            stableInsetTop = 0;
        }
        this.setPadding(0, stableInsetTop, 0, 0);
    }
}
