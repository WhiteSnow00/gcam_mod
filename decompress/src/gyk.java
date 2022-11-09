import java.nio.Buffer;
import java.util.concurrent.ExecutionException;
import java.util.TimeZone;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.libraries.camera.exif.ExifInterface;
import android.os.SystemClock;
import com.google.android.libraries.camera.jni.jpeg.JpegUtilNative;
import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyk extends gyp
{
    private static final nsd a;
    private final gyu b;
    
    static {
        a = nsd.g("com/google/android/apps/camera/processing/imagebackend/TaskCompressImageToJpeg");
    }
    
    public gyk(final gyb gyb, final Executor executor, final gxz gxz, final hhy hhy, final gyu b) {
        super(gyb, executor, gxz, 4, hhy);
        this.b = b;
    }
    
    public static final int a(final lju lju, final ByteBuffer byteBuffer, final Rect rect) {
        return JpegUtilNative.a(lju, byteBuffer, rect, kra.a);
    }
    
    @Override
    public final void run() {
        final gyb f = this.f;
        final huz k = this.g.k();
        k.getClass();
        k.s(SystemClock.elapsedRealtime());
        switch (f.a.a()) {
            default: {
                this.c.b(f.a, this.d);
                throw new IllegalArgumentException("Unsupported input image format for TaskCompressImageToJpeg");
            }
            case 256: {
                try {
                    final ByteBuffer buffer = f.a.h().get(0).getBuffer();
                    try {
                        int n = buffer.limit();
                        Object o = new byte[n];
                        Object o2 = ByteBuffer.wrap((byte[])o);
                        buffer.rewind();
                        ((ByteBuffer)o2).put(buffer);
                        buffer.rewind();
                        ((ByteBuffer)o2).rewind();
                        final Object o3 = kvj.a((byte[])o);
                        final kvc c = kvc.c((ExifInterface)o3);
                        Object o4 = ((ExifInterface)o3).b(ExifInterface.ai);
                        o4.getClass();
                        final int intValue = (int)o4;
                        o4 = ((ExifInterface)o3).b(ExifInterface.aj);
                        o4.getClass();
                        final int intValue2 = (int)o4;
                        o4 = kvc.a(c);
                        final kra b = kra.b(f.b.e + ((kra)o4).e);
                        final int intValue3 = intValue;
                        final int intValue4 = intValue2;
                        final Rect e = f.e;
                        Rect rect;
                        if (b != kra.a && b != kra.c) {
                            rect = new Rect(e.top, e.left, e.bottom, e.right);
                        }
                        else {
                            rect = new Rect(e);
                        }
                        final Rect h = gyp.h(intValue3, intValue4, rect);
                        gym gym = new gym((kra)o4, intValue3, intValue4);
                        final lju a = f.a;
                        if (!h.equals((Object)new Rect(0, 0, a.c(), a.b()))) {
                            gym = new gym((kra)o4, h.width(), h.height());
                            o = Bitmap.createBitmap(BitmapFactory.decodeByteArray((byte[])o, 0, n), h.left, h.top, h.width(), h.height());
                            o2 = new ByteArrayOutputStream();
                            ((Bitmap)o).compress(Bitmap$CompressFormat.JPEG, 95, (OutputStream)o2);
                            o = ((ByteArrayOutputStream)o2).toByteArray();
                            o2 = ByteBuffer.allocate(((Bitmap)o).length);
                            ((ByteBuffer)o2).put(ByteBuffer.wrap((byte[])o));
                            ((ByteBuffer)o2).rewind();
                        }
                        this.c.b(f.a, this.d);
                        this.j(this.e, gym, 3);
                        o2.getClass();
                        n = ((Buffer)o2).limit();
                        o4 = null;
                        o = o2;
                        o2 = gym;
                    }
                    catch (final OutOfMemoryError outOfMemoryError) {
                        final Object o3 = this.g;
                        final Object o2 = iwx.a;
                        ((hhy)o3).C(o2, (Throwable)new dgi("Failed to allocate jpeg buffer for encoding."));
                    }
                }
                finally {
                    this.c.b(f.a, this.d);
                }
            }
            case 35: {
                final Rect i = gyp.i(f.a, f.e);
                try {
                    new gym(f.b, f.a.c(), f.a.b());
                    final kre kre = new kre(i.width(), i.height());
                    final Object o2 = new gym(f.b, kre.a, kre.b);
                    this.j(this.e, (gym)o2, 3);
                    final int n2 = ((gym)o2).c * 3 * ((gym)o2).b / 2;
                    final int n3 = n2 / 2;
                    final Object o4 = this.b.c(n3);
                    ByteBuffer byteBuffer = (ByteBuffer)((gyv)o4).a();
                    gxz gxz = null;
                    lju lju = null;
                    Executor executor = null;
                    Label_0819: {
                        if (byteBuffer == null) {
                            this.g.C(iwx.a, new dgi("Failed to allocate jpeg buffer for encoding."));
                            ((gyv)o4).close();
                            gxz = this.c;
                            lju = f.a;
                            executor = this.d;
                        }
                        else {
                            int n = a(f.a, byteBuffer, f.e);
                            if (n > n3) {
                                ((gyv)o4).close();
                                this.b.c(n2);
                                byteBuffer = (ByteBuffer)((gyv)o4).a();
                                if (byteBuffer == null) {
                                    this.g.C(iwx.a, new dgi("Failed to allocate jpeg buffer for encoding."));
                                    ((gyv)o4).close();
                                    gxz = this.c;
                                    lju = f.a;
                                    executor = this.d;
                                    break Label_0819;
                                }
                                n = a(f.a, byteBuffer, f.e);
                            }
                            if (n < 0) {
                                ((gyv)o4).close();
                                throw new RuntimeException("Error compressing jpeg.");
                            }
                            byteBuffer.limit(n);
                            this.c.b(f.a, this.d);
                            final Object o3 = kvj.b().a;
                            ((ExifInterface)o3).x(ExifInterface.s, this.f.k, TimeZone.getDefault());
                            final Object o = byteBuffer;
                            final byte[] array = new byte[n];
                            o.getClass();
                            ((ByteBuffer)o).get(array);
                            ((ByteBuffer)o).rewind();
                            if (o4 != null) {
                                ((gyv)o4).close();
                            }
                            ((gxp)super.c).k.d(new gyn(this.e, (gym)o2, 3), new gzz());
                            final niz h2 = niz.h(o3);
                            final oey c2 = f.c;
                            kvj b2;
                            if (h2.g()) {
                                b2 = new kvj((ExifInterface)h2.c());
                            }
                            else {
                                b2 = kvj.b();
                            }
                            b2.f(((gym)o2).c, ((gym)o2).b, ((gym)o2).a, niz.h(knf.d(c2)));
                            final ExifInterface a2 = b2.a;
                            final huz j = this.g.k();
                            j.getClass();
                            j.o(a2);
                            final hhy g = this.g;
                            new kre(((gym)o2).c, ((gym)o2).b);
                            final hwr hwr = new hwr(llk.c);
                            hwr.a(a2);
                            hwr.b(((gym)o2).a);
                            knf.e(g.r(array, hwr), new gyj(this, (gym)o2));
                            final oey c3 = f.c;
                            if (!c3.isDone()) {
                                a.l(gyk.a.c(), "CaptureResults unavailable to photoCaptureDoneEvent event.", '\u0883');
                                final huz l = this.g.k();
                                l.getClass();
                                l.t(SystemClock.elapsedRealtime());
                                return;
                            }
                            while (true) {
                                try {
                                    try {
                                        final huz m = this.g.k();
                                        m.getClass();
                                        m.l(c3.get(), false);
                                        final Object o5 = this.g;
                                        final huz k2 = ((hhy)o5).k();
                                        k2.getClass();
                                        k2.t(SystemClock.elapsedRealtime());
                                        return;
                                    }
                                    finally {}
                                }
                                catch (final ExecutionException ex) {
                                    gyk.a.c().E(2181).o("CaptureResults not added to photoCaptureDoneEvent event due to Execution Exception.");
                                    final hhy g2 = this.g;
                                    continue;
                                }
                                catch (final InterruptedException ex2) {
                                    gyk.a.b().E(2180).o("CaptureResults not added to photoCaptureDoneEvent event due to Interrupted Exception.");
                                    final hhy g3 = this.g;
                                    continue;
                                }
                                break;
                            }
                            final Object o5 = this.g.k();
                            ((hhy)o5).getClass();
                            ((huz)o5).t(SystemClock.elapsedRealtime());
                        }
                    }
                    gxz.b(lju, executor);
                    return;
                }
                finally {
                    this.c.b(f.a, this.d);
                    while (true) {}
                }
                break;
            }
        }
    }
}
