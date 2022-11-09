import android.graphics.drawable.Icon$OnDrawableLoadedListener;
import android.graphics.drawable.Icon;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.wearable.complications.ComplicationText;
import j$.util.Objects;
import android.text.Layout$Alignment;
import android.text.TextPaint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.wearable.complications.ComplicationData;
import android.content.Context;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ur
{
    public up A;
    private CharSequence B;
    private boolean C;
    private boolean D;
    private final Rect E;
    private us F;
    public final Context a;
    public ComplicationData b;
    public final Rect c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public Drawable h;
    public final uu i;
    public final uu j;
    public final uu k;
    public final uv l;
    public final uv m;
    public final Rect n;
    public final RectF o;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public final Rect t;
    public final RectF u;
    public uq v;
    public uq w;
    public TextPaint x;
    public TextPaint y;
    public us z;
    
    public ur(final Context a, final us us, final us us2) {
        this.c = new Rect();
        this.B = "";
        this.i = new uu();
        this.j = new uu();
        this.k = new uu();
        this.l = new uv();
        this.m = new uv();
        this.n = new Rect();
        this.o = new RectF();
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.E = new Rect();
        this.u = new RectF();
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.a = a;
        this.g(us, us2);
    }
    
    private final void i() {
        if (this.b != null && !this.c.isEmpty()) {
            this.n.set(0, 0, this.c.width(), this.c.height());
            this.o.set(0.0f, 0.0f, (float)this.c.width(), (float)this.c.height());
            final ComplicationData b = this.b;
            uy uy = null;
            switch (b.b) {
                default: {
                    uy = new uy();
                    break;
                }
                case 8: {
                    uy = new ux();
                    break;
                }
                case 7: {
                    uy = new vc();
                    break;
                }
                case 6: {
                    uy = new uw();
                    break;
                }
                case 5: {
                    if (!this.C) {
                        uy = new va();
                        break;
                    }
                    if (b.h() == null) {
                        uy = new uw();
                        break;
                    }
                    uy = new vb();
                    break;
                }
                case 4: {
                    uy = new uz();
                    break;
                }
                case 3:
                case 9: {
                    uy = new vb();
                    break;
                }
            }
            uy.u(this.c.width(), this.c.height(), this.b);
            uy.n(this.E);
            this.u.set(this.E);
            uy.a(this.p);
            uy.q(this.q);
            uy.b(this.r);
            Layout$Alignment layout$Alignment;
            if (this.b.b == 4) {
                final Layout$Alignment g = uy.g();
                uy.l(this.s);
                this.l.b(g);
                this.l.c(uy.c());
                uy.m(this.t);
                this.m.b(uy.h());
                this.m.c(uy.d());
                layout$Alignment = g;
            }
            else {
                final Layout$Alignment i = uy.i();
                uy.o(this.s);
                this.l.b(i);
                this.l.c(uy.e());
                uy.p(this.t);
                this.m.b(uy.j());
                this.m.c(uy.f());
                layout$Alignment = i;
            }
            if (layout$Alignment != Layout$Alignment.ALIGN_CENTER) {
                final float n = this.c.height() * 0.1f;
                this.l.i(n / this.s.width());
                this.m.i(n / this.s.width());
            }
            else {
                this.l.i(0.0f);
                this.m.i(0.0f);
            }
            final Rect rect = new Rect();
            final Rect n2 = this.n;
            final int max = Math.max(this.a(this.F), this.a(this.z));
            rect.set(n2);
            final double sqrt = Math.sqrt(2.0);
            final double n3 = (float)max;
            Double.isNaN(n3);
            final int n4 = (int)Math.ceil((sqrt - 1.0) * n3);
            rect.inset(n4, n4);
            if (!this.s.intersect(rect)) {
                this.s.setEmpty();
            }
            if (!this.t.intersect(rect)) {
                this.t.setEmpty();
            }
            if (!this.p.isEmpty()) {
                final Rect p = this.p;
                aai.j(p, p, 1.0f);
                aai.d(this.p, rect);
            }
            if (!this.q.isEmpty()) {
                final Rect q = this.q;
                aai.j(q, q, 0.95f);
                if (this.b.a() == 2) {
                    aai.d(this.q, rect);
                }
            }
            if (!this.r.isEmpty()) {
                final Rect r = this.r;
                aai.j(r, r, 1.0f);
            }
        }
    }
    
    public final int a(final us us) {
        if (this.c.isEmpty()) {
            return 0;
        }
        return Math.min(Math.min(this.c.height(), this.c.width()) / 2, us.p);
    }
    
    public final int b(final us us, final Rect rect) {
        if (this.c.isEmpty()) {
            return 0;
        }
        return Math.max(this.a(us) - Math.min(Math.min(rect.left, this.c.width() - rect.right), Math.min(rect.top, this.c.height() - rect.bottom)), 0);
    }
    
    public final void c() {
        final up a = this.A;
        if (a != null) {
            a.a();
        }
    }
    
    public final void d(ComplicationData b) {
        if (Objects.equals((Object)this.b, (Object)b)) {
            return;
        }
        final Icon icon = null;
        if (b == null) {
            this.b = null;
            return;
        }
        final int b2 = b.b;
        int n = 0;
        final int n2 = 1;
        if (b2 == 10) {
            if (this.D) {
                return;
            }
            this.D = true;
            final uh uh = new uh(3);
            final ComplicationText complicationText = new ComplicationText(this.B);
            ComplicationData.j("SHORT_TEXT", uh.a);
            uh.b.putParcelable("SHORT_TEXT", (Parcelable)complicationText);
            this.b = uh.a();
        }
        else {
            this.b = b;
            this.D = false;
        }
        final Handler handler = new Handler(Looper.getMainLooper());
        this.d = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.e = null;
        b = this.b;
        Icon c;
        Icon icon2;
        Icon icon3;
        Icon d;
        Icon icon4;
        if (b != null) {
            c = b.c();
            b = this.b;
            ComplicationData.k("ICON_BURN_IN_PROTECTION", b.b);
            icon2 = (Icon)b.e("ICON_BURN_IN_PROTECTION");
            b = this.b;
            ComplicationData.k("SMALL_IMAGE_BURN_IN_PROTECTION", b.b);
            icon3 = (Icon)b.e("SMALL_IMAGE_BURN_IN_PROTECTION");
            d = this.b.d();
            final ComplicationData b3 = this.b;
            ComplicationData.k("LARGE_IMAGE", b3.b);
            icon4 = (Icon)b3.e("LARGE_IMAGE");
        }
        else {
            final Icon icon5 = icon3 = null;
            icon4 = (d = icon3);
            icon2 = icon5;
            c = icon;
        }
        if (c != null) {
            c.loadDrawableAsync(this.a, (Icon$OnDrawableLoadedListener)new uo(this, 1), handler);
            n = 1;
        }
        if (icon2 != null) {
            icon2.loadDrawableAsync(this.a, (Icon$OnDrawableLoadedListener)new uo(this), handler);
            n = 1;
        }
        if (d != null) {
            d.loadDrawableAsync(this.a, (Icon$OnDrawableLoadedListener)new uo(this, 2), handler);
            n = 1;
        }
        if (icon3 != null) {
            icon3.loadDrawableAsync(this.a, (Icon$OnDrawableLoadedListener)new uo(this, 3), handler);
            n = n2;
        }
        if (icon4 != null) {
            icon4.loadDrawableAsync(this.a, (Icon$OnDrawableLoadedListener)new uo(this, 4), handler);
        }
        else if (n == 0) {
            this.c();
        }
        this.i();
    }
    
    public final void e(final CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            charSequence2 = "";
        }
        this.B = charSequence2.subSequence(0, charSequence2.length());
        if (this.D) {
            this.D = false;
            this.d(new uh(10).a());
        }
    }
    
    public final void f(final boolean c) {
        if (this.C != c) {
            this.C = c;
            this.i();
        }
    }
    
    public final void g(final us f, final us z) {
        this.F = f;
        this.z = z;
        this.v = new uq(f, false, false, false);
        this.w = new uq(z, true, false, false);
        this.i();
    }
    
    public final void h(final Rect rect) {
        final int width = this.c.width();
        final int width2 = rect.width();
        boolean b = true;
        if (width == width2 && this.c.height() == rect.height()) {
            b = false;
        }
        this.c.set(rect);
        if (b) {
            this.i();
        }
    }
}
