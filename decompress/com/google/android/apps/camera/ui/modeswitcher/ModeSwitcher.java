// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.modeswitcher;

import java.util.List;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.os.Trace;
import android.content.res.Resources;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import android.graphics.Typeface;
import android.graphics.drawable.RippleDrawable;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import java.util.Map;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$OnGestureListener;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.GestureDetector;
import android.widget.HorizontalScrollView;

public class ModeSwitcher extends HorizontalScrollView implements iqy
{
    public static final nsd a;
    public iqr b;
    public iql c;
    public GestureDetector d;
    public boolean e;
    public boolean f;
    public jcb g;
    public eyt h;
    public ird i;
    public iqx j;
    public jbm k;
    
    static {
        a = nsd.g("com/google/android/apps/camera/ui/modeswitcher/ModeSwitcher");
    }
    
    public ModeSwitcher(final Context context) {
        super(context);
        this.b = null;
        this.e = false;
        this.f = false;
        this.g = jcb.a;
        this.i = null;
        this.j = new iqu(1);
        this.k = jbm.b;
        this.j(context);
    }
    
    public ModeSwitcher(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = null;
        this.e = false;
        this.f = false;
        this.g = jcb.a;
        this.i = null;
        this.j = new iqu(1);
        this.k = jbm.b;
        this.j(context);
    }
    
    public ModeSwitcher(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = null;
        this.e = false;
        this.f = false;
        this.g = jcb.a;
        this.i = null;
        this.j = new iqu(1);
        this.k = jbm.b;
        this.j(context);
    }
    
    public ModeSwitcher(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.b = null;
        this.e = false;
        this.f = false;
        this.g = jcb.a;
        this.i = null;
        this.j = new iqu(1);
        this.k = jbm.b;
        this.j(context);
    }
    
    public static float a(final float n, final float n2, final float n3) {
        njo.m(n2 <= n3, "value=%s min=%s max=%s", n, n2, n3);
        return Math.max(n2, Math.min(n, n3));
    }
    
    private final void j(final Context context) {
        kjm.a();
        final iql c = new iql(context);
        jwn.ac((View)c);
        ((ViewGroup)this).addView((View)c);
        (this.c = c).setOrientation(0);
        this.c.o = niz.i(new iqm(this));
        this.c.setGravity(16);
        this.c.setBackgroundColor(0);
        this.setHorizontalScrollBarEnabled(false);
        this.setOverScrollMode(2);
        final iqq onTouchListener = new iqq(this);
        (this.d = new GestureDetector(context, (GestureDetector$OnGestureListener)onTouchListener)).setIsLongpressEnabled(false);
        this.setOnTouchListener((View$OnTouchListener)onTouchListener);
    }
    
    public final jbm b() {
        final iql c = this.c;
        final int scrollX = this.getScrollX();
        final int n = this.getWidth() / 2;
        kjm.a();
        jbm b;
        if (c.b.isEmpty()) {
            b = jbm.b;
        }
        else {
            b = ((Map.Entry)new nlg(new kzm(scrollX + n, 1), nqc.a).e(c.b.entrySet())).getKey();
        }
        return b;
    }
    
    public final void c(final jbm jbm) {
        kjm.a();
        final jbm a = jbm.a;
        int n = 0;
        njo.e(jbm != a, "Cannot append UNINITIALIZED mode");
        final iql c = this.c;
        kjm.a();
        final String d = jbk.b(jbm).d(c.getContext().getResources());
        final String c2 = jbk.b(jbm).c(c.getContext().getResources());
        final boolean b = c.b.get(jbm) == null;
        final String value = String.valueOf(jbm);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 28);
        sb.append("mode ");
        sb.append(value);
        sb.append(" is registered already.");
        njo.p(b, sb.toString());
        final TextView textView = (TextView)((LayoutInflater)c.getContext().getSystemService("layout_inflater")).inflate(2131624053, (ViewGroup)null);
        textView.setText((CharSequence)d);
        textView.setContentDescription((CharSequence)c2);
        textView.setSoundEffectsEnabled(false);
        final RippleDrawable background = (RippleDrawable)c.getContext().getDrawable(2131231374);
        if (!c.g) {
            textView.setTypeface(Typeface.create("google-sans-medium_compat", 0));
        }
        else {
            background.setRadius(0);
        }
        textView.setBackground((Drawable)background);
        c.b.put(jbm, textView);
        final int f = ik.f((View)c);
        final Resources resources = c.getContext().getResources();
        final irz irz = new irz(c.getContext(), (View)textView, c.g);
        int n2;
        if (f == 1) {
            n2 = (int)resources.getDimension(2131166078);
        }
        else {
            n2 = 0;
        }
        final int n3 = (int)resources.getDimension(2131166082);
        if (f != 1) {
            n = (int)resources.getDimension(2131166078);
        }
        irz.c(n2, n3, n);
        c.e.put(jbm, irz);
        c.addView((View)textView);
        textView.setOnClickListener((View$OnClickListener)new iqn(this, jbm));
    }
    
    public final void d() {
        Trace.beginSection("ModeSwitcher:applyOrientation");
        jvu.r((View)this, this.g);
        Trace.endSection();
    }
    
    public final void e(final boolean b, final boolean b2) {
        kjm.a();
        this.c.c(b, b2);
    }
    
    public final void f(int n, final boolean b) {
        n -= this.getWidth() / 2;
        if (b) {
            this.smoothScrollTo(n, 0);
            return;
        }
        this.scrollTo(n, 0);
    }
    
    public final void g(final jbm k, final boolean b) {
        kjm.a();
        k.getClass();
        njo.e(k != jbm.a, "Cannot setActiveMode to UNINITIALIZED");
        njo.p(this.e, "must call finalizeModeSetup before setActiveMode");
        this.c.b(k, b);
        this.k = k;
    }
    
    public final void h(final jbm jbm) {
        Trace.beginSection("ModeSwitcher#setActiveModeAndNL");
        njo.d(jbm != jbm.a);
        this.g(jbm, true);
        final ird i = this.i;
        if (i != null) {
            i.f(jbm);
        }
        Trace.endSection();
    }
    
    public final void i(final jbm jbm, final boolean b) {
        final iql c = this.c;
        monitorenter(c);
        Label_0029: {
            if (!b) {
                break Label_0029;
            }
            Block_6_Outer:Label_0072_Outer:
            while (true) {
                try {
                    if (!c.d.contains(jbm)) {
                        break Label_0029;
                    }
                    break Label_0044;
                }
                finally {
                    monitorexit(c);
                    while (true) {
                        while (true) {
                            c.d.add(jbm);
                            c.f = true;
                            monitorexit(c);
                            c.requestLayout();
                            return;
                            monitorexit(c);
                            return;
                            Label_0047: {
                                iftrue(Label_0063:)(!b);
                            }
                            continue Label_0072_Outer;
                        }
                        iftrue(Label_0047:)(b || c.d.contains(jbm));
                        continue Block_6_Outer;
                        Label_0063: {
                            c.d.remove(jbm);
                        }
                        continue;
                    }
                }
                break;
            }
        }
    }
    
    public final boolean isEnabled() {
        return this.f;
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return !this.f || super.onInterceptTouchEvent(motionEvent);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.d();
        }
        if (this.f) {
            this.setSystemGestureExclusionRects((List)nns.m(new Rect(0, 0, this.getWidth(), this.getHeight())));
            return;
        }
        this.setSystemGestureExclusionRects((List)nns.l());
    }
    
    protected final void onMeasure(final int n, final int n2) {
        Trace.beginSection("ModeSwitcher:onMeasure");
        if (jcb.d(this.g)) {
            super.onMeasure(n, n2);
        }
        else {
            super.onMeasure(n2, n);
        }
        Trace.endSection();
    }
    
    public final void setEnabled(final boolean b) {
        kjm.a();
        if (!this.e) {
            return;
        }
        if (b && this.f) {
            a.l(ModeSwitcher.a.c(), "ModeSwitcher WAS ALREADY ENABLED!", '\u0b38');
        }
        else if (!b && !this.f) {
            a.l(ModeSwitcher.a.c(), "ModeSwitcher WAS ALREADY DISABLED!", '\u0b37');
        }
        this.c.setEnabled(b);
        this.f = b;
    }
    
    public final void setVisibility(final int n) {
        super.setVisibility(n);
        this.c.setVisibility(n);
    }
}
