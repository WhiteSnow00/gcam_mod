import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.nio.ByteBuffer;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bfh implements awi
{
    private static final bfg a;
    private final Context b;
    private final List c;
    private final bfg d;
    private final bfi e;
    
    static {
        a = new bfg();
    }
    
    public bfh(final Context context, final List c, final azk azk, final azi azi) {
        final bfg a = bfh.a;
        this.b = context.getApplicationContext();
        this.c = c;
        this.e = new bfi(azk, azi);
        this.d = a;
    }
}
