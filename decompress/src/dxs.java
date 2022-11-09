import android.hardware.HardwareBuffer;
import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.util.Arrays;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.GrayReadViewU8;
import com.google.googlex.gcam.GcamModuleJNI;
import java.util.List;
import com.google.googlex.gcam.YuvReadView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxs implements lju
{
    public final YuvReadView a;
    private final long b;
    private final List c;
    
    public dxs(final YuvReadView a, final long b) {
        njo.e(a.d() == 1 || a.d() == 2, "Format of yuvReadView can only be NV12 or NV21!");
        final GrayReadViewU8 grayReadViewU8 = new GrayReadViewU8(GcamModuleJNI.YuvReadView_luma_read_view(a.a, a));
        final InterleavedReadViewU8 interleavedReadViewU8 = new InterleavedReadViewU8(GcamModuleJNI.YuvReadView_chroma_read_view(a.a, a));
        final int n = (int)(grayReadViewU8.a() * (GcamModuleJNI.GrayReadViewU8_width(grayReadViewU8.a, grayReadViewU8) - 1) + 1L + grayReadViewU8.b() * (GcamModuleJNI.GrayReadViewU8_height(grayReadViewU8.a, grayReadViewU8) - 1));
        final int n2 = (int)(interleavedReadViewU8.e() * (interleavedReadViewU8.d() - 1) + 1L + interleavedReadViewU8.f() * (interleavedReadViewU8.c() - 1) + interleavedReadViewU8.a() * (interleavedReadViewU8.b() - 1));
        final long grayReadViewU8_data = GcamModuleJNI.GrayReadViewU8_data(grayReadViewU8.a, grayReadViewU8);
        ogn ogn;
        if (grayReadViewU8_data == 0L) {
            ogn = null;
        }
        else {
            ogn = new ogn(grayReadViewU8_data);
        }
        final ByteBuffer b2 = BufferUtils.b(ogn.a(ogn), n);
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        if (a.d() == 1) {
            byteBuffer = BufferUtils.b(ogn.a(interleavedReadViewU8.g()), n2);
            byteBuffer2 = BufferUtils.b(ogn.a(interleavedReadViewU8.g()) + interleavedReadViewU8.a(), n2);
        }
        else {
            byteBuffer2 = BufferUtils.b(ogn.a(interleavedReadViewU8.g()), n2);
            byteBuffer = BufferUtils.b(ogn.a(interleavedReadViewU8.g()) + interleavedReadViewU8.a(), n2);
        }
        this.b = b;
        this.a = a;
        this.c = Arrays.asList(new les(b2, grayReadViewU8.b(), grayReadViewU8.a(), 1), new les(byteBuffer, interleavedReadViewU8.f(), interleavedReadViewU8.e(), 1), new les(byteBuffer2, interleavedReadViewU8.f(), interleavedReadViewU8.e(), 1));
    }
    
    @Override
    public final int a() {
        return 35;
    }
    
    @Override
    public final int b() {
        return this.a.b();
    }
    
    @Override
    public final int c() {
        return this.a.c();
    }
    
    @Override
    public final void close() {
    }
    
    @Override
    public final long d() {
        return this.b;
    }
    
    @Override
    public final Rect e() {
        return new Rect(0, 0, this.c(), this.b());
    }
    
    @Override
    public final HardwareBuffer f() {
        return null;
    }
    
    @Override
    public final lfa g() {
        return lfa.a();
    }
    
    @Override
    public final List h() {
        return this.c;
    }
    
    @Override
    public final void i(final Rect rect) {
    }
}
