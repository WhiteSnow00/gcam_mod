// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.bottombar;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.widget.ImageButton;

public class RoundedStateView extends ImageButton
{
    private static final float INTER_CIRCLE_RING_ALPHA = 0.32f;
    private Paint borderStrokePaint;
    private int buttonCenterX;
    private int buttonCenterY;
    private Paint mainCircleButtonPaint;
    private float rippleRingDiameterEnd;
    
    public RoundedStateView(final Context context, final AttributeSet set) {
        super(context, set);
        this.initialize();
    }
    
    private void initialize() {
        this.setClickable(true);
        this.rippleRingDiameterEnd = this.getResources().getDimension(R$dimen.rounded_thumbnail_ripple_ring_diameter_max);
        (this.borderStrokePaint = new Paint(1)).setStyle(Paint$Style.STROKE);
        this.borderStrokePaint.setStrokeWidth((float)jvu.u(2.0f));
        this.borderStrokePaint.setColor(-1);
        (this.mainCircleButtonPaint = new Paint()).setAntiAlias(true);
        this.mainCircleButtonPaint.setColor(Color.argb(81, 0, 0, 0));
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, this.getResources().getDimension(R$dimen.bottom_border_ring_diameter), this.borderStrokePaint);
        canvas.drawCircle((float)this.buttonCenterX, (float)this.buttonCenterY, this.getResources().getDimension(R$dimen.bottom_inner_circle_diameter), this.mainCircleButtonPaint);
        canvas.restore();
    }
    
    protected void onMeasure(int n, final int n2) {
        n = (int)this.rippleRingDiameterEnd;
        this.setMeasuredDimension(n, n);
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        this.buttonCenterX = n / 2;
        this.buttonCenterY = n2 / 2;
        super.onSizeChanged(n, n2, n3, n4);
    }
}
