// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.internal;

import android.os.Parcelable;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Checkable;

public class CheckableImageButton extends ov implements Checkable
{
    private static final int[] c;
    public boolean a;
    public boolean b;
    private boolean d;
    
    static {
        c = new int[] { 16842912 };
    }
    
    public CheckableImageButton(final Context context) {
        this(context, null);
    }
    
    public CheckableImageButton(final Context context, final AttributeSet set) {
        this(context, set, 2130969190);
    }
    
    public CheckableImageButton(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = true;
        this.d = true;
        ik.F((View)this, new neg(this));
    }
    
    public final boolean isChecked() {
        return this.a;
    }
    
    public final int[] onCreateDrawableState(final int n) {
        if (this.a) {
            return mergeDrawableStates(super.onCreateDrawableState(n + 1), CheckableImageButton.c);
        }
        return super.onCreateDrawableState(n);
    }
    
    protected final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof neh)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final neh neh = (neh)parcelable;
        super.onRestoreInstanceState(neh.d);
        this.setChecked(neh.a);
    }
    
    protected final Parcelable onSaveInstanceState() {
        final neh neh = new neh(super.onSaveInstanceState());
        neh.a = this.a;
        return (Parcelable)neh;
    }
    
    public final void setChecked(final boolean a) {
        if (this.b && this.a != a) {
            this.a = a;
            this.refreshDrawableState();
            this.sendAccessibilityEvent(2048);
        }
    }
    
    public final void setPressed(final boolean pressed) {
        if (this.d) {
            super.setPressed(pressed);
        }
    }
    
    public final void toggle() {
        this.setChecked(this.a ^ true);
    }
}
