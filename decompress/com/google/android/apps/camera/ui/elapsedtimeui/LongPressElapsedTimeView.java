// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.elapsedtimeui;

import android.view.animation.AnimationUtils;
import android.content.res.Resources$Theme;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.widget.LinearLayout;

public class LongPressElapsedTimeView extends LinearLayout
{
    public Animation a;
    public Animation b;
    public ImageView c;
    public final Runnable d;
    
    public LongPressElapsedTimeView(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = new inc(this);
    }
    
    public final TextView a() {
        return (TextView)this.findViewById(2131427715);
    }
    
    public final TextView b() {
        return (TextView)this.findViewById(2131427716);
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624041, (ViewGroup)this);
        this.setLayerType(1, (Paint)null);
        this.setBackground(this.getResources().getDrawable(2131231663, (Resources$Theme)null));
        this.a = AnimationUtils.loadAnimation(this.getContext(), 2130771980);
        this.b = AnimationUtils.loadAnimation(this.getContext(), 2130771981);
        this.c = (ImageView)this.findViewById(2131427657);
    }
}
