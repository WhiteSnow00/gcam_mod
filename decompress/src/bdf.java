import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdf implements aza, ayw
{
    private final Bitmap a;
    private final azk b;
    
    public bdf(final Bitmap a, final azk b) {
        bit.e(a, "Bitmap must not be null");
        this.a = a;
        bit.e(b, "BitmapPool must not be null");
        this.b = b;
    }
    
    public static bdf f(final Bitmap bitmap, final azk azk) {
        if (bitmap == null) {
            return null;
        }
        return new bdf(bitmap, azk);
    }
    
    @Override
    public final int a() {
        return biv.a(this.a);
    }
    
    @Override
    public final Class b() {
        return Bitmap.class;
    }
    
    @Override
    public final void d() {
        this.a.prepareToDraw();
    }
    
    @Override
    public final void e() {
        this.b.d(this.a);
    }
}
