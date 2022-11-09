// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.rectiface.jni;

import com.google.googlex.gcam.StaticMetadata;
import android.os.Build;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import java.nio.file.Path;
import java.io.FileOutputStream;
import com.google.googlex.gcam.imageio.JpgHelper;
import com.google.googlex.gcam.JpgEncodeOptions;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.Paths;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.image.ImageUtils;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.LockedHardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;
import android.graphics.Bitmap;
import com.google.android.apps.camera.rectiface.Rectiface$RectifaceProgressCallback;
import android.hardware.HardwareBuffer;

public final class RectifaceImpl implements hbb, krc, exn, ewr, ews
{
    private static final nsd a;
    private final cxl b;
    private long c;
    private long d;
    private boolean e;
    private int f;
    private final gwc g;
    private final gwb h;
    private final klv i;
    
    static {
        a = nsd.g("com/google/android/apps/camera/rectiface/jni/RectifaceImpl");
        hbk.a();
    }
    
    public RectifaceImpl(final gwc g, final gwb h, final klv i, final cxl b, final kjm kjm, final ewn ewn) {
        this.c = 0L;
        this.d = 0L;
        this.e = false;
        this.g = g;
        this.h = h;
        this.i = i;
        this.b = b;
        egz.c(kjm, ewn, this);
    }
    
    private static native void copyRgbaToRgbImpl(final long p0, final long p1, final long p2, final boolean p3);
    
    private static native String correctFaceDistortionAHWBImpl(final HardwareBuffer p0, final long p1, final long p2, final long p3, final long p4, final boolean p5, final boolean p6, final boolean p7, final boolean p8, final boolean p9, final long p10, final Rectiface$RectifaceProgressCallback p11, final long p12);
    
    private static native String correctFaceDistortionImpl(final long p0, final long p1, final long p2, final long p3, final long p4, final boolean p5, final boolean p6, final boolean p7, final boolean p8, final boolean p9, final long p10, final Rectiface$RectifaceProgressCallback p11, final long p12);
    
    private static native boolean correctLensDistortionAHWBZeroCopyImpl(final HardwareBuffer p0, final HardwareBuffer p1, final long p2, final long p3);
    
    private static native boolean correctLensDistortionImpl(final Bitmap p0, final long p1);
    
    private static native boolean correctLensDistortionYuvImpl(final long p0, final long p1);
    
    private static native long initializeLensCorrectionImpl(final int p0, final int p1);
    
    private static native long initializeSegmenterImpl(final long p0, final int p1, final String p2, final String p3, final int p4);
    
    private final void o(HardwareBuffer c, final ShotMetadata shotMetadata, final int n, final String s) {
        c = (HardwareBuffer)LockedHardwareBuffer.c(c, 2L);
        try {
            final InterleavedReadViewU8 a = ((LockedHardwareBuffer)c).a();
            final InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(a.d(), a.c(), a.b());
            ImageUtils.a(a, interleavedImageU8.d());
            this.p(interleavedImageU8.c(), shotMetadata, n, s);
            ((LockedHardwareBuffer)c).close();
        }
        finally {
            try {
                ((LockedHardwareBuffer)c).close();
            }
            finally {
                final Throwable t;
                ((Throwable)shotMetadata).addSuppressed(t);
            }
        }
    }
    
    private final void p(final InterleavedReadViewU8 interleavedReadViewU8, final ShotMetadata shotMetadata, int length, final String s) {
        try {
            int imageRotationToDegrees;
            if (this.b.k(cxr.ba)) {
                imageRotationToDegrees = GcamModuleJNI.ImageRotationToDegrees(shotMetadata.b());
                okn.z(shotMetadata);
            }
            else {
                imageRotationToDegrees = 0;
            }
            final Path value = Paths.get("sdcard", "DCIM", "CAMERA", s);
            Files.createDirectories(value, (FileAttribute<?>[])new FileAttribute[0]);
            final JpgEncodeOptions jpgEncodeOptions = new JpgEncodeOptions();
            GcamModuleJNI.JpgEncodeOptions_quality_set(jpgEncodeOptions.a, jpgEncodeOptions, 80);
            GcamModuleJNI.JpgEncodeOptions_shot_metadata_set(jpgEncodeOptions.a, jpgEncodeOptions, ShotMetadata.c(shotMetadata), shotMetadata);
            final niz a = JpgHelper.a(interleavedReadViewU8, jpgEncodeOptions, imageRotationToDegrees);
            String s2 = null;
            switch (length - 1) {
                default: {
                    s2 = "output";
                    break;
                }
                case 0: {
                    s2 = "input";
                    break;
                }
            }
            final int length2 = String.valueOf(s).length();
            length = s2.length();
            final StringBuilder sb = new StringBuilder(length2 + 5 + length);
            sb.append(s);
            sb.append("_");
            sb.append(s2);
            sb.append(".jpg");
            final FileOutputStream fileOutputStream = new FileOutputStream(Files.createFile(value.resolve(sb.toString()), (FileAttribute<?>[])new FileAttribute[0]).toFile());
            fileOutputStream.write((byte[])a.c());
            fileOutputStream.close();
        }
        catch (final Exception ex) {}
    }
    
    private static final void q(final ShotMetadata shotMetadata) {
        shotMetadata.j(String.valueOf(shotMetadata.h()).concat("Skipped Rectiface since the module is not initialized."));
        a.k(RectifaceImpl.a.c(), "%s", "Skipped Rectiface since the module is not initialized.", '\u08ae');
    }
    
    private static native void releaseSegmenterImpl(final long p0);
    
    @Override
    public final void a() {
        if (this.h.a() == 0L && this.l()) {
            this.h.c();
        }
    }
    
    @Override
    public final void b() {
        if (this.h.a() != 0L) {
            this.h.d();
        }
    }
    
    @Override
    public final hbj c() {
        final RectifaceWarpfieldImpl rectifaceWarpfieldImpl = new RectifaceWarpfieldImpl();
        if (rectifaceWarpfieldImpl.b == 0L) {
            rectifaceWarpfieldImpl.b = RectifaceWarpfieldImpl.initializeImpl();
        }
        a.l(RectifaceWarpfieldImpl.a.c(), "Ignored Rectiface warpfield re-initialization.", '\u08b3');
        njo.p(rectifaceWarpfieldImpl.b != 0L, "Invalid rectiface warpfield.");
        return rectifaceWarpfieldImpl;
    }
    
    @Override
    public final void close() {
        this.e = false;
        final long c = this.c;
        if (c != 0L) {
            releaseSegmenterImpl(c);
            this.c = 0L;
        }
        final long d = this.d;
        if (d != 0L) {
            releaseSegmenterImpl(d);
            this.d = 0L;
        }
    }
    
    @Override
    public final InterleavedImageU8 d(final HardwareBuffer hardwareBuffer) {
        final int format = hardwareBuffer.getFormat();
        final boolean b = false;
        njo.e(format == 1, "HardwareBuffer format unexpected.");
        final LockedHardwareBuffer c = LockedHardwareBuffer.c(hardwareBuffer, 2L);
        try {
            final InterleavedReadViewU8 a = c.a();
            njo.d(a.b() == 4);
            final InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(a.d(), a.c(), 3);
            final InterleavedWriteViewU8 d = interleavedImageU8.d();
            njo.e(a.b() == 4, "Expect srcBuffer in RGBA8 format.");
            njo.e(GcamModuleJNI.InterleavedWriteViewU8_channels(d.a, d) == 3, "Expect dstBuffer in RGB8 format.");
            njo.d(a.d() == GcamModuleJNI.InterleavedWriteViewU8_width(d.a, d));
            njo.d(a.c() == GcamModuleJNI.InterleavedWriteViewU8_height(d.a, d) || b);
            copyRgbaToRgbImpl(a.a, InterleavedWriteViewU8.a(d), this.c, this.e);
            c.close();
            hardwareBuffer.close();
            return interleavedImageU8;
        }
        finally {
            try {
                c.close();
            }
            finally {
                final Throwable t;
                ((Throwable)hardwareBuffer).addSuppressed(t);
            }
        }
    }
    
    @Override
    public final void e(final Bitmap bitmap, final ShotMetadata shotMetadata) {
        bitmap.getClass();
        if (!correctLensDistortionImpl(bitmap, ShotMetadata.c(shotMetadata))) {
            a.l(RectifaceImpl.a.b(), "Lens correction failed.", '\u08a8');
        }
    }
    
    @Override
    public final void f(final YuvWriteView yuvWriteView, final ShotMetadata shotMetadata) {
        yuvWriteView.getClass();
        if (!correctLensDistortionYuvImpl(YuvWriteView.e(yuvWriteView), ShotMetadata.c(shotMetadata))) {
            a.l(RectifaceImpl.a.b(), "Lens correction failed.", '\u08a9');
        }
    }
    
    @Override
    public final void g() {
        final long c = this.c;
        boolean b = false;
        Label_0188: {
            if (c == 0L) {
                final gwc g = this.g;
                if (g != null) {
                    if (g.a() == 0L && this.i()) {
                        a.l(RectifaceImpl.a.c(), "Expected portrait segmenter to be initialized, but it wasn't. Initializing again.", '\u08ab');
                        this.g.b();
                    }
                    final long a = this.g.a();
                    final String manufacturer = Build.MANUFACTURER;
                    manufacturer.getClass();
                    final String device = Build.DEVICE;
                    device.getClass();
                    this.c = initializeSegmenterImpl(a, 8, manufacturer, device, 0);
                    int f;
                    if (this.b.k(cxx.M) && this.b.k(cxx.m)) {
                        f = 1;
                    }
                    else {
                        f = 0;
                    }
                    this.f = f;
                    this.d = initializeLensCorrectionImpl(8, f);
                    break Label_0188;
                }
            }
            a.l(RectifaceImpl.a.c(), "Ignored Rectiface (Segmenter) re-initialization.", '\u08aa');
        }
        if (this.c != 0L) {
            b = true;
        }
        njo.p(b, "Invalid segmenter.");
        this.e = true;
    }
    
    @Override
    public final boolean h(final HardwareBuffer hardwareBuffer, final HardwareBuffer hardwareBuffer2, final ShotMetadata shotMetadata) {
        if ((this.f == 1 && hardwareBuffer.getFormat() != 35) || (this.f == 0 && hardwareBuffer.getFormat() != 1)) {
            a.l(RectifaceImpl.a.c(), "Lens distortion correction skipped because of format mismatch.", '\u08b2');
            return false;
        }
        hardwareBuffer.getClass();
        return correctLensDistortionAHWBZeroCopyImpl(hardwareBuffer, hardwareBuffer2, ShotMetadata.c(shotMetadata), this.d);
    }
    
    @Override
    public final boolean i() {
        return this.b.k(cyd.i);
    }
    
    @Override
    public final void j(final HardwareBuffer hardwareBuffer, final ShotMetadata shotMetadata, final boolean b, String value, final hbj hbj, final huz huz, final Rectiface$RectifaceProgressCallback rectiface$RectifaceProgressCallback) {
        if (!this.e) {
            q(shotMetadata);
            return;
        }
        if (!this.b.k(cyd.b)) {
            return;
        }
        final Boolean value2 = !value.isEmpty() && this.b.k(cyd.h);
        if (value2) {
            this.o(hardwareBuffer, shotMetadata, 1, value);
        }
        final RectifaceOutput rectifaceOutput = new RectifaceOutput();
        final String correctFaceDistortionAHWBImpl = correctFaceDistortionAHWBImpl(hardwareBuffer, ShotMetadata.c(shotMetadata), this.c, ((RectifaceWarpfieldImpl)hbj).b, this.h.a(), this.n(), this.m(shotMetadata), this.b.k(cyd.e), this.b.k(cyd.f) || b, this.b.k(cyd.g) || !this.i() || !(boolean)this.i.aQ(), rectifaceOutput.a, rectiface$RectifaceProgressCallback, 0L);
        if (value2) {
            this.o(hardwareBuffer, shotMetadata, 2, value);
        }
        final String value3 = String.valueOf(shotMetadata.h());
        value = String.valueOf(correctFaceDistortionAHWBImpl);
        String concat;
        if (value.length() != 0) {
            concat = value3.concat(value);
        }
        else {
            concat = new String(value3);
        }
        shotMetadata.j(concat);
        if (huz != null) {
            final okt m = nyw.i.m();
            final int n = och.p()[rectifaceOutput.i()];
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyw nyw = (nyw)m.b;
            if (n == 0) {
                throw null;
            }
            nyw.b = n - 1;
            nyw.a |= 0x1;
            final int c = rectifaceOutput.c();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyw nyw2 = (nyw)m.b;
            nyw2.a |= 0x2;
            nyw2.e = c;
            final int f = rectifaceOutput.f();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyw nyw3 = (nyw)m.b;
            nyw3.a |= 0x10;
            nyw3.g = f;
            final int h = rectifaceOutput.h();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyw nyw4 = (nyw)m.b;
            nyw4.a |= 0x8;
            nyw4.f = h;
            final int g = rectifaceOutput.g();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyw nyw5 = (nyw)m.b;
            nyw5.a |= 0x40;
            nyw5.h = g;
            if (rectifaceOutput.e() > 0) {
                for (int i = 0; i < rectifaceOutput.e(); ++i) {
                    m.t(rectifaceOutput.b(i));
                }
            }
            final RectifaceOutput rectifaceOutput2 = rectifaceOutput;
            if (rectifaceOutput2.d() > 0) {
                for (int j = 0; j < rectifaceOutput2.d(); ++j) {
                    m.s(rectifaceOutput2.a(j));
                }
            }
            huz.g((nyw)m.h());
        }
        rectifaceOutput.j();
    }
    
    @Override
    public final void k(final InterleavedWriteViewU8 interleavedWriteViewU8, final ShotMetadata shotMetadata, final boolean b, String value, final hbj hbj, final huz huz, final Rectiface$RectifaceProgressCallback rectiface$RectifaceProgressCallback) {
        if (!this.e) {
            q(shotMetadata);
            return;
        }
        if (!this.b.k(cyd.b)) {
            return;
        }
        final Boolean value2 = !value.isEmpty() && this.b.k(cyd.h);
        if (value2) {
            this.p(interleavedWriteViewU8.b(), shotMetadata, 1, value);
        }
        final RectifaceOutput rectifaceOutput = new RectifaceOutput();
        final String correctFaceDistortionImpl = correctFaceDistortionImpl(InterleavedWriteViewU8.a(interleavedWriteViewU8), ShotMetadata.c(shotMetadata), this.c, ((RectifaceWarpfieldImpl)hbj).b, this.h.a(), this.n(), this.m(shotMetadata), this.b.k(cyd.e), this.b.k(cyd.f) || b, this.b.k(cyd.g) || !this.i(), rectifaceOutput.a, rectiface$RectifaceProgressCallback, 0L);
        if (value2) {
            this.p(interleavedWriteViewU8.b(), shotMetadata, 2, value);
        }
        final String value3 = String.valueOf(shotMetadata.h());
        value = String.valueOf(correctFaceDistortionImpl);
        String concat;
        if (value.length() != 0) {
            concat = value3.concat(value);
        }
        else {
            concat = new String(value3);
        }
        shotMetadata.j(concat);
        if (huz != null) {
            final okt m = nyw.i.m();
            final int n = och.p()[rectifaceOutput.i()];
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyw nyw = (nyw)m.b;
            if (n == 0) {
                throw null;
            }
            nyw.b = n - 1;
            nyw.a |= 0x1;
            final int c = rectifaceOutput.c();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyw nyw2 = (nyw)m.b;
            nyw2.a |= 0x2;
            nyw2.e = c;
            final int f = rectifaceOutput.f();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyw nyw3 = (nyw)m.b;
            nyw3.a |= 0x10;
            nyw3.g = f;
            final int h = rectifaceOutput.h();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyw nyw4 = (nyw)m.b;
            nyw4.a |= 0x8;
            nyw4.f = h;
            final int g = rectifaceOutput.g();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyw nyw5 = (nyw)m.b;
            nyw5.a |= 0x40;
            nyw5.h = g;
            if (rectifaceOutput.e() > 0) {
                for (int i = 0; i < rectifaceOutput.e(); ++i) {
                    m.t(rectifaceOutput.b(i));
                }
            }
            if (rectifaceOutput.d() > 0) {
                final float[] array = new float[rectifaceOutput.d()];
                for (int j = 0; j < rectifaceOutput.d(); ++j) {
                    m.s(rectifaceOutput.a(j));
                }
            }
            huz.g((nyw)m.h());
        }
        rectifaceOutput.j();
    }
    
    public final boolean l() {
        return this.b.k(cyd.c);
    }
    
    public final boolean m(final ShotMetadata shotMetadata) {
        if ((int)this.b.a(cyd.a).c() == 2) {
            final StaticMetadata g = shotMetadata.g();
            if (GcamModuleJNI.StaticMetadata_lens_facing_get(g.a, g) == 1) {
                final boolean b = true;
                return !this.b.k(cyd.d) || b;
            }
        }
        final boolean b = false;
        return !this.b.k(cyd.d) || b;
    }
    
    public final boolean n() {
        return !this.l() || !this.i() || !(boolean)this.i.aQ();
    }
}
