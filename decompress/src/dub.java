import java.io.File;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import com.google.googlex.gcam.PostviewParams;
import java.io.UnsupportedEncodingException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import com.google.googlex.gcam.DebugParams;
import java.io.IOException;
import com.google.googlex.gcam.imageio.ExifEncode;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.GcamModuleJNI;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dub
{
    public static final long a;
    private static final nsd b;
    private final cxl c;
    
    static {
        b = nsd.g("com/google/android/apps/camera/hdrplus/GcamUtils");
        a = (GcamModuleJNI.DEBUG_SAVE_INPUT_METERING_get() | GcamModuleJNI.DEBUG_SAVE_INPUT_PAYLOAD_get() | GcamModuleJNI.DEBUG_SAVE_TEXT_get());
    }
    
    public dub(final cxl c) {
        this.c = c;
    }
    
    public static ExifInterface a(int length, int n, ShotMetadata by, final niz niz) {
        final byte[] encodeGcamExif = new ExifEncode().encodeGcamExif(length, n, ShotMetadata.c(by));
        if (encodeGcamExif != null) {
            length = encodeGcamExif.length;
        }
        else {
            length = 0;
        }
        final byte[] array = new byte[length + 4];
        n = length + 2;
        array[0] = -1;
        array[1] = -31;
        array[2] = (byte)(n >> 8 & 0xFF);
        array[3] = (byte)(n & 0xFF);
        if (length > 0) {
            System.arraycopy(encodeGcamExif, 0, array, 4, length);
        }
        final ExifInterface exifInterface = new ExifInterface();
        try {
            exifInterface.r(array);
        }
        catch (final IOException ex) {
            a.k(dub.b.c(), "Unable to parse EXIF: %s", ex.getMessage(), '\u03a3');
        }
        if (by.a() != 1 && by.a() != 0 && by.a() != 3) {
            exifInterface.bx = 2;
        }
        else {
            exifInterface.bx = 1;
        }
        GcamModuleJNI.ShotMetadata_xmp_metadata_main_get(by.a, by);
        by = (ShotMetadata)GcamModuleJNI.ShotMetadata_xmp_metadata_extended_get(by.a, by);
        Label_0379: {
            if (niz.g() && ((DebugParams)niz.c()).a() != null && ((DebugParams)niz.c()).a().a() != null) {
                final niz c = lmx.c((String)by);
                if (c.g()) {
                    lmx.j((apf)c.c(), ((DebugParams)niz.c()).a().a());
                    try {
                        final apf apf = (apf)c.c();
                        final aqk aqk = new aqk();
                        aph.d(apf);
                        final apu apu = (apu)apf;
                        aqk.f(3, false);
                        aqk.f(2, true);
                        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
                        acw.c(apu, byteArrayOutputStream, aqk);
                        try {
                            by = (ShotMetadata)byteArrayOutputStream.toString(aqk.b());
                        }
                        catch (final UnsupportedEncodingException ex2) {
                            by = (ShotMetadata)byteArrayOutputStream.toString();
                        }
                        break Label_0379;
                    }
                    catch (final ape ape) {
                        break Label_0379;
                    }
                }
                a.l(dub.b.c(), "Extended XMP section not found to append slowraw directory", '\u03a1');
            }
        }
        exifInterface.by = (String)by;
        return exifInterface;
    }
    
    public static PostviewParams b(final lfg lfg, final gij gij) {
        final PostviewParams postviewParams = new PostviewParams();
        final kre b = ohv.g(lfg).b;
        postviewParams.b(5);
        final float b2 = kqp.g(gij.b).b();
        final int a = b.a;
        final int b3 = b.b;
        int n;
        int n2;
        if (a > b3) {
            n = Math.round(a / 6.0f);
            n2 = Math.round(n / b2 * 1.05f);
        }
        else {
            n2 = Math.round(b3 / 6.0f);
            n = Math.round(n2 * b2 * 1.05f);
        }
        final kre kre = new kre(n + 1 & 0xFFFFFFFE, n2 + 1 & 0xFFFFFFFE);
        final int a2 = kre.a;
        if (a2 > kre.b) {
            postviewParams.d(a2);
            postviewParams.c(0);
        }
        else {
            postviewParams.d(0);
            postviewParams.c(kre.b);
        }
        return postviewParams;
    }
    
    public static String d(final long n) {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS");
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        final String value = String.valueOf(simpleDateFormat.format(n));
        String concat;
        if (value.length() != 0) {
            concat = "XXXX_".concat(value);
        }
        else {
            concat = new String("XXXX_");
        }
        return concat;
    }
    
    public final String c(File file, final long n, final String s) {
        if (!file.exists() || !file.isDirectory()) {
            final String value = String.valueOf(file.getAbsolutePath());
            String concat;
            if (value.length() != 0) {
                concat = "Gcam debug directory not valid or doesn't exist: ".concat(value);
            }
            else {
                concat = new String("Gcam debug directory not valid or doesn't exist: ");
            }
            throw new RuntimeException(concat);
        }
        file = new File(new File(new File(file, "gcam"), d(n)), s);
        if (!file.mkdirs()) {
            final String value2 = String.valueOf(file.getAbsolutePath());
            String concat2;
            if (value2.length() != 0) {
                concat2 = "Could not create Gcam debug data folder: ".concat(value2);
            }
            else {
                concat2 = new String("Could not create Gcam debug data folder: ");
            }
            throw new RuntimeException(concat2);
        }
        return file.getAbsolutePath();
    }
    
    public final boolean e() {
        if (!this.c.k(cxz.p)) {
            final cxl c = this.c;
            final cxo a = cxs.a;
            c.b();
            return false;
        }
        return true;
    }
}
