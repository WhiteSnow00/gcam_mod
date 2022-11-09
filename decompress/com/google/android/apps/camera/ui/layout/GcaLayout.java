// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.layout;

import android.os.Trace;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Rect;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.support.constraint.ConstraintLayout;

public class GcaLayout extends ConstraintLayout
{
    public njp d;
    
    public GcaLayout(final Context context) {
        super(context);
        this.d(context);
    }
    
    public GcaLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.d(context);
    }
    
    public GcaLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d(context);
    }
    
    private final void d(final Context context) {
        ((ioa)((egq)context).b(ioa.class)).a(this);
    }
    
    private static final void e(final View view, final Rect rect, final ct ct) {
        if (rect.width() >= 0 && rect.height() >= 0) {
            ct.f(view.getId(), rect.height());
            ct.g(view.getId(), rect.width());
            ct.e(view.getId(), 3, 0, 3, rect.top);
            ct.e(view.getId(), 6, 0, 6, rect.left);
        }
    }
    
    @Override
    public final cr bA(final AttributeSet set) {
        return new iob(this.getContext(), set);
    }
    
    @Override
    public final cr bz() {
        return new iob();
    }
    
    @Override
    protected final boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof iob;
    }
    
    @Override
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final Object tag = this.getTag();
        nov.z(tag);
        Trace.beginSection(String.valueOf(tag.toString()).concat(".onLayout"));
        super.onLayout(b, n, n2, n3, n4);
        Trace.endSection();
    }
    
    public void onMeasure(final int n, final int n2) {
        final Object tag = this.getTag();
        nov.z(tag);
        Trace.beginSection(String.valueOf(tag.toString()).concat(".onMeasure"));
        final Object a = this.d.a();
        nov.z(a);
        final inw inw = (inw)a;
        final ins b = inw.b;
        final ct ct = new ct();
        ct.d(this);
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final int z = ((iob)child.getLayoutParams()).Z;
            if (z != 0) {
                switch (z - 1) {
                    default: {
                        e(child, b.n, ct);
                        break;
                    }
                    case 11: {
                        e(child, b.m, ct);
                        break;
                    }
                    case 10: {
                        e(child, b.d, ct);
                        break;
                    }
                    case 9: {
                        e(child, b.c, ct);
                        break;
                    }
                    case 8: {
                        e(child, b.j, ct);
                        break;
                    }
                    case 7: {
                        e(child, b.g, ct);
                        break;
                    }
                    case 6: {
                        e(child, b.h, ct);
                        break;
                    }
                    case 5: {
                        e(child, b.l, ct);
                        break;
                    }
                    case 4: {
                        final iod c = inw.c;
                        if (c != null) {
                            ct.f(child.getId(), c.a.getHeight());
                            ct.g(child.getId(), c.a.getWidth());
                            ct.e(child.getId(), 3, 0, 3, c.c.top);
                            ct.e(child.getId(), 6, 0, 6, c.c.left);
                            ct.e(child.getId(), 7, 0, 7, c.c.right);
                            ct.e(child.getId(), 4, 0, 4, c.c.bottom);
                            child.setPadding(c.b.left, c.b.top, c.b.right, c.b.bottom);
                            break;
                        }
                        e(child, b.f, ct);
                        break;
                    }
                    case 3: {
                        e(child, b.i, ct);
                        break;
                    }
                    case 2: {
                        e(child, b.f, ct);
                        break;
                    }
                    case 1: {
                        e(child, b.e, ct);
                        break;
                    }
                    case 0: {
                        e(child, b.k, ct);
                        break;
                    }
                }
            }
            else {
                child.requestLayout();
            }
        }
        ct.b(this);
        super.onMeasure(n, n2);
        Trace.endSection();
    }
}
