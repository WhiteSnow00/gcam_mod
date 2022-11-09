// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnClickListener;
import android.graphics.drawable.Animatable;

public class CameraSwitchButton extends ScalableButton
{
    private Animatable buttonAnimatable;
    private boolean clickEnabled;
    private View$OnClickListener onClickListener;
    
    public CameraSwitchButton(final Context context, final AttributeSet set) {
        super(context, set);
        this.clickEnabled = true;
        this.initialize();
    }
    
    private void initialize() {
        this.buttonAnimatable = (Animatable)this.getDrawable();
        super.setOnClickListener((View$OnClickListener)new CameraSwitchButton$$ExternalSyntheticLambda0(this));
        this.setFocusable(false);
        final Drawable background = this.getBackground();
        if (background instanceof RippleDrawable) {
            final Drawable mutate = background.getConstantState().newDrawable().mutate();
            ((RippleDrawable)mutate).setRadius(this.getResources().getDimensionPixelSize(R$dimen.camera_switch_button_ripple_diameter) / 2);
            this.setBackground(mutate);
        }
    }
    
    public void setFrontFacing(final boolean b) {
        this.setEnabled(false);
        String contentDescription;
        if (b) {
            contentDescription = this.getResources().getString(R$string.camera_id_front_desc);
        }
        else {
            contentDescription = this.getResources().getString(R$string.camera_id_back_desc);
        }
        this.setContentDescription((CharSequence)contentDescription);
        this.setEnabled(true);
    }
    
    public void setOnClickListener(final View$OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
