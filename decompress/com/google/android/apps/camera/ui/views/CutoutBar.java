// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.views;

import android.graphics.Paint;
import android.graphics.Canvas;
import android.os.Trace;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

public class CutoutBar extends View
{
    public static final nsd a;
    public final cxc b;
    public float c;
    public float d;
    public float e;
    public jcb f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/ui/views/CutoutBar");
    }
    
    public CutoutBar(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = jcb.a;
        final cxl a = ((bmp)context).a();
        this.b = cxe.a(a, (int)a.a(cxe.a).c());
    }
    
    public final void a() {
        Trace.beginSection("FrontLensIndicator:applyOrientation");
        jvu.r(this, this.f);
        Trace.endSection();
    }
    
    protected final void onDraw(final Canvas canvas) {
        final float c = this.c;
        final float d = this.d;
        final float e = this.e;
        final Paint paint = new Paint();
        paint.setColor(-16777216);
        paint.setAntiAlias(true);
        canvas.drawCircle(c, d, e, paint);
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.a();
        }
    }
    
    protected final void onMeasure(final int n, final int n2) {
        Trace.beginSection("FrontLensIndicator:onMeasure");
        if (jcb.d(this.f)) {
            super.onMeasure(n, n2);
        }
        else {
            super.onMeasure(n2, n);
        }
        Trace.endSection();
    }
}
