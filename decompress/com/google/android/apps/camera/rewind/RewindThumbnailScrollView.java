// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.rewind;

import android.os.VibrationEffect;
import android.widget.TextView;
import android.view.MotionEvent;
import j$.util.function.Consumer;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.View;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout;
import java.util.List;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.widget.FrameLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.util.SparseArray;
import android.widget.HorizontalScrollView;

public class RewindThumbnailScrollView extends HorizontalScrollView
{
    private static final nsd h;
    public SparseArray a;
    public final Context b;
    public final Drawable c;
    public final FrameLayout$LayoutParams d;
    public int e;
    public ObjectAnimator f;
    public hch g;
    private final int i;
    private final PropertyValuesHolder j;
    private LayoutInflater k;
    private int l;
    private int m;
    private int n;
    private int o;
    
    static {
        h = nsd.g("com/google/android/apps/camera/rewind/RewindThumbnailScrollView");
    }
    
    public RewindThumbnailScrollView(final Context b, final AttributeSet set) {
        super(b, set);
        this.e = -1;
        this.o = -1;
        this.b = b;
        final Drawable drawable = b.getDrawable(2131231364);
        drawable.getClass();
        this.c = drawable;
        this.i = this.getResources().getDimensionPixelSize(2131165808);
        this.d = new FrameLayout$LayoutParams(-2, -1, 83);
        this.j = PropertyValuesHolder.ofFloat("translationY", new float[] { 0.0f, -7.0f });
    }
    
    public final int a() {
        if (this.a == null) {
            RewindThumbnailScrollView.h.c().g(ntf.a, "McFlyThumbnailScrollView").E(2257).p("Thumbnail scroller is uninitialized, returning %d", -1);
            return -1;
        }
        return this.o;
    }
    
    public final int b() {
        synchronized (this) {
            this.d("Cannot get the maximum scrollable X when uninitialized.");
            return this.l;
        }
    }
    
    public final int c(final int n) {
        final int l = this.l;
        return Math.min(l, Math.max(0, n * l / this.m));
    }
    
    public final void d(final String s) {
        if (this.a != null) {
            return;
        }
        throw new IllegalStateException(s);
    }
    
    public final void e(final List list, int i) {
        monitorenter(this);
        try {
            final int j = this.i;
            final int n = (i - j) / 2;
            final int width = j * list.size() / 4;
            this.l = n + n + width - i;
            this.m = list.size() - 1;
            i = this.l;
            final int size = list.size();
            this.n = i / (size + size);
            this.a = new SparseArray(list.size());
            final LinearLayout linearLayout = (LinearLayout)this.findViewById(2131427740);
            final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)linearLayout.getLayoutParams();
            layoutParams.setMarginStart(n);
            layoutParams.setMarginEnd(n);
            layoutParams.width = width;
            linearLayout.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            linearLayout.setClipToOutline(true);
            this.d.leftMargin = n + this.i / 2 - this.c.getIntrinsicWidth() / 2;
            FrameLayout frameLayout;
            ImageView imageView;
            int k;
            for (i = 0; i < list.size(); i += 4) {
                frameLayout = (FrameLayout)this.k.inflate(2131624048, (ViewGroup)null);
                imageView = (ImageView)frameLayout.findViewById(2131427738);
                imageView.setImageBitmap(list.get(i).d());
                k = this.i;
                imageView.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(k, k));
                linearLayout.addView((View)frameLayout);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void f(int c) {
        if (this.f == null) {
            c = this.c(c);
            final ObjectAnimator ofInt = ObjectAnimator.ofInt((Object)this, "scrollX", new int[] { this.getScrollX(), c });
            ofInt.setAutoCancel(true);
            ofInt.setDuration(200L);
            ofInt.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
            ofInt.addListener(jvh.e((Consumer)new hct(this)));
            (this.f = ofInt).start();
        }
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.k = LayoutInflater.from(this.getContext());
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return this.f == null && super.onInterceptTouchEvent(motionEvent);
    }
    
    protected final void onScrollChanged(int min, int n, int m, final int n2) {
        super.onScrollChanged(min, n, m, n2);
        if (this.a == null) {
            return;
        }
        n = this.n;
        m = this.m;
        min = Math.min(m, Math.max(0, (min + n) * m / this.l));
        n = this.o;
        if (n != min) {
            final View view = (View)this.a.get(n);
            final View view2 = (View)this.a.get(min);
            if (view != null) {
                ObjectAnimator.ofPropertyValuesHolder((Object)view, new PropertyValuesHolder[] { this.j }).reverse();
            }
            if (view2 != null) {
                ObjectAnimator.ofPropertyValuesHolder((Object)view2, new PropertyValuesHolder[] { this.j }).start();
            }
            this.o = min;
            final hch g = this.g;
            if (g != null) {
                final hcp a = g.a;
                final List b = g.b;
                final ImageView c = g.c;
                final RewindExportShotView d = g.d;
                final hdb hdb = b.get(min);
                final boolean b2 = a.j.b(hdb);
                c.setImageDrawable((Drawable)a.v(hdb));
                String text;
                if (b2) {
                    text = d.a;
                }
                else {
                    text = d.b;
                }
                if (!((TextView)d.getCurrentView()).getText().toString().equals(text)) {
                    d.setText((CharSequence)text);
                }
                if (b2) {
                    a.g.d(VibrationEffect.createOneShot(50L, -1));
                }
            }
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.a != null && motionEvent.getAction() == 1) {
            final SparseArray a = this.a;
            a.getClass();
            if (a.get(this.o) != null) {
                this.f(this.o);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
