// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.dynamicdepth;

import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ShotMetadata;

public class DynamicDepthUtils
{
    public static final nsd a;
    private final String b;
    private boolean c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/dynamicdepth/DynamicDepthUtils");
    }
    
    public DynamicDepthUtils() {
        this.c = false;
        this.b = "";
    }
    
    private static native boolean createDynamicDepthFromPdImpl(final long p0, final long p1, final long p2, final long p3);
    
    public static native boolean createDynamicDepthFromUltradepthImpl(final long p0, final long p1, final long p2, final long p3, final boolean p4, final long p5);
    
    public static byte[] d(byte[] writeDynamicDepthIntoJpegStreamImpl, final DynamicDepthResult dynamicDepthResult, final hbj hbj) {
        final long a = dynamicDepthResult.a;
        long a2;
        if (hbj == null) {
            a2 = 0L;
        }
        else {
            a2 = hbj.a();
        }
        writeDynamicDepthIntoJpegStreamImpl = writeDynamicDepthIntoJpegStreamImpl(writeDynamicDepthIntoJpegStreamImpl, a, a2);
        if (writeDynamicDepthIntoJpegStreamImpl != null) {
            final nsx a3 = ntf.a;
            return writeDynamicDepthIntoJpegStreamImpl;
        }
        return null;
    }
    
    private static native void initializePdImpl(final boolean p0, final String p1);
    
    public static native void savePdCacheImpl();
    
    private static native byte[] writeDynamicDepthIntoJpegStreamImpl(final byte[] p0, final long p1, final long p2);
    
    public final Runnable a() {
        monitorenter(this);
        try {
            aas aas;
            if (!this.c) {
                initializePdImpl(false, this.b);
                this.c = true;
                aas = aas.d;
            }
            else {
                aas = aas.e;
            }
            monitorexit(this);
            return aas;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final boolean b(final lju lju, final lju lju2, final DynamicDepthResult dynamicDepthResult, final ShotMetadata shotMetadata) {
        synchronized (this) {
            final ohs ohs = new ohs();
            final niz a = ohs.a(lju);
            if (!a.g()) {
                a.l(DynamicDepthUtils.a.b().g(ntf.a, "CAM_DynDepthUtils"), "Error converting the PD image.", '\u02f3');
                return false;
            }
            return this.c((RawWriteView)a.c(), ohs.c(lju2), dynamicDepthResult, shotMetadata);
        }
    }
    
    public final boolean c(final RawWriteView rawWriteView, final YuvWriteView yuvWriteView, final DynamicDepthResult dynamicDepthResult, final ShotMetadata shotMetadata) {
        synchronized (this) {
            final Runnable a = this.a();
            final boolean dynamicDepthFromPdImpl = createDynamicDepthFromPdImpl(RawWriteView.d(rawWriteView), YuvWriteView.e(yuvWriteView), ShotMetadata.c(shotMetadata), dynamicDepthResult.a);
            a.run();
            return dynamicDepthFromPdImpl;
        }
    }
}
