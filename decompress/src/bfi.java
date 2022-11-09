import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bfi
{
    public final azk a;
    public final azi b;
    
    public bfi(final azk a, final azi b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final Bitmap bitmap) {
        this.a.d(bitmap);
    }
    
    public final void b(final byte[] array) {
        final azi b = this.b;
        if (b == null) {
            return;
        }
        b.c(array);
    }
    
    public final byte[] c(final int n) {
        final azi b = this.b;
        if (b == null) {
            return new byte[n];
        }
        return (byte[])b.a(n, byte[].class);
    }
}
