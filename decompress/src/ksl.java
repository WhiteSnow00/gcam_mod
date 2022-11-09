import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ksl
{
    public boolean a;
    public Matrix b;
    public kre c;
    private RectF d;
    private kra e;
    private Rect f;
    
    public final Matrix a() {
        final Matrix b = this.b;
        b.getClass();
        return b;
    }
    
    public final void b(final int n, final int n2, final int n3, final int n4, final kra e) {
        this.d = new RectF((float)n, (float)n2, (float)n3, (float)n4);
        this.e = e;
        this.c();
        this.f = null;
        this.c();
    }
    
    public final void c() {
        final Rect f = this.f;
        if (f == null) {
            return;
        }
        if (this.c == null) {
            return;
        }
        if (this.e == null) {
            return;
        }
        if (this.d == null) {
            return;
        }
        (this.b = new Matrix()).postTranslate((float)(-f.centerX()), (float)(-f.centerY()));
        int width;
        int height;
        if (f.width() / (float)f.height() > this.c.a()) {
            width = (int)(f.height() * this.c.a());
            height = f.height();
        }
        else {
            width = f.width();
            height = (int)(f.width() / this.c.a());
        }
        this.b.postRotate((float)(-this.e.a()));
        final kra e = this.e;
        final kra a = kra.a;
        float n = -1.0f;
        if (e != a && this.e != kra.c) {
            final Matrix b = this.b;
            if (!this.a) {
                n = 1.0f;
            }
            b.postScale(1.0f, n);
        }
        else {
            final Matrix b2 = this.b;
            if (!this.a) {
                n = 1.0f;
            }
            b2.postScale(n, 1.0f);
        }
        final RectF rectF = new RectF(0.0f, 0.0f, (float)width, (float)height);
        this.b.mapRect(rectF);
        this.b.postScale(this.d.width() / rectF.width(), this.d.height() / rectF.height());
        this.b.postTranslate(this.d.width() / 2.0f, this.d.height() / 2.0f);
    }
    
    public final boolean d(final Rect f) {
        final Rect f2 = this.f;
        if (f2 != null && f.equals((Object)f2) && this.b != null) {
            return false;
        }
        String.valueOf(String.valueOf(f)).length();
        this.f = f;
        this.c();
        return true;
    }
}
