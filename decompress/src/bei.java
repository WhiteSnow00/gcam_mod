import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bei implements aza, ayw
{
    private final Resources a;
    private final aza b;
    
    private bei(final Resources a, final aza b) {
        bit.a(a);
        this.a = a;
        bit.a(b);
        this.b = b;
    }
    
    public static aza f(final Resources resources, final aza aza) {
        if (aza == null) {
            return null;
        }
        return new bei(resources, aza);
    }
    
    @Override
    public final int a() {
        return this.b.a();
    }
    
    @Override
    public final Class b() {
        return BitmapDrawable.class;
    }
    
    @Override
    public final void d() {
        final aza b = this.b;
        if (b instanceof ayw) {
            ((ayw)b).d();
        }
    }
    
    @Override
    public final void e() {
        this.b.e();
    }
}
