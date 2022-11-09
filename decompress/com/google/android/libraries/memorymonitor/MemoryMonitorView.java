// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.memorymonitor;

import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import android.content.res.Configuration;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.view.GestureDetector$OnGestureListener;
import android.app.ActivityManager;
import android.util.AttributeSet;
import android.content.Context;
import android.view.GestureDetector;
import android.graphics.Paint;
import android.content.res.Resources;
import android.view.View;

public class MemoryMonitorView extends View
{
    public static final float a;
    private static final Runtime h;
    public final long b;
    public final long c;
    public final long d;
    public final float e;
    public final lsa f;
    public volatile lrz g;
    private Resources i;
    private int j;
    private int k;
    private Paint l;
    private Paint m;
    private Paint n;
    private float o;
    private float p;
    private float q;
    private final GestureDetector r;
    private final lsc s;
    
    static {
        a = (float)b((double)(h = Runtime.getRuntime()).maxMemory());
    }
    
    public MemoryMonitorView(final Context context, final AttributeSet set) {
        super(context, set);
        this.f = new lsa();
        this.g = new lrz(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
        final lsc s = new lsc(this);
        this.s = s;
        this.i = context.getResources();
        this.j = a(context, 45);
        this.k = a(context, 140);
        this.l = new Paint();
        (this.m = new Paint()).setStrokeWidth((float)a(context, 1));
        this.p = (float)a(context, 2);
        this.q = (float)a(context, 7);
        (this.n = new Paint()).setColor(-16777216);
        this.n.setTextSize(this.q);
        final ActivityManager activityManager = (ActivityManager)this.getContext().getSystemService("activity");
        this.b = activityManager.getMemoryClass();
        this.c = activityManager.getLargeMemoryClass();
        this.d = MemoryMonitorView.h.maxMemory();
        this.e = (float)(this.i.getDisplayMetrics().heightPixels / 2);
        this.r = new GestureDetector(context, (GestureDetector$OnGestureListener)s);
    }
    
    public static int a(final Context context, final int n) {
        return Math.round(n * context.getResources().getDisplayMetrics().density);
    }
    
    public static long b(final double n) {
        return Math.round(n / 1048576.0);
    }
    
    private final float c(final long n) {
        final long d = this.d;
        if (d == 0L) {
            return 0.0f;
        }
        return n / (float)d * this.o;
    }
    
    private final float d(long b, final int n, final int n2, final Canvas canvas, int height) {
        this.l.setColor(height);
        final float c = this.c(b);
        final float n3 = this.getWidth() * n2 / 3.0f;
        final float n4 = this.getHeight() - (float)n - c;
        final RectF rectF = new RectF(n3, n4, this.getWidth() / 3.0f + n3, n4 + c);
        final float p5 = this.p;
        canvas.drawRoundRect(rectF, p5, p5, this.l);
        height = this.getHeight();
        final float q = this.q;
        b = b((double)b);
        final StringBuilder sb = new StringBuilder(21);
        sb.append(b);
        sb.append("M");
        canvas.drawText(sb.toString(), n2 * this.getWidth() / 3.0f, height - n - c + c / 2.0f + q / 2.0f, this.n);
        return c;
    }
    
    private final void e(final long n, final int n2, final Canvas canvas, final int n3) {
        this.d(n, 0, n2, canvas, n3);
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        this.j = a(this.getContext(), 45);
        this.k = a(this.getContext(), 140);
    }
    
    public final void onDraw(final Canvas canvas) {
        this.l.setColor(-7829368);
        this.o = this.getHeight() * 0.5f;
        final RectF rectF = new RectF(0.0f, this.getHeight() - this.o, (float)this.getWidth(), (float)this.getHeight());
        final float p = this.p;
        canvas.drawRoundRect(rectF, p, p, this.l);
        final lrz g = this.g;
        final long c = this.f.c;
        final int n = (int)(this.d(g.n - c, 0, 0, canvas, -16711936) + 0.0f);
        if (c > 0L) {
            this.d(c, n, 0, canvas, -2998243);
        }
        this.e(g.a, 1, canvas, -256);
        this.e(g.b, 2, canvas, -13068292);
        final float n2 = this.getHeight() - this.c(g.o);
        this.m.setColor(-16777216);
        canvas.drawLine(0.0f, n2, this.getWidth() / 3.0f, n2, this.m);
        final float n3 = this.getHeight() - this.c(g.p);
        this.m.setColor(-2998243);
        canvas.drawLine(0.0f, n3, this.getWidth() / 3.0f, n3, this.m);
    }
    
    protected final void onMeasure(int n, int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        n = View$MeasureSpec.getSize(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        n2 = View$MeasureSpec.getSize(n2);
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                n = Math.min(this.j, n);
            }
            else {
                n = this.j;
            }
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                n2 = Math.min(this.k, n2);
            }
            else {
                n2 = this.k;
            }
        }
        this.setMeasuredDimension(n, n2);
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            final lsc s = this.s;
            final int d = lsc.d;
            final float b = s.b;
            if (b != s.a) {
                s.a("Inflating heap utilization to %.2f%% (%.2f MB)", b * 100.0f, s.b * MemoryMonitorView.a);
                final lsa f = s.c.f;
                final long n = f.c + (long)((s.b - lsa.a()) * f.a);
                while (true) {
                    while (f.c > n) {
                        if (!f.b.isEmpty()) {
                            f.c -= ((byte[])f.b.pop()).length;
                        }
                        else {
                            while (true) {
                                final long c = f.c;
                                if (c >= n) {
                                    return this.r.onTouchEvent(motionEvent);
                                }
                                final int n2 = (int)Math.min(n - c, 1048576L);
                                f.b.push(new byte[n2]);
                                f.c += n2;
                            }
                        }
                    }
                    continue;
                }
            }
            final lrz g = s.c.g;
            final long b2 = b((double)g.o);
            final long b3 = b((double)g.p);
            final long b4 = b((double)s.c.d);
            final MemoryMonitorView c2 = s.c;
            final long b5 = c2.b;
            final long c3 = c2.c;
            final StringBuilder sb = new StringBuilder(418);
            sb.append("Red: Artificially inflated Dalvik heap alloc.\nGreen: Dalvik heap alloc.\nYellow: Native heap alloc\nBlue: Other private dirty (GL RAM)\nBlack line: Dalvik heap size: ");
            sb.append(b2);
            sb.append("MB\nRed line: Max Dalvik heap memory: ");
            sb.append(b3);
            sb.append("MB\nGrey background bounds: large heap size: ");
            sb.append(b4);
            sb.append("MB (should be the same as the red line)\nDefault heap: ");
            sb.append(b5);
            sb.append(" MB; large heap: ");
            sb.append(c3);
            sb.append(" MB");
            s.a(sb.toString(), new Object[0]);
        }
        return this.r.onTouchEvent(motionEvent);
    }
}
