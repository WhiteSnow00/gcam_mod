import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.AndroidJniUtils;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import com.google.googlex.gcam.InterleavedWriteViewU8;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ogk implements AutoCloseable
{
    public final InterleavedWriteViewU8 a;
    private final Bitmap b;
    private long c;
    
    private ogk(final Bitmap b) {
        b.getClass();
        this.b = b;
        njo.i(b.getConfig().equals((Object)Bitmap$Config.ARGB_8888), "Bitmap Config must be ARGB_8888", b.getConfig());
        final int width = b.getWidth();
        final int height = b.getHeight();
        final int rowBytes = b.getRowBytes();
        njo.j(b.getRowBytes() % 4 == 0, "Bitmap's row stride in bytes (%s) must evenly divide the number of channels (%s)", b.getRowBytes(), 4);
        final long lockBitmap = AndroidJniUtils.lockBitmap(b);
        this.c = lockBitmap;
        if (lockBitmap != 0L) {
            this.a = new InterleavedWriteViewU8(GcamModuleJNI.new_InterleavedWriteViewU8__SWIG_1(width, height, 4, ogn.a(new ogn(lockBitmap)), rowBytes));
            return;
        }
        throw new IllegalArgumentException("Failed to lock bitmap.");
    }
    
    public static ogk a(final Bitmap bitmap) {
        return new ogk(bitmap);
    }
    
    @Override
    public final void close() {
        if (this.c != 0L) {
            AndroidJniUtils.unlockBitmap(this.b);
            this.c = 0L;
        }
    }
    
    @Override
    protected final void finalize() {
        if (this.c != 0L) {
            System.err.printf("LockedBitmap finalized with a non-zero native pointer (0x%x), this indicates a resource management error.%n", this.c);
        }
        this.close();
    }
}
