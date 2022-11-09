import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import android.graphics.Rect;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory$Options;
import java.io.InputStream;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bee implements beg
{
    private final axa a;
    private final azi b;
    private final List c;
    
    public bee(final InputStream inputStream, final List c, final azi b) {
        bit.a(b);
        this.b = b;
        bit.a(c);
        this.c = c;
        this.a = new axa(inputStream, b);
    }
    
    @Override
    public final int a() {
        return afo.x(this.c, this.a.c(), this.b);
    }
    
    @Override
    public final Bitmap b(final BitmapFactory$Options bitmapFactory$Options) {
        return BitmapFactory.decodeStream(this.a.c(), (Rect)null, bitmapFactory$Options);
    }
    
    @Override
    public final ImageHeaderParser$ImageType c() {
        return afo.A(this.c, this.a.c(), this.b);
    }
    
    @Override
    public final void d() {
        this.a.a.a();
    }
}
