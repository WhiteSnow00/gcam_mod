// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.hdrplus.deblurfusion;

import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import java.util.concurrent.Executor;

public class DeblurFusionControllerImpl implements dyp
{
    public static final nsd a;
    public final gwc b;
    public final kse c;
    public final ogo d;
    public final cxl e;
    private final Executor f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/hdrplus/deblurfusion/DeblurFusionControllerImpl");
    }
    
    public DeblurFusionControllerImpl(final gwc b, final Executor f, final kse c, final cxl e) {
        this.b = b;
        this.f = f;
        this.c = c;
        this.d = new ogo();
        this.e = e;
    }
    
    public static native long deblurFaceImpl(final long p0, final long p1, final long p2, final long p3, final long p4, final InterleavedU8ClientAllocator p5, final boolean p6, final boolean p7, final boolean p8, final boolean p9, final long[] p10, final long p11, final boolean p12, final boolean p13);
    
    public static native long retrieveResultImage(final long p0);
    
    public static native int retrieveResultStatus(final long p0);
    
    @Override
    public final oey a(final long n, final dyo dyo, final dyo dyo2, final dyi dyi) {
        if (dyo.a.c()) {
            a.l(DeblurFusionControllerImpl.a.b().g(ntf.a, "FalconController"), "Empty primary raw image.", '\u03dd');
        }
        if (dyo2.a.c()) {
            a.l(DeblurFusionControllerImpl.a.b().g(ntf.a, "FalconController"), "Empty secondary raw image.", '\u03dc');
        }
        final nsx a = ntf.a;
        final ofn f = ofn.f();
        this.f.execute(new dya(this, n, dyo, dyo2, dyi, f));
        return f;
    }
}
