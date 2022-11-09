// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.behavior;

import android.view.ViewGroup;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class SwipeDismissBehavior extends zv
{
    public abq a;
    public int b;
    public float c;
    public float d;
    public float e;
    private boolean f;
    private final abp g;
    
    public SwipeDismissBehavior() {
        this.b = 2;
        this.c = 0.5f;
        this.d = 0.0f;
        this.e = 0.5f;
        this.g = new ncu(this);
    }
    
    public static float x(final float n) {
        return Math.min(Math.max(0.0f, n), 1.0f);
    }
    
    @Override
    public boolean c(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        boolean f = this.f;
        switch (motionEvent.getActionMasked()) {
            case 1:
            case 3: {
                this.f = false;
                break;
            }
            case 0: {
                f = coordinatorLayout.l(view, (int)motionEvent.getX(), (int)motionEvent.getY());
                this.f = f;
                break;
            }
        }
        if (f) {
            if (this.a == null) {
                this.a = abq.b(coordinatorLayout, this.g);
            }
            return this.a.j(motionEvent);
        }
        return false;
    }
    
    @Override
    public final boolean d(final CoordinatorLayout coordinatorLayout, final View view, final int n) {
        if (ik.d(view) == 0) {
            ik.K(view, 1);
            ik.C(view, 1048576);
            if (this.w(view)) {
                ik.aa(view, iz.f, new ncv(this));
            }
        }
        return false;
    }
    
    @Override
    public final boolean e(final CoordinatorLayout coordinatorLayout, final View view, final MotionEvent motionEvent) {
        final abq a = this.a;
        if (a != null) {
            a.e(motionEvent);
            return true;
        }
        return false;
    }
    
    public boolean w(final View view) {
        return true;
    }
}
