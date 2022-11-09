import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

final class bfd extends bfc
{
    private bfd(final Drawable drawable) {
        super(drawable);
    }
    
    static aza g(final Drawable drawable) {
        if (drawable != null) {
            return new bfd(drawable);
        }
        return null;
    }
    
    @Override
    public final int a() {
        return Math.max(1, this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight() * 4);
    }
    
    @Override
    public final Class b() {
        return this.a.getClass();
    }
    
    @Override
    public final void e() {
    }
}
