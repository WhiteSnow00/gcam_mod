// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.modeswitcher;

import android.view.View$MeasureSpec;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.graphics.drawable.LayerDrawable;
import android.view.accessibility.AccessibilityManager;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.View;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.ColorMatrixColorFilter;
import android.animation.Animator;
import java.util.ArrayList;
import android.graphics.ColorFilter;
import android.widget.GridLayout;

public class MoreModesGrid extends GridLayout implements iqy
{
    public static final ColorFilter a;
    private static final nsd n;
    public final ArrayList b;
    public niz c;
    public jcb d;
    public eyt e;
    public boolean f;
    public boolean g;
    public Animator h;
    int i;
    public int j;
    public float k;
    public boolean l;
    public niz m;
    private int o;
    private int p;
    
    static {
        n = nsd.g("com/google/android/apps/camera/ui/modeswitcher/MoreModesGrid");
        a = (ColorFilter)new ColorMatrixColorFilter(new float[] { 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f });
    }
    
    public MoreModesGrid(final Context context) {
        super(context);
        this.b = new ArrayList();
        this.c = nii.a;
        this.f = false;
        this.g = true;
        this.h = (Animator)new ObjectAnimator();
        this.k = 0.0f;
        this.l = false;
        this.m = nii.a;
        this.c(context);
    }
    
    public MoreModesGrid(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = new ArrayList();
        this.c = nii.a;
        this.f = false;
        this.g = true;
        this.h = (Animator)new ObjectAnimator();
        this.k = 0.0f;
        this.l = false;
        this.m = nii.a;
        this.c(context);
    }
    
    public MoreModesGrid(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = new ArrayList();
        this.c = nii.a;
        this.f = false;
        this.g = true;
        this.h = (Animator)new ObjectAnimator();
        this.k = 0.0f;
        this.l = false;
        this.m = nii.a;
        this.c(context);
    }
    
    public MoreModesGrid(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.b = new ArrayList();
        this.c = nii.a;
        this.f = false;
        this.g = true;
        this.h = (Animator)new ObjectAnimator();
        this.k = 0.0f;
        this.l = false;
        this.m = nii.a;
        this.c(context);
    }
    
    private final void c(final Context context) {
        kjm.a();
        this.setColumnCount(3);
        final Resources resources = context.getResources();
        this.i = resources.getInteger(2131492976);
        this.j = resources.getInteger(2131492950);
        this.k = resources.getDimension(2131165861);
        this.o = resources.getDimensionPixelOffset(2131165857);
        this.p = resources.getDimensionPixelOffset(2131165855);
    }
    
    public final Animator a() {
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this, View.ALPHA, new float[] { this.getAlpha(), 0.0f });
        ((Animator)ofFloat).setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        return (Animator)ofFloat;
    }
    
    public final void b() {
        this.h.cancel();
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this, View.ALPHA, new float[] { 0.0f, 1.0f });
        ((Animator)ofFloat).setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        ObjectAnimator objectAnimator;
        if (this.d == jcb.b) {
            objectAnimator = ObjectAnimator.ofFloat((Object)this, View.TRANSLATION_Y, new float[] { -this.k, 0.0f });
        }
        else if (this.d == jcb.c) {
            objectAnimator = ObjectAnimator.ofFloat((Object)this, View.TRANSLATION_Y, new float[] { this.k, 0.0f });
        }
        else {
            objectAnimator = ObjectAnimator.ofFloat((Object)this, View.TRANSLATION_X, new float[] { this.k, 0.0f });
        }
        ((Animator)objectAnimator).setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        final AnimatorSet h = new AnimatorSet();
        h.play((Animator)ofFloat).with((Animator)objectAnimator);
        h.setDuration((long)this.i);
        this.setPivotY((float)this.getHeight());
        this.setPivotX((float)(this.getWidth() / 2));
        this.setAlpha(0.0f);
        this.setTranslationX(0.0f);
        this.setTranslationY(0.0f);
        this.setVisibility(0);
        if (((AccessibilityManager)this.getContext().getSystemService("accessibility")).isTouchExplorationEnabled() && this.getChildCount() > 1) {
            this.getChildAt(1).sendAccessibilityEvent(8);
        }
        h.start();
        this.h = (Animator)h;
    }
    
    public final void i(final jbm jbm, final boolean c) {
        final ArrayList b = this.b;
        final int size = b.size();
        final int n = 0;
        int i = 0;
        while (true) {
            while (i < size) {
                final irb irb = (irb)b.get(i);
                ++i;
                if (irb.a == jbm) {
                    if (irb == null) {
                        a.k(MoreModesGrid.n.b(), "No ModeInfo found for %s", jbm, '\u0b4f');
                        return;
                    }
                    if ((c && irb.c) || (c || irb.c)) {
                        return;
                    }
                    irb.c = c;
                    final View b2 = irb.b;
                    if (b2 == null) {
                        return;
                    }
                    final Drawable drawable = ((LayerDrawable)((TextView)b2).getCompoundDrawables()[1]).getDrawable(2);
                    int alpha;
                    if (!c) {
                        alpha = n;
                    }
                    else {
                        alpha = 255;
                    }
                    drawable.setAlpha(alpha);
                    return;
                }
            }
            final irb irb = null;
            continue;
        }
    }
    
    protected final void onLayout(final boolean b, int n, int visibility, final int n2, final int n3) {
        super.onLayout(b, n, visibility, n2, n3);
        visibility = this.getVisibility();
        n = 0;
        if (visibility == 0 && this.c.c() != this.d) {
            n = 1;
        }
        this.c = niz.i(this.d);
        if (n != 0) {
            if (this.l) {
                this.setVisibility(8);
                return;
            }
            this.b();
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        njo.p(this.f ^ true, "modes changed without a later call to finalizeModeSetup");
        njo.p(this.c.g(), "setUiOrientation must be called prior to layout");
        final int o = this.o;
        int n3 = 0;
        Label_0080: {
            if (this.d != jcb.b) {
                n3 = o;
                if (this.d != jcb.c) {
                    break Label_0080;
                }
            }
            final int n4 = View$MeasureSpec.getSize(n) - View$MeasureSpec.getSize(n2);
            n3 = o;
            if (n4 > 0) {
                n3 = o + (n4 >> 1);
            }
        }
        this.setPadding(n3, this.getPaddingTop(), n3, this.p);
        super.onMeasure(n, n2);
    }
}
