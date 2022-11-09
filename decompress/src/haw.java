import java.nio.ByteBuffer;
import java.util.List;
import android.util.Log;
import android.os.Trace;
import com.google.android.libraries.vision.smartcapture.BurstCurator;
import java.util.concurrent.Executor;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class haw implements krc
{
    private static final nsd b;
    public final AtomicBoolean a;
    private final oey c;
    private final boolean d;
    private niz e;
    private boolean f;
    
    static {
        b = nsd.g("com/google/android/apps/camera/qualityscore/SmartCaptureFrameQualityScorer");
    }
    
    private haw(final oey c, final boolean d, final niz e) {
        this.e = nii.a;
        this.a = new AtomicBoolean(false);
        this.f = false;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static haw a(final Context context, final cxl cxl, final lfg lfg, final Executor executor, final kse kse, final boolean b, final niz niz) {
        final cxm a = cxj.a;
        cxl.d();
        boolean b2;
        if (!b) {
            cxl.b();
            b2 = false;
        }
        else {
            b2 = true;
        }
        cxl.b();
        final lfu l = lfg.l();
        final lfu a2 = lfu.a;
        boolean b3;
        if (l == a2) {
            b3 = cxl.k(cxx.b);
        }
        else {
            b3 = cxl.k(cxx.c);
        }
        final boolean k = cxl.k(cxx.d);
        boolean b4;
        if (l == a2) {
            b4 = cxl.k(cxx.e);
        }
        else {
            b4 = cxl.k(cxx.f);
        }
        boolean b5;
        if (l == a2) {
            b5 = cxl.k(cxx.g);
        }
        else {
            b5 = cxl.k(cxx.h);
        }
        cxl.e();
        return new haw(ofi.r(new hav(context, kse, b2, b3, k, b4, b5), executor), b3, niz);
    }
    
    final niz b(final lju lju, final gzn gzn) {
        monitorenter(this);
        try {
            BurstCurator burstCurator;
            if (this.f) {
                burstCurator = null;
            }
            else {
                burstCurator = (BurstCurator)knf.d(this.c);
            }
            if (burstCurator == null) {
                a.l(haw.b.b(), "Input frame and metadata cannot be null.", '\u089c');
                final nii a = nii.a;
                monitorexit(this);
                return a;
            }
            if (gzn.n != null) {
                final gzm[] p2 = gzn.p;
                Label_0902: {
                    if (p2 != null) {
                        niz niz = null;
                        Label_0067: {
                            if (p2.length == 0 && !this.d) {
                                niz = nii.a;
                            }
                            else {
                                final float n = lju.c() / (float)gzn.s.width();
                                final float n2 = lju.b() / (float)gzn.s.height();
                                final boolean b = !gzn.q && this.a.getAndSet(false);
                                final okt m = oqe.c.m();
                                if (m.c) {
                                    m.m();
                                    m.c = false;
                                }
                                final oqe oqe = (oqe)m.b;
                                oqe.a |= 0x1;
                                oqe.b = b;
                                final oqe k = (oqe)m.h();
                                final okt i = opq.k.m();
                                final int r = gzn.r;
                                if (i.c) {
                                    i.m();
                                    i.c = false;
                                }
                                final opq opq = (opq)i.b;
                                opq.a |= 0x4;
                                opq.c = (360 - r) % 360;
                                final opq d = (opq)i.h();
                                final opd a2 = dkf.a(gzn, n, n2);
                                final okt j = opw.l.m();
                                final long b2 = gzn.b;
                                if (j.c) {
                                    j.m();
                                    j.c = false;
                                }
                                final opw opw = (opw)j.b;
                                final int a3 = opw.a | 0x2;
                                opw.a = a3;
                                opw.c = b2;
                                a2.getClass();
                                opw.e = a2;
                                final int a4 = a3 | 0x40;
                                opw.a = a4;
                                final boolean q = gzn.q;
                                final int a5 = a4 | 0x200;
                                opw.a = a5;
                                opw.f = q;
                                d.getClass();
                                opw.d = d;
                                final int a6 = a5 | 0x20;
                                opw.a = a6;
                                k.getClass();
                                opw.k = k;
                                opw.a = (a6 | 0x200000);
                                final opw opw2 = (opw)j.h();
                                if (gzn.q) {
                                    njo.p(burstCurator.c ^ true, "BurstCurator closed");
                                    Trace.beginSection("BurstCurator.toByteArray");
                                    final byte[] g = opw2.g();
                                    Trace.endSection();
                                    Trace.beginSection("BurstCurator.processYUVFrame");
                                    final byte[] nativeProcessMetadata = burstCurator.nativeProcessMetadata(burstCurator.b, g);
                                    Trace.endSection();
                                    Trace.beginSection("BurstCurator.parseFrom");
                                    opw opw3;
                                    try {
                                        opw3 = (opw)oky.t(opw.l, nativeProcessMetadata, burstCurator.a);
                                    }
                                    catch (final olm olm) {
                                        Log.e("BURST_CURATOR", "Proto serialization error.");
                                        opw3 = opw2;
                                    }
                                    Trace.endSection();
                                    final niz l = niz.i(new hat(opw3));
                                    monitorexit(this);
                                    return l;
                                }
                                try {
                                    final List h = lju.h();
                                    final ljt ljt = h.get(0);
                                    final ljt ljt2 = h.get(1);
                                    final ljt ljt3 = h.get(2);
                                    final ByteBuffer buffer = ljt.getBuffer();
                                    final int pixelStride = ljt.getPixelStride();
                                    final int rowStride = ljt.getRowStride();
                                    final ByteBuffer buffer2 = ljt2.getBuffer();
                                    final int pixelStride2 = ljt2.getPixelStride();
                                    final int rowStride2 = ljt2.getRowStride();
                                    final ByteBuffer buffer3 = ljt3.getBuffer();
                                    final int pixelStride3 = ljt3.getPixelStride();
                                    final int rowStride3 = ljt3.getRowStride();
                                    final int c = lju.c();
                                    final int b3 = lju.b();
                                    njo.p(burstCurator.c ^ true, "BurstCurator closed");
                                    if (buffer.isDirect() && buffer2.isDirect() && buffer3.isDirect()) {
                                        Trace.beginSection("BurstCurator.toByteArray");
                                        final byte[] g2 = opw2.g();
                                        Trace.endSection();
                                        Trace.beginSection("BurstCurator.processYUVFrame");
                                        final byte[] nativeProcessYUV = burstCurator.nativeProcessYUV(burstCurator.b, buffer, pixelStride, rowStride, buffer2, pixelStride2, rowStride2, buffer3, pixelStride3, rowStride3, c, b3, g2);
                                        Trace.endSection();
                                        Trace.beginSection("BurstCurator.parseFrom");
                                        opw opw4;
                                        try {
                                            opw4 = (opw)oky.t(opw.l, nativeProcessYUV, burstCurator.a);
                                        }
                                        catch (final olm olm2) {
                                            Log.e("BURST_CURATOR", "Proto serialization error.");
                                            opw4 = opw2;
                                        }
                                        Trace.endSection();
                                        niz = niz.i(new hat(opw4));
                                        break Label_0067;
                                    }
                                    throw new IllegalArgumentException("Only direct buffers are currently supported");
                                }
                                catch (final IllegalStateException ex) {
                                    a.m(haw.b.b(), "Couldn't get planes for analysis.", '\u089f', ex);
                                    final nii a7 = nii.a;
                                    monitorexit(this);
                                    return a7;
                                }
                                break Label_0902;
                            }
                        }
                        monitorexit(this);
                        return niz;
                    }
                }
                a.l(haw.b.b(), "Faces array cannot be null.", '\u08a0');
                final nii a8 = nii.a;
                monitorexit(this);
                return a8;
            }
            a.l(haw.b.b(), "Sensor region cannot be null.", '\u08a1');
            final nii a9 = nii.a;
            monitorexit(this);
            return a9;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            if (!this.f) {
                this.f = true;
                knf.e(this.c, new hau(this));
            }
        }
    }
}
