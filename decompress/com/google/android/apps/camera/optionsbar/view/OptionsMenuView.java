// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.optionsbar.view;

import android.view.View$MeasureSpec;
import android.view.View$OnTouchListener;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Trace;
import java.util.ArrayList;
import android.content.res.Resources$Theme;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.view.GestureDetector$OnGestureListener;
import java.util.HashMap;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;
import java.util.Map;
import android.view.GestureDetector;
import android.widget.ScrollView;

public class OptionsMenuView extends ScrollView
{
    public static final nsd a;
    public int b;
    public final GestureDetector c;
    public final Map d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final Map h;
    public LinearLayout i;
    public gkk j;
    public boolean k;
    public jcb l;
    public gkc m;
    
    static {
        a = nsd.g("com/google/android/apps/camera/optionsbar/view/OptionsMenuView");
    }
    
    public OptionsMenuView(final Context context, final AttributeSet set) {
        super(context, set);
        this.k = false;
        this.l = jcb.a;
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new HashMap();
        this.c = new GestureDetector(context, (GestureDetector$OnGestureListener)new gkm(this));
    }
    
    public final int a() {
        final LinearLayout i = this.i;
        if (i != null) {
            return i.getChildCount();
        }
        return 0;
    }
    
    public final void b(final gjo gjo) {
        monitorenter(this);
        try {
            if (this.h.get(gjo) != null) {
                final gkk gkk = this.h.get(gjo);
                final ArrayList d = gkk.d;
                for (int size = d.size(), i = 0; i < size; ++i) {
                    final ImageButton imageButton = (ImageButton)((FrameLayout)d.get(i)).getChildAt(0);
                    imageButton.setEnabled(false);
                    if (gkk.l) {
                        imageButton.setImageAlpha(153);
                    }
                    else {
                        imageButton.setImageAlpha(64);
                    }
                }
                final ImageButton imageButton2 = gkk.e.get(gkk.o);
                if (imageButton2 != null) {
                    gkk.f(imageButton2);
                }
                gkk.h.setText((CharSequence)gkk.getResources().getString(2131952366));
                gkk.h.setContentDescription((CharSequence)gkk.getResources().getString(2131952367));
                if (gkk.l) {
                    gkk.h.setAlpha(0.6f);
                }
                else {
                    gkk.h.setTextColor(gkk.getResources().getColor(2131101042, (Resources$Theme)null));
                }
                this.h.get(gjo).setEnabled(false);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void c(final gjo gjo, final gjp gjp) {
        synchronized (this) {
            if (this.h.get(gjo) != null) {
                final gkk gkk = this.h.get(gjo);
                final ImageButton imageButton = gkk.e.get(gjp);
                imageButton.getClass();
                if (imageButton != gkk.e.get(gkk.o)) {
                    imageButton.setEnabled(false);
                    if (gkk.l) {
                        imageButton.setImageAlpha(153);
                    }
                    else {
                        imageButton.setImageAlpha(64);
                    }
                }
            }
        }
    }
    
    public final void d(final gjo gjo) {
        monitorenter(this);
        try {
            if (this.h.get(gjo) != null) {
                final gkk gkk = this.h.get(gjo);
                final ArrayList d = gkk.d;
                for (int size = d.size(), i = 0; i < size; ++i) {
                    final ImageButton imageButton = (ImageButton)((FrameLayout)d.get(i)).getChildAt(0);
                    imageButton.setEnabled(true);
                    imageButton.setImageAlpha(255);
                }
                final ImageButton imageButton2 = gkk.e.get(gkk.o);
                if (imageButton2 != null) {
                    gkk.e(imageButton2);
                    final gjn gjn = gkk.f.get(imageButton2);
                    gjn.getClass();
                    String text;
                    if (gjn.e.isEmpty()) {
                        text = gkk.getResources().getString(gjn.c);
                    }
                    else {
                        text = gjn.e;
                    }
                    gkk.h.setText((CharSequence)text);
                    String contentDescription;
                    if (gjn.f.isEmpty()) {
                        contentDescription = gkk.getResources().getString(gjn.d);
                    }
                    else {
                        contentDescription = gjn.f;
                    }
                    gkk.h.setContentDescription((CharSequence)contentDescription);
                    if (gkk.l) {
                        gkk.h.setAlpha(1.0f);
                    }
                    else {
                        gkk.h.setTextColor(gkk.getResources().getColor(2131101041, (Resources$Theme)null));
                    }
                }
                this.h.get(gjo).setEnabled(true);
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void e(final gjo gjo, final boolean b) {
        if (this.h.get(gjo) != null) {
            final ArrayList d = this.h.get(gjo).d;
            for (int size = d.size(), i = 0; i < size; ++i) {
                ((ImageButton)((FrameLayout)d.get(i)).getChildAt(0)).setEnabled(b);
            }
            this.h.get(gjo).setEnabled(b);
        }
    }
    
    public final void f(final gjm gjm, final gjs gjs) {
        this.e.put(gjm, gjs);
    }
    
    public final boolean g(final gjo gjo) {
        return this.h.get(gjo) != null && this.h.get(gjo).isEnabled();
    }
    
    protected final void onFinishInflate() {
        Trace.beginSection("optionsMenu:inflate");
        super.onFinishInflate();
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624088, (ViewGroup)this);
        this.setLayerType(1, (Paint)null);
        this.i = (LinearLayout)this.findViewById(2131427824);
        this.setOnTouchListener((View$OnTouchListener)new gkl(this));
        this.setScrollbarFadingEnabled(false);
        Trace.endSection();
    }
    
    protected final void onMeasure(final int n, int n2) {
        int measureSpec = 0;
        Label_0223: {
            if (this.k) {
                final int mode = View$MeasureSpec.getMode(n2);
                measureSpec = n2;
                if (this.b > 0) {
                    measureSpec = n2;
                    if (mode != 1073741824) {
                        if (mode != 0) {
                            measureSpec = n2;
                            if (View$MeasureSpec.getSize(n2) <= this.b) {
                                break Label_0223;
                            }
                        }
                        measureSpec = View$MeasureSpec.makeMeasureSpec(this.b, Integer.MIN_VALUE);
                    }
                }
            }
            else {
                try {
                    final int size = View$MeasureSpec.getSize(n2);
                    final int n3 = this.b - this.getResources().getDimensionPixelSize(2131166112) - this.getResources().getDimensionPixelSize(2131166111);
                    final int n4 = n3 / this.getResources().getDimensionPixelSize(2131166123);
                    int height;
                    if ((height = size) > n3) {
                        final double n5 = (float)n4;
                        Double.isNaN(n5);
                        final double n6 = (float)this.getResources().getDimensionPixelSize(2131166123);
                        Double.isNaN(n6);
                        height = (int)((n5 - 0.5) * n6);
                    }
                    final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE);
                    try {
                        this.getLayoutParams().height = height;
                        measureSpec = measureSpec2;
                    }
                    catch (final RuntimeException ex) {
                        n2 = measureSpec2;
                    }
                }
                catch (final RuntimeException ex2) {}
                final RuntimeException ex;
                a.m(OptionsMenuView.a.b(), "Error forcing height.", '\u074a', ex);
                measureSpec = n2;
            }
        }
        super.onMeasure(n, measureSpec);
    }
}
