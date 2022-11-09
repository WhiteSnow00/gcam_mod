// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.focusindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;

public class FocusIndicatorRingView extends View
{
    public final dos a;
    public final dou b;
    public PointF c;
    public final float d;
    private jcb e;
    private boolean f;
    
    public FocusIndicatorRingView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = new dot();
        final ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new OvalShape());
        final Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Paint$Style.FILL);
        this.b = new dov(shapeDrawable);
        this.d = context.getResources().getDimension(2131165466) / 2.0f;
    }
    
    FocusIndicatorRingView(final Context context, final dos a, final dou b) {
        super(context);
        this.a = a;
        this.b = b;
        this.d = context.getResources().getDimension(2131165466) / 2.0f;
    }
    
    static int a(final jcb jcb) {
        final jcb a = jcb.a;
        final kra a2 = kra.a;
        switch (jcb.ordinal()) {
            default: {
                throw new IllegalArgumentException();
            }
            case 3: {
                return 180;
            }
            case 2: {
                return 270;
            }
            case 1: {
                return 90;
            }
            case 0: {
                return 0;
            }
        }
    }
    
    public final void b(final PointF c) {
        this.c = c;
        this.setX(c.x - this.getWidth() / 2);
        this.setY(c.y - this.getHeight() / 2);
    }
    
    protected final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        this.a.a(canvas);
        this.b.a(canvas);
    }
    
    protected final void onLayout(final boolean b, int width, int height, final int n, final int n2) {
        super.onLayout(b, width, height, n, n2);
        final View view = (View)this.getParent();
        final jcb e = this.e;
        final Context context = this.getContext();
        final jcb b2 = jcb.b(iwu.a(context), iwu.d(context), view.getMeasuredWidth(), view.getMeasuredHeight());
        this.e = b2;
        if (this.f) {
            final PointF c = this.c;
            width = view.getWidth();
            height = view.getHeight();
            kra kra = null;
            switch (a(b2) - a(e)) {
                default: {
                    throw new IllegalArgumentException();
                }
                case 0: {
                    kra = kra.a;
                    break;
                }
                case -90:
                case 270: {
                    kra = kra.b;
                    break;
                }
                case -180:
                case 180: {
                    kra = kra.c;
                    break;
                }
                case -270:
                case 90: {
                    kra = kra.d;
                    break;
                }
            }
            if (c != null) {
                final PointF pointF = new PointF();
                switch (kra.ordinal()) {
                    default: {
                        pointF.set(c.x, c.y);
                        break;
                    }
                    case 3: {
                        pointF.set(c.y, height - c.x);
                        break;
                    }
                    case 2: {
                        pointF.set(width - c.x, height - c.y);
                        break;
                    }
                    case 1: {
                        pointF.set(width - c.y, c.x);
                        break;
                    }
                }
                this.b(pointF);
            }
        }
        this.f = true;
    }
    
    protected final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.a.b(n, n2);
        this.b.b(n, n2);
    }
}
