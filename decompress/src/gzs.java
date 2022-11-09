import java.util.List;
import java.util.Arrays;
import java.nio.Buffer;
import android.os.Trace;
import com.google.android.apps.camera.jni.aesthetic.AestheticScorerNima;
import com.google.android.apps.camera.jni.aesthetic.AestheticScorerNimaV2;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzs implements krc
{
    private egu a;
    private long b;
    private float c;
    private boolean d;
    private final float[] e;
    
    public gzs(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        this.b = 0L;
        this.c = -1.0f;
        int n = 0;
        this.d = false;
        this.a = null;
        if (b) {
            egu a;
            if (b3) {
                a = new AestheticScorerNimaV2();
            }
            else {
                a = new AestheticScorerNima();
            }
            (this.a = a).c(b4);
        }
        if (b2) {
            if (b3) {
                n = 288;
            }
            else {
                n = 256;
            }
        }
        this.e = new float[n];
    }
    
    public final float a(final lju lju, final gzn gzn) {
        synchronized (this) {
            if (this.a != null && gzn.p.length <= 0) {
                if (!(this.d = (this.c > 0.0f && gzn.b - this.b < 60000000L))) {
                    Trace.beginSection("AestheticFrameQualityScorer.getFrameScore");
                    final List h = lju.h();
                    final ljt ljt = h.get(0);
                    final ljt ljt2 = h.get(1);
                    final ljt ljt3 = h.get(2);
                    final egu a = this.a;
                    if (a != null) {
                        this.c = a.a(lju.c(), lju.b(), ljt.getBuffer(), ljt.getPixelStride(), ljt.getRowStride(), ljt2.getBuffer(), ljt2.getPixelStride(), ljt2.getRowStride(), ljt3.getBuffer(), ljt3.getPixelStride(), ljt3.getRowStride(), this.e);
                    }
                    else {
                        Arrays.fill(this.e, 0.0f);
                        this.c = 0.0f;
                    }
                    this.b = gzn.b;
                    Trace.endSection();
                }
                return this.c;
            }
            Arrays.fill(this.e, 0.0f);
            return this.c = 0.0f;
        }
    }
    
    public final niz b() {
        monitorenter(this);
        try {
            final float[] e = this.e;
            final int length = e.length;
            if (length != 0) {
                float n = 0.0f;
                for (int i = 0; i < length; ++i) {
                    n += Math.abs(e[i]);
                }
                niz niz;
                if (n < 1.0E-6) {
                    niz = nii.a;
                }
                else {
                    niz = niz.i(this.e.clone());
                }
                monitorexit(this);
                return niz;
            }
            final nii a = nii.a;
            monitorexit(this);
            return a;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean c() {
        synchronized (this) {
            return this.d;
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            final egu a = this.a;
            if (a != null) {
                a.b();
                this.a = null;
            }
        }
    }
}
