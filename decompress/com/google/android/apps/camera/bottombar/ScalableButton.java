// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;
import android.util.AttributeSet;
import android.content.Context;

public class ScalableButton extends ov
{
    private static final float DEFAULT_SIZE = 1.0f;
    private static final float SCALED_SIZE = 1.05f;
    
    public ScalableButton(final Context context, final AttributeSet set) {
        super(context, set);
        this.initialize();
    }
    
    private void initialize() {
        super.setOnTouchListener((View$OnTouchListener)ScalableButton$$ExternalSyntheticLambda0.INSTANCE);
    }
}
