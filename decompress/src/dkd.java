import com.google.mediapipe.framework.TextureFrame;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import com.google.mediapipe.framework.AndroidAssetUtil;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkd implements krc
{
    public static final nsd a;
    public final lyp b;
    public final Executor c;
    public final oiy d;
    public final mao e;
    public volatile dkc f;
    public volatile man g;
    
    static {
        a = nsd.g("com/google/android/apps/camera/faceobfuscation/GpuFaceObfuscationController");
    }
    
    public dkd(final dsd dsd, final Executor c, final Context context) {
        AndroidAssetUtil.a(context);
        this.c = c;
        final lyp a = dsd.a("faceobfuscation");
        this.b = a;
        this.e = mao.a(a);
        final ofn f = ofn.f();
        a.execute(new dkb(this, f));
        try {
            final oiy d = new oiy(context, (long)f.get(1000L, TimeUnit.MILLISECONDS), "gca_postprocessing.binarypb");
            (this.d = d).c(new djz(this));
            d.b();
            return;
        }
        catch (final TimeoutException ex) {}
        catch (final ExecutionException ex2) {}
        catch (final InterruptedException ex3) {}
        throw new AssertionError((Object)"Unhandled exception");
    }
    
    public final void a() {
        synchronized (this) {
            this.e.close();
            this.b.close();
        }
    }
    
    @Override
    public final void close() {
        this.c.execute(new dka(this));
    }
}
