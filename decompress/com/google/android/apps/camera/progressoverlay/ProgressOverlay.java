// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.progressoverlay;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.widget.FrameLayout;

public class ProgressOverlay extends FrameLayout
{
    public AnimatedVectorDrawable a;
    private ImageView b;
    
    public ProgressOverlay(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void a() {
        super.onFinishInflate();
        final LayoutInflater layoutInflater = (LayoutInflater)this.getContext().getSystemService("layout_inflater");
        this.removeAllViewsInLayout();
        layoutInflater.inflate(2131624022, (ViewGroup)this);
        this.b = (ImageView)this.findViewById(2131427683);
        final AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable)this.getContext().getDrawable(2131231347);
        this.a = animatedVectorDrawable;
        this.b.setImageDrawable((Drawable)animatedVectorDrawable);
    }
    
    public final void b() {
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624123, (ViewGroup)this);
        this.b = (ImageView)this.findViewById(2131427862);
        final AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable)this.getContext().getDrawable(2131231433);
        this.a = animatedVectorDrawable;
        this.b.setImageDrawable((Drawable)animatedVectorDrawable);
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b();
    }
}
