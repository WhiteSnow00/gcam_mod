// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.wear.wearappv2.ui;

import android.graphics.Rect;
import android.text.TextUtils;
import android.graphics.Canvas;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;

public final class WearZoomUi extends View
{
    private final Paint a;
    private final Paint b;
    private final Paint c;
    private final float d;
    private final float e;
    private float f;
    
    public WearZoomUi(final Context context, final AttributeSet set) {
        super(context, set, 0, 0);
        this.f = 240.0f;
        final Resources resources = context.getResources();
        this.d = resources.getDimension(2131166377);
        this.e = resources.getDimension(2131166379);
        final Paint a = new Paint();
        (this.a = a).setColor(aai.b(context, 2131100899));
        a.setStyle(Paint$Style.STROKE);
        a.setAntiAlias(true);
        a.setAlpha(143);
        a.setStrokeCap(Paint$Cap.ROUND);
        a.setStrokeWidth(resources.getDimension(2131166378));
        final Paint b = new Paint();
        (this.b = b).setColor(aai.b(context, 17170443));
        b.setAntiAlias(true);
        final Paint c = new Paint();
        (this.c = c).setColor(aai.b(context, 2131101501));
        c.setAntiAlias(true);
        c.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        c.setTextSize(resources.getDimension(2131166380));
    }
    
    public final float a() {
        return this.getWidth() / 2.0f;
    }
    
    public final float b() {
        return this.getHeight() / 2.0f;
    }
    
    protected final void onDraw(final Canvas canvas) {
        final float n = Math.min(this.getWidth(), this.getHeight()) / 2 - this.d;
        canvas.drawArc(this.a() - n, this.b() - n, this.a() + n, this.b() + n, 150.0f, 60.0f, false, this.a);
        final double n2 = this.f;
        final double n3 = n;
        Double.isNaN(n2);
        final double n4 = n2 - 90.0;
        final double cos = Math.cos(Math.toRadians(n4));
        Double.isNaN(n3);
        final double n5 = this.a();
        Double.isNaN(n5);
        final float n6 = (float)(cos * n3 + n5);
        final double sin = Math.sin(Math.toRadians(n4));
        Double.isNaN(n3);
        final double n7 = this.b();
        Double.isNaN(n7);
        final float n8 = (float)(sin * n3 + n7);
        canvas.drawCircle(n6, n8, this.e, this.b);
        if (TextUtils.isEmpty((CharSequence)null)) {
            return;
        }
        canvas.rotate(180.0f, n6, n8);
        new Rect();
        throw null;
    }
    
    public final void setPressed(final boolean pressed) {
        this.isPressed();
        super.setPressed(pressed);
    }
}
