import android.graphics.Matrix;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import com.google.android.apps.camera.jni.eisutil.FrameUtilNative;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdz
{
    private final cxl a;
    private final klv b;
    
    public hdz(final klv b, final cxl a) {
        this.a = a;
        this.b = b;
    }
    
    public static final boolean d(final kra kra) {
        return kra == kra.b || kra == kra.d;
    }
    
    public static final void e(final lju lju, final kra kra) {
        lju.getClass();
        njo.d(lju.a() == 35);
        System.currentTimeMillis();
        final boolean d = d(kra);
        final ByteBuffer buffer = lju.h().get(0).getBuffer();
        final int rowStride = lju.h().get(0).getRowStride();
        final ByteBuffer buffer2 = lju.h().get(1).getBuffer();
        final int rowStride2 = lju.h().get(1).getRowStride();
        final ByteBuffer buffer3 = lju.h().get(2).getBuffer();
        final int rowStride3 = lju.h().get(2).getRowStride();
        FrameUtilNative.mirrorYUV420888(buffer, rowStride, buffer2, rowStride2, buffer3, rowStride3, buffer, rowStride, buffer2, rowStride2, buffer3, rowStride3, lju.c(), lju.b(), d);
        System.currentTimeMillis();
    }
    
    public final Bitmap a(final Bitmap bitmap, final int n, final lfu lfu) {
        return this.b(bitmap, n, lfu, true);
    }
    
    public final Bitmap b(Bitmap bitmap, final int n, final lfu lfu, final boolean b) {
        if (bitmap != null && this.c(lfu)) {
            final Matrix matrix = new Matrix();
            System.currentTimeMillis();
            if (n != kra.b.e && n != kra.d.e) {
                matrix.postScale(-1.0f, 1.0f);
            }
            else {
                matrix.postScale(1.0f, -1.0f);
            }
            if (b) {
                matrix.postRotate((float)n);
            }
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            System.currentTimeMillis();
            return bitmap;
        }
        return bitmap;
    }
    
    public final boolean c(final lfu lfu) {
        if (!this.a.k(cxr.aM)) {
            this.b.aR(false);
        }
        return (boolean)this.b.aQ() && lfu.equals(lfu.a);
    }
}
