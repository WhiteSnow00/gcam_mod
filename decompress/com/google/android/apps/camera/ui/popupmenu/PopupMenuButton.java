// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.popupmenu;

import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class PopupMenuButton extends ov
{
    public PopupMenuButton(final Context context, final AttributeSet set) {
        super(context, set);
        this.setBackgroundResource(2131231101);
        this.setColorFilter(leg.g((View)this));
    }
    
    public final void a(final int tint) {
        final LayerDrawable layerDrawable = (LayerDrawable)this.getBackground();
        layerDrawable.setTintMode(PorterDuff$Mode.SRC);
        layerDrawable.getDrawable(1).mutate().setTint(tint);
    }
    
    public final void b(final int tint) {
        ((LayerDrawable)this.getBackground()).getDrawable(0).mutate().setTint(tint);
    }
    
    public final void c(final boolean b) {
        if (!b) {
            this.setBackgroundResource(2131231102);
            this.setColorFilter(-1);
        }
    }
}
