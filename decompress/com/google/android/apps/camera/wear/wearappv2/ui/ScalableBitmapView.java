// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.wear.wearappv2.ui;

import android.graphics.Matrix;
import android.util.AttributeSet;
import android.content.Context;
import java.text.DateFormat;
import android.view.View;

public class ScalableBitmapView extends View
{
    static {
        DateFormat.getDateTimeInstance();
    }
    
    public ScalableBitmapView(final Context context, final AttributeSet set) {
        super(context, set);
        new Matrix();
    }
}
