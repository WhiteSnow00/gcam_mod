import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bfx implements bfy
{
    private final azk a;
    private final bfy b;
    private final bfy c;
    
    public bfx(final azk a, final bfy b, final bfy c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final aza a(final aza aza, final awg awg) {
        final Drawable drawable = (Drawable)aza.c();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(bdf.f(((BitmapDrawable)drawable).getBitmap(), this.a), awg);
        }
        if (drawable instanceof bfk) {
            return this.c.a(aza, awg);
        }
        return null;
    }
}
