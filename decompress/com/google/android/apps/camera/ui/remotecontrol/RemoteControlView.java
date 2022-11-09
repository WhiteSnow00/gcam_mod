// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.remotecontrol;

import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Trace;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.TextView;
import android.widget.FrameLayout;

public class RemoteControlView extends FrameLayout
{
    public TextView a;
    public TextView b;
    public TextView c;
    public TextView d;
    public View e;
    public View f;
    private LinearLayout g;
    private int h;
    
    public RemoteControlView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    private final void b(final int n) {
        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)this.g.getLayoutParams();
        layoutParams.topMargin = this.h;
        layoutParams.bottomMargin = this.h;
        layoutParams.gravity = (n | 0x1);
        this.g.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public final void a() {
        this.b.setText((CharSequence)"--");
        this.a.setText((CharSequence)"--");
        this.c.setText((CharSequence)"");
        this.e.setVisibility(8);
        this.d.setText((CharSequence)"");
        this.f.setVisibility(8);
    }
    
    protected final void onFinishInflate() {
        Trace.beginSection("RemoteControlUi:inflate");
        super.onFinishInflate();
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624125, (ViewGroup)this);
        this.a = (TextView)this.findViewById(2131427547);
        this.b = (TextView)this.findViewById(2131427849);
        this.c = (TextView)this.findViewById(2131428147);
        this.d = (TextView)this.findViewById(2131428150);
        this.e = this.findViewById(2131428148);
        this.f = this.findViewById(2131428151);
        this.g = (LinearLayout)this.findViewById(2131427873);
        this.h = this.getResources().getDimensionPixelSize(2131166212);
        this.setLayerType(1, (Paint)null);
        this.a();
        Trace.endSection();
    }
    
    public final void onMeasure(final int n, final int n2) {
        switch (jcb.a(this.getDisplay(), this.getContext()).ordinal()) {
            case 2: {
                this.b(48);
                break;
            }
            case 1: {
                this.b(80);
                break;
            }
            case 0:
            case 3: {
                final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)this.g.getLayoutParams();
                layoutParams.topMargin = this.h;
                layoutParams.gravity = 49;
                this.g.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                break;
            }
        }
        super.onMeasure(n, n2);
    }
}
