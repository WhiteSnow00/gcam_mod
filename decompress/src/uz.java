import android.text.Layout$Alignment;
import android.support.wearable.complications.ComplicationData;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uz extends uy
{
    private final Rect b;
    
    public uz() {
        this.b = new Rect();
    }
    
    private final boolean v(final Rect rect) {
        final ComplicationData a = super.a;
        return (a.c() == null && a.d() == null) || !aai.k(rect);
    }
    
    @Override
    public final void a(final Rect rect) {
        final ComplicationData a = super.a;
        this.k(rect);
        if (a.c() != null && a.d() == null && !this.v(rect)) {
            aai.g(rect, rect);
            return;
        }
        rect.setEmpty();
    }
    
    @Override
    public final int c() {
        if (super.a.g() == null) {
            return 16;
        }
        return 80;
    }
    
    @Override
    public final int d() {
        return 48;
    }
    
    @Override
    public final Layout$Alignment g() {
        this.k(this.b);
        if (this.v(this.b)) {
            return Layout$Alignment.ALIGN_CENTER;
        }
        return Layout$Alignment.ALIGN_NORMAL;
    }
    
    @Override
    public final Layout$Alignment h() {
        return this.g();
    }
    
    @Override
    public final void l(final Rect rect) {
        final ComplicationData a = super.a;
        this.k(rect);
        if (this.v(rect)) {
            if (a.g() != null) {
                aai.i(rect, rect);
            }
            return;
        }
        if (a.g() == null) {
            aai.h(rect, rect);
            return;
        }
        aai.h(rect, rect);
        aai.i(rect, rect);
    }
    
    @Override
    public final void m(final Rect rect) {
        final ComplicationData a = super.a;
        this.k(rect);
        if (a.g() == null) {
            rect.setEmpty();
            return;
        }
        if (this.v(rect)) {
            aai.e(rect, rect);
            return;
        }
        aai.h(rect, rect);
        aai.e(rect, rect);
    }
    
    @Override
    public final void q(final Rect rect) {
        final ComplicationData a = super.a;
        this.k(rect);
        if (a.d() != null && !this.v(rect)) {
            aai.g(rect, rect);
            return;
        }
        rect.setEmpty();
    }
}
