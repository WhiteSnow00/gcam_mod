import android.graphics.PathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint$Style;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.Color;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.support.wearable.complications.rendering.ComplicationStyle$Builder;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.text.TextPaint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uq
{
    public final TextPaint a;
    public final TextPaint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final us h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final ColorFilter l;
    
    public uq(final us h, final boolean i, final boolean j, final boolean k) {
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        final boolean antiAlias = !i || !j;
        us a = h;
        if (j) {
            final ComplicationStyle$Builder complicationStyle$Builder = new ComplicationStyle$Builder(h);
            if (h.b != -16777216) {
                complicationStyle$Builder.a = 0;
            }
            complicationStyle$Builder.c = -1;
            complicationStyle$Builder.d = -1;
            complicationStyle$Builder.j = -1;
            final int l = h.l;
            if (l != -16777216 && l != 0) {
                complicationStyle$Builder.k = -1;
            }
            complicationStyle$Builder.q = -1;
            if (h.t != -16777216) {
                complicationStyle$Builder.r = 0;
            }
            a = complicationStyle$Builder.a();
        }
        final TextPaint a2 = new TextPaint();
        (this.a = a2).setColor(a.d);
        a2.setAntiAlias(antiAlias);
        a2.setTypeface(a.f);
        a2.setTextSize((float)a.h);
        a2.setAntiAlias(antiAlias);
        Object m;
        if (antiAlias) {
            m = new PorterDuffColorFilter(a.k, PorterDuff$Mode.SRC_IN);
        }
        else {
            final int k2 = a.k;
            m = new ColorMatrixColorFilter(new ColorMatrix(new float[] { 0.0f, 0.0f, 0.0f, 0.0f, (float)Color.red(k2), 0.0f, 0.0f, 0.0f, 0.0f, (float)Color.green(k2), 0.0f, 0.0f, 0.0f, 0.0f, (float)Color.blue(k2), 0.0f, 0.0f, 0.0f, 255.0f, -32385.0f }));
        }
        this.l = (ColorFilter)m;
        final TextPaint b = new TextPaint();
        (this.b = b).setColor(a.e);
        b.setAntiAlias(antiAlias);
        b.setTypeface(a.g);
        b.setTextSize((float)a.i);
        b.setAntiAlias(antiAlias);
        final Paint c = new Paint();
        (this.c = c).setColor(a.s);
        c.setStyle(Paint$Style.STROKE);
        c.setAntiAlias(antiAlias);
        c.setStrokeWidth((float)a.r);
        final Paint d = new Paint();
        (this.d = d).setColor(a.t);
        d.setStyle(Paint$Style.STROKE);
        d.setAntiAlias(antiAlias);
        d.setStrokeWidth((float)a.r);
        final Paint e = new Paint();
        (this.e = e).setStyle(Paint$Style.STROKE);
        e.setColor(a.l);
        if (a.m == 2) {
            e.setPathEffect((PathEffect)new DashPathEffect(new float[] { (float)a.n, (float)a.o }, 0.0f));
        }
        if (a.m == 0) {
            e.setAlpha(0);
        }
        e.setStrokeWidth((float)a.q);
        e.setAntiAlias(antiAlias);
        final Paint f = new Paint();
        (this.f = f).setColor(a.b);
        f.setAntiAlias(antiAlias);
        final Paint g = new Paint();
        (this.g = g).setColor(a.u);
        g.setAntiAlias(antiAlias);
    }
    
    public final boolean a() {
        return this.i && this.k;
    }
}
