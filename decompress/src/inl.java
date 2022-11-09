import android.graphics.Paint;
import com.google.android.apps.camera.ui.gridlines.GridLinesUi;
import android.view.View;
import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class inl
{
    public final RectF a;
    public inm b;
    public final View c;
    public final ino d;
    public final ino e;
    public final ino f;
    public final ink g;
    public final ink h;
    public final ink i;
    
    public inl(final GridLinesUi c, final Paint paint, final Paint paint2) {
        this.a = new RectF();
        this.c = c;
        this.d = new ino(paint);
        this.e = new ino(paint);
        this.g = new ink(paint);
        this.h = new ink(paint);
        this.f = new ino(paint2);
        this.i = new ink(paint2);
    }
    
    public final void a(final inm b) {
        this.b = b;
        this.b();
        this.c.invalidate();
    }
    
    public final void b() {
        final ino d = this.d;
        final inm b = this.b;
        final boolean i = b.i;
        d.b = i;
        this.e.b = i;
        this.g.b = i;
        this.h.b = i;
        final ino f = this.f;
        f.b = i;
        this.i.b = i;
        final boolean h = b.h;
        final int n = 0;
        int n2;
        if (!h) {
            n2 = 0;
        }
        else {
            n2 = 255;
        }
        f.a(n2);
        final ink j = this.i;
        int n3;
        if (!this.b.h) {
            n3 = n;
        }
        else {
            n3 = 255;
        }
        j.a(n3);
        this.b.a(this.a);
        final ino d2 = this.d;
        final inm b2 = this.b;
        d2.a = b2.a;
        this.e.a = b2.b;
        this.g.a = b2.c;
        this.h.a = b2.d;
        this.f.a = b2.e;
        this.i.a = b2.f;
        this.c.invalidate();
    }
}
