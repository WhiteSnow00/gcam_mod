import android.text.Layout$Alignment;
import android.support.wearable.complications.ComplicationData;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class va extends uy
{
    private static final float b;
    private final vb c;
    private final Rect d;
    private final Rect e;
    
    static {
        b = (float)(1.0 / Math.sqrt(2.0));
    }
    
    public va() {
        this.c = new vb();
        this.d = new Rect();
        this.e = new Rect();
    }
    
    private final void v() {
        if (super.a != null) {
            this.n(this.d);
            final Rect d = this.d;
            aai.j(d, d, va.b * 0.7f);
            this.c.u(this.d.width(), this.d.height(), super.a);
        }
    }
    
    @Override
    public final void a(final Rect rect) {
        final ComplicationData a = super.a;
        if (a.c() == null) {
            rect.setEmpty();
            return;
        }
        this.k(rect);
        if (a.h() != null && !aai.k(rect)) {
            this.c.a(rect);
            rect.offset(this.d.left, this.d.top);
            return;
        }
        aai.j(rect, this.d, 0.7f);
    }
    
    @Override
    public final int e() {
        final ComplicationData a = super.a;
        this.k(this.e);
        if (!aai.k(this.e)) {
            return this.c.e();
        }
        if (a.i() != null) {
            return 80;
        }
        return 16;
    }
    
    @Override
    public final int f() {
        return 48;
    }
    
    @Override
    public final Layout$Alignment i() {
        this.k(this.e);
        if (aai.k(this.e)) {
            return Layout$Alignment.ALIGN_NORMAL;
        }
        return this.c.i();
    }
    
    @Override
    public final Layout$Alignment j() {
        return this.i();
    }
    
    @Override
    public final void n(final Rect rect) {
        this.k(rect);
        if (super.a.h() != null && aai.k(rect)) {
            aai.g(rect, rect);
            aai.j(rect, rect, 0.95f);
            return;
        }
        aai.f(rect, rect);
        aai.j(rect, rect, 0.95f);
    }
    
    @Override
    public final void o(final Rect rect) {
        final ComplicationData a = super.a;
        if (a.h() == null) {
            rect.setEmpty();
            return;
        }
        this.k(rect);
        if (!aai.k(rect)) {
            this.c.o(rect);
            rect.offset(this.d.left, this.d.top);
            return;
        }
        if (a.i() != null && a.c() == null) {
            aai.h(rect, rect);
            aai.i(rect, rect);
            return;
        }
        aai.h(rect, rect);
    }
    
    @Override
    public final void p(final Rect rect) {
        final ComplicationData a = super.a;
        if (a.i() == null || a.h() == null) {
            rect.setEmpty();
            return;
        }
        this.k(rect);
        if (aai.k(rect)) {
            aai.h(rect, rect);
            aai.e(rect, rect);
            return;
        }
        this.c.p(rect);
        rect.offset(this.d.left, this.d.top);
    }
    
    @Override
    public final void r(final ComplicationData a) {
        super.a = a;
        this.v();
    }
    
    @Override
    public final void s(final int n) {
        super.s(n);
        this.v();
    }
    
    @Override
    public final void t(final int n) {
        super.t(n);
        this.v();
    }
}
