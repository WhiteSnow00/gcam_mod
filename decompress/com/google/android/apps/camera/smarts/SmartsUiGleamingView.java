// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.smarts;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Animatable2$AnimationCallback;
import android.graphics.drawable.Drawable$Callback;
import android.content.res.Resources$Theme;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.view.View;

public class SmartsUiGleamingView extends View
{
    public AnimatedVectorDrawable a;
    public int b;
    private AnimatedVectorDrawable c;
    
    public SmartsUiGleamingView(final Context context) {
        super(context);
    }
    
    public SmartsUiGleamingView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void a() {
        kjm.a();
        this.c.setVisible(false, false);
        this.a.setVisible(false, false);
        this.setVisibility(4);
    }
    
    protected final void onDraw(final Canvas canvas) {
        this.c.draw(canvas);
        this.a.draw(canvas);
    }
    
    public final void onFinishInflate() {
        super.onFinishInflate();
        final hol hol = new hol(this);
        (this.c = (AnimatedVectorDrawable)this.getResources().getDrawable(2131231158, (Resources$Theme)null)).setCallback((Drawable$Callback)this);
        this.getResources().getDimensionPixelSize(2131166254);
        this.c.registerAnimationCallback((Animatable2$AnimationCallback)hol);
        this.c.setVisible(false, false);
        (this.a = (AnimatedVectorDrawable)this.getResources().getDrawable(2131231352, (Resources$Theme)null)).setCallback((Drawable$Callback)this);
        this.b = this.getResources().getDimensionPixelSize(2131166256) / 2;
        this.a.registerAnimationCallback((Animatable2$AnimationCallback)hol);
        this.a.setVisible(false, false);
        this.setVisibility(4);
    }
    
    protected final boolean verifyDrawable(final Drawable drawable) {
        return drawable == this.c || drawable == this.a || super.verifyDrawable(drawable);
    }
}
