import com.google.android.libraries.camera.exif.ExifInterface;
import android.hardware.HardwareBuffer;
import android.hardware.camera2.params.Face;
import android.graphics.Rect;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.imageio.JpgHelper;
import com.google.googlex.gcam.JpgEncodeOptions;
import com.google.android.apps.camera.rectiface.Rectiface$RectifaceProgressCallback;
import com.google.googlex.gcam.StringStaticMetadataMap;
import com.google.googlex.gcam.StringFrameMetadataMap;
import com.google.googlex.gcam.PixelRect;
import com.google.googlex.gcam.PixelRectVector;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.hdrplus.HdrPlusInterface;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.image.YuvUtils;
import com.google.googlex.gcam.InterleavedImageU8;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dvc
{
    private final dwk a;
    private final dwf b;
    private final fxu c;
    private final efp d;
    private final efp e;
    private final efp f;
    private final cxl g;
    private final ddm h;
    private final dev i;
    private final dww j;
    
    public dvc(final dwk a, final dwf b, final fxu c, final oui oui, final oui oui2, final oui oui3, final cxl g, final ddm h, final dev i, final dww j) {
        this.a = a;
        this.b = b;
        this.d = efp.a(oui);
        this.c = c;
        this.e = efp.a(oui2);
        this.f = efp.a(oui3);
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final niz a(final dtx dtx, niz niz, final boolean b) {
        if (niz.g()) {
            final dwu dwu = (dwu)niz.c();
            if (this.d.c()) {
                ((fve)this.d.b()).m(dwu.j.b.h(), dwu.g);
            }
        }
        if (this.b == dwf.d) {
            if (!niz.g()) {
                return niz.i(duf.i);
            }
            return nii.a;
        }
        else if (b) {
            if (!niz.g()) {
                return niz.i(duf.g);
            }
            return nii.a;
        }
        else {
            niz niz2;
            if (niz.g()) {
                final dwu dwu2 = (dwu)niz.c();
                duf duf;
                if (dwu2.b != null) {
                    duf = duf.c;
                }
                else if (dwu2.a != null) {
                    duf = duf.d;
                }
                else {
                    if (dwu2.c == null) {
                        throw new IllegalArgumentException("Unknown image format in PostprocessingImage.");
                    }
                    duf = duf.e;
                }
                niz2 = niz.i(duf);
            }
            else {
                niz2 = nii.a;
            }
            final int intValue = (int)this.g.a(cyd.a).c();
            final int intValue2 = (int)this.g.a(cyd.a).c();
            final lfu l = this.c.l();
            final lfu a = lfu.a;
            final boolean b2 = intValue2 == 2 || intValue == 1;
            final boolean b3 = this.c.l() == lfu.a && this.g.k(cxg.g) && dtx.a.b();
            final cxl g = this.g;
            final cxo a2 = cxg.a;
            g.e();
            final cxl g2 = this.g;
            final cxo a3 = cxr.a;
            g2.c();
            final boolean b4 = this.h.b();
            final boolean e = dtx.e;
            if (this.e.c() && this.e.b() instanceof dwr) {
                if (!niz.g()) {
                    return niz.i(duf.c);
                }
                final dwu dwu3 = (dwu)niz.c();
                dwu3.b.getClass();
                this.j.b(dwu3);
                final dww j = this.j;
                final dxs b5 = dwu3.b;
                b5.getClass();
                final InterleavedImageU8 a4 = new InterleavedImageU8(b5.c(), b5.b(), 3);
                YuvUtils.a(j.d.c(b5), a4.d());
                final dwt c = dwu3.c();
                c.b();
                c.a = a4;
                final dwu a5 = c.a();
                final dww i = this.j;
                final dws c2 = ((dwq)i.g.c()).c(a5.j);
                final InterleavedImageU8 a6 = a5.a;
                if (a6 != null) {
                    final String a7 = dwm.a;
                    final HdrPlusInterface hdrPlusInterface = new HdrPlusInterface();
                    final dwo h = a5.h;
                    h.getClass();
                    final long a8 = h.a.a;
                    final int b6 = a6.b();
                    final int a9 = a6.a();
                    final ShotMetadata d = a5.d;
                    final int e2 = a5.e.e;
                    final boolean k = i.f.k(cxr.ba);
                    final dwo h2 = a5.h;
                    h2.getClass();
                    final gdx b7 = h2.b;
                    final kre b8 = i.h.b;
                    final boolean d2 = a5.m.d;
                    final PortraitRequest portraitRequest = new PortraitRequest();
                    GcamModuleJNI.PortraitRequest_image_rotation_set(portraitRequest.a, portraitRequest, GcamModuleJNI.DegreesToImageRotation((360 - e2) % 360));
                    GcamModuleJNI.PortraitRequest_manually_rotate_xmp_jpg_set(portraitRequest.a, portraitRequest, k);
                    final PixelRectVector pixelRectVector = new PixelRectVector();
                    final Rect b9 = b7.b;
                    final float n = (float)b6;
                    final float n2 = n / b9.width();
                    final float n3 = a9 / (float)b9.height();
                    final Face[] a10 = b7.a;
                    for (int n4 = 0; n4 < a10.length; ++n4) {
                        final Rect bounds = a10[n4].getBounds();
                        final PixelRect pixelRect = new PixelRect();
                        pixelRect.b((int)((bounds.left - b9.left) * n2));
                        pixelRect.d((int)((bounds.top - b9.top) * n3));
                        pixelRect.c((int)((bounds.right - b9.left) * n2));
                        pixelRect.e((int)((bounds.bottom - b9.top) * n3));
                        pixelRectVector.a(pixelRect);
                    }
                    GcamModuleJNI.PortraitRequest_faces_set(portraitRequest.a, portraitRequest, pixelRectVector.a, pixelRectVector);
                    final int a11 = b8.a;
                    final int b10 = b8.b;
                    GcamModuleJNI.PortraitRequest_output_width_set(portraitRequest.a, portraitRequest, a11);
                    GcamModuleJNI.PortraitRequest_output_height_set(portraitRequest.a, portraitRequest, b10);
                    final StringFrameMetadataMap stringFrameMetadataMap = new StringFrameMetadataMap(GcamModuleJNI.new_StringFrameMetadataMap__SWIG_0(), true);
                    stringFrameMetadataMap.b(dwm.a, d.f());
                    GcamModuleJNI.PortraitRequest_frame_metadata_set(portraitRequest.a, portraitRequest, stringFrameMetadataMap.a, stringFrameMetadataMap);
                    final StringStaticMetadataMap stringStaticMetadataMap = new StringStaticMetadataMap(GcamModuleJNI.new_StringStaticMetadataMap__SWIG_0(), true);
                    stringStaticMetadataMap.b(dwm.a, d.g());
                    GcamModuleJNI.PortraitRequest_static_metadata_set(portraitRequest.a, portraitRequest, stringStaticMetadataMap.a, stringStaticMetadataMap);
                    GcamModuleJNI.PortraitRequest_post_resample_sharpening_set(portraitRequest.a, portraitRequest, hdrPlusInterface.getPostZoomSharpenStrength(a8, a11 / n));
                    GcamModuleJNI.PortraitRequest_output_format_primary_set(portraitRequest.a, portraitRequest, 3);
                    GcamModuleJNI.PortraitRequest_use_internal_rectiface_set(portraitRequest.a, portraitRequest, d2);
                    c2.c(a6, portraitRequest, a5.d, a5.i, a5.j.a.f);
                    c2.close();
                    return nii.a;
                }
                throw new IllegalStateException("RGB for portrait processing unavailable");
            }
            else {
                Label_1614: {
                    if (intValue == 1 || (intValue2 == 2 && l == a)) {
                        if (dtx.d && this.f.c()) {
                            if (!niz.g()) {
                                return niz.i(duf.e);
                            }
                            final dwu dwu4 = (dwu)niz.c();
                            dwu dwu5;
                            if (dwu4.a != null) {
                                dwu5 = this.j.a(dwu4);
                            }
                            else {
                                final HardwareBuffer c3 = dwu4.c;
                                c3.getClass();
                                final dww m = this.j;
                                c3.getClass();
                                final boolean b11 = m.e == dwf.c;
                                final hbb hbb = (hbb)((niz)m.c.get()).c();
                                final hbj c4 = hbb.c();
                                final cxl f = m.f;
                                final int a12 = cxh.a;
                                f.e();
                                final dwv dwv = new dwv(dwu4);
                                c3.getClass();
                                hbb.j(c3, dwu4.d, b11, dwu4.j.b.s(), c4, dwu4.j.b.k(), dwv);
                                final dwt c5 = dwu4.c();
                                c5.g = c4;
                                dwu5 = c5.a();
                            }
                            final niz i2 = niz.i(dwu5);
                            final hbj l2 = dwu5.l;
                            l2.getClass();
                            this.i.d(((dwu)((njd)i2).a).j.b.h(), l2);
                            niz = i2;
                            break Label_1614;
                        }
                    }
                    if (b2) {
                        if (!niz.g()) {
                            return niz.i(duf.d);
                        }
                        ((dwu)niz.c()).a.getClass();
                        final dwu a13 = this.j.a((dwu)niz.c());
                        niz = niz.i(a13);
                        final hbj l3 = a13.l;
                        l3.getClass();
                        this.i.d(((dwu)((njd)niz).a).j.b.h(), l3);
                    }
                    else if (niz.g()) {
                        this.i.d(((dwu)niz.c()).j.b.h(), null);
                    }
                }
                final cxl g3 = this.g;
                final int a14 = cxh.a;
                g3.b();
                this.g.e();
                this.g.e();
                niz i3 = niz;
                if (niz.g()) {
                    i3 = niz;
                    if (((dwu)niz.c()).c != null) {
                        final dww j2 = this.j;
                        final dwu dwu6 = (dwu)niz.c();
                        final HardwareBuffer c6 = dwu6.c;
                        c6.getClass();
                        final InterleavedImageU8 d3 = ((hbb)((niz)j2.c.get()).c()).d(c6);
                        final dwt c7 = dwu6.c();
                        c7.b();
                        c7.a = d3;
                        i3 = niz.i(c7.a());
                    }
                }
                niz = i3;
                if (b3) {
                    if (!i3.g()) {
                        return niz.i(duf.c);
                    }
                    dwu c8 = (dwu)i3.c();
                    njo.o(c8.c == null);
                    if (c8.a != null) {
                        c8 = dww.c(c8);
                    }
                    this.j.b(c8);
                    niz = niz.i(c8);
                }
                if (!niz.g() && b4) {
                    return niz.i(duf.c);
                }
                if (niz.g() && dtx.h) {
                    final dww j3 = this.j;
                    final dwu dwu7 = (dwu)niz.c();
                    j3.b.b("Swiss not present. Returning without swiss.");
                    niz = niz.i(dwu7);
                }
                if (e) {
                    if (!niz.g()) {
                        return niz.i(duf.c);
                    }
                    dwu c9;
                    final dwu dwu8 = c9 = (dwu)niz.c();
                    if (dwu8.a != null) {
                        c9 = dww.c(dwu8);
                    }
                    this.a.b(c9, dug.a((duf)niz2.c()));
                    return nii.a;
                }
                else {
                    if (!niz.g()) {
                        return niz.i(duf.b);
                    }
                    final dwu dwu9 = (dwu)niz.c();
                    if (dwu9.b != null) {
                        this.a.b(dwu9, dug.a((duf)niz2.c()));
                        return nii.a;
                    }
                    if (dwu9.a != null) {
                        final dwk a15 = this.a;
                        final JpgEncodeOptions jpgEncodeOptions = new JpgEncodeOptions();
                        final InterleavedImageU8 a16 = dwu9.a;
                        a16.getClass();
                        kre kre = dwu9.b();
                        final ShotMetadata d4 = dwu9.d;
                        int imageRotationToDegrees;
                        if (a15.a.k(cxr.ba)) {
                            imageRotationToDegrees = GcamModuleJNI.ImageRotationToDegrees(d4.b());
                            okn.z(d4);
                            kre = kre.i(kra.b(imageRotationToDegrees));
                            final dwt c10 = dwu9.c();
                            c10.e(kra.a);
                            c10.a();
                        }
                        else {
                            imageRotationToDegrees = 0;
                        }
                        final ExifInterface a17 = dub.a(kre.a, kre.b, dwu9.d, dwu9.j.b.m());
                        final niz a18 = JpgHelper.a(a16.c(), jpgEncodeOptions, imageRotationToDegrees);
                        a16.e();
                        final gen j4 = dwu9.j;
                        a15.a(j4, j4.a.f, kre.a, kre.b, (byte[])a18.c(), niz.i(a17));
                        return nii.a;
                    }
                    throw new IllegalStateException("Requested JPEG and still got uncompressed callback.");
                }
            }
        }
    }
}
