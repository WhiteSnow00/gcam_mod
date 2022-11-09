// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.eduimageview;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.FrameLayout;

public class EduImageView extends FrameLayout
{
    public ImageView a;
    public TextView b;
    
    public EduImageView(final Context context) {
        super(context);
    }
    
    public EduImageView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public EduImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final void a(final String s, final String s2) {
        this.b(s, s2, null);
    }
    
    public final void b(final String s, final String s2, final cqa cqa) {
        new imp(this, this.getContext(), s, s2, cqa).b(false);
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624008, (ViewGroup)this);
        this.a = (ImageView)this.findViewById(2131427654);
        this.b = (TextView)this.findViewById(2131428060);
    }
}
