import java.io.InputStream;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.io.IOException;
import com.google.common.io.ByteStreams;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import com.google.googlex.gcam.creativecamera.portraitmode.PortraitRelightingProcessorInterface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gvn implements gwb
{
    public static final nsd a;
    public final Context b;
    public final boolean c;
    public final pii d;
    public final PortraitRelightingProcessorInterface e;
    public boolean f;
    public final ReentrantLock g;
    private final kse h;
    private final cxl i;
    private final Executor j;
    
    static {
        a = nsd.g("com/google/android/apps/camera/portrait/PortraitRelightingProcessorManagerImpl");
    }
    
    public gvn(final kse h, final Context b, final cxl i, final pii d, final boolean c) {
        this.f = false;
        this.g = new ReentrantLock();
        this.h = h;
        this.b = b;
        this.i = i;
        this.c = c;
        this.d = d;
        final kjx a = kjy.a();
        a.a = "FireflyProcMgr";
        a.b(10);
        a.c(1);
        this.j = new kjs(mcn.f(a.a()));
        this.e = new PortraitRelightingProcessorInterface();
    }
    
    @Override
    public final long a() {
        if (this.g.tryLock()) {
            try {
                return this.e.getPortraitRelightingProcessorHandle();
            }
            finally {
                this.g.unlock();
            }
        }
        return 0L;
    }
    
    public final ByteBuffer b(Context doFinal, String s, final String s2) {
        this.h.f("FireflyMgr#loadModelAsset");
        final byte[] array = new byte[0];
        byte[] array2;
        try {
            final InputStream open = ((Context)doFinal).getAssets().open(s);
            final int available = open.available();
            array2 = new byte[available];
            final int read = ByteStreams.read(open, array2, 0, available);
            if (open.available() != 0) {
                a.l(gvn.a.b(), "There is more data. This is problematic", '\u0851');
            }
            open.close();
            if (read != available) {
                a.l(gvn.a.b(), "Didn't finish reading the asset.", '\u0850');
            }
        }
        catch (final IOException ex) {
            a.k(gvn.a.b(), "Unable to load the asset: %s", ex, '\u084b');
            array2 = array;
        }
        this.h.f("FireflyMgr#decrypt");
        s = (String)(Object)new byte[0];
        try {
            final byte[] g = nwp.e.g("6B63910ECDC9F72F9B907AC6E8E6A53519A194834FB5417CFEB12AD4174286CC");
            final IvParameterSpec ivParameterSpec = new IvParameterSpec(nwp.e.g("EE0F689D8C7579BC1A11DEE1D035717E"));
            final SecretKeySpec secretKeySpec = new SecretKeySpec(g, "AES");
            final Cipher instance = Cipher.getInstance("AES_256/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, ivParameterSpec);
            doFinal = instance.doFinal(array2);
        }
        catch (final Exception ex2) {
            a.k(gvn.a.b(), "Unable to decrypt bytes: %s", ex2, '\u084f');
            doFinal = s;
        }
        this.h.g();
        this.h.f("FireflyMgr#md5");
        try {
            final byte[] digest = MessageDigest.getInstance("MD5").digest((byte[])doFinal);
            if (!MessageDigest.isEqual(digest, nwp.e.g(s2))) {
                gvn.a.c().E(2124).x("Checksum is %s, expecting %s", nwp.e.f(digest), s2);
            }
        }
        catch (final Exception ex3) {
            a.k(gvn.a.b(), "Failed to compute MD5 hash: %s", ex3, '\u084d');
        }
        this.h.g();
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(doFinal.length);
        allocateDirect.put((byte[])doFinal);
        this.h.g();
        return allocateDirect;
    }
    
    @Override
    public final void c() {
        this.j.execute(new gvm(this));
    }
    
    @Override
    public final void d() {
        this.g.lock();
        try {
            this.e.release();
            this.f = false;
        }
        finally {
            this.g.unlock();
        }
    }
    
    @Override
    public final boolean e(final boolean b) {
        boolean b2;
        if (b) {
            b2 = this.i.k(cyc.z);
        }
        else {
            b2 = this.i.k(cyd.c);
        }
        final long a = this.a();
        return b2 && a != 0L;
    }
}
