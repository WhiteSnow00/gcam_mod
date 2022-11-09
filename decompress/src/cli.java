import java.io.File;
import android.location.Location;
import java.io.IOException;
import com.google.android.libraries.camera.exif.ExifInterface;

// 
// Decompiled by Procyon v0.6.0
// 

final class cli
{
    private static final nsd a;
    private final ckn b;
    private final eya c;
    private final jdi d;
    private final cqz e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/camcorder/snapshot/SnapshotUtils");
    }
    
    public cli(final ckn b, final eya c, final jdi d, final cqz e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final cgg a(final byte[] array, final kra kra) {
        final long currentTimeMillis = System.currentTimeMillis();
        final ExifInterface a = new ExifInterface();
        try {
            a.r(array);
        }
        catch (final IOException ex) {
            a.l(cli.a.b(), "fail to read EXIF from JPEG byte array.", '\u0228');
        }
        final Integer b = a.b(ExifInterface.ai);
        boolean b2 = false;
        int intValue;
        if (b != null) {
            intValue = b;
        }
        else {
            intValue = 0;
        }
        final Integer b3 = a.b(ExifInterface.aj);
        int intValue2;
        if (b3 != null) {
            intValue2 = b3;
        }
        else {
            intValue2 = 0;
        }
        if (a.k(ExifInterface.b) == null || a.k(ExifInterface.a) == null) {
            a.y(a.i(ExifInterface.a, intValue));
            a.y(a.i(ExifInterface.b, intValue2));
        }
        if (a.k(ExifInterface.j) == null) {
            a.y(a.i(ExifInterface.j, kvc.b(kra).i));
        }
        final kvj kvj = new kvj(a);
        kvj.g(currentTimeMillis);
        niz e = nii.a;
        if (this.b.a.c(hjq.a)) {
            final niz niz = e = this.c.d();
            if (niz.g()) {
                kvj.d((Location)niz.c());
                e = niz;
            }
        }
        this.d.a(a);
        final cqz e2 = this.e;
        final hif b4 = e2.b;
        final jdv a2 = e2.a;
        final hie d = b4.d(System.currentTimeMillis());
        final hia a3 = d.a("jpg");
        try {
            final long h = lpy.h(array, a, a3.a);
            if (h > 0L) {
                b2 = true;
            }
            njo.t(b2, "Expected to write a positive number of bytes to %s, instead wrote %s from byteArray of size %s", a3.a, h, array.length);
            final kra a4 = kvc.a(kvc.c(a));
            final cgg cgg = new cgg(null);
            cgg.b = new File("");
            cgg.a = a;
            cgg.c = a3;
            cgg.d = d;
            cgg.e = e;
            final llk c = llk.c;
            if (c != null) {
                cgg.f = c;
                cgg.g = new kre(intValue, intValue2);
                cgg.h = a4.e;
                cgg.i = currentTimeMillis;
                return cgg;
            }
            throw new NullPointerException("Null mimeType");
        }
        catch (final IOException ex2) {
            a.m(cli.a.b(), "Failed to create file: ", '\u0227', ex2);
            throw ex2;
        }
    }
}
