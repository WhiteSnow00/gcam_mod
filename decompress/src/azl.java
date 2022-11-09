import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;

// 
// Decompiled by Procyon v0.6.0
// 

public class azl implements azk
{
    @Override
    public final Bitmap a(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        return Bitmap.createBitmap(n, n2, bitmap$Config);
    }
    
    @Override
    public final Bitmap b(final int n, final int n2, final Bitmap$Config bitmap$Config) {
        return Bitmap.createBitmap(n, n2, bitmap$Config);
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public void d(final Bitmap bitmap) {
        bitmap.recycle();
    }
    
    @Override
    public final void e(final int n) {
    }
}
