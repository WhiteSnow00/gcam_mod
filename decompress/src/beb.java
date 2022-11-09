import android.graphics.Bitmap;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class beb extends bdg
{
    private static final byte[] b;
    
    static {
        b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(beb.a);
    }
    
    @Override
    public final void a(final MessageDigest messageDigest) {
        messageDigest.update(beb.b);
    }
    
    @Override
    protected final Bitmap c(final azk azk, final Bitmap bitmap, final int n, final int n2) {
        return beq.f(azk, bitmap, n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof beb;
    }
    
    @Override
    public final int hashCode() {
        return 1572326941;
    }
}
