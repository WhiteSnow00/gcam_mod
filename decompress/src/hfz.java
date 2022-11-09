import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.concurrent.Executor;
import android.graphics.Bitmap;
import com.google.googlex.gcam.DebugParams;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hfz implements hhy
{
    private static final nsd b;
    public final him a;
    private final huz c;
    private final String d;
    private final long e;
    private final btl f;
    private ljm g;
    private final ofn h;
    
    static {
        b = nsd.g("com/google/android/apps/camera/session/ImageIntentSession");
    }
    
    public hfz(final String d, final long e, final btl f, final huz c, final ofn h) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.c = c;
        this.a = him.a();
        njo.p(h.isDone() ^ true, "SettableFuture for image data is already set before the session started");
        this.h = h;
    }
    
    @Override
    public final void A() {
    }
    
    @Override
    public final void B() {
    }
    
    @Override
    public final void C(final iwv iwv, final Throwable t) {
    }
    
    @Override
    public final void L(final ljm g) {
        this.g = g;
    }
    
    @Override
    public final void M(final DebugParams debugParams) {
    }
    
    @Override
    public final void O(final iwv iwv) {
        monitorenter(this);
        monitorexit(this);
    }
    
    @Override
    public final void P(final kre kre) {
        monitorenter(this);
        monitorexit(this);
    }
    
    @Override
    public final void S(final Integer n) {
    }
    
    @Override
    public final void U(final Bitmap bitmap, final int n) {
    }
    
    @Override
    public final void V(final Bitmap bitmap) {
    }
    
    @Override
    public final void W(final Bitmap bitmap) {
    }
    
    @Override
    public final void Y(final int n) {
    }
    
    @Override
    public final krd a() {
        synchronized (this) {
            return krd.b;
        }
    }
    
    @Override
    public final void b(final krd krd) {
        monitorenter(this);
        monitorexit(this);
    }
    
    @Override
    public final void c(final gxd gxd) {
    }
    
    @Override
    public final long d() {
        return this.e;
    }
    
    @Override
    public final hia f() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final hie g() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final him h() {
        return this.a;
    }
    
    @Override
    public final hio i() {
        return hio.i;
    }
    
    @Override
    public final hip j() {
        return hip.a;
    }
    
    @Override
    public final huz k() {
        return this.c;
    }
    
    @Override
    public final ljm l() {
        return this.g;
    }
    
    @Override
    public final niz m() {
        return nii.a;
    }
    
    @Override
    public final niz n() {
        return nii.a;
    }
    
    @Override
    public final oey p() {
        return odg.h(this.h, new hfy(this), odx.a);
    }
    
    @Override
    public final oey q() {
        throw new IllegalStateException("Image Intent session doesn't have a MediaStoreRecord.");
    }
    
    @Override
    public final oey r(final byte[] array, hwr hwr) {
        try {
            final ExifInterface exifInterface = (ExifInterface)hwr.c.f();
            final byte[] array2 = array;
            if (exifInterface != null) {
                final niz b = this.f.b();
                ExifInterface a = exifInterface;
                if (b.g()) {
                    final kvj kvj = new kvj(exifInterface);
                    kvj.d((Location)b.c());
                    a = kvj.a;
                }
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (array != null) {
                    final nxc nxc = new nxc(byteArrayOutputStream);
                    try {
                        hwr = (hwr)a.m(nxc);
                        try {
                            ((OutputStream)hwr).write(array, 0, array.length);
                            ((OutputStream)hwr).close();
                            nxc.flush();
                            nxc.close();
                            hwr = (hwr)(Object)byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        }
                        finally {
                            try {
                                ((OutputStream)hwr).close();
                            }
                            finally {
                                final Throwable t;
                                ((Throwable)(Object)array).addSuppressed(t);
                            }
                        }
                    }
                    finally {
                        try {
                            nxc.close();
                        }
                        finally {
                            ((Throwable)(Object)array).addSuppressed((Throwable)(Object)array2);
                        }
                    }
                }
                throw new IllegalArgumentException("Argument is null");
            }
            this.h.o(array2);
        }
        catch (final IOException ex) {
            a.m(hfz.b.b(), "Could not read image bytes.", '\u08ed', ex);
            this.h.a(ex);
        }
        return ofi.n(this.a);
    }
    
    @Override
    public final String s() {
        return this.d;
    }
    
    @Override
    public final void u(final hik hik) {
    }
    
    @Override
    public final void w(final Throwable t) {
    }
    
    @Override
    public final void y() {
    }
}
