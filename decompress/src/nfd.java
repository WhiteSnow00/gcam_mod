import android.graphics.Region$Op;
import android.graphics.Rect;
import android.graphics.Outline;
import android.graphics.drawable.Drawable$ConstantState;
import android.content.Context;
import android.graphics.ColorFilter;
import j$.util.Objects;
import android.graphics.Canvas;
import android.content.res.ColorStateList;
import android.os.Looper;
import android.graphics.Paint$Style;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Region;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Matrix;
import java.util.BitSet;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nfd extends Drawable implements nfr
{
    private static final Paint f;
    public nfc a;
    public final nfp[] b;
    public final nfp[] c;
    public final BitSet d;
    public boolean e;
    private final Matrix g;
    private final Path h;
    private final Path i;
    private final RectF j;
    private final RectF k;
    private final Region l;
    private final Region m;
    private nfi n;
    private final Paint o;
    private final Paint p;
    private final nfk q;
    private PorterDuffColorFilter r;
    private PorterDuffColorFilter s;
    private final RectF t;
    private final nfb u;
    
    static {
        nfd.class.getSimpleName();
        final Paint f2 = new Paint(1);
        (f = f2).setColor(-1);
        f2.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
    }
    
    public nfd() {
        this(new nfi());
    }
    
    public nfd(final nfc a) {
        this.b = new nfp[4];
        this.c = new nfp[4];
        this.d = new BitSet(8);
        this.g = new Matrix();
        this.h = new Path();
        this.i = new Path();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new Region();
        this.m = new Region();
        final Paint o = new Paint(1);
        this.o = o;
        final Paint p = new Paint(1);
        this.p = p;
        new Path();
        final Paint paint = new Paint();
        final Paint paint2 = new Paint();
        final int c = gv.c(-16777216, 68);
        gv.c(-16777216, 20);
        gv.c(-16777216, 0);
        paint2.setColor(c);
        paint.setColor(0);
        final Paint paint3 = new Paint(4);
        paint3.setStyle(Paint$Style.FILL);
        new Paint(paint3);
        nfk a2;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            a2 = nfj.a;
        }
        else {
            a2 = new nfk();
        }
        this.q = a2;
        this.t = new RectF();
        this.a = a;
        p.setStyle(Paint$Style.STROKE);
        o.setStyle(Paint$Style.FILL);
        this.u();
        this.t(this.getState());
        this.u = new nfb(this);
    }
    
    public nfd(final nfi nfi) {
        this(new nfc(nfi));
    }
    
    private final float m() {
        if (this.s()) {
            return this.p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }
    
    private static int n(final int n, final int n2) {
        return n * (n2 + (n2 >>> 7)) >>> 8;
    }
    
    private final PorterDuffColorFilter o(final ColorStateList list, final PorterDuff$Mode porterDuff$Mode, final Paint paint, final boolean b) {
        final PorterDuffColorFilter porterDuffColorFilter = null;
        PorterDuffColorFilter porterDuffColorFilter2;
        if (list != null && porterDuff$Mode != null) {
            int n = list.getColorForState(this.getState(), 0);
            if (b) {
                n = this.c(n);
            }
            porterDuffColorFilter2 = new PorterDuffColorFilter(n, porterDuff$Mode);
        }
        else {
            if (b) {
                final int color = paint.getColor();
                final int c = this.c(color);
                if (c != color) {
                    porterDuffColorFilter2 = new PorterDuffColorFilter(c, PorterDuff$Mode.SRC_IN);
                    return porterDuffColorFilter2;
                }
            }
            porterDuffColorFilter2 = porterDuffColorFilter;
        }
        return porterDuffColorFilter2;
    }
    
    private final RectF p() {
        this.k.set(this.d());
        final float m = this.m();
        this.k.inset(m, m);
        return this.k;
    }
    
    private final void q(final RectF rectF, final Path path) {
        final nfk q = this.q;
        final nfc a = this.a;
        q.a(a.a, a.k, rectF, this.u, path);
        if (this.a.j != 1.0f) {
            this.g.reset();
            final Matrix g = this.g;
            final float j = this.a.j;
            g.setScale(j, j, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.g);
        }
        path.computeBounds(this.t, true);
    }
    
    private final void r(final Canvas canvas, final Paint paint, final Path path, final nfi nfi, final RectF rectF) {
        if (nfi.d(rectF)) {
            final float n = nfi.b.a(rectF) * this.a.k;
            canvas.drawRoundRect(rectF, n, n, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }
    
    private final boolean s() {
        return (this.a.v == Paint$Style.FILL_AND_STROKE || this.a.v == Paint$Style.STROKE) && this.p.getStrokeWidth() > 0.0f;
    }
    
    private final boolean t(final int[] array) {
        final ColorStateList d = this.a.d;
        boolean b = false;
        if (d != null) {
            final int color = this.o.getColor();
            final int colorForState = this.a.d.getColorForState(array, color);
            if (color != colorForState) {
                this.o.setColor(colorForState);
                b = true;
            }
        }
        if (this.a.e != null) {
            final int color2 = this.p.getColor();
            final int colorForState2 = this.a.e.getColorForState(array, color2);
            if (color2 != colorForState2) {
                this.p.setColor(colorForState2);
                return true;
            }
        }
        return b;
    }
    
    private final boolean u() {
        final PorterDuffColorFilter r = this.r;
        final PorterDuffColorFilter s = this.s;
        final nfc a = this.a;
        this.r = this.o(a.g, a.h, this.o, true);
        final nfc a2 = this.a;
        final ColorStateList f = a2.f;
        this.s = this.o(null, a2.h, this.p, false);
        final boolean u = this.a.u;
        return !Objects.equals((Object)r, (Object)this.r) || !Objects.equals((Object)s, (Object)this.s);
    }
    
    public final float a() {
        final nfc a = this.a;
        final float o = a.o;
        final float p = a.p;
        return o + 0.0f;
    }
    
    public final void b(final nfi a) {
        this.a.a = a;
        this.invalidateSelf();
    }
    
    protected final int c(final int n) {
        final float a = this.a();
        final nfc a2 = this.a;
        final float n2 = a2.n;
        final ndx b = a2.b;
        int a3 = n;
        if (b != null) {
            a3 = n;
            if (b.a) {
                a3 = n;
                if (gv.c(n, 255) == b.b) {
                    a3 = b.a(n, a + n2);
                }
            }
        }
        return a3;
    }
    
    protected final RectF d() {
        this.j.set(this.getBounds());
        return this.j;
    }
    
    public final void draw(final Canvas canvas) {
        this.o.setColorFilter((ColorFilter)this.r);
        final int alpha = this.o.getAlpha();
        this.o.setAlpha(n(alpha, this.a.m));
        this.p.setColorFilter((ColorFilter)this.s);
        this.p.setStrokeWidth(this.a.l);
        final int alpha2 = this.p.getAlpha();
        this.p.setAlpha(n(alpha2, this.a.m));
        if (this.e) {
            final float n = -this.m();
            final nfi a = this.a.a;
            final nfh b = a.b();
            b.a = njo.x(a.a, n);
            b.b = njo.x(a.b, n);
            b.d = njo.x(a.d, n);
            b.c = njo.x(a.c, n);
            final nfi a2 = b.a();
            this.n = a2;
            this.q.a(a2, this.a.k, this.p(), null, this.i);
            this.q(this.d(), this.h);
            this.e = false;
        }
        final nfc a3 = this.a;
        final int q = a3.q;
        if (a3.r > 0 && !this.l()) {
            this.h.isConvex();
        }
        if (this.a.v == Paint$Style.FILL_AND_STROKE || this.a.v == Paint$Style.FILL) {
            this.r(canvas, this.o, this.h, this.a.a, this.d());
        }
        if (this.s()) {
            this.r(canvas, this.p, this.i, this.n, this.p());
        }
        this.o.setAlpha(alpha);
        this.p.setAlpha(alpha2);
    }
    
    public final void e(final Context context) {
        this.a.b = new ndx(context);
        this.k();
    }
    
    public final void f(final float o) {
        final nfc a = this.a;
        if (a.o != o) {
            a.o = o;
            this.k();
        }
    }
    
    public final void g(final ColorStateList d) {
        final nfc a = this.a;
        if (a.d != d) {
            a.d = d;
            this.onStateChange(this.getState());
        }
    }
    
    public final Drawable$ConstantState getConstantState() {
        return this.a;
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final void getOutline(final Outline outline) {
        final int q = this.a.q;
        if (this.l()) {
            outline.setRoundRect(this.getBounds(), this.a.a.a.a(this.d()) * this.a.k);
            return;
        }
        this.q(this.d(), this.h);
        this.h.isConvex();
        try {
            outline.setConvexPath(this.h);
        }
        catch (final IllegalArgumentException ex) {}
    }
    
    public final boolean getPadding(final Rect rect) {
        final Rect i = this.a.i;
        if (i != null) {
            rect.set(i);
            return true;
        }
        return super.getPadding(rect);
    }
    
    public final Region getTransparentRegion() {
        this.l.set(this.getBounds());
        this.q(this.d(), this.h);
        this.m.setPath(this.h, this.l);
        this.l.op(this.m, Region$Op.DIFFERENCE);
        return this.l;
    }
    
    public final void h(final float k) {
        final nfc a = this.a;
        if (a.k != k) {
            a.k = k;
            this.e = true;
            this.invalidateSelf();
        }
    }
    
    public final void i(final ColorStateList e) {
        final nfc a = this.a;
        if (a.e != e) {
            a.e = e;
            this.onStateChange(this.getState());
        }
    }
    
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }
    
    public final boolean isStateful() {
        final boolean stateful = super.isStateful();
        boolean b = false;
        if (!stateful) {
            final ColorStateList g = this.a.g;
            if (g == null || !g.isStateful()) {
                final nfc a = this.a;
                final ColorStateList f = a.f;
                final ColorStateList e = a.e;
                if (e == null || !e.isStateful()) {
                    final ColorStateList d = this.a.d;
                    if (d == null) {
                        return b;
                    }
                    if (!d.isStateful()) {
                        return false;
                    }
                }
            }
        }
        b = true;
        return b;
    }
    
    public final void j(final float l) {
        this.a.l = l;
        this.invalidateSelf();
    }
    
    public final void k() {
        final float a = this.a();
        this.a.r = (int)Math.ceil(0.75f * a);
        this.a.s = (int)Math.ceil(a * 0.25f);
        this.u();
        super.invalidateSelf();
    }
    
    public final boolean l() {
        return this.a.a.d(this.d());
    }
    
    public final Drawable mutate() {
        this.a = new nfc(this.a);
        return this;
    }
    
    protected final void onBoundsChange(final Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }
    
    protected final boolean onStateChange(final int[] array) {
        final boolean t = this.t(array);
        final boolean u = this.u();
        boolean b = true;
        if (!t) {
            if (!u) {
                b = false;
            }
        }
        if (b) {
            this.invalidateSelf();
        }
        return b;
    }
    
    public final void setAlpha(final int m) {
        final nfc a = this.a;
        if (a.m != m) {
            a.m = m;
            super.invalidateSelf();
        }
    }
    
    public final void setColorFilter(final ColorFilter c) {
        this.a.c = c;
        super.invalidateSelf();
    }
    
    public final void setTint(final int n) {
        this.setTintList(ColorStateList.valueOf(n));
    }
    
    public final void setTintList(final ColorStateList g) {
        this.a.g = g;
        this.u();
        super.invalidateSelf();
    }
    
    public final void setTintMode(final PorterDuff$Mode h) {
        final nfc a = this.a;
        if (a.h != h) {
            a.h = h;
            this.u();
            super.invalidateSelf();
        }
    }
}
