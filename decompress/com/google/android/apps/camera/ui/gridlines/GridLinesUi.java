// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.gridlines;

import android.graphics.Canvas;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Map;
import android.view.View;

public class GridLinesUi extends View
{
    private static final inm c;
    private static final inm d;
    private static final inm e;
    private static final inm f;
    private static final inm g;
    public final Map a;
    public final inl b;
    
    static {
        c = new inj();
        d = new inn(new float[] { 0.0f, 1.0f }, false, true);
        e = new inn(new float[] { 0.33333334f, 0.6666666f }, false, false);
        f = new inn(new float[] { 0.25f, 0.5f, 0.75f }, true, false);
        g = new inn(new float[] { 0.38196602f, 0.618034f }, false, false);
    }
    
    public GridLinesUi(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = nnx.r(inp.a, GridLinesUi.d, inp.b, GridLinesUi.e, inp.c, GridLinesUi.f, inp.d, GridLinesUi.g);
        final Paint paint = new Paint();
        paint.setStrokeWidth((float)context.getResources().getDimensionPixelSize(2131165736));
        paint.setColor(a(context.getResources()));
        final Paint paint2 = new Paint();
        paint2.setStrokeWidth((float)context.getResources().getDimensionPixelSize(2131165736));
        paint2.setColor(a(context.getResources()));
        (this.b = new inl(this, paint, paint2)).a(GridLinesUi.c);
    }
    
    private static int a(final Resources resources) {
        return resources.getColor(2131100888, (Resources$Theme)null);
    }
    
    public final void onDraw(final Canvas canvas) {
        final inl b = this.b;
        if (b.b.g) {
            return;
        }
        b.d.b(canvas, b.a);
        b.e.b(canvas, b.a);
        b.g.b(canvas, b.a);
        b.h.b(canvas, b.a);
        b.f.b(canvas, b.a);
        b.i.b(canvas, b.a);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final inl b2 = this.b;
        b2.a.set((float)n, (float)n2, (float)n3, (float)n4);
        b2.b();
        b2.c.invalidate();
    }
}
