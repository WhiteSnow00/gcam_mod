// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.button;

import android.graphics.Paint;
import java.util.Iterator;
import android.util.Log;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.text.TextPaint;
import android.graphics.Rect;
import android.widget.TextView;
import java.io.Serializable;
import android.widget.CompoundButton;
import android.widget.Button;
import android.content.res.TypedArray;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import java.util.LinkedHashSet;
import android.widget.Checkable;
import android.support.v7.widget.AppCompatButton;

public class MaterialButton extends AppCompatButton implements Checkable, nfr
{
    private static final int[] b;
    private static final int[] c;
    private final ndq d;
    private final LinkedHashSet e;
    private PorterDuff$Mode f;
    private ColorStateList g;
    private Drawable h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;
    
    static {
        b = new int[] { 16842911 };
        c = new int[] { 16842912 };
    }
    
    public MaterialButton(final Context context) {
        this(context, null);
    }
    
    public MaterialButton(final Context context, final AttributeSet set) {
        this(context, set, 2130969383);
    }
    
    public MaterialButton(final Context context, final AttributeSet set, int g) {
        super(ngv.a(context, set, g, 2132018490), set, g);
        this.e = new LinkedHashSet();
        this.m = false;
        this.n = false;
        final Context context2 = this.getContext();
        final TypedArray a = nem.a(context2, set, ndr.a, g, 2132018490, new int[0]);
        this.l = a.getDimensionPixelSize(12, 0);
        this.f = neq.b(a.getInt(15, -1), PorterDuff$Mode.SRC_IN);
        this.g = neu.a(this.getContext(), a, 14);
        this.h = neu.b(this.getContext(), a, 10);
        this.o = a.getInteger(11, 1);
        this.i = a.getDimensionPixelSize(13, 0);
        final ndq d = new ndq(this, nfi.a(context2, set, g, 2132018490).a());
        this.d = d;
        d.c = a.getDimensionPixelOffset(1, 0);
        d.d = a.getDimensionPixelOffset(2, 0);
        d.e = a.getDimensionPixelOffset(3, 0);
        d.f = a.getDimensionPixelOffset(4, 0);
        if (a.hasValue(8)) {
            g = a.getDimensionPixelSize(8, -1);
            d.g = g;
            d.d(d.b.c((float)g));
        }
        d.h = a.getDimensionPixelSize(20, 0);
        d.i = neq.b(a.getInt(7, -1), PorterDuff$Mode.SRC_IN);
        d.j = neu.a(d.a.getContext(), a, 6);
        d.k = neu.a(d.a.getContext(), a, 19);
        d.l = neu.a(d.a.getContext(), a, 16);
        d.o = a.getBoolean(5, false);
        d.q = a.getDimensionPixelSize(9, 0);
        final int j = ik.j((View)d.a);
        final int paddingTop = d.a.getPaddingTop();
        g = ik.i((View)d.a);
        final int paddingBottom = d.a.getPaddingBottom();
        if (a.hasValue(0)) {
            d.c();
        }
        else {
            final MaterialButton a2 = d.a;
            final nfd nfd = new nfd(d.b);
            nfd.e(d.a.getContext());
            nfd.setTintList(d.j);
            final PorterDuff$Mode i = d.i;
            if (i != null) {
                nfd.setTintMode(i);
            }
            final int h = d.h;
            final ColorStateList k = d.k;
            nfd.j((float)h);
            nfd.i(k);
            final nfd nfd2 = new nfd(d.b);
            nfd2.setTint(0);
            nfd2.j((float)d.h);
            nfd2.i(ColorStateList.valueOf(0));
            (d.m = new nfd(d.b)).setTint(-1);
            a2.setBackgroundDrawable((Drawable)(d.p = (LayerDrawable)new RippleDrawable(nev.b(d.l), (Drawable)new InsetDrawable((Drawable)new LayerDrawable(new Drawable[] { nfd2, nfd }), d.c, d.e, d.d, d.f), d.m)));
            final nfd a3 = d.a();
            if (a3 != null) {
                a3.f((float)d.q);
            }
        }
        ik.M((View)d.a, j + d.c, paddingTop + d.e, g + d.d, paddingBottom + d.f);
        a.recycle();
        this.setCompoundDrawablePadding(this.l);
        this.g(this.h != null);
    }
    
    private final String a() {
        Serializable s;
        if (!this.e()) {
            s = Button.class;
        }
        else {
            s = CompoundButton.class;
        }
        return ((Class)s).getName();
    }
    
    private final void f() {
        if (this.j()) {
            jp.e((TextView)this, this.h, null, null);
            return;
        }
        if (this.i()) {
            jp.e((TextView)this, null, null, this.h);
            return;
        }
        if (this.k()) {
            jp.e((TextView)this, null, this.h, null);
        }
    }
    
    private final void g(final boolean b) {
        final Drawable h = this.h;
        if (h != null) {
            (this.h = h.mutate()).setTintList(this.g);
            final PorterDuff$Mode f = this.f;
            if (f != null) {
                this.h.setTintMode(f);
            }
            int n;
            if ((n = this.i) == 0) {
                n = this.h.getIntrinsicWidth();
            }
            int n2;
            if ((n2 = this.i) == 0) {
                n2 = this.h.getIntrinsicHeight();
            }
            final Drawable h2 = this.h;
            final int j = this.j;
            final int k = this.k;
            h2.setBounds(j, k, n + j, n2 + k);
        }
        if (!b) {
            final Drawable[] compoundDrawablesRelative = ((TextView)this).getCompoundDrawablesRelative();
            final Drawable drawable = compoundDrawablesRelative[0];
            final Drawable drawable2 = compoundDrawablesRelative[1];
            final Drawable drawable3 = compoundDrawablesRelative[2];
            if ((this.j() && drawable != this.h) || (this.i() && drawable3 != this.h) || (this.k() && drawable2 != this.h)) {
                this.f();
            }
            return;
        }
        this.f();
    }
    
    private final void h(int n, int n2) {
        if (this.h != null && this.getLayout() != null) {
            if (!this.j() && !this.i()) {
                if (this.k()) {
                    this.j = 0;
                    if (this.o == 16) {
                        this.k = 0;
                        this.g(false);
                        return;
                    }
                    if ((n = this.i) == 0) {
                        n = this.h.getIntrinsicHeight();
                    }
                    final TextPaint paint = this.getPaint();
                    String s2;
                    final String s = s2 = this.getText().toString();
                    if (this.getTransformationMethod() != null) {
                        s2 = this.getTransformationMethod().getTransformation((CharSequence)s, (View)this).toString();
                    }
                    final Rect rect = new Rect();
                    ((Paint)paint).getTextBounds(s2, 0, s2.length(), rect);
                    n = (n2 - Math.min(rect.height(), this.getLayout().getHeight()) - this.getPaddingTop() - n - this.l - this.getPaddingBottom()) / 2;
                    if (this.k != n) {
                        this.k = n;
                        this.g(false);
                    }
                }
            }
            else {
                this.k = 0;
                n2 = this.o;
                final int n3 = 1;
                if (n2 == 1 || n2 == 3) {
                    this.j = 0;
                    this.g(false);
                    return;
                }
                if ((n2 = this.i) == 0) {
                    n2 = this.h.getIntrinsicWidth();
                }
                final TextPaint paint2 = this.getPaint();
                String s3 = this.getText().toString();
                if (this.getTransformationMethod() != null) {
                    s3 = this.getTransformationMethod().getTransformation((CharSequence)s3, (View)this).toString();
                }
                final int n4 = (n - Math.min((int)((Paint)paint2).measureText(s3), this.getLayout().getEllipsizedWidth()) - ik.i((View)this) - n2 - this.l - ik.j((View)this)) / 2;
                if (ik.f((View)this) != 1) {
                    n = 0;
                }
                else {
                    n = 1;
                }
                if (this.o != 4) {
                    n2 = 0;
                }
                else {
                    n2 = n3;
                }
                if (n != n2) {
                    n = -n4;
                }
                else {
                    n = n4;
                }
                if (this.j != n) {
                    this.j = n;
                    this.g(false);
                }
            }
        }
    }
    
    private final boolean i() {
        final int o = this.o;
        return o == 3 || o == 4;
    }
    
    private final boolean j() {
        final int o = this.o;
        return o == 1 || o == 2;
    }
    
    private final boolean k() {
        final int o = this.o;
        return o == 16 || o == 32;
    }
    
    private final boolean l() {
        final ndq d = this.d;
        return d != null && !d.n;
    }
    
    public final void b(final nfi nfi) {
        if (this.l()) {
            this.d.d(nfi);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }
    
    public final void c(final ColorStateList j) {
        if (this.l()) {
            final ndq d = this.d;
            if (d.j != j) {
                d.j = j;
                if (d.a() != null) {
                    d.a().setTintList(d.j);
                }
            }
        }
        else {
            final oo a = super.a;
            if (a != null) {
                a.g(j);
            }
        }
    }
    
    public final void d(final PorterDuff$Mode i) {
        if (this.l()) {
            final ndq d = this.d;
            if (d.i != i) {
                d.i = i;
                if (d.a() != null && d.i != null) {
                    d.a().setTintMode(d.i);
                }
            }
        }
        else {
            final oo a = super.a;
            if (a != null) {
                a.h(i);
            }
        }
    }
    
    public final boolean e() {
        final ndq d = this.d;
        return d != null && d.o;
    }
    
    public final ColorStateList getBackgroundTintList() {
        ColorStateList list;
        if (this.l()) {
            list = this.d.j;
        }
        else {
            final oo a = super.a;
            if (a != null) {
                list = a.a();
            }
            else {
                list = null;
            }
        }
        return list;
    }
    
    public final PorterDuff$Mode getBackgroundTintMode() {
        PorterDuff$Mode porterDuff$Mode;
        if (this.l()) {
            porterDuff$Mode = this.d.i;
        }
        else {
            final oo a = super.a;
            if (a != null) {
                porterDuff$Mode = a.b();
            }
            else {
                porterDuff$Mode = null;
            }
        }
        return porterDuff$Mode;
    }
    
    public final boolean isChecked() {
        return this.m;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l()) {
            nfa.b((View)this, this.d.a());
        }
    }
    
    protected final int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 2);
        if (this.e()) {
            mergeDrawableStates(onCreateDrawableState, MaterialButton.b);
        }
        if (this.m) {
            mergeDrawableStates(onCreateDrawableState, MaterialButton.c);
        }
        return onCreateDrawableState;
    }
    
    @Override
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)this.a());
        accessibilityEvent.setChecked(this.m);
    }
    
    @Override
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)this.a());
        accessibilityNodeInfo.setCheckable(this.e());
        accessibilityNodeInfo.setChecked(this.m);
        accessibilityNodeInfo.setClickable(this.isClickable());
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof ndp)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final ndp ndp = (ndp)parcelable;
        super.onRestoreInstanceState(ndp.d);
        this.setChecked(ndp.a);
    }
    
    public final Parcelable onSaveInstanceState() {
        final ndp ndp = new ndp(super.onSaveInstanceState());
        ndp.a = this.m;
        return (Parcelable)ndp;
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.h(n, n2);
    }
    
    protected final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        super.onTextChanged(charSequence, n, n2, n3);
        this.h(this.getMeasuredWidth(), this.getMeasuredHeight());
    }
    
    public final boolean performClick() {
        this.toggle();
        return super.performClick();
    }
    
    public final void setBackground(final Drawable backgroundDrawable) {
        this.setBackgroundDrawable(backgroundDrawable);
    }
    
    public final void setBackgroundColor(final int n) {
        if (this.l()) {
            final ndq d = this.d;
            if (d.a() != null) {
                d.a().setTint(n);
            }
            return;
        }
        super.setBackgroundColor(n);
    }
    
    @Override
    public final void setBackgroundDrawable(final Drawable drawable) {
        if (!this.l()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable != this.getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.d.c();
            super.setBackgroundDrawable(drawable);
            return;
        }
        this.getBackground().setState(drawable.getState());
    }
    
    @Override
    public final void setBackgroundResource(final int n) {
        Drawable b;
        if (n != 0) {
            b = lp.b(this.getContext(), n);
        }
        else {
            b = null;
        }
        this.setBackgroundDrawable(b);
    }
    
    public final void setBackgroundTintList(final ColorStateList list) {
        this.c(list);
    }
    
    public final void setBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        this.d(porterDuff$Mode);
    }
    
    public final void setChecked(final boolean m) {
        if (this.e() && this.isEnabled() && this.m != m) {
            this.m = m;
            this.refreshDrawableState();
            if (this.n) {
                return;
            }
            this.n = true;
            final Iterator iterator = this.e.iterator();
            while (iterator.hasNext()) {
                ((ndo)iterator.next()).a();
            }
            this.n = false;
        }
    }
    
    public final void setElevation(final float elevation) {
        super.setElevation(elevation);
        if (this.l()) {
            this.d.a().f(elevation);
        }
    }
    
    public final void toggle() {
        this.setChecked(this.m ^ true);
    }
}
