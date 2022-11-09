import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.YuvWriteView;
import java.nio.ByteBuffer;
import java.util.List;
import com.google.googlex.gcam.RawWriteView;
import java.nio.Buffer;
import com.google.googlex.gcam.BufferUtils;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ohs
{
    private static final String a;
    
    static {
        a = ohs.class.getSimpleName();
    }
    
    public final niz a(final lju lju) {
        final int a = lju.a();
        final List h = lju.h();
        if (a != 257 && a != 4098 && a != 4099) {
            final String a2 = ohs.a;
            final StringBuilder sb = new StringBuilder(34);
            sb.append("Unsupported PD format: ");
            sb.append(a);
            Log.e(a2, sb.toString());
            return nii.a;
        }
        final int size = h.size();
        final boolean b = true;
        njo.g(size == 1, "Should have a single PD plane, has: %s", h.size());
        final ByteBuffer buffer = h.get(0).getBuffer();
        final int remaining = buffer.remaining();
        int n = 2016;
        int b2;
        int n2;
        if (a == 257) {
            if (remaining % 8064 != 0) {
                final String a3 = ohs.a;
                final StringBuilder sb2 = new StringBuilder(96);
                sb2.append("The row stride in bytes (8064) should evenly divide the PD buffer capacity (");
                sb2.append(remaining);
                sb2.append(").");
                Log.e(a3, sb2.toString());
                return nii.a;
            }
            b2 = remaining / 8064;
            if (b2 != 756) {
                if (b2 != 758) {
                    final String a4 = ohs.a;
                    final StringBuilder sb3 = new StringBuilder(114);
                    sb3.append("The inferred PD data height for DEPTH_POINT_CLOUD formatted Images should be one of 756 or 758, but is ");
                    sb3.append(b2);
                    Log.e(a4, sb3.toString());
                    return nii.a;
                }
                n2 = 4032;
            }
            else {
                n2 = 4032;
            }
        }
        else {
            if (a == 4099) {
                return niz.i(this.b(lju));
            }
            njo.e(lju.c() % 2 == 0, "Image width should be divisible by the number of channels.");
            final int pixelStride = h.get(0).getPixelStride();
            njo.e(pixelStride == 2, "Pixel stride should be two bytes.");
            n = lju.c() / 2;
            b2 = lju.b();
            final int rowStride = h.get(0).getRowStride();
            n2 = rowStride / 2;
            final int n3 = (n + n) * pixelStride;
            njo.j(rowStride >= n3, "The row stride (%s bytes) should be greater than or equal to the width (%s bytes)", rowStride, n3);
            njo.m(remaining == rowStride * b2 && b, "The buffer capacity (%s) should be equal to the row stride in bytes (%s) multiplied by the height (%s).", remaining, rowStride, b2);
        }
        return niz.i(new RawWriteView(n + n, b2, n2, 1, new ogn(BufferUtils.a(buffer))));
    }
    
    public final RawWriteView b(final lju lju) {
        final int c = lju.c();
        final int b = lju.b();
        int a = lju.a();
        final List h = lju.h();
        final int pixelStride = h.get(0).getPixelStride();
        final int rowStride = h.get(0).getRowStride();
        njo.g(this.d(a), "Unsupported raw format: %s. Should must be a compatible image format.", a);
        njo.j(c % 2 == 0 && b % 2 == 0, "Should have even dimensions, but was: %sx%s", c, b);
        njo.g(h.size() == 1, "Should have a single RAW_SENSOR plane, has: %s", h.size());
        Label_0279: {
            if (a == 32) {
                njo.g(pixelStride == 2, "Unexpected RAW_SENSOR pixel stride: %s", pixelStride);
            }
            else {
                if (a != 37) {
                    if (a != 4099) {
                        break Label_0279;
                    }
                    a = 4099;
                }
                njo.j(c % 4 == 0, "RAW10 image width should be divisible by 4, but was: %sx%s", c, b);
                njo.g(pixelStride == 0, "Unexpected RAW10 pixel stride: %s", pixelStride);
                final int n = c * 5 / 4;
                njo.j(rowStride >= n, "RAW10 row stride %s should be at least %s", rowStride, n);
            }
        }
        final ogn ogn = new ogn(BufferUtils.a(h.get(0).getBuffer()));
        int n2;
        boolean b2;
        if (a != 37) {
            if (a == 4099) {
                n2 = rowStride;
                b2 = false;
            }
            else {
                n2 = rowStride / 2;
                b2 = true;
            }
        }
        else {
            n2 = rowStride;
            b2 = false;
        }
        return new RawWriteView(c, b, n2, b2 ? 1 : 0, ogn);
    }
    
    public final YuvWriteView c(final lju lju) {
        final int c = lju.c();
        final int b = lju.b();
        final int c2 = lju.c();
        final int b2 = lju.b();
        int n = 2;
        njo.e(c2 % 2 == 0, "A YUV image must have even width.");
        njo.e(b2 % 2 == 0, "A YUV image must have even height.");
        njo.e(lju.a() == 35, "Format is not YUV_420_888");
        final List h = lju.h();
        njo.g(h.size() == 3, "A YUV image must have %s planes.", 3);
        final ljt ljt = h.get(0);
        final ljt ljt2 = h.get(1);
        final ljt ljt3 = h.get(2);
        final long a = BufferUtils.a(ljt.getBuffer());
        final long a2 = BufferUtils.a(ljt2.getBuffer());
        final long a3 = BufferUtils.a(ljt3.getBuffer());
        njo.e(ljt.getPixelStride() == 1, "Y plane's pixel stride is not 1");
        njo.e(ljt.getRowStride() >= lju.c(), "Y plane's row stride smaller than image width");
        njo.e(ljt2.getRowStride() >= lju.c(), "U plane's row stride smaller than image width");
        njo.e(ljt2.getRowStride() == ljt3.getRowStride(), "U and V planes have different row strides");
        njo.e(a != 0L, "luma plane address cannot be 0 (NULL).");
        njo.e(a2 != 0L, "chroma U plane address cannot be 0 (NULL).");
        njo.e(a3 != 0L, "chroma V plane address cannot be 0 (NULL).");
        njo.e(ljt2.getPixelStride() == 2 && ljt3.getPixelStride() == 2 && Math.abs(a2 - a3) == 1L, "UV planes not tightly interleaved");
        int n2;
        if (a2 < a3) {
            n2 = 1;
        }
        else {
            n2 = 2;
        }
        final List h2 = lju.h();
        final ogn ogn = new ogn(BufferUtils.a(h2.get(0).getBuffer()));
        if (n2 == 1) {
            n = 1;
        }
        return new YuvWriteView(GcamModuleJNI.new_YuvWriteView__SWIG_3(c, b, h2.get(0).getRowStride(), ogn.a(ogn), c / 2, b / 2, h2.get(n).getRowStride(), ogn.a(new ogn(BufferUtils.a(h2.get(n).getBuffer()))), n2));
    }
    
    public final boolean d(final int n) {
        return n == 37 || n == 32 || n == 4099;
    }
}
