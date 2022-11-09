// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.legacy.lightcycle.ui;

import android.view.View;
import android.content.res.Configuration;
import android.widget.FrameLayout$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Handler;
import android.widget.FrameLayout;

public class PhotoSphereMessageOverlay extends FrameLayout
{
    public final Handler a;
    public boolean b;
    public boolean c;
    private final int[] d;
    
    public PhotoSphereMessageOverlay(final Context context) {
        super(context.getApplicationContext());
        this.a = kpo.c();
        this.b = false;
        this.c = true;
        this.d = new int[] { 2131427943, 2131427713, 2131427903 };
    }
    
    public PhotoSphereMessageOverlay(final Context context, final AttributeSet set) {
        super(context.getApplicationContext(), set);
        this.a = kpo.c();
        this.b = false;
        this.c = true;
        this.d = new int[] { 2131427943, 2131427713, 2131427903 };
    }
    
    public final void a() {
        this.a.post((Runnable)new eua(this, 1));
    }
    
    public final void b(final int n) {
        final int[] d = this.d;
        final int length = d.length;
        for (int i = 0; i < 3; ++i) {
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)this.findViewById(d[i]).getLayoutParams();
            int n2;
            if (n == 180) {
                n2 = 80;
            }
            else {
                n2 = 48;
            }
            frameLayout$LayoutParams.gravity = (n2 | 0x1);
        }
    }
    
    public final void c(final int n) {
        this.a.post((Runnable)new etx(this, n));
    }
    
    public final void d(final boolean b, final int n) {
        this.a.post((Runnable)new eub(this, b, n));
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final View viewById = this.findViewById(2131427943);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)viewById.getLayoutParams();
        final float dimension = this.getResources().getDimension(2131166150);
        final float dimension2 = this.getResources().getDimension(2131166148);
        final float dimension3 = this.getResources().getDimension(2131166149);
        frameLayout$LayoutParams.width = (int)dimension;
        frameLayout$LayoutParams.height = (int)dimension2;
        frameLayout$LayoutParams.setMargins(0, (int)dimension3, 0, 0);
        viewById.requestLayout();
    }
}
