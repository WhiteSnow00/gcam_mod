// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.captureframe;

import j$.util.function.Consumer;
import java.util.Collection;
import j$.util.Collection$_EL;
import android.graphics.Canvas;
import android.graphics.BlendMode;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class CaptureFrameUi extends View
{
    public final RectF a;
    public final Paint b;
    private final List c;
    private final float d;
    
    public CaptureFrameUi(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new RectF();
        final float dimension = this.getResources().getDimension(2131165490);
        this.d = this.getResources().getDimension(2131165315);
        final Paint b = new Paint();
        (this.b = b).setStrokeWidth((float)this.getResources().getDimensionPixelSize(2131165491));
        b.setAntiAlias(true);
        b.setStyle(Paint$Style.STROKE);
        b.setBlendMode(BlendMode.DST_ATOP);
        this.c = nns.p(new ihi(this, b, 1, dimension), new ihi(this, b, 2, dimension), new ihi(this, b, 3, dimension), new ihi(this, b, 4, dimension));
    }
    
    public final void onDraw(final Canvas canvas) {
        Collection$_EL.stream((Collection)this.c).forEach((Consumer)new ihh(this, canvas));
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final RectF a = this.a;
        final float d = this.d;
        a.set(n + d, n2 + d, n3 - d, n4 - d);
    }
}
