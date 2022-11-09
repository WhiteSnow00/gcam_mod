// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.util.TypedValue;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

public class SnapshotButton extends ShutterButton
{
    public SnapshotButton(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    @Override
    protected float getDefaultScale() {
        final TypedValue typedValue = new TypedValue();
        this.getResources().getValue(R$dimen.snapshot_button_scale, typedValue, true);
        return typedValue.getFloat();
    }
    
    @Override
    protected float getOuterCircleStrokeWidth() {
        return (float)jvu.u(2.0f);
    }
    
    @Override
    public void setClickEnabled(final boolean clickEnabled) {
        super.setClickEnabled(clickEnabled);
    }
    
    @Override
    public void setMode(final iuk iuk, final ivh ivh, final boolean b) {
        if (iuk.equals(iuk.b)) {
            super.setMode(iuk.b, ivh, b);
            return;
        }
        super.setMode(iuk.a, ivh, b);
    }
    
    public void wirePressedStateAnimationListener() {
        this.setListener(new SnapshotButton$1(this, new ivh(this)));
        this.setClickEnabled(true);
    }
}
