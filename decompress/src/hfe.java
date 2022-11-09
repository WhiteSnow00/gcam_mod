import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfe
{
    public final kra a;
    public final int b;
    public final int c;
    private final UUID d;
    private final int e;
    private final long f;
    private final gwa g;
    private final hio h;
    private final cxl i;
    private final byte[] j;
    private final ExifInterface k;
    
    public hfe(final int e, final long f, final UUID d, final kra a, final int b, final int c, final byte[] j, final ExifInterface k, final gwa g, final hio h, final cxl i) {
        this.e = e;
        this.f = f;
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
        this.j = j;
        this.k = k;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final hwr a(final hia hia, final niz niz, final niz niz2) {
        kre.h(this.b, this.c);
        final hwr hwr = new hwr(llk.c);
        hwr.b(this.a);
        try {
            final FileOutputStream e = hia.a.e();
            try {
                this.b(niz, niz2, hia.b, hia.a().c(), e);
                e.close();
                hia.c();
                return hwr;
            }
            finally {
                try {
                    e.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)niz).addSuppressed(t);
                }
            }
        }
        catch (final IOException ex) {
            hia.b();
            throw new IllegalStateException(ex);
        }
    }
    
    public final void b(final niz niz, final niz niz2, final boolean b, final String s, final OutputStream outputStream) {
        final ExifInterface k = this.k;
        k.getClass();
        final OutputStream m = k.m(outputStream);
        try {
            final byte[] j = this.j;
            final boolean g = this.g.c.g();
            final apf apf = null;
            apf apf2 = null;
            byte[] array = j;
            if (g) {
                final byte[] d = DynamicDepthUtils.d(this.j, (DynamicDepthResult)this.g.c.c(), null);
                ((DynamicDepthResult)this.g.c.c()).close();
                array = j;
                if (d != null) {
                    array = d;
                }
            }
            final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array);
            apf apf3 = null;
            apf apf4;
            if (this.g.c.g()) {
                final nja e = lmx.e(byteArrayInputStream);
                Label_0168: {
                    if (e != null) {
                        final Object a = e.a;
                        if (a != null) {
                            apf3 = (apf)a;
                            break Label_0168;
                        }
                    }
                    apf3 = null;
                }
                if (e != null) {
                    final Object b2 = e.b;
                    if (b2 != null) {
                        apf2 = (apf)b2;
                    }
                }
                apf4 = apf2;
                if (this.g.b.g()) {
                    apf4 = lmx.b(apf2, (apf)this.g.b.f());
                }
                byteArrayInputStream.reset();
            }
            else if (this.g.a.g()) {
                apf3 = (apf)this.g.a.c();
                apf4 = (apf)this.g.b.f();
            }
            else {
                final apf apf5 = (apf)this.g.b.f();
                apf3 = apf;
                apf4 = apf5;
            }
            final cxl i = this.i;
            Label_0422: {
                if (i != null && i.k(cyc.C)) {
                    final hio h = this.h;
                    if (h != null && h == hio.k) {
                        if (apf3 == null) {
                            apf3 = lmx.a();
                        }
                        lmx.k(apf3, s);
                        break Label_0422;
                    }
                }
                if (apf3 == null) {
                    final UUID d2 = this.d;
                    apf3 = lmx.a();
                    hff.a(d2, b, s, b ^ true, apf3);
                }
                else {
                    hff.a(this.d, b, s, b ^ true, apf3);
                }
            }
            final ExifInterface l = this.k;
            if (l != null) {
                apf4 = lmx.b(apf4, (apf)lmx.c(l.by).f());
            }
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            lmx.o(byteArrayInputStream, byteArrayOutputStream, apf3, apf4);
            m.write(byteArrayOutputStream.toByteArray());
            if (niz.g()) {
                if (niz2.g()) {
                    dyz.a((byte[])niz.c(), (String)niz2.c());
                }
                final byte[] array2 = (byte[])niz.c();
                m.write((byte[])niz.c());
            }
            m.close();
        }
        finally {
            try {
                m.close();
            }
            finally {
                final Throwable t;
                ((Throwable)niz).addSuppressed(t);
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof hfe) {
            final hfe hfe = (hfe)o;
            if (this.f == hfe.f && this.b == hfe.b && this.c == hfe.c && this.e == hfe.e) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return String.format("%d_%dx%d_%d", this.f, this.b, this.c, this.e).hashCode();
    }
    
    @Override
    public final String toString() {
        final long f = this.f;
        final StringBuilder sb = new StringBuilder(38);
        sb.append("BurstMemoryImage[");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
