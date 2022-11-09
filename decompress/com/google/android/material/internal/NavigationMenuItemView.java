// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.internal;

import android.view.ViewGroup$LayoutParams;
import android.view.ViewStub;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.CheckedTextView;

public class NavigationMenuItemView extends nej implements nk
{
    private static final int[] d;
    public boolean c;
    private int e;
    private final CheckedTextView i;
    private FrameLayout j;
    private my k;
    private final ht l;
    
    static {
        d = new int[] { 16842912 };
    }
    
    public NavigationMenuItemView(final Context context) {
        this(context, null);
    }
    
    public NavigationMenuItemView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public NavigationMenuItemView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final nek l = new nek(this);
        this.l = l;
        this.q(0);
        LayoutInflater.from(context).inflate(2131623997, (ViewGroup)this, true);
        this.e = context.getResources().getDimensionPixelSize(2131165392);
        final CheckedTextView i = (CheckedTextView)this.findViewById(2131427545);
        (this.i = i).setDuplicateParentStateEnabled(true);
        ik.F((View)i, l);
    }
    
    @Override
    public final my a() {
        return this.k;
    }
    
    @Override
    public final boolean e() {
        return false;
    }
    
    @Override
    public final void f(my k) {
        this.k = k;
        final int a = k.a;
        if (a > 0) {
            this.setId(a);
        }
        int visibility;
        if (!k.isVisible()) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        this.setVisibility(visibility);
        if (this.getBackground() == null) {
            final TypedValue typedValue = new TypedValue();
            StateListDrawable stateListDrawable;
            if (this.getContext().getTheme().resolveAttribute(2130968846, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(NavigationMenuItemView.d, (Drawable)new ColorDrawable(typedValue.data));
                stateListDrawable.addState(NavigationMenuItemView.EMPTY_STATE_SET, (Drawable)new ColorDrawable(0));
            }
            else {
                stateListDrawable = null;
            }
            ik.G((View)this, (Drawable)stateListDrawable);
        }
        final boolean checkable = k.isCheckable();
        this.refreshDrawableState();
        if (this.c != checkable) {
            this.c = checkable;
            this.l.f((View)this.i, 2048);
        }
        final boolean checked = k.isChecked();
        this.refreshDrawableState();
        this.i.setChecked(checked);
        this.setEnabled(k.isEnabled());
        this.i.setText(k.d);
        final Drawable icon = k.getIcon();
        if (icon != null) {
            final int e = this.e;
            icon.setBounds(0, 0, e, e);
        }
        jp.e((TextView)this.i, icon, null, null);
        final View actionView = k.getActionView();
        if (actionView != null) {
            if (this.j == null) {
                this.j = (FrameLayout)((ViewStub)this.findViewById(2131427544)).inflate();
            }
            this.j.removeAllViews();
            this.j.addView(actionView);
        }
        this.setContentDescription(k.l);
        ((View)this).setTooltipText(k.m);
        k = this.k;
        if (k.d == null && k.getIcon() == null && this.k.getActionView() != null) {
            this.i.setVisibility(8);
            final FrameLayout j = this.j;
            if (j != null) {
                final qz layoutParams = (qz)j.getLayoutParams();
                layoutParams.width = -1;
                this.j.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            }
        }
        else {
            this.i.setVisibility(0);
            final FrameLayout i = this.j;
            if (i != null) {
                final qz layoutParams2 = (qz)i.getLayoutParams();
                layoutParams2.width = -2;
                this.j.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            }
        }
    }
    
    protected final int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        final my k = this.k;
        if (k != null && k.isCheckable() && this.k.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, NavigationMenuItemView.d);
        }
        return onCreateDrawableState;
    }
}
