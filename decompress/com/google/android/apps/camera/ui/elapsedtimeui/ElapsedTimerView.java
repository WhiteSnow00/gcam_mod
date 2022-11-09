// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.elapsedtimeui;

import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class ElapsedTimerView extends LinearLayout
{
    public ElapsedTimerView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final TextView a() {
        return (TextView)this.findViewById(2131427834);
    }
    
    public final TextView b() {
        return (TextView)this.findViewById(2131427870);
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624009, (ViewGroup)this);
        this.setLayerType(1, (Paint)null);
    }
}
