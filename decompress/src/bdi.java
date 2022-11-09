import android.graphics.Bitmap;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdi extends bdg
{
    private static final byte[] b;
    
    static {
        b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(bdi.a);
    }
    
    @Override
    public final void a(final MessageDigest messageDigest) {
        messageDigest.update(bdi.b);
    }
    
    @Override
    protected final Bitmap c(final azk azk, final Bitmap bitmap, final int n, final int n2) {
        return beq.d(azk, bitmap, n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof bdi;
    }
    
    @Override
    public final int hashCode() {
        return -670243078;
    }
}
