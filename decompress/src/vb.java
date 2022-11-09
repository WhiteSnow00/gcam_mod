import android.text.Layout$Alignment;
import android.support.wearable.complications.ComplicationData;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vb extends uy
{
    private final Rect b;
    
    public vb() {
        this.b = new Rect();
    }
    
    @Override
    public final void a(final Rect rect) {
        if (super.a.c() == null) {
            rect.setEmpty();
            return;
        }
        this.k(rect);
        if (aai.k(rect)) {
            aai.g(rect, rect);
            return;
        }
        aai.f(rect, rect);
        aai.i(rect, rect);
        aai.f(rect, rect);
    }
    
    @Override
    public final int e() {
        final ComplicationData a = super.a;
        if (a.i() != null && a.c() == null) {
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
        final ComplicationData a = super.a;
        this.k(this.b);
        if (aai.k(this.b) && a.c() != null) {
            return Layout$Alignment.ALIGN_NORMAL;
        }
        return Layout$Alignment.ALIGN_CENTER;
    }
    
    @Override
    public final Layout$Alignment j() {
        return this.i();
    }
    
    @Override
    public final void o(final Rect rect) {
        final ComplicationData a = super.a;
        this.k(rect);
        if (a.c() == null) {
            if (a.i() != null) {
                aai.i(rect, rect);
            }
            return;
        }
        if (aai.k(rect)) {
            aai.h(rect, rect);
            return;
        }
        aai.f(rect, rect);
        aai.e(rect, rect);
    }
    
    @Override
    public final void p(final Rect rect) {
        final ComplicationData a = super.a;
        if (a.c() == null && a.i() != null) {
            this.k(rect);
            aai.e(rect, rect);
            return;
        }
        rect.setEmpty();
    }
}
