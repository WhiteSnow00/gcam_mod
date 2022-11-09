import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.GcamModuleJNI;
import android.util.DisplayMetrics;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ogp implements InterleavedU8ClientAllocator
{
    private static final Bitmap$Config c;
    public Bitmap a;
    public ogk b;
    private final DisplayMetrics d;
    
    static {
        c = Bitmap$Config.ARGB_8888;
    }
    
    public ogp(final DisplayMetrics d) {
        njo.d(GcamModuleJNI.kInvalidAllocationId_get() != 0L);
        this.d = d;
    }
    
    @Override
    public final LongPair allocate(final int n, final int n2, final int n3) {
        final boolean b = true;
        njo.j(n3 == 4, "Server requested an InterleavedImageU8 of %s channels, but UniqueBitmapClientAllocator only supports %s.", n3, 4);
        njo.p(this.a == null && b, "allocate() should be called at most once.");
        final Bitmap bitmap = Bitmap.createBitmap(this.d, n, n2, ogp.c);
        this.a = bitmap;
        this.b = ogk.a(bitmap);
        return new LongPair(0L, InterleavedWriteViewU8.a(this.b.a));
    }
    
    @Override
    public final void doneWriting(final long n) {
        final boolean b = true;
        njo.d(n == 0L);
        njo.p(this.a != null, "doneWriting() was called before allocate().");
        njo.p(this.b != null && b, "doneWriting() was called more than once.");
        this.b.close();
        this.b = null;
    }
}
