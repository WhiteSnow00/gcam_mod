import com.google.android.libraries.camera.exif.ExifInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gaf
{
    public final long a;
    public final byte[] b;
    public final int c;
    public final ExifInterface d;
    public final kre e;
    
    private gaf(final long a, final byte[] b, final kre e, final int c, final ExifInterface d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    public static gaf a(final long n, final byte[] array, final kre kre, final int n2, final ExifInterface exifInterface, final jdi jdi) {
        if (jdi != null) {
            jdi.a(exifInterface);
        }
        return new gaf(n, array, kre, n2, exifInterface);
    }
}
