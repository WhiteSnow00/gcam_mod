import java.io.InputStream;
import java.io.File;
import java.nio.Buffer;
import com.google.googlex.gcam.BufferUtils;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.io.IOException;
import com.google.common.io.ByteStreams;
import android.content.Context;
import com.google.googlex.gcam.creativecamera.portraitmode.PortraitSegmenterInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvo implements gwc
{
    private static final nsd a;
    private final Object b;
    private final PortraitSegmenterInterface c;
    private boolean d;
    private final kse e;
    private final Context f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final pii k;
    private final pii l;
    private boolean m;
    
    static {
        a = nsd.g("com/google/android/apps/camera/portrait/PortraitSegmenterManagerImpl");
    }
    
    public gvo(final kse e, final Context f, final boolean g, final boolean h, final boolean i, final boolean m, final boolean j, final pii k, final pii l) {
        this.b = new Object();
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.m = m;
        this.j = j;
        this.k = k;
        this.l = l;
        this.c = new PortraitSegmenterInterface();
    }
    
    private final void c(int n) {
        final okt m = oax.i.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oax oax = (oax)m.b;
        oax.b = n - 1;
        n = (oax.a | 0x1);
        oax.a = n;
        n |= 0x2;
        oax.a = n;
        oax.c = "tflite_vakunov_multi-subject_2018-06-09.fb.enc";
        final boolean g = this.g;
        n |= 0x4;
        oax.a = n;
        oax.d = g;
        final boolean h = this.h;
        n |= 0x8;
        oax.a = n;
        oax.e = h;
        final boolean i = this.i;
        n |= 0x10;
        oax.a = n;
        oax.f = i;
        final boolean j = this.m;
        n |= 0x20;
        oax.a = n;
        oax.g = j;
        final boolean k = this.j;
        oax.a = (n | 0x40);
        oax.h = k;
        ((eyt)this.l.get()).A((oax)m.h());
    }
    
    @Override
    public final long a() {
        synchronized (this.b) {
            return this.c.getSegmenterHandle();
        }
    }
    
    @Override
    public final void b() {
        synchronized (this.b) {
            if (!this.d) {
                final Context f = this.f;
                this.e.f("PortraitSegmenterManager#loadModelAsset");
                byte[] array = new byte[0];
                try {
                    final InputStream open = f.getAssets().open("tflite_vakunov_multi-subject_2018-06-09.fb.enc");
                    final int available = open.available();
                    final byte[] array2 = new byte[available];
                    final int read = ByteStreams.read(open, array2, 0, available);
                    if (open.available() != 0) {
                        a.l(gvo.a.b(), "There is more data. This is problematic", '\u0859');
                    }
                    open.close();
                    if (read != available) {
                        a.l(gvo.a.b(), "Didn't finish reading the asset...", '\u0858');
                    }
                    array = array2;
                }
                catch (final IOException ex) {
                    a.k(gvo.a.b(), "Unable to load the asset: %s", ex, '\u0857');
                    this.c(2);
                }
                this.e.g();
                final PortraitSegmenterInterface c = this.c;
                this.e.f("PortraitSegmenterManager#decrypt");
                byte[] doFinal;
                try {
                    final byte[] g = nwp.e.g("6B63910ECDC9F72F9B907AC6E8E6A53519A194834FB5417CFEB12AD4174286CC");
                    final IvParameterSpec ivParameterSpec = new IvParameterSpec(nwp.e.g("EE0F689D8C7579BC1A11DEE1D035717E"));
                    final SecretKeySpec secretKeySpec = new SecretKeySpec(g, "AES");
                    final Cipher instance = Cipher.getInstance("AES_256/CBC/PKCS5Padding");
                    instance.init(2, secretKeySpec, ivParameterSpec);
                    doFinal = instance.doFinal(array);
                }
                catch (final Exception ex2) {
                    a.k(gvo.a.b(), "Unable to decrypt bytes: %s", ex2, '\u0856');
                    this.c(3);
                    doFinal = new byte[0];
                }
                this.e.g();
                this.e.f("PortraitSegmenterManager#md5");
                try {
                    final byte[] digest = MessageDigest.getInstance("MD5").digest(doFinal);
                    if (!MessageDigest.isEqual(digest, nwp.e.g("2F01B88911B7897DD738B9CF658A28A6"))) {
                        gvo.a.c().E(2130).x("Checksum is %s, expecting %s", nwp.e.f(digest), "2F01B88911B7897DD738B9CF658A28A6");
                    }
                }
                catch (final Exception ex3) {
                    a.k(gvo.a.b(), "Failed to compute MD5 hash: %s", ex3, '\u0853');
                    this.c(3);
                }
                this.e.g();
                final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(doFinal.length);
                allocateDirect.put(doFinal);
                final long a = BufferUtils.a(allocateDirect);
                final long n = allocateDirect.capacity();
                this.e.f("PortraitSegmenterManager#nativeInitialization");
                final niz a2 = ((ejf)this.k).a();
                String absolutePath;
                if (a2.g()) {
                    absolutePath = new File((File)a2.c(), "tflite_vakunov_multi-subject_2018-06-09.fb.enc.cache").getAbsolutePath();
                }
                else {
                    absolutePath = "";
                }
                boolean d;
                final boolean b = d = c.initSegmenter(a, n, "tflite_vakunov_multi-subject_2018-06-09.fb.enc", absolutePath, this.g, this.h, this.i, this.m, this.j);
                if (b) {
                    d = b;
                    if (!this.g) {
                        d = b;
                        if (this.m && !(d = c.dummyImageProducesReasonableMask())) {
                            a.l(gvo.a.b(), "OpenCL segmenter failed to produce a reasonable mask, falling back to OpenGL.", '\u0855');
                            c.release();
                            this.c(5);
                            allocateDirect.clear();
                            allocateDirect.put(doFinal);
                            this.m = false;
                            d = c.initSegmenter(a, n, "tflite_vakunov_multi-subject_2018-06-09.fb.enc", absolutePath, this.g, this.h, this.i, false, false);
                        }
                    }
                }
                this.e.g();
                if (!d) {
                    this.c(4);
                }
                this.d = d;
            }
        }
    }
}
