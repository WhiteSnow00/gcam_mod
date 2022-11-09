import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import android.graphics.Rect;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory$Options;
import android.os.ParcelFileDescriptor;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bef implements beg
{
    private final azi a;
    private final List b;
    private final axd c;
    
    public bef(final ParcelFileDescriptor parcelFileDescriptor, final List b, final azi a) {
        bit.a(a);
        this.a = a;
        bit.a(b);
        this.b = b;
        this.c = new axd(parcelFileDescriptor);
    }
    
    @Override
    public final int a() {
        return afo.y(this.b, new avz(this.c, this.a));
    }
    
    @Override
    public final Bitmap b(final BitmapFactory$Options bitmapFactory$Options) {
        return BitmapFactory.decodeFileDescriptor(this.c.c().getFileDescriptor(), (Rect)null, bitmapFactory$Options);
    }
    
    @Override
    public final ImageHeaderParser$ImageType c() {
        return afo.B(this.b, new avw(this.c, this.a));
    }
    
    @Override
    public final void d() {
    }
}
