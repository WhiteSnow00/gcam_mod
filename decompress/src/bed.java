import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import android.graphics.Rect;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory$Options;
import java.util.List;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bed implements beg
{
    private final ByteBuffer a;
    private final List b;
    private final azi c;
    
    public bed(final ByteBuffer a, final List b, final azi c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final int a() {
        final List b = this.b;
        final ByteBuffer d = bii.d(this.a);
        final azi c = this.c;
        if (d == null) {
            return -1;
        }
        return afo.y(b, new avx(d, c));
    }
    
    @Override
    public final Bitmap b(final BitmapFactory$Options bitmapFactory$Options) {
        return BitmapFactory.decodeStream(bii.a(bii.d(this.a)), (Rect)null, bitmapFactory$Options);
    }
    
    @Override
    public final ImageHeaderParser$ImageType c() {
        return afo.z(this.b, bii.d(this.a));
    }
    
    @Override
    public final void d() {
    }
}
