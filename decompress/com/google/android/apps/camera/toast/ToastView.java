// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.toast;

import android.view.View$OnClickListener;
import android.util.TypedValue;
import android.widget.TextView;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.PopupWindow;
import android.view.View;
import j$.time.Duration;
import android.widget.FrameLayout;

public class ToastView extends FrameLayout
{
    public static final Duration d;
    public static final Duration e;
    public static final nsd f;
    private View a;
    public float g;
    public long h;
    public Runnable i;
    public Runnable j;
    public Runnable k;
    public Runnable l;
    public PopupWindow m;
    public View n;
    
    static {
        d = Duration.ofMillis(300L);
        e = Duration.ofMillis(300L);
        f = nsd.g("com/google/android/apps/camera/toast/ToastView");
    }
    
    public ToastView(final Context context, final AttributeSet set) {
        super(context, set);
        this.i = iey.b;
        this.j = iey.a;
        this.k = iey.c;
        this.l = iey.d;
    }
    
    public static ToastView e(final iev iev) {
        final ViewGroup a = iev.a;
        View.inflate(a.getContext(), 2131624164, a);
        final ToastView toastView = (ToastView)a.findViewById(2131428076);
        toastView.b(iev);
        return toastView;
    }
    
    public void b(final iev iev) {
        final TextView textView = (TextView)this.findViewById(2131428075);
        if (textView != null) {
            textView.setText((CharSequence)iev.b);
        }
        final TextView textView2 = (TextView)this.findViewById(2131428074);
        if (textView2 != null) {
            textView2.setText((CharSequence)iev.c);
        }
        this.h = iev.a() - ToastView.e.toMillis() - ToastView.d.toMillis();
        this.i = new iex(this);
        this.f(iev);
        this.d();
        this.j = iev.d;
        this.k = iev.e;
        this.l = iev.f;
        final View viewById = this.findViewById(2131428072);
        if ((this.a = viewById) != null) {
            final int paddingBottom = viewById.getPaddingBottom();
            this.g = TypedValue.applyDimension(0, (float)(paddingBottom + paddingBottom), this.getResources().getDisplayMetrics());
        }
    }
    
    public void c() {
        this.a.setOnClickListener((View$OnClickListener)new iew(this));
    }
    
    public final PopupWindow d() {
        (this.m = new PopupWindow(new View(this.getContext()), 1, 1)).setClippingEnabled(false);
        this.m.setOutsideTouchable(true);
        return this.m;
    }
    
    public final void f(final iev iev) {
        this.n = (View)iev.a;
    }
    
    public final void g() {
        this.animate().alpha(1.0f).setDuration(ToastView.d.toMillis()).withEndAction((Runnable)new iex(this, 1)).translationYBy(-this.g).start();
    }
}
