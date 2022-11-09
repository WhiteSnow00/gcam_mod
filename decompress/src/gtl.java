import java.io.OutputStream;
import android.graphics.Bitmap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.BurstSpec;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;
import java.util.Locale;
import com.google.googlex.gcam.DebugParams;
import java.util.Iterator;
import java.util.NoSuchElementException;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import java.util.HashMap;
import java.util.concurrent.Executor;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public class gtl implements duz, dvr, dvs, dwc
{
    private static final nsd e;
    protected final DynamicDepthUtils a;
    protected final hle b;
    protected final dty c;
    protected final kse d;
    private final dev f;
    private final gry g;
    private final boa h;
    private final kre i;
    private final Executor j;
    private final HashMap k;
    private final dxk l;
    
    static {
        e = nsd.g("com/google/android/apps/camera/pixelcamerakit/payloadprocessor/DynamicDepthProcessor");
    }
    
    public gtl(final dev f, final DynamicDepthUtils a, final gry g, final dty c, final boa h, final gij gij, final hle b, final Executor j, final kse d, final dxk l) {
        this.k = new HashMap();
        this.f = f;
        this.a = a;
        this.g = g;
        this.c = c;
        this.h = h;
        this.i = gij.b;
        this.b = b;
        this.j = j;
        this.d = d;
        this.l = l;
    }
    
    private final void l(final gtn gtn, final DynamicDepthResult dynamicDepthResult) {
        DynamicDepthResult dynamicDepthResult2 = dynamicDepthResult;
        Label_0021: {
            if (!gtn.h || (dynamicDepthResult2 = dynamicDepthResult) == null) {
                break Label_0021;
            }
            dynamicDepthResult.close();
            dynamicDepthResult2 = null;
            try {
                try {
                    this.f.c(gtn.b.b.h(), niz.h(dynamicDepthResult2));
                    gtn.d();
                }
                finally {
                    gtn.d();
                    while (true) {}
                }
            }
            catch (final NoSuchElementException ex) {}
        }
    }
    
    @Override
    public final void a(final dxh dxh, final int n, final long n2, final ljm ljm) {
        dxh.c.b.h();
        final gtn gtn = this.k.get(dxh);
        if (gtn != null) {
            gtn.c.o(n);
            return;
        }
        throw new IllegalStateException("Shot hasn't been started yet!");
    }
    
    @Override
    public final void c(final dxh dxh, final dvv dvv) {
        this.d(dxh.c.b.h());
    }
    
    @Override
    public final void d(final him him) {
        a.k(gtl.e.c(), "Shot has been aborted %s", him, '\u0813');
        while (true) {
            for (final dxh dxh : this.k.keySet()) {
                if (dxh.c.b.h().equals(him)) {
                    final dxh dxh2 = dxh;
                    if (dxh2 == null) {
                        return;
                    }
                    final gtn gtn = this.k.remove(dxh2);
                    if (gtn != null) {
                        this.f.c(gtn.b.b.h(), nii.a);
                        gtn.b();
                    }
                    return;
                }
            }
            final dxh dxh2 = null;
            continue;
        }
    }
    
    @Override
    public final void e(dxh d, kvs kvs) {
        final gtn gtn = this.k.get(d);
        if (gtn != null) {
            gtn.c(kvs);
            final int i = gtn.i;
            final niz m = gtn.b.b.m();
            if (m.g()) {
                final String a = ((DebugParams)m.c()).a().a();
                if (a != null) {
                    d = (dxh)this.g.a(kvs).d();
                    if (d != null) {
                        kvs = (kvs)new File(a, String.format(Locale.ROOT, "%s_%02d.pd", "payload_depth", i - 1));
                        Object a2 = ntf.a;
                        ((File)kvs).getName();
                        while (true) {
                            try {
                                a2 = new FileOutputStream((File)kvs);
                                try {
                                    for (final ljt ljt : ((lju)d).h()) {
                                        final ByteBuffer buffer = ljt.getBuffer();
                                        final int limit = buffer.limit();
                                        final byte[] array = new byte[limit];
                                        buffer.get(array);
                                        int rowStride;
                                        if (((lju)d).a() == 4099) {
                                            rowStride = ljt.getRowStride();
                                        }
                                        else {
                                            rowStride = ((lju)d).c() * ljt.getPixelStride();
                                        }
                                        for (int j = 0; j < limit; j += ljt.getRowStride()) {
                                            ((OutputStream)a2).write(array, j, rowStride);
                                        }
                                        buffer.clear();
                                    }
                                    ((FileOutputStream)a2).close();
                                    ((krc)d).close();
                                    return;
                                }
                                finally {
                                    try {
                                        ((FileOutputStream)a2).close();
                                    }
                                    finally {
                                        final Throwable t;
                                        t.addSuppressed((Throwable)a2);
                                    }
                                }
                            }
                            catch (final IOException a2) {
                                DynamicDepthUtils.a.b().g(ntf.a, "CAM_DynDepthUtils").h((Throwable)a2).E(749).r("IOException while saving Depth debug image %s", ((File)kvs).getName());
                                continue;
                            }
                            break;
                        }
                        ((krc)d).close();
                    }
                }
            }
            return;
        }
        kvs.close();
    }
    
    @Override
    public final void f(final dxh dxh, final BurstSpec burstSpec, final ljm ljm) {
        njo.o(this.k.containsKey(dxh) ^ true);
        this.k.put(dxh, new gtn(dxh.c, this.c.a(), burstSpec, ljm));
        this.f.b(dxh.c.b.h());
    }
    
    @Override
    public final void g(final him him) {
        final dxi a = this.l.a(him);
        a.c(this);
        a.a(new gtj(this));
        a.e(this);
    }
    
    @Override
    public final void h(final dxh dxh) {
        final gtn gtn = this.k.get(dxh);
        if (gtn != null) {
            this.j.execute(new gtk(this, gtn, dxh));
            return;
        }
        throw new IllegalStateException("Shot hasn't been started yet!");
    }
    
    protected DynamicDepthResult j(final grx grx, final gtn gtn) {
        final lju g = grx.g();
        final lju d = grx.d();
        gtn.d();
        gtn.b.b.h();
        if (g != null && d != null) {
            this.b.c();
            kse d3 = null;
            try {
                final ShotMetadata shotMetadata = (ShotMetadata)gtn.d.get();
                this.d.f("ddepth#process");
                final DynamicDepthResult dynamicDepthResult = new DynamicDepthResult(this.i, this.h.d().ordinal(), false, gtn.j.f, grx.a.c());
                if (this.a.b(d, g, dynamicDepthResult, shotMetadata)) {
                    return dynamicDepthResult;
                }
                dynamicDepthResult.close();
                final kse d2 = this.d;
            }
            catch (final Exception ex) {
                d3 = this.d;
            }
            finally {
                this.d.g();
                d.close();
                g.close();
            }
            d3.g();
            d.close();
            g.close();
        }
        else {
            if (g != null) {
                g.close();
            }
            if (d != null) {
                d.close();
            }
        }
        return null;
    }
    
    @Override
    public final void m(final dxh dxh, final Bitmap bitmap, final ShotMetadata shotMetadata) {
        final him h = dxh.c.b.h();
        final gtn gtn = this.k.get(dxh);
        if (gtn != null) {
            gtn.d.o(shotMetadata);
            return;
        }
        a.k(gtl.e.c(), "Couldn't find inflight shot, already processed? %s", h, '\u0818');
    }
    
    @Override
    public final void n(final dxh dxh) {
        this.d(dxh.c.b.h());
    }
}
