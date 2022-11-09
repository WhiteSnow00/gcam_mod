import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bea implements avt
{
    @Override
    public final int a(final InputStream inputStream, final azi azi) {
        final acu acu = new acu(inputStream);
        final acr a = acu.a("Orientation");
        final int n = 1;
        int a2;
        if (a == null) {
            a2 = n;
        }
        else {
            try {
                a2 = a.a(acu.j);
            }
            catch (final NumberFormatException ex) {
                a2 = n;
            }
        }
        if (a2 == 0) {
            return -1;
        }
        return a2;
    }
    
    @Override
    public final int b(final ByteBuffer byteBuffer, final azi azi) {
        return this.a(bii.a(byteBuffer), azi);
    }
    
    @Override
    public final ImageHeaderParser$ImageType c(final InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
    
    @Override
    public final ImageHeaderParser$ImageType d(final ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
