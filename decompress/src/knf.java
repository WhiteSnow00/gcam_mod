import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import java.io.IOException;
import android.media.MediaCodec;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knf
{
    public static final MediaCodec a(final kng kng) {
        final String b = kng.b();
        final String value = String.valueOf(b);
        if (value.length() != 0) {
            "create mediaCodec for".concat(value);
        }
        else {
            new String("create mediaCodec for");
        }
        try {
            return MediaCodec.createEncoderByType(b);
        }
        catch (final IOException ex) {
            throw new kne(kng, ex);
        }
    }
    
    public static oey c(final oey oey, final oey oey2, final kqt kqt) {
        final kjg kjg = new kjg(kqt);
        final ArrayList list = new ArrayList(2);
        list.add(oey);
        list.add(oey2);
        return odg.i(ofi.j(list), new kjd(kjg, 1), odx.a);
    }
    
    public static Object d(final oey oey) {
        if (oey.isDone() && !oey.isCancelled()) {
            int n = 0;
            while (true) {
                try {
                    final Object value = oey.get();
                    if (n != 0) {
                        Thread.currentThread().interrupt();
                    }
                    return value;
                }
                catch (final ExecutionException ex) {
                    if (n != 0) {
                        Thread.currentThread().interrupt();
                    }
                    return null;
                }
                catch (final InterruptedException ex2) {
                    n = 1;
                    continue;
                }
                finally {
                    if (n != 0) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            }
        }
        return null;
    }
    
    public static void e(final oey oey, final kqq kqq) {
        f(oey, kqq, odx.a);
    }
    
    public static void f(final oey oey, final kqq kqq, final Executor executor) {
        ofi.w(oey, new kje(kqq), executor);
    }
    
    public static void g(final oey oey, final oey oey2, final kjf kjf, final Executor executor) {
        final ArrayList list = new ArrayList(2);
        list.add(oey);
        list.add(oey2);
        odg.i(ofi.j(list), new kjd(kjf), executor);
    }
}
