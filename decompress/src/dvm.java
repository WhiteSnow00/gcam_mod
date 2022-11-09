import java.util.concurrent.locks.Lock;
import com.google.googlex.gcam.ClientShotMetadata;
import android.hardware.HardwareBuffer;
import java.util.List;
import com.google.googlex.gcam.AndroidJniUtils;
import com.google.googlex.gcam.ViewfinderResults;
import com.google.googlex.gcam.FrameMetadataKey;
import java.util.HashMap;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InitParams;
import com.google.googlex.gcam.image.ImageUtils;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import android.graphics.Bitmap$Config;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.StaticMetadata;
import com.google.googlex.gcam.ThreadPoolConfig;
import com.google.googlex.gcam.GenerateRgbImageOptions;
import android.graphics.Bitmap;
import java.util.Iterator;
import android.hardware.camera2.CameraCharacteristics$Key;
import android.hardware.camera2.CameraCharacteristics;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.ShotParams;
import com.google.googlex.gcam.DebugParams;
import java.io.File;
import com.google.googlex.gcam.ImageSaverParams;
import com.google.googlex.gcam.clientallocator.InterleavedU16ClientAllocator;
import com.google.googlex.gcam.hdrplus.MutableMergedRawCallback;
import com.google.googlex.gcam.clientallocator.RawClientAllocator;
import com.google.googlex.gcam.hdrplus.EncodedBlobCallback;
import com.google.googlex.gcam.clientallocator.YuvClientAllocator;
import com.google.googlex.gcam.hdrplus.BaseFrameCallback;
import com.google.googlex.gcam.base.function.IntConsumer;
import com.google.googlex.gcam.base.function.IntStringConsumer;
import com.google.googlex.gcam.base.function.IntLongConsumer;
import com.google.googlex.gcam.base.function.IntFloatConsumer;
import com.google.googlex.gcam.ShotCallbacks;
import android.graphics.RectF;
import com.google.googlex.gcam.NormalizedRect;
import com.google.googlex.gcam.AwbInfo;
import android.hardware.camera2.CaptureResult;
import com.google.googlex.gcam.PostviewParams;
import com.google.googlex.gcam.Tuning;
import com.google.googlex.gcam.PhysicalStabilityParams;
import com.google.googlex.gcam.GcamModuleJNI;
import java.util.concurrent.Executor;
import android.util.DisplayMetrics;
import com.google.googlex.gcam.hdrplus.HdrPlusInterface;
import com.google.googlex.gcam.Gcam;
import java.util.Map;
import com.google.googlex.gcam.BuildPayloadBurstSpecOptions;
import com.google.googlex.gcam.ViewfinderProcessingOptions;

// 
// Decompiled by Procyon v0.6.0
// 

final class dvm implements dvj
{
    public static final kre b;
    public static final kre c;
    private static final nsd f;
    private final hvd A;
    private final cyn B;
    private final ddx C;
    private final dul D;
    private final dub E;
    private final duq F;
    private final dvh G;
    private final klj H;
    private final krr I;
    private final kse J;
    private final dxk K;
    private final dva L;
    private final hah M;
    private final gwb N;
    private final liz O;
    private final gkn P;
    public final ViewfinderProcessingOptions d;
    public final BuildPayloadBurstSpecOptions e;
    private final String g;
    private final String h;
    private final Map i;
    private final Gcam j;
    private final HdrPlusInterface k;
    private final dug l;
    private final dwe m;
    private final cxl n;
    private final klj o;
    private final dwf p;
    private final DisplayMetrics q;
    private final ohv r;
    private final ohs s;
    private final lfg t;
    private final kre u;
    private final pii v;
    private final kjk w;
    private final fxb x;
    private final pii y;
    private String z;
    
    static {
        f = nsd.g("com/google/android/apps/camera/hdrplus/HdrPlusSessionImpl");
        b = kre.h(1920, 1080);
        c = kre.h(1920, 1440);
    }
    
    public dvm(DisplayMetrics writeLock, final dug l, final dwe m, final ohv r, final ohs s, final lfg t, final fvt fvt, final gij gij, final Gcam j, final ViewfinderProcessingOptions viewfinderProcessingOptions, final BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions, final pii v, final cxl n, final kjk w, final fxb x, final dwf dwf, final pii y, final hvd a, final cyn b, final ddx c, final dul d, final dub e, final duq f, final dth dth, final dvh g, final klj h, final krr krr, final kse i, final gkn p36, final dxk k, final dva l2, final Executor executor, final hah m2, final gwb n2, final liz o, final byte[] array) {
        this.k = new HdrPlusInterface();
        this.q = writeLock;
        this.l = l;
        this.m = m;
        this.r = r;
        this.s = s;
        this.t = t;
        this.j = j;
        this.o = fvt.b;
        this.n = n;
        this.w = w;
        this.x = x;
        this.p = dwf;
        this.y = y;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
        this.H = h;
        this.F = f;
        this.G = g;
        this.P = p36;
        this.K = k;
        this.L = l2;
        this.M = m2;
        this.N = n2;
        this.O = o;
        final ViewfinderProcessingOptions d2 = new ViewfinderProcessingOptions(GcamModuleJNI.new_ViewfinderProcessingOptions__SWIG_1(viewfinderProcessingOptions.a, viewfinderProcessingOptions));
        this.d = d2;
        this.e = new BuildPayloadBurstSpecOptions(buildPayloadBurstSpecOptions);
        this.u = gij.b;
        this.v = v;
        this.z = null;
        this.J = i;
        this.I = krr.a("HdrPlusSession");
        this.g = GcamModuleJNI.kRequestCameraSecondaryTele_get();
        this.h = GcamModuleJNI.kRequestCameraSecondaryWide_get();
        j.d(d2);
        final nnt nnt = new nnt();
        for (int n3 = 0; n3 < GcamModuleJNI.Gcam_GetNumCameras(j.a, j); ++n3) {
            final Tuning c2 = j.c(n3);
            final long tuning_physical_stability_params_get = GcamModuleJNI.Tuning_physical_stability_params_get(c2.a, c2);
            Object o2;
            if (tuning_physical_stability_params_get == 0L) {
                o2 = null;
            }
            else {
                o2 = new PhysicalStabilityParams(tuning_physical_stability_params_get);
            }
            nnt.d(n3, o2);
        }
        this.i = nnt.b();
        writeLock = (DisplayMetrics)dth.a.writeLock();
        ((Lock)writeLock).lock();
        try {
            dth.b = dwf;
            ((Lock)writeLock).unlock();
            if (n.k(cxs.W) && dwf != dwf.c) {
                w.c(f.a().a(new dvk(this, e, j, n), executor));
            }
        }
        finally {
            ((Lock)writeLock).unlock();
            while (true) {}
        }
    }
    
    private final int D(int gcam_FindFirstCamera) {
        if (!this.O.k) {
            njo.d(this.j.f());
        }
        final Gcam j = this.j;
        gcam_FindFirstCamera = GcamModuleJNI.Gcam_FindFirstCamera(j.a, j, gcam_FindFirstCamera);
        njo.d(gcam_FindFirstCamera >= 0);
        return gcam_FindFirstCamera;
    }
    
    private final dxh E(int gcam_StartShotCapture, final him him, final gen gen, final PostviewParams postviewParams, final ggv ggv, final ljm ljm, final boolean b, int intValue, final int n, final boolean b2, final int n2, final boolean b3, final niz niz) {
        this.I.b("startShotCapture()");
        final dxj b4 = this.K.b(him);
        final float a = this.r.a((int)((kkz)this.o).d);
        final int b5 = boa.b(gen.a.a, this.t);
        final hhy b6 = gen.b;
        niz niz2;
        if (b6 != null) {
            niz2 = b6.n();
        }
        else {
            niz2 = nii.a;
        }
        final boolean g = b4.b().g();
        dwf dwf;
        if (this.F.a().aQ()) {
            dwf = dwf.c;
        }
        else {
            dwf = null;
        }
        final ShotParams g2 = this.G(a, b5, ggv, gcam_StartShotCapture, b, g, b3, niz2, dwf, b2, niz.g());
        int n3;
        if (this.x.aQ() == fxa.a) {
            n3 = 0;
        }
        else {
            n3 = 1;
        }
        GcamModuleJNI.ShotParams_wb_mode_set(g2.a, g2, n3);
        String s;
        if (!b) {
            s = "n";
        }
        else {
            s = "z";
        }
        final dwf a2 = dwf.a;
        switch (this.p.ordinal()) {
            case 3: {
                s = s.concat("m");
                break;
            }
            case 2: {
                s = s.concat("l");
                break;
            }
            case 1: {
                s = s.concat("p");
                break;
            }
            case 0: {
                s = s.concat("d");
                break;
            }
        }
        GcamModuleJNI.ShotParams_software_suffix_set(g2.a, g2, s);
        njo.e(n >= -1, "Incorrect base frame override.");
        GcamModuleJNI.ShotParams_base_frame_override_index_set(g2.a, g2, n);
        if (b) {
            njo.e(true, "Incorrect base frame hint.");
            GcamModuleJNI.ShotParams_zsl_base_frame_index_hint_set(g2.a, g2, intValue);
        }
        if (dwf == null) {
            dwf = this.p;
        }
        final AwbInfo h = this.r.h(ljm);
        final ohv r = this.r;
        if (ljm != null) {
            final long longValue = (long)ljm.d(CaptureResult.SENSOR_EXPOSURE_TIME);
            final float[] o = ohv.o(r.f(ljm), ljm);
            final float b7 = ohv.b(longValue);
            final float n4 = o[0];
            final float n5 = o[1];
            final Integer n6 = (Integer)ljm.d(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            float n7;
            if (n6 != null) {
                n7 = n6 / 100.0f;
            }
            else {
                n7 = 1.0f;
            }
            final float n8 = b7 * (n4 * n5) * n7;
            GcamModuleJNI.ShotParams_previous_viewfinder_wb_set(g2.a, g2, AwbInfo.a(h), h);
            GcamModuleJNI.ShotParams_previous_viewfinder_tet_set(g2.a, g2, n8);
            final krr i = this.I;
            final StringBuilder sb = new StringBuilder(46);
            sb.append("takePicture - Viewfinder TET = ");
            sb.append(n8);
            i.g(sb.toString());
            intValue = (int)this.n.a(cxs.b).e(0);
            if (!b && !GcamModuleJNI.ShotParams_GcamAwbDesired(g2.a, g2) && intValue != 2) {
                intValue = 1;
            }
            else {
                intValue = 0;
            }
            if (niz.g()) {
                g2.c((AwbInfo)niz.c());
            }
            else if (intValue != 0) {
                g2.c(h);
            }
            this.r.r(g2.a(), ljm, this.l.j, this.u);
            if (b2) {
                if (this.p != dwf.b) {
                    if (this.p == dwf.a) {
                        this.n.e();
                    }
                }
                else {
                    g2.a().f(new NormalizedRect());
                }
            }
            final RectF rectF = (RectF)gen.a.j.f();
            if (rectF != null) {
                final AeShotParams a3 = g2.a();
                final NormalizedRect normalizedRect = new NormalizedRect();
                normalizedRect.c(rectF.left);
                normalizedRect.e(rectF.top);
                normalizedRect.d(rectF.right);
                normalizedRect.f(rectF.bottom);
                a3.f(normalizedRect);
                a3.h(normalizedRect);
            }
            if (this.p == dwf.b) {
                final AeShotParams a4 = g2.a();
                final NormalizedRect c = a4.c();
                if (!GcamModuleJNI.NormalizedRect_IsEmpty(c.a, c)) {
                    final NormalizedRect c2 = a4.c();
                    final NormalizedRect b8 = a4.b();
                    a4.h(new NormalizedRect(GcamModuleJNI.Union(NormalizedRect.a(c2), c2, NormalizedRect.a(b8), b8), true));
                }
            }
            final dxh dxh = new dxh(b4, this.q, gen, this.m.a.a(), this.A, this.B, this.C, g2, dwf, this.n.k(cxs.aj));
            final ShotCallbacks shotCallbacks = new ShotCallbacks();
            if (dxh.m.i().g()) {
                dxh.f.setProgressCallback(shotCallbacks.a, new dwz(dxh));
            }
            final oid g3 = dxh.g;
            final dxg p13 = dxh.p;
            final HdrPlusInterface a5 = g3.a;
            final long a6 = shotCallbacks.a;
            final ohy ohy = new ohy(p13);
            p13.getClass();
            final ohz ohz = new ohz(p13);
            p13.getClass();
            a5.setShotStatusCallbacks(a6, ohy, ohz, new ohx(p13));
            if (dxh.m.a().g()) {
                dxh.f.setBaseFrameCallback(shotCallbacks.a, new dxb(dxh));
            }
            final InterleavedU8ClientAllocator h2 = dxh.h;
            if (h2 != null || dxh.i != null) {
                if (h2 != null) {
                    dxh.f.setPostviewRgbAllocator(shotCallbacks.a, h2);
                }
                else {
                    final ogu j = dxh.i;
                    if (j != null) {
                        dxh.f.setPostviewYuvAllocator(shotCallbacks.a, j);
                    }
                }
                dxh.g.a.setPostviewCallback(shotCallbacks.a, oid.a(new dxd(dxh, 1)));
            }
            final InterleavedU8ClientAllocator k = dxh.j;
            if (k != null || dxh.k != null) {
                if (k != null) {
                    dxh.f.setFinalImageRgbAllocator(shotCallbacks.a, k);
                }
                final ogu l = dxh.k;
                if (l != null) {
                    dxh.f.setFinalImageYuvAllocator(shotCallbacks.a, l);
                }
                dxh.g.a.setFinalImageCallback(shotCallbacks.a, oid.a(new dxd(dxh)));
            }
            if (dxh.m.b().g()) {
                dxh.f.setMergedDngCallback(shotCallbacks.a, HdrPlusInterface.a(new dxc(dxh, 1), true));
            }
            if (dxh.m.j().g()) {
                final ogt ogt = new ogt();
                dxh.f.setMergedRawImageAllocator(shotCallbacks.a, ogt);
                dxh.g.a.setMergedRawImageCallback(shotCallbacks.a, oid.a(new dxe(dxh, ogt)));
            }
            if (dxh.m.d().g()) {
                dxh.g.a.setMutableMergedRawCallback(shotCallbacks.a, new oib(new dxf(dxh)));
            }
            if (dxh.m.e().g()) {
                dxh.f.setMergedPdAllocator(shotCallbacks.a, dxh.l);
                dxh.f.setMergedPdCallback(shotCallbacks.a, new dxa(dxh));
            }
            if (dxh.m.c().g()) {
                dxh.f.setJpegCallback(shotCallbacks.a, HdrPlusInterface.a(new dxc(dxh), false));
            }
            DebugParams debugParams2 = null;
            Label_1974: {
                if (this.E.e()) {
                    final niz a7 = ((ejf)this.v).a();
                    if (a7.g()) {
                        final ImageSaverParams imageSaverParams = new ImageSaverParams(GcamModuleJNI.new_ImageSaverParams(), true);
                        final hhy b9 = gen.b;
                        long n9;
                        if (b9 != null) {
                            n9 = b9.d();
                        }
                        else {
                            n9 = System.currentTimeMillis();
                        }
                        if (((File)a7.c()).getFreeSpace() <= 1073741824L) {
                            this.C.a("Cache has less than 1GB free. Slowraw data may be silently deleted.");
                        }
                        String z;
                        if (b2 && (this.p == dwf.b || this.p == dwf.a)) {
                            String s2;
                            if (this.n.k(cxr.R)) {
                                s2 = this.h;
                            }
                            else {
                                s2 = this.g;
                            }
                            final dub e = this.E;
                            final File file = (File)a7.c();
                            final String value = String.valueOf(s2);
                            String concat;
                            if (value.length() != 0) {
                                concat = "camera_".concat(value);
                            }
                            else {
                                concat = new String("camera_");
                            }
                            z = e.c(file, n9, concat);
                        }
                        else if (b2 && this.p == dwf.c) {
                            final dub e2 = this.E;
                            final File file2 = (File)a7.c();
                            final StringBuilder sb2 = new StringBuilder(25);
                            sb2.append("camera_kepler_");
                            sb2.append(n2);
                            z = e2.c(file2, n9, sb2.toString());
                        }
                        else {
                            z = this.E.c((File)a7.c(), n9, "");
                        }
                        this.z = z;
                        GcamModuleJNI.ImageSaverParams_dest_folder_set(imageSaverParams.a, imageSaverParams, z);
                        final DebugParams debugParams = new DebugParams();
                        GcamModuleJNI.DebugParams_save_bitmask_set(debugParams.a, debugParams, dub.a);
                        GcamModuleJNI.DebugParams_image_saver_params_set(debugParams.a, debugParams, imageSaverParams.a, imageSaverParams);
                        final hhy b10 = gen.b;
                        debugParams2 = debugParams;
                        if (b10 != null) {
                            b10.M(debugParams);
                            debugParams2 = debugParams;
                        }
                        break Label_1974;
                    }
                }
                debugParams2 = null;
            }
            if (b4.k().g()) {
                intValue = 3;
            }
            else if (b4.l().g()) {
                intValue = 5;
            }
            else if (b4.n().g()) {
                intValue = 1;
            }
            else {
                b4.c().g();
                intValue = 0;
            }
            this.J.f("Gcam::StartShotCapture");
            final Gcam m = this.j;
            final long a8 = m.a;
            final long a9 = g2.a;
            final long a10 = shotCallbacks.a;
            final long a11 = postviewParams.a;
            long a12;
            if (debugParams2 == null) {
                a12 = 0L;
            }
            else {
                a12 = debugParams2.a;
            }
            gcam_StartShotCapture = GcamModuleJNI.Gcam_StartShotCapture(a8, m, gcam_StartShotCapture, a9, g2, a10, shotCallbacks, intValue, a11, postviewParams, a12, debugParams2);
            this.J.g();
            if (gcam_StartShotCapture == GcamModuleJNI.kInvalidShotId_get()) {
                if (this.B == cyn.d) {
                    a.l(dvm.f.b(), "Gcam::StartShotCapture() returned an invalid shot id.", '\u03bc');
                    return null;
                }
                throw new IllegalArgumentException("Gcam::StartShotCapture() returned an invalid shot id.");
            }
            else {
                final kjk f = gen.a.f;
                final dul d = this.D;
                final duk duk = new duk(gcam_StartShotCapture);
                synchronized (d.a) {
                    d.b.add(duk);
                    monitorexit(d.a);
                    f.c(new dui(d, duk));
                    njo.d(gcam_StartShotCapture != GcamModuleJNI.kInvalidShotId_get());
                    njo.o(dxh.b == GcamModuleJNI.kInvalidShotId_get());
                    dxh.b = gcam_StartShotCapture;
                    return dxh;
                }
            }
        }
        throw new IllegalArgumentException("source should not be null");
    }
    
    private final AeShotParams F(final float n, final dwf dwf) {
        dwf p2 = dwf;
        if (dwf == null) {
            p2 = this.p;
        }
        final AeShotParams aeShotParams = new AeShotParams();
        final boolean h = this.l.h;
        aeShotParams.g(n);
        aeShotParams.k(this.u.a);
        aeShotParams.j(this.u.b);
        if (p2 == dwf.b) {
            aeShotParams.l(3);
        }
        else if (p2 == dwf.c) {
            aeShotParams.l(4);
        }
        else {
            if (p2 != dwf.a && p2 != dwf.d) {
                throw new IllegalStateException(String.format("Unknown HdrPlusType: %s.", p2));
            }
            aeShotParams.l(1);
        }
        this.P.c();
        GcamModuleJNI.AeShotParams_spoofed_touch_rectangle_set(aeShotParams.a, aeShotParams, false);
        return aeShotParams;
    }
    
    private final ShotParams G(float n, int n2, final ggv ggv, int intValue, final boolean b, final boolean b2, final boolean b3, niz g, dwf p11, final boolean b4, final boolean b5) {
        if (p11 == null) {
            p11 = this.p;
        }
        final ShotParams shotParams = new ShotParams();
        GcamModuleJNI.ShotParams_zsl_set(shotParams.a, shotParams, b);
        shotParams.d(GcamModuleJNI.DegreesToImageRotation(n2));
        shotParams.e(this.n.k(cxr.ba));
        GcamModuleJNI.ShotParams_save_merged_dng_set(shotParams.a, shotParams, b2);
        GcamModuleJNI.ShotParams_compress_merged_dng_set(shotParams.a, shotParams, true);
        final lfg t = this.t;
        final CameraCharacteristics$Key sensor_INFO_TIMESTAMP_SOURCE = CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
        final Integer value = 0;
        if ((int)t.n(sensor_INFO_TIMESTAMP_SOURCE, value) == 1 && g.g() && ((hwe)g.c()).c() > 0L && ((hwe)g.c()).d() > 0L) {
            GcamModuleJNI.ShotParams_shutter_press_down_timestamp_ns_set(shotParams.a, shotParams, ((hwe)g.c()).c());
            GcamModuleJNI.ShotParams_shutter_press_up_timestamp_ns_set(shotParams.a, shotParams, ((hwe)g.c()).d());
        }
        final AeShotParams f = this.F(n, p11);
        GcamModuleJNI.ShotParams_ae_set(shotParams.a, shotParams, AeShotParams.a(f), f);
        if (this.p == dwf.b) {
            GcamModuleJNI.ShotParams_resampling_method_override_set(shotParams.a, shotParams, 0);
            shotParams.a().k(0);
            shotParams.a().j(0);
            n2 = this.j.b(intValue).a();
            if (n2 == 0 || n2 == 10) {
                g = this.n.g(cyc.g);
                if (g.g() && ((Float)g.c()).equals(1.5172f)) {
                    shotParams.a().h(gvw.b);
                }
                else {
                    shotParams.a().h(gvw.a);
                }
            }
        }
        shotParams.a().i(this.N.e(this.p == dwf.b));
        final cxl n3 = this.n;
        final cxo a = cxs.a;
        n3.f();
        this.n.b();
        if (!this.l.a.k(cxr.as)) {
            GcamModuleJNI.ShotParams_icc_output_profile_override_set(shotParams.a, shotParams, 1);
        }
        if (ggv == ggv.a) {
            n2 = 0;
        }
        else if (ggv == ggv.c) {
            n2 = 1;
        }
        else {
            n2 = 2;
        }
        GcamModuleJNI.ShotParams_flash_mode_set(shotParams.a, shotParams, n2);
        GcamModuleJNI.ShotParams_allow_temporal_binning_set(shotParams.a, shotParams, dug.c(this.n) && p11 != dwf.c);
        n2 = (int)this.n.a(cxs.b).e(value);
        n2 = (new int[] { 1, 2, 3 })[n2];
        if (n2 != 0) {
            switch (n2 - 1) {
                case 2: {
                    shotParams.f(false);
                    break;
                }
                case 1: {
                    shotParams.f(true);
                    break;
                }
                case 0: {
                    shotParams.f(p11 == dwf.c && !b5);
                    break;
                }
            }
            this.n.b();
            this.n.e();
            this.n.b();
            n = (float)this.H.aQ();
            if (p11 == dwf.c) {
                if (!this.n.k(cxs.O)) {
                    this.F.q();
                    n2 = 0;
                }
                else {
                    n2 = 1;
                }
            }
            else {
                n2 = 0;
            }
            final boolean b6 = this.j.b(intValue).a() == 4 && this.n.k(cxs.N);
            Label_0840: {
                if (dug.d(this.n) && this.p != dwf.b) {
                    if (n >= 1.2f || n2 != 0) {
                        n2 = 1;
                        break Label_0840;
                    }
                    if (b6) {
                        n2 = 1;
                        break Label_0840;
                    }
                }
                n2 = 0;
            }
            this.n.b();
            if (this.n.k(cxs.M)) {
                GcamModuleJNI.ShotParams_merge_method_override_set(shotParams.a, shotParams, 0);
            }
            GcamModuleJNI.ShotParams_allow_sabre_set(shotParams.a, shotParams, n2 != 0);
            GcamModuleJNI.ShotParams_allow_spatial_rgb_set(shotParams.a, shotParams, false);
            boolean b7 = false;
            switch (p11.ordinal()) {
                default: {
                    b7 = false;
                    break;
                }
                case 2: {
                    b7 = this.n.k(cxs.H);
                    break;
                }
                case 1: {
                    b7 = this.n.k(cyc.A);
                    break;
                }
                case 0: {
                    b7 = this.n.k(cxs.I);
                    break;
                }
            }
            shotParams.g(b7);
            final niz g2 = this.n.g(cxs.J);
            if (g2.g()) {
                n = (float)g2.c();
                GcamModuleJNI.ShotParams_shasta_factor_set(shotParams.a, shotParams, n);
            }
            this.n.e();
            GcamModuleJNI.ShotParams_shasta_force_set(shotParams.a, shotParams, false);
            int n4 = GcamModuleJNI.ShotParams_nonzsl_frame_count_override_get(shotParams.a, shotParams);
            this.n.b();
            if (b && b7 && this.n.a(cxs.j).g()) {
                n4 = Math.max(n4, (int)this.n.a(cxs.j).c());
            }
            if (p11 == dwf.c) {
                final Integer n5 = (Integer)this.t.m(CameraCharacteristics.LENS_FACING);
                n5.getClass();
                final int intValue2 = n5;
                Label_1240: {
                    if (this.n.k(cxs.H)) {
                        n2 = Math.max(n4, 15);
                    }
                    else {
                        if (n2 != 0) {
                            if (intValue2 == 1) {
                                n2 = Math.max(n4, 15);
                                break Label_1240;
                            }
                        }
                        n2 = Math.max(n4, 13);
                    }
                }
                final boolean i = this.l.i;
                GcamModuleJNI.ShotParams_motion_ef_enabled_set(shotParams.a, shotParams, true);
                final PhysicalStabilityParams l = this.l(intValue);
                shotParams.i(GcamModuleJNI.PhysicalStabilityParams_max_handheld_shot_capture_time_ms_get(l.a, l));
                if (this.l.g && this.F.m()) {
                    Label_1461: {
                        if (intValue2 == 1) {
                            GcamModuleJNI.ShotParams_device_is_on_tripod_set(shotParams.a, shotParams, true);
                            if (b4) {
                                GcamModuleJNI.ShotParams_downsample_by_2_before_merge_set(shotParams.a, shotParams, true);
                                kre kre;
                                if (kqp.b.j(kqp.g(this.u))) {
                                    kre = dvm.b;
                                }
                                else {
                                    kre = dvm.c;
                                }
                                shotParams.a().k(kre.a);
                                shotParams.a().j(kre.b);
                            }
                            shotParams.g(false);
                            final Iterator iterator = this.G.b.values().iterator();
                            while (iterator.hasNext()) {
                                if ((long)iterator.next() >= dvh.a) {
                                    shotParams.i(15000.0f);
                                    shotParams.h(1000.0f);
                                    break Label_1461;
                                }
                            }
                            shotParams.i(Float.POSITIVE_INFINITY);
                        }
                    }
                    final Float n6 = (Float)this.n.g(cxs.z).f();
                    if (n6 != null) {
                        shotParams.h(n6 * 1000.0f);
                    }
                }
                final dug j = this.l;
                n4 = n2;
                if (j.a.a(cxs.c).g()) {
                    n4 = n2;
                    if ((int)j.a.a(cxs.c).c() > 0) {
                        intValue = (int)this.n.a(cxs.c).e(0);
                        GcamModuleJNI.ShotParams_psaf_frame_count_set(shotParams.a, shotParams, intValue);
                        final niz g3 = this.n.g(cxs.D);
                        if (g3.g()) {
                            n = (float)g3.c();
                            GcamModuleJNI.ShotParams_psaf_max_exposure_time_ms_set(shotParams.a, shotParams, n);
                        }
                        final niz g4 = this.n.g(cxs.E);
                        n4 = n2;
                        if (g4.g()) {
                            n = (float)g4.c();
                            GcamModuleJNI.ShotParams_psaf_log_scene_brightness_threshold_override_set(shotParams.a, shotParams, n);
                            n4 = n2;
                        }
                    }
                }
            }
            GcamModuleJNI.ShotParams_allow_base_frame_reuse_set(shotParams.a, shotParams, b3);
            GcamModuleJNI.ShotParams_nonzsl_frame_count_override_set(shotParams.a, shotParams, n4);
            GcamModuleJNI.ShotParams_optimize_sky_set(shotParams.a, shotParams, this.l.a.k(cxs.y));
            this.n.f();
            GcamModuleJNI.ShotParams_nonzsl_extended_base_frame_selection_set(shotParams.a, shotParams, true);
            GcamModuleJNI.ShotParams_rerun_face_detection_set(shotParams.a, shotParams, this.n.k(cxs.B));
            return shotParams;
        }
        throw null;
    }
    
    private final void H() {
        if (!this.w.a()) {
            return;
        }
        throw new kuw("Camera already closed");
    }
    
    private final boolean I() {
        if (!this.n.k(cxz.p)) {
            final cxl n = this.n;
            final cxo a = cxs.a;
            n.b();
            return false;
        }
        return true;
    }
    
    @Override
    public final Bitmap A(lju a, final ljm ljm, final ggv ggv, final niz niz, final niz niz2, final niz niz3, final niz niz4) {
        final int a2 = this.a(ljm);
        final StaticMetadata b = this.j.b(a2);
        final ShotParams g = this.G(this.r.a((int)((kkz)this.o).d), 0, ggv, a2, false, false, false, nii.a, (dwf)((njd)niz4).a, false, false);
        this.r.r(g.a(), ljm, this.l.j, (kre)niz.e(this.u));
        final AeShotParams a3 = g.a();
        final njd njd = (njd)niz;
        a3.k(((kre)njd.a).a);
        g.a().j(((kre)njd.a).b);
        final FrameMetadata k = this.k(ljm, this.C(ljm));
        final RawWriteView b2 = this.s.b(a);
        final SpatialGainMap n = this.r.n(ljm);
        final GenerateRgbImageOptions generateRgbImageOptions = new GenerateRgbImageOptions();
        GcamModuleJNI.GenerateRgbImageOptions_expected_number_of_frames_set(generateRgbImageOptions.a, generateRgbImageOptions, (int)((njd)niz2).a);
        GcamModuleJNI.GenerateRgbImageOptions_actual_number_of_frames_set(generateRgbImageOptions.a, generateRgbImageOptions, (int)((njd)niz3).a);
        final cxl n2 = this.n;
        final cxo a4 = cxs.a;
        n2.b();
        final long a5 = generateRgbImageOptions.a;
        final boolean b3 = false;
        GcamModuleJNI.GenerateRgbImageOptions_verbose_set(a5, generateRgbImageOptions, false);
        final int a6 = this.m.a.a();
        final InitParams a7 = this.m.a;
        final long initParams_finish_threads_get = GcamModuleJNI.InitParams_finish_threads_get(a7.a, a7);
        ThreadPoolConfig threadPoolConfig;
        if (initParams_finish_threads_get == 0L) {
            threadPoolConfig = null;
        }
        else {
            threadPoolConfig = new ThreadPoolConfig(initParams_finish_threads_get, false);
        }
        final InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(GcamModuleJNI.Gcam_GenerateRgbImage(StaticMetadata.b(b), b, g.a, g, FrameMetadata.b(k), k, SpatialGainMap.a(n), n, RawWriteView.d(b2), b2, a6, ThreadPoolConfig.a(threadPoolConfig), threadPoolConfig, generateRgbImageOptions.a, generateRgbImageOptions));
        if (interleavedImageU8.f()) {
            return null;
        }
        final Bitmap bitmap = Bitmap.createBitmap(this.q, interleavedImageU8.b(), interleavedImageU8.a(), Bitmap$Config.ARGB_8888);
        a = (lju)ogk.a(bitmap);
        try {
            final InterleavedReadViewU8 c = interleavedImageU8.c();
            final InterleavedWriteViewU8 a8 = ((ogk)a).a;
            final long a9 = c.a;
            final long a10 = InterleavedWriteViewU8.a(a8);
            njo.e(a9 != 0L, "src is null");
            njo.e(a10 != 0L || b3, "dst is null");
            ImageUtils.simpleRgbToAnyRgbImpl(a9, 5, a10);
            ((ogk)a).close();
            return bitmap;
        }
        finally {
            try {
                ((ogk)a).close();
            }
            finally {
                final Throwable t;
                ((Throwable)ljm).addSuppressed(t);
            }
        }
    }
    
    @Override
    public final boolean B(final int n, final ljm ljm, final lju lju, final lju lju2, final ljm ljm2, final lju lju3) {
        this.J.f("LiveTemporalBinning");
        final GyroSampleVector c = this.C(ljm);
        this.J.f("metadata");
        final FrameMetadata j = this.r.j(ljm, c);
        final SpatialGainMap n2 = this.r.n(ljm);
        this.J.g();
        final RawWriteView b = this.s.b(lju);
        RawWriteView rawWriteView;
        if (lju2 == null) {
            rawWriteView = new RawWriteView();
        }
        else {
            rawWriteView = (RawWriteView)this.s.a(lju2).e(new RawWriteView());
        }
        Runnable runnable;
        if (lju2 != null) {
            runnable = new gav(lju2, 1);
        }
        else {
            runnable = null;
        }
        FrameMetadata i;
        if (lju3 != null && ljm2 != null) {
            i = this.r.j(ljm2, c);
        }
        else {
            i = new FrameMetadata();
        }
        RawWriteView b2;
        if (lju3 != null) {
            b2 = this.s.b(lju3);
        }
        else {
            b2 = new RawWriteView();
        }
        Runnable runnable2;
        if (lju3 != null) {
            runnable2 = new gav(lju3, 1);
        }
        else {
            runnable2 = null;
        }
        final cxl n3 = this.n;
        final cxo a = cxs.a;
        n3.b();
        final dug l = this.l;
        int intValue;
        if (!l.a.a(cxs.n).g()) {
            intValue = -1;
        }
        else {
            intValue = (int)l.a.a(cxs.n).c();
        }
        final boolean temporallyBinViewfinderFrame = this.k.temporallyBinViewfinderFrame(Gcam.a(this.j), n, FrameMetadata.b(j), SpatialGainMap.a(n2), RawWriteView.d(b), new gav(lju, 1), RawWriteView.d(rawWriteView), runnable, FrameMetadata.b(i), RawWriteView.d(b2), runnable2, false, intValue);
        this.J.g();
        return temporallyBinViewfinderFrame;
    }
    
    public final GyroSampleVector C(final ljm ljm) {
        final Long n = (Long)ljm.d(CaptureResult.SENSOR_TIMESTAMP);
        n.getClass();
        final long longValue = n;
        final Long n2 = (Long)ljm.d(CaptureResult.SENSOR_EXPOSURE_TIME);
        n2.getClass();
        final long longValue2 = n2;
        final long e = this.r.e(ljm);
        final GyroSampleVector gyroSampleVector = new GyroSampleVector();
        final niz niz = (niz)this.y.get();
        if (niz.g()) {
            final lgq lgq = (lgq)niz.c();
            this.J.f("gyro");
            lgq.b(-5000000L + longValue, longValue2 + longValue + e + 5000000L, new dvl(gyroSampleVector));
            this.J.g();
        }
        return gyroSampleVector;
    }
    
    @Override
    public final int a(final ljm ljm) {
        final ohv r = this.r;
        return this.D(ohv.c(r.a, r.b, ljm));
    }
    
    @Override
    public final dug b() {
        return this.l;
    }
    
    @Override
    public final dwg c(final lju lju, final ljm ljm, final kre kre) {
        lju.getClass();
        njo.o(this.s.d(lju.a()));
        final RawWriteView b = this.s.b(lju);
        final FrameMetadata k = this.k(ljm, this.C(ljm));
        final SpatialGainMap n = this.r.n(ljm);
        final ohv r = this.r;
        final Integer n2 = (Integer)ljm.d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        n2.getClass();
        final dwg dwg = new dwg(b, k, n, this.F(r.a(n2), null), GcamModuleJNI.FrameMetadata_actual_exposure_time_ms_get(k.a, k) * GcamModuleJNI.FrameMetadata_actual_analog_gain_get(k.a, k) * GcamModuleJNI.FrameMetadata_applied_digital_gain_get(k.a, k) * GcamModuleJNI.FrameMetadata_post_raw_digital_gain_get(k.a, k));
        this.r.r(dwg.d, ljm, this.l.j, kre);
        return dwg;
    }
    
    @Override
    public final dxh d(final int n, final him him, final gen gen, final PostviewParams postviewParams, final ggv ggv, final ljm ljm) {
        this.J.f("HdrPlus#StartMomentsShotCapture");
        try {
            return this.E(n, him, gen, postviewParams, ggv, ljm, true, -1, -1, false, -1, true, nii.a);
        }
        finally {
            this.J.g();
        }
    }
    
    @Override
    public final dxh e(final int n, final gen gen, final PostviewParams postviewParams, final ggv ggv, final ljm ljm) {
        return this.f(n, gen, postviewParams, ggv, ljm, -1, false, -1, nii.a);
    }
    
    @Override
    public final dxh f(final int n, final gen gen, final PostviewParams postviewParams, final ggv ggv, final ljm ljm, final int n2, final boolean b, final int n3, final niz niz) {
        this.J.f("HdrPlus#StartShotCapture");
        try {
            final him h = gen.b.h();
            if (!b) {
                this.L.g(h);
            }
            return this.E(n, h, gen, postviewParams, ggv, ljm, false, -1, n2, b, n3, false, niz);
        }
        finally {
            this.J.g();
        }
    }
    
    @Override
    public final dxh g(final int n, final gen gen, final PostviewParams postviewParams, final ggv ggv, final ljm ljm, final int n2, final int n3, final boolean b) {
        this.J.f("HdrPlus#StartZslShotCapture");
        try {
            final him h = gen.b.h();
            if (!b) {
                this.L.g(h);
            }
            int n4;
            if (!b) {
                n4 = -1;
            }
            else {
                n4 = 1;
            }
            return this.E(n, h, gen, postviewParams, ggv, ljm, true, n2, n3, b, n4, false, nii.a);
        }
        finally {
            this.J.g();
        }
    }
    
    @Override
    public final AeResults h(final dwg dwg) {
        final AeShotParams d = dwg.d;
        final RawWriteView a = dwg.a;
        final FrameMetadata b = dwg.b;
        final SpatialGainMap c = dwg.c;
        final int d2 = this.D(b.a());
        final StaticMetadata b2 = this.j.b(d2);
        final Tuning c2 = this.j.c(d2);
        return new AeResults(GcamModuleJNI.Gcam_ComputeAeResults(StaticMetadata.b(b2), b2, c2.a, c2, AeShotParams.a(d), d, RawReadView.b(a), a, FrameMetadata.b(b), b, SpatialGainMap.a(c), c, false), true);
    }
    
    @Override
    public final BurstSpec i(final dxh dxh, final lju lju, final ljm ljm) {
        this.I.b("buildAfBurstSpec()");
        this.H();
        final dwg c = this.c(lju, ljm, this.u);
        if (c.b != null && c.a != null && c.c != null) {
            final Gcam j = this.j;
            final int a = dxh.a();
            final RawWriteView a2 = c.a;
            final FrameMetadata b = c.b;
            final SpatialGainMap c2 = c.c;
            return new BurstSpec(GcamModuleJNI.Gcam_BuildAfBurstSpec(j.a, j, a, RawReadView.b(a2), a2, FrameMetadata.b(b), b, SpatialGainMap.a(c2), c2));
        }
        this.I.d("buildAfBurstSpec failed due to incomplete viewfinder frame. Out of memory?");
        return new BurstSpec();
    }
    
    @Override
    public final BurstSpec j(final dxh dxh, final lju lju, final ljm ljm, final boolean b) {
        this.I.b("buildPayloadBurstSpec()");
        this.H();
        this.J.f("buildPayloadBurstSpec#convertFrame");
        final dwg c = this.c(lju, ljm, this.u);
        this.J.h("buildPayloadBurstSpec#create");
        if (c.b != null && c.a != null && c.c != null) {
            final BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions = new BuildPayloadBurstSpecOptions(this.e);
            GcamModuleJNI.BuildPayloadBurstSpecOptions_shasta_zsl_set(buildPayloadBurstSpecOptions.a, buildPayloadBurstSpecOptions, b);
            if (b) {
                final niz g = this.n.g(cxs.K);
                final boolean g2 = g.g();
                float max = 66.666664f;
                if (g2) {
                    max = Math.max(66.666664f, (float)g.c());
                }
                GcamModuleJNI.BuildPayloadBurstSpecOptions_max_total_capture_time_ms_set(buildPayloadBurstSpecOptions.a, buildPayloadBurstSpecOptions, max);
            }
            final Gcam j = this.j;
            final int a = dxh.a();
            final RawWriteView a2 = c.a;
            final FrameMetadata b2 = c.b;
            final SpatialGainMap c2 = c.c;
            final BurstSpec burstSpec = new BurstSpec(GcamModuleJNI.Gcam_BuildPayloadBurstSpec(j.a, j, a, RawReadView.b(a2), a2, FrameMetadata.b(b2), b2, SpatialGainMap.a(c2), c2, buildPayloadBurstSpecOptions.a, buildPayloadBurstSpecOptions));
            this.J.g();
            return burstSpec;
        }
        this.I.d("buildPayloadBurstSpec failed due to incomplete viewfinder frame. Out of memory?");
        return new BurstSpec();
    }
    
    @Override
    public final FrameMetadata k(final ljm ljm, final GyroSampleVector gyroSampleVector) {
        final Long n = (Long)ljm.d(CaptureResult.SENSOR_TIMESTAMP);
        final Map map = null;
        Map map3;
        final Map map2 = map3 = null;
        if (n != null) {
            final had d = this.M.d(n);
            map3 = map2;
            if (d != null) {
                map3 = map2;
                if (d.p.g()) {
                    if (((hat)d.p.c()).a.length == 0) {
                        map3 = map;
                    }
                    else {
                        final HashMap hashMap = new HashMap();
                        final has[] a = ((hat)d.p.c()).a;
                        final int length = a.length;
                        int n2 = 0;
                        while (true) {
                            map3 = hashMap;
                            if (n2 >= length) {
                                break;
                            }
                            final has has = a[n2];
                            if (has.c > 0.0f) {
                                hashMap.put((int)has.a, has.c);
                            }
                            ++n2;
                        }
                    }
                }
            }
        }
        if (!this.n.k(cxs.S)) {
            return this.r.k(ljm, gyroSampleVector, map3);
        }
        final FrameMetadataKey l = this.r.l(ljm);
        if (l == null) {
            return this.r.k(ljm, gyroSampleVector, map3);
        }
        final FrameMetadata frameMetadata = new FrameMetadata();
        final Gcam j = this.j;
        if (!GcamModuleJNI.Gcam_OverrideFrameMetadata(j.a, j, l.a, l, FrameMetadata.b(frameMetadata), frameMetadata)) {
            return this.r.k(ljm, gyroSampleVector, map3);
        }
        return frameMetadata;
    }
    
    @Override
    public final PhysicalStabilityParams l(final int n) {
        final PhysicalStabilityParams physicalStabilityParams = this.i.get(n);
        physicalStabilityParams.getClass();
        return physicalStabilityParams;
    }
    
    @Override
    public final ViewfinderResults m(final int n) {
        final Gcam j = this.j;
        return new ViewfinderResults(GcamModuleJNI.Gcam_GetLatestViewfinderResults(j.a, j, n));
    }
    
    @Override
    public final void n(final dxh dxh) {
        final int a = dxh.a();
        final kse j = this.J;
        final StringBuilder sb = new StringBuilder(21);
        sb.append("AbortShot-");
        sb.append(a);
        j.f(sb.toString());
        final Gcam i = this.j;
        GcamModuleJNI.Gcam_AbortShot(i.a, i, a);
        this.J.g();
    }
    
    @Override
    public final void o(final dxh dxh, final int n, final ljm ljm, final lju lju, final lju lju2) {
        this.p(dxh, n, ljm, lju, lju2, nii.a);
    }
    
    @Override
    public final void p(final dxh dxh, final int n, final ljm ljm, final lju lju, final lju lju2, final niz niz) {
        this.J.f("AddPayloadFrame");
        final GyroSampleVector c = this.C(ljm);
        this.J.f("metadata");
        FrameMetadata k = new FrameMetadata();
        if (ljm != null) {
            final FrameMetadata frameMetadata = k = this.k(ljm, c);
            if (niz.g()) {
                frameMetadata.f().c(((dvi)niz.c()).a);
                frameMetadata.f().b(((dvi)niz.c()).b);
                frameMetadata.f().f(((dvi)niz.c()).a);
                frameMetadata.f().d(((dvi)niz.c()).b);
                k = frameMetadata;
            }
        }
        if (lju != null && this.I()) {
            final String z = this.z;
            z.getClass();
            duv.b(z, n, ljm);
        }
        final List e = dxh.e;
        final Long n2 = (Long)ljm.d(CaptureResult.SENSOR_TIMESTAMP);
        n2.getClass();
        e.add(n2);
        dxh.d.add(ljm);
        final SpatialGainMap n3 = this.r.n(ljm);
        this.J.h("wrapImages");
        long aHardwareBufferPtr = 0L;
        final Runnable runnable = null;
        RawWriteView b;
        Runnable runnable2;
        Runnable runnable3;
        if (lju != null) {
            b = this.s.b(lju);
            final HardwareBuffer f = lju.f();
            Runnable e2;
            Runnable f2;
            if (f != null) {
                aHardwareBufferPtr = AndroidJniUtils.getAHardwareBufferPtr(f);
                final ohr ohr = new ohr(lju, f);
                e2 = ohr.e;
                f2 = ohr.f;
            }
            else {
                e2 = new gav(lju, 1);
                f2 = null;
            }
            runnable2 = e2;
            runnable3 = f2;
        }
        else {
            b = new RawWriteView();
            aHardwareBufferPtr = 0L;
            runnable2 = (runnable3 = null);
        }
        RawWriteView rawWriteView2;
        Runnable runnable6;
        if (lju2 != null) {
            final niz a = this.s.a(lju2);
            RawWriteView rawWriteView;
            Runnable runnable4;
            if (a.g()) {
                rawWriteView = (RawWriteView)a.c();
                runnable4 = new gav(lju2, 1);
            }
            else {
                rawWriteView = new RawWriteView();
                runnable4 = runnable;
            }
            final Runnable runnable5 = runnable4;
            rawWriteView2 = rawWriteView;
            runnable6 = runnable5;
        }
        else {
            rawWriteView2 = new RawWriteView();
            runnable6 = null;
        }
        this.J.h("addPayloadFrame()");
        if (!this.k.addPayloadFrame(Gcam.a(this.j), dxh.a(), FrameMetadata.b(k), SpatialGainMap.a(n3), RawWriteView.d(b), runnable2, RawWriteView.d(rawWriteView2), runnable6, aHardwareBufferPtr, runnable3)) {
            dvm.f.b().E(957).s("addPayloadFrame for shot %d failed, closing input images at frame index %d.", dxh.a(), n);
            if (lju != null) {
                lju.close();
            }
            if (lju2 != null) {
                lju2.close();
            }
        }
        this.J.g();
        this.J.g();
    }
    
    @Override
    public final void q(final int n, final lju lju, final ljm ljm) {
        final dwg c = this.c(lju, ljm, this.u);
        this.k.addViewfinderFrame(Gcam.a(this.j), n, FrameMetadata.b(c.b), SpatialGainMap.a(c.c), AeShotParams.a(c.d), RawWriteView.d(c.a), new gav(lju, 1));
    }
    
    @Override
    public final void r(final dxh dxh) {
        this.s(dxh, new BurstSpec());
    }
    
    @Override
    public final void s(final dxh dxh, final BurstSpec burstSpec) {
        final kse j = this.J;
        final int a = dxh.a();
        final StringBuilder sb = new StringBuilder(30);
        sb.append("BeginPayloadFrames-");
        sb.append(a);
        j.f(sb.toString());
        final Gcam i = this.j;
        GcamModuleJNI.Gcam_BeginPayloadFrames(i.a, i, dxh.a(), burstSpec.a, burstSpec);
        this.J.g();
    }
    
    @Override
    public final void t(final dxh dxh) {
        final int a = dxh.a();
        final Gcam j = this.j;
        GcamModuleJNI.Gcam_EndZslPayloadFrames(j.a, j, a);
    }
    
    @Override
    public final void u(final int n) {
        final Gcam j = this.j;
        GcamModuleJNI.Gcam_FlushTemporalBinning(j.a, j, n);
    }
    
    @Override
    public final void v(final int n) {
        final Gcam j = this.j;
        GcamModuleJNI.Gcam_FlushViewfinder(j.a, j, n);
    }
    
    @Override
    public final boolean w(final ljm ljm) {
        final ksd ksd = new ksd(this.J, "HdrPlusSession#claimFrameForTemporalBinning");
        try {
            final FrameMetadataKey l = this.r.l(ljm);
            if (l == null) {
                ksd.close();
                return false;
            }
            final Gcam j = this.j;
            final boolean gcam_ClaimFrameForBinning = GcamModuleJNI.Gcam_ClaimFrameForBinning(j.a, j, l.a, l);
            ksd.close();
            return gcam_ClaimFrameForBinning;
        }
        finally {
            try {
                ksd.close();
            }
            finally {
                final Throwable t;
                ((Throwable)ljm).addSuppressed(t);
            }
        }
    }
    
    @Override
    public final boolean x(final dxh dxh) {
        final int a = dxh.a();
        final kse j = this.J;
        final StringBuilder sb = new StringBuilder(28);
        sb.append("EndPayloadFrames-");
        sb.append(a);
        j.f(sb.toString());
        final Gcam i = this.j;
        final boolean gcam_EndPayloadFrames = GcamModuleJNI.Gcam_EndPayloadFrames(i.a, i, a, ClientShotMetadata.a(null), null);
        if (!gcam_EndPayloadFrames) {
            this.I.d("EndPayloadFrames() failed.");
        }
        if (this.I()) {
            this.J.h("writeDebugMetadata");
            duv.a();
            this.J.g();
        }
        this.J.g();
        return gcam_EndPayloadFrames;
    }
    
    @Override
    public final boolean y(final dxh dxh) {
        final int a = dxh.a();
        final kse j = this.J;
        final StringBuilder sb = new StringBuilder(26);
        sb.append("EndShotCapture-");
        sb.append(a);
        j.f(sb.toString());
        final Gcam i = this.j;
        final boolean gcam_EndShotCapture = GcamModuleJNI.Gcam_EndShotCapture(i.a, i, a);
        this.J.g();
        return gcam_EndShotCapture;
    }
    
    @Override
    public final boolean z(final ljm ljm) {
        final ksd ksd = new ksd(this.J, "HdrPlusSession#lockFrameFromFutureBinning");
        try {
            final FrameMetadataKey l = this.r.l(ljm);
            if (l == null) {
                ksd.close();
                return false;
            }
            final Gcam j = this.j;
            final boolean gcam_LockFrameFromFutureBinning = GcamModuleJNI.Gcam_LockFrameFromFutureBinning(j.a, j, l.a, l);
            ksd.close();
            return gcam_LockFrameFromFutureBinning;
        }
        finally {
            try {
                ksd.close();
            }
            finally {
                final Throwable t;
                ((Throwable)ljm).addSuppressed(t);
            }
        }
    }
}
