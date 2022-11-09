import java.io.File;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.InterleavedImageU16;
import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.creativecamera.portraitmode.PortraitOutputsInterface;
import java.util.HashMap;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvl implements gvy
{
    public static final nsd a;
    public static final String b;
    public static final String c;
    public static final String d;
    public final Executor e;
    public final cxl f;
    public final Object g;
    public final Object h;
    public final HashMap i;
    public final PortraitOutputsInterface j;
    public boolean k;
    public final gwc l;
    public final gwb m;
    private final gae n;
    private final dug o;
    private final boolean p;
    private final hdz q;
    private final pii r;
    
    static {
        a = nsd.g("com/google/android/apps/camera/portrait/PortraitControllerImpl");
        b = GcamModuleJNI.kRequestCameraPrimary_get();
        c = GcamModuleJNI.kRequestCameraSecondaryTele_get();
        d = GcamModuleJNI.kRequestCameraSecondaryWide_get();
    }
    
    public gvl(final gwc l, final gwb m, final gae n, final Executor e, final cxl f, final dug o, final hdz q, final pii r) {
        final Object g = new Object();
        this.g = g;
        this.h = new Object();
        this.i = new HashMap();
        this.j = new PortraitOutputsInterface();
        this.k = false;
        synchronized (g) {
            this.l = l;
            this.m = m;
            monitorexit(g);
            this.n = n;
            this.e = e;
            this.f = f;
            this.o = o;
            this.p = f.k(cyc.f);
            this.q = q;
            this.r = r;
        }
    }
    
    public static gwa a(final String s, final String s2) {
        final gvz a = gwa.a();
        a.a = b(s);
        a.b = b(s2);
        return a.a();
    }
    
    public static niz b(final String s) {
        if (njb.d(s)) {
            return nii.a;
        }
        try {
            return niz.i(aph.c(s));
        }
        catch (final ape ape) {
            a.l(gvl.a.b(), "String was not a serialized XMPMeta.", '\u0845');
            return nii.a;
        }
    }
    
    public static boolean d(final jcw jcw) {
        final niz a = jcw.a;
        final niz b = jcw.b;
        final boolean b2 = a.g() && !((InterleavedImageU8)a.c()).f();
        final boolean b3 = b.g() && ((HardwareBuffer)b.c()).getWidth() > 0 && ((HardwareBuffer)b.c()).getHeight() > 0;
        return !b2 && !b3;
    }
    
    @Override
    public final void c() {
        synchronized (this.h) {
            if (this.k) {
                gvl.a.c().E(2120).o("init() called on an already initialized PortraitController.");
                return;
            }
            monitorexit(this.h);
            this.e.execute(new gux(this));
        }
    }
    
    @Override
    public final void e() {
    }
    
    @Override
    public final oey f(final long n, final InterleavedImageU8 interleavedImageU8, final InterleavedImageU16 interleavedImageU9, final fxu fxu, final PortraitRequest portraitRequest, final RawReadView rawReadView, final ShotMetadata shotMetadata, final RawReadView rawReadView2, final ShotMetadata shotMetadata2, final dzt dzt) {
        Object o = this.h;
        synchronized (o) {
            if (!this.k) {
                return ofi.m(new kuw("Controller hasn't been initialized"));
            }
            monitorexit(o);
            o = this.n.a.d;
            GcamModuleJNI.PortraitRequest_embed_gdepth_metadata_set(portraitRequest.a, portraitRequest, this.p);
            if (this.f.k(cyc.u)) {
                GcamModuleJNI.PortraitRequest_depth_processing_set(portraitRequest.a, portraitRequest, 2);
            }
            GcamModuleJNI.PortraitRequest_allow_raw_blur_rear_set(portraitRequest.a, portraitRequest, this.f.k(cyc.x));
            GcamModuleJNI.PortraitRequest_allow_raw_blur_front_set(portraitRequest.a, portraitRequest, this.f.k(cyc.w));
            o = ((ejf)this.r).a();
            if (this.f.k(cyc.t) && ((niz)o).g()) {
                o = ((File)((niz)o).c()).getAbsolutePath();
                GcamModuleJNI.PortraitRequest_opencl_cache_directory_set(portraitRequest.a, portraitRequest, (String)o);
            }
            int n2;
            if (this.f.k(cyc.z)) {
                n2 = gvx.a(3);
            }
            else {
                n2 = gvx.a(1);
            }
            GcamModuleJNI.PortraitRequest_relighting_option_set(portraitRequest.a, portraitRequest, n2);
            GcamModuleJNI.PortraitRequest_horizontal_flip_set(portraitRequest.a, portraitRequest, this.q.c(fxu.l()));
            GcamModuleJNI.PortraitRequest_use_spotlight_enhance_set(portraitRequest.a, portraitRequest, this.f.k(cyc.B));
            this.f.e();
            GcamModuleJNI.PortraitRequest_apply_portrait_matting_set(portraitRequest.a, portraitRequest, false);
            if (this.o.b()) {
                GcamModuleJNI.PortraitRequest_execute_finish_on_set(portraitRequest.a, portraitRequest, 1);
            }
            return this.n.a(new gvh(this, n, dzt, this.f.k(cyc.C), portraitRequest, rawReadView, shotMetadata, rawReadView2, shotMetadata2, interleavedImageU9, interleavedImageU8));
        }
    }
}
