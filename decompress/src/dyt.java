import java.io.SequenceInputStream;
import java.io.ByteArrayInputStream;
import com.google.googlex.gcam.DebugParams;
import java.io.InputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dyt implements dyy
{
    private static final nsd a;
    
    static {
        a = nsd.g("com/google/android/apps/camera/hdrplus/debug/AfDebugMetadataSaverImpl");
    }
    
    private static void c(final ByteArrayOutputStream byteArrayOutputStream, final String s, final byte[] array) {
        if (array != null) {
            byteArrayOutputStream.write(s.getBytes());
            byteArrayOutputStream.write(array);
        }
    }
    
    private static byte[] d(final dyv dyv) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c(byteArrayOutputStream, "aecDebug", dyv.a);
        c(byteArrayOutputStream, "afDebug", dyv.b);
        c(byteArrayOutputStream, "awbDebug", dyv.c);
        return byteArrayOutputStream.toByteArray();
    }
    
    @Override
    public final niz a(final lji lji) {
        final niz a = dyv.a(lji);
        if (!a.g()) {
            return nii.a;
        }
        try {
            return niz.i(d((dyv)a.c()));
        }
        catch (final IOException ex) {
            a.k(dyt.a.c(), "Ignoring unexpected exception %s", ex, '\u0406');
            return nii.a;
        }
    }
    
    @Override
    public final InputStream b(final InputStream inputStream, final dyv dyv, final niz niz) {
        try {
            if (niz.g() && ((DebugParams)niz.c()).a() != null && ((DebugParams)niz.c()).a().a() != null) {
                dyz.a(d(dyv), ((DebugParams)niz.c()).a().a());
            }
            final byte[] d = d(dyv);
            final int length = d.length;
            return new SequenceInputStream(inputStream, new ByteArrayInputStream(d));
        }
        finally {
            final Throwable t;
            a.m(dyt.a.b(), "3A_DEBUG, Appending 3A debug metadata failed.", '\u0408', t);
            return inputStream;
        }
    }
}
