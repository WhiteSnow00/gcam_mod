import java.util.concurrent.Executor;
import android.graphics.Rect;
import java.io.IOException;
import com.google.android.libraries.camera.exif.ExifInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dwk
{
    public final cxl a;
    private final krr b;
    private final jdi c;
    private final gbf d;
    
    public dwk(final cxl a, final jdi c, final gbf d, final krr krr) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = krr.a("JpegCompressSaving");
    }
    
    public final void a(final gen gen, final kjk kjk, final int n, final int n2, final byte[] array, final niz niz) {
        final int c = gen.a.c;
        try {
            Object o;
            if (niz.g()) {
                o = niz.c();
            }
            else {
                o = new ExifInterface();
                ((ExifInterface)o).r(array);
            }
            final kvc c2 = kvc.c((ExifInterface)o);
            if (c >= 0) {
                final kvh i = ((ExifInterface)o).i(ExifInterface.bf, "M");
                final kvh j = ((ExifInterface)o).i(ExifInterface.bg, new krb(c, 1L));
                ((ExifInterface)o).y(i);
                ((ExifInterface)o).y(j);
            }
            final byte[] e = gen.a.e;
            if (e.length > 0) {
                ((ExifInterface)o).y(((ExifInterface)o).i(ExifInterface.f, (Object)new String(e)));
            }
            kre.h(n, n2);
            this.c(gen, kjk, array, kvc.a(c2).e, (ExifInterface)o);
        }
        catch (final IOException ex) {
            this.b.i("Could not read exif from gcam jpeg", ex);
            throw new IllegalStateException("Could not read exif from gcam jpeg", ex);
        }
    }
    
    public final void b(final dwu dwu, final String s) {
        final gen j = dwu.j;
        final dxs b = dwu.b;
        if (b != null) {
            final ExifInterface a = dub.a(b.c(), b.b(), dwu.d, dwu.j.b.m());
            final gya a2 = gyb.a(b);
            a2.a = j.a.d;
            a2.c = dwu.e;
            a2.c(dwu.f);
            a2.f = new Rect(0, 0, b.c(), b.b());
            a2.e = j.b.k();
            a2.h = dwu.m.a;
            final gyb a3 = a2.a();
            ofi.w(this.d.b(a3), new dwj(this, a3, a, s, j), odx.a);
            return;
        }
        throw new IllegalStateException("Expected YUV image but it's missing");
    }
    
    public final void c(final gen gen, final kjk kjk, final byte[] array, final int n, final ExifInterface exifInterface) {
        gen.b.k().i(array.length);
        this.c.a(exifInterface);
        final hwr hwr = new hwr(llk.c);
        hwr.a(exifInterface);
        hwr.b(kra.b(n));
        gen.b.r(array, hwr);
        kjk.close();
    }
}
