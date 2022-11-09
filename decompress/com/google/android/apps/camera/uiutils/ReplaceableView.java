// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.uiutils;

import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

public class ReplaceableView extends View
{
    public ReplaceableView(final Context context) {
        super(context);
    }
    
    public ReplaceableView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void a(final View view) {
        this.getParent().getClass();
        final ViewGroup viewGroup = (ViewGroup)this.getParent();
        final int indexOfChild = viewGroup.indexOfChild((View)this);
        viewGroup.removeView((View)this);
        viewGroup.addView(view, indexOfChild);
    }
}
