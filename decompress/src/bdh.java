import android.graphics.Bitmap;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdh extends bdg
{
    private static final byte[] b;
    
    static {
        b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(bdh.a);
    }
    
    @Override
    public final void a(final MessageDigest messageDigest) {
        messageDigest.update(bdh.b);
    }
    
    @Override
    protected final Bitmap c(final azk azk, final Bitmap bitmap, final int n, final int n2) {
        return beq.c(azk, bitmap, n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof bdh;
    }
    
    @Override
    public final int hashCode() {
        return -599754482;
    }
}
