// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.toast;

import android.view.View$OnTouchListener;
import android.view.View$OnLayoutChangeListener;
import android.widget.Space;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.PopupWindow;

public class EducationToastView extends ToastView
{
    public Runnable a;
    public Runnable b;
    private PopupWindow o;
    
    public EducationToastView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = aas.l;
        this.b = aas.m;
    }
    
    public static EducationToastView a(final iev iev) {
        final ViewGroup a = iev.a;
        View.inflate(a.getContext(), 2131624007, a);
        final EducationToastView educationToastView = (EducationToastView)a.findViewById(2131427577);
        educationToastView.b(iev);
        return educationToastView;
    }
    
    @Override
    public final void b(final iev iev) {
        final ImageView imageView = (ImageView)this.findViewById(2131427575);
        imageView.setImageResource(2131231329);
        imageView.setVisibility(0);
        ((Space)this.findViewById(2131427576)).setVisibility(8);
        this.addOnLayoutChangeListener((View$OnLayoutChangeListener)new ieq(imageView));
        this.f(iev);
        this.o = this.d();
        this.a = iev.f;
        this.b = iev.e;
    }
    
    @Override
    public final void c() {
        this.o.setTouchInterceptor((View$OnTouchListener)new ier(this));
    }
}
