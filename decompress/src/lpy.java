import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import com.google.common.io.ByteStreams;
import java.io.OutputStream;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.InputStream;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpy
{
    public static int a(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 16: {
                return 18;
            }
            case 15: {
                return 17;
            }
            case 14: {
                return 16;
            }
            case 13: {
                return 15;
            }
            case 12: {
                return 14;
            }
            case 11: {
                return 13;
            }
            case 10: {
                return 12;
            }
            case 9: {
                return 11;
            }
            case 8: {
                return 10;
            }
            case 6: {
                return 8;
            }
            case 5: {
                return 7;
            }
            case 4: {
                return 6;
            }
            case 3: {
                return 5;
            }
            case 2: {
                return 4;
            }
            case 1: {
                return 3;
            }
            case 0: {
                return 2;
            }
            case -1: {
                return 1;
            }
        }
    }
    
    public static void b() {
        c(Looper.myLooper() == Looper.getMainLooper(), "This should be running on the main thread.");
    }
    
    public static void c(final boolean b, final String s) {
        if (!b) {
            k(new IllegalStateException(s));
        }
    }
    
    public static void d(final Object o) {
        if (o == null) {
            k(new NullPointerException());
        }
    }
    
    public static long e(final InputStream inputStream, final lkb lkb) {
        return g(inputStream, null, lkb);
    }
    
    public static long f(final byte[] array, final lkb lkb) {
        return h(array, null, lkb);
    }
    
    public static long g(final InputStream inputStream, ExifInterface m, lkb e) {
        e = (lkb)e.e();
        Label_0085: {
            if (m == null) {
                break Label_0085;
            }
            try {
                final nxc nxc = new nxc((OutputStream)e);
                try {
                    m = (ExifInterface)m.m(nxc);
                    try {
                        ByteStreams.copy(inputStream, (OutputStream)m);
                        ((OutputStream)m).close();
                        nxc.flush();
                        final long n = nxc.a;
                        nxc.close();
                    }
                    finally {
                        try {
                            ((OutputStream)m).close();
                        }
                        finally {
                            final Throwable t;
                            ((Throwable)inputStream).addSuppressed(t);
                        }
                    }
                }
                finally {
                    try {
                        nxc.close();
                    }
                    finally {
                        final Throwable t2;
                        ((Throwable)inputStream).addSuppressed(t2);
                    }
                }
                final long n = ByteStreams.copy(inputStream, (OutputStream)e);
                ((OutputStream)e).flush();
                ((OutputStream)e).close();
                return n;
            }
            finally {
                try {
                    ((OutputStream)e).close();
                }
                finally {
                    final Throwable t3;
                    ((Throwable)inputStream).addSuppressed(t3);
                }
            }
        }
    }
    
    public static long h(final byte[] array, final ExifInterface exifInterface, final lkb lkb) {
        return g(new ByteArrayInputStream(array), exifInterface, lkb);
    }
    
    public static long i(final InputStream inputStream, final ExifInterface exifInterface, final lkb lkb) {
        if (exifInterface == null) {
            return e(inputStream, lkb);
        }
        return j(ByteStreams.toByteArray(inputStream), exifInterface, lkb);
    }
    
    public static long j(byte[] byteArray, final ExifInterface exifInterface, lkb e) {
        if (exifInterface == null) {
            return f(byteArray, e);
        }
        e = (lkb)e.e();
        try {
            final OutputStream m = exifInterface.m((OutputStream)e);
            try {
                final nja d = lmx.d(byteArray, (apf)lmx.c(exifInterface.by).f());
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                lmx.p(byteArray, byteArrayOutputStream, (apf)d.a, (apf)d.b);
                byteArray = byteArrayOutputStream.toByteArray();
                m.write(byteArray);
                final long n = byteArray.length;
                m.close();
                ((OutputStream)e).close();
                return n;
            }
            finally {
                try {
                    m.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)(Object)byteArray).addSuppressed(t);
                }
            }
        }
        finally {
            try {
                ((OutputStream)e).close();
            }
            finally {
                final Throwable t2;
                ((Throwable)(Object)byteArray).addSuppressed(t2);
            }
        }
    }
    
    private static void k(final RuntimeException ex) {
        Log.e("Preconditions", "Precondition broken. Build is not strict; continuing...", (Throwable)ex);
    }
}
