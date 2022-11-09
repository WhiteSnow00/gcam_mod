// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.debugui;

import j$.util.function.Consumer;
import java.util.Collection;
import j$.util.Collection$_EL;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.List;
import android.graphics.RectF;
import android.graphics.Paint;

public class DebugCanvasView extends def
{
    public final Paint a;
    public final Paint b;
    public final RectF c;
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    private volatile List k;
    private volatile List l;
    private volatile MeteringRectangle m;
    private volatile nia n;
    private volatile float o;
    private volatile float p;
    private volatile float q;
    private volatile nia r;
    private volatile List s;
    
    public DebugCanvasView(final Context context, final AttributeSet set) {
        super(context, set);
        final Paint a = new Paint();
        this.a = a;
        final Paint b = new Paint();
        this.b = b;
        final Paint e = new Paint();
        this.e = e;
        final Paint f = new Paint();
        this.f = f;
        final Paint g = new Paint();
        this.g = g;
        final Paint h = new Paint();
        this.h = h;
        final Paint i = new Paint();
        this.i = i;
        final Paint j = new Paint();
        this.j = j;
        this.k = nns.l();
        this.l = nns.l();
        a.setAntiAlias(true);
        a.setStyle(Paint$Style.STROKE);
        a.setStrokeWidth(3.0f);
        a.setColor(-256);
        a.setTextSize(48.0f);
        b.setAntiAlias(true);
        b.setStyle(Paint$Style.STROKE);
        b.setStrokeWidth(3.0f);
        b.setColor(-1);
        b.setTextSize(30.0f);
        e.setAntiAlias(true);
        e.setStyle(Paint$Style.STROKE);
        e.setStrokeWidth(3.0f);
        e.setStrokeMiter(0.6f);
        e.setColor(-16776961);
        e.setTextSize(64.0f);
        f.setColor(-65536);
        f.setStrokeWidth(16.0f);
        f.setStyle(Paint$Style.STROKE);
        g.setColor(-16711936);
        g.setStrokeWidth(3.0f);
        g.setStyle(Paint$Style.STROKE);
        g.setTextSize(48.0f);
        h.setColor(-65536);
        h.setStrokeWidth(4.0f);
        h.setStyle(Paint$Style.STROKE);
        i.setColor(-1);
        i.setStrokeWidth(2.0f);
        i.setStyle(Paint$Style.STROKE);
        j.setColor(-1);
        j.setStrokeWidth(2.0f);
        j.setStyle(Paint$Style.STROKE);
        j.setTextSize(48.0f);
        this.c = new RectF();
        this.m = null;
        this.n = null;
    }
    
    public final RectF a(final Canvas canvas, final Rect rect, final Paint paint) {
        final RectF rectF = new RectF(rect);
        this.c().mapRect(rectF);
        canvas.drawRect(rectF, paint);
        return rectF;
    }
    
    public final void b(final Canvas canvas, final Point point) {
        if (point == null) {
            return;
        }
        final float[] array = { (float)point.x, (float)point.y };
        this.c().mapPoints(array);
        final float n = array[0];
        final float n2 = array[1];
        canvas.drawLine(n - 15.0f, n2, n + 15.0f, n2, this.a);
        final float n3 = array[0];
        final float n4 = array[1];
        canvas.drawLine(n3, n4 - 15.0f, n3, n4 + 15.0f, this.a);
    }
    
    protected final void onDraw(final Canvas canvas) {
        if (!this.d()) {
            return;
        }
        Collection$_EL.stream((Collection)this.k).forEach((Consumer)new deb(this, canvas, 1));
        if (!this.l.isEmpty()) {
            Collection$_EL.stream((Collection)this.l).forEach((Consumer)new deb(this, canvas));
        }
        final StringBuilder sb = new StringBuilder(19);
        sb.append("srp:");
        sb.append(0.0f);
        canvas.drawText(sb.toString(), this.c.left + 25.0f, this.c.bottom - 25.0f, this.j);
        final StringBuilder sb2 = new StringBuilder(19);
        sb2.append("clp:");
        sb2.append(0.0f);
        canvas.drawText(sb2.toString(), this.c.left + 25.0f, this.c.bottom - 75.0f, this.j);
        final StringBuilder sb3 = new StringBuilder(18);
        sb3.append("tp:");
        sb3.append(0.0f);
        canvas.drawText(sb3.toString(), this.c.left + 25.0f, this.c.bottom - 125.0f, this.j);
        canvas.drawRect(this.c, this.f);
        super.onDraw(canvas);
    }
}
