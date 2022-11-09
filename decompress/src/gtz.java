import java.nio.ByteBuffer;
import java.util.List;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.GcamModuleJNI;
import java.nio.Buffer;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.InterleavedWriteViewU16;
import com.google.googlex.gcam.ShotMetadata;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import java.util.concurrent.Executor;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gtz extends gtl
{
    private final boolean e;
    private final boa f;
    private final kre g;
    private final gwc h;
    
    public gtz(final gwc h, final dev dev, final DynamicDepthUtils dynamicDepthUtils, final gry gry, final dty dty, final Executor executor, final hdz hdz, final boa f, final gij gij, final hle hle, final kse kse, final dxk dxk) {
        super(dev, dynamicDepthUtils, gry, dty, f, gij, hle, executor, kse, dxk);
        this.e = hdz.c(lfu.a);
        this.f = f;
        this.g = gij.b;
        this.h = h;
    }
    
    @Override
    protected final DynamicDepthResult j(final grx grx, final gtn gtn) {
        final lju g = grx.g();
        final lju c = grx.c(grx.b.f);
        gtn.d();
        if (c != null && g != null) {
            final boolean a = this.b.a();
            long a2;
            if (a) {
                final gwc h = this.h;
                if (h == null) {
                    return null;
                }
                if (h.a() == 0L) {
                    this.h.b();
                }
                a2 = this.h.a();
            }
            else {
                a2 = 0L;
            }
            gtn.b.b.h();
            this.b.c();
            final kse d2;
            Label_0623: {
                try {
                    final ShotMetadata shotMetadata = (ShotMetadata)gtn.d.get();
                    this.d.f("udepth#process");
                    final DynamicDepthResult dynamicDepthResult = new DynamicDepthResult(this.g, this.f.d().ordinal(), this.e, gtn.j.f, grx.a.c());
                    final ohs ohs = new ohs();
                    final int a3 = c.a();
                    final List h2 = c.h();
                    njo.g(h2.size() == 1, "Should have a single depth plane, has: %s", h2.size());
                    njo.g(a3 == 1144402265, "Unsupported format: %s", a3);
                    final ByteBuffer buffer = h2.get(0).getBuffer();
                    final int remaining = buffer.remaining();
                    final int pixelStride = h2.get(0).getPixelStride();
                    njo.e(pixelStride == 2, "Pixel stride should be two bytes.");
                    final int c2 = c.c();
                    final int b = c.b();
                    final int rowStride = h2.get(0).getRowStride();
                    final int n = rowStride / 2;
                    final int n2 = pixelStride * c2;
                    njo.j(rowStride >= n2, "The row stride (%s bytes) should be greater than or equal to the width (%s bytes)", rowStride, n2);
                    njo.m(remaining == rowStride * b, "The buffer capacity (%s) should be equal to the row stride in bytes (%s) multiplied by the height (%s).", remaining, rowStride, b);
                    final InterleavedWriteViewU16 interleavedWriteViewU16 = (InterleavedWriteViewU16)((njd)niz.i(new InterleavedWriteViewU16(GcamModuleJNI.new_InterleavedWriteViewU16__SWIG_1(c2, b, 1, BufferUtils.a(buffer), n)))).a;
                    final YuvWriteView c3 = ohs.c(g);
                    final long a4 = InterleavedWriteViewU16.a(interleavedWriteViewU16);
                    final long e = YuvWriteView.e(c3);
                    final long c4 = ShotMetadata.c(shotMetadata);
                    final lju lju = g;
                    try {
                        if (DynamicDepthUtils.createDynamicDepthFromUltradepthImpl(a2, a4, e, c4, a, dynamicDepthResult.a)) {
                            this.d.g();
                            c.close();
                            lju.close();
                            return dynamicDepthResult;
                        }
                        dynamicDepthResult.close();
                        lju.close();
                        final kse d = this.d;
                        break Label_0623;
                    }
                    catch (final Exception ex) {}
                }
                catch (final Exception ex2) {}
                d2 = this.d;
            }
            d2.g();
            c.close();
            g.close();
            return null;
        }
        if (c != null) {
            c.close();
        }
        if (g != null) {
            g.close();
        }
        return null;
    }
}
