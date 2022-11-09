import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import android.graphics.Bitmap$CompressFormat;
import android.graphics.Bitmap;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bde implements awj
{
    public static final awf a;
    public static final awf b;
    private final azi c;
    
    static {
        a = awf.c("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
        b = awf.b("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    }
    
    @Deprecated
    public bde() {
        this.c = null;
    }
    
    public bde(final azi c) {
        this.c = c;
    }
    
    @Override
    public final int b() {
        return 2;
    }
}
