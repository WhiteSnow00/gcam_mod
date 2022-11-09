import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iia
{
    private static final Bitmap b;
    public final Bitmap a;
    
    static {
        b = Bitmap.createBitmap(1, 1, Bitmap$Config.ALPHA_8);
    }
    
    public iia(final Bitmap a) {
        this.a = a;
    }
    
    public static iia a() {
        return new iia(iia.b);
    }
    
    public final boolean b() {
        return this.a == null;
    }
    
    public final boolean c() {
        return this.a == iia.b;
    }
}
