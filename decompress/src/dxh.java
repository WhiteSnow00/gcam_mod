import java.util.ArrayList;
import com.google.googlex.gcam.GcamModuleJNI;
import android.util.DisplayMetrics;
import com.google.googlex.gcam.ShotParams;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import com.google.googlex.gcam.hdrplus.HdrPlusInterface;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxh
{
    public static final nsd a;
    public int b;
    public final gen c;
    public final List d;
    public final List e;
    public final HdrPlusInterface f;
    public final oid g;
    public final InterleavedU8ClientAllocator h;
    public final ogu i;
    public final InterleavedU8ClientAllocator j;
    public final ogu k;
    public final ogr l;
    public final dxj m;
    public final dwf n;
    public int o;
    public final dxg p;
    private final ShotParams q;
    
    static {
        a = nsd.g("com/google/android/apps/camera/hdrplus/Shot");
    }
    
    public dxh(final dxj m, final DisplayMetrics displayMetrics, final gen c, final int n, final hvd hvd, final cyn cyn, final ddx ddx, final ShotParams shotParams, final dwf n2, final boolean b) {
        this.o = 1;
        this.b = GcamModuleJNI.kInvalidShotId_get();
        final HdrPlusInterface f = new HdrPlusInterface();
        this.f = f;
        this.g = new oid(f);
        this.m = m;
        this.c = c;
        this.q = new ShotParams(GcamModuleJNI.new_ShotParams__SWIG_1(shotParams.a, shotParams));
        this.n = n2;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.p = new dxg(this, n, m, cyn, ddx, hvd);
        final boolean g = m.g().g();
        long n3 = 32L;
        if (g) {
            this.h = new ogp(displayMetrics);
            this.i = null;
        }
        else if (m.h().g()) {
            this.h = null;
            this.i = new ogu();
        }
        else {
            if (m.f().g()) {
                this.h = new ogq(288L, 32L);
            }
            else {
                this.h = null;
            }
            this.i = null;
        }
        if (m.e().g()) {
            this.l = new ogr();
        }
        else {
            this.l = null;
        }
        if (m.k().g()) {
            this.j = new ogs();
            this.k = null;
            return;
        }
        if (m.l().g()) {
            long n4;
            if (!b) {
                n4 = 2L;
            }
            else {
                n4 = 3L;
            }
            if (b) {
                n3 = 48L;
            }
            this.j = new ogq(0x100L | n4 | n3, n3 | n4);
            this.k = null;
            return;
        }
        if (m.n().g()) {
            this.k = new ogu();
            this.j = null;
            return;
        }
        this.j = null;
        this.k = null;
    }
    
    public final int a() {
        njo.p(this.b != GcamModuleJNI.kInvalidShotId_get(), "setShotId() has not been called on this Shot.");
        return this.b;
    }
}
