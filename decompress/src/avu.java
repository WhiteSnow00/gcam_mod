import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avu implements awb
{
    final /* synthetic */ InputStream a;
    
    public avu(final InputStream a) {
        this.a = a;
    }
    
    @Override
    public final ImageHeaderParser$ImageType a(final avt avt) {
        try {
            return avt.c(this.a);
        }
        finally {
            this.a.reset();
        }
    }
}
