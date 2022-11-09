import com.google.android.apps.camera.imax.cyclops.image.StereoPanorama;
import android.media.MediaFormat;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import com.google.android.apps.camera.imax.cyclops.processing.OmnistereoRendererImpl;
import java.io.IOException;
import android.media.MediaCrypto;
import android.media.MediaCodec;
import android.view.Surface;
import android.media.MediaExtractor;
import com.google.geo.lightfield.processing.ProgressCallback;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eed implements Runnable
{
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ ProgressCallback b;
    final /* synthetic */ eee c;
    
    public eed(final eee c, final AtomicReference a, final ProgressCallback b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final AtomicReference a = this.a;
        final eee c = this.c;
        final ProgressCallback b = this.b;
        b.setProgress(0.0f);
        final muf muf = new muf();
        muf.b();
        final String b2 = c.d.b();
        final int[] array2;
        final int[] array = array2 = new int[2];
        array2[1] = (array2[0] = 0);
        final MediaExtractor mediaExtractor = new MediaExtractor();
        final MediaFormat b3 = eeq.b(mediaExtractor, b2);
        mediaExtractor.release();
        if (b3 != null) {
            array[0] = b3.getInteger("width");
            array[1] = b3.getInteger("height");
        }
        final mui mui = new mui(array[0], array[1]);
        final Surface surface = new Surface(mui.c);
        final eeq eeq = new eeq(surface);
        final String b4 = c.d.b();
        eeq.f = false;
        eeq.d = eeq.b(eeq.c, b4);
        Object o = eeq.d;
        boolean b5;
        if (o == null) {
            a.k(eeq.a.b(), "Could not extract MediaFormat from %s", b4, '\u0492');
            b5 = eeq.f;
        }
        else {
            if (((MediaFormat)o).containsKey("durationUs")) {
                eeq.e = eeq.d.getLong("durationUs");
            }
            try {
                eeq.h = MediaCodec.createDecoderByType(eeq.d.getString("mime"));
                eeq.d.getString("mime");
                try {
                    o = eeq.h;
                    final MediaFormat d = eeq.d;
                    final Surface b6 = eeq.b;
                    try {
                        ((MediaCodec)o).configure(d, b6, (MediaCrypto)null, 0);
                        try {
                            eeq.h.start();
                            eeq.g = eeq.h.getInputBuffers();
                            eeq.f = true;
                        }
                        catch (final Exception ex) {
                            a.m(eeq.a.b(), "Could not start MediaCodec", '\u048e', ex);
                            b5 = eeq.f;
                        }
                    }
                    catch (final IllegalArgumentException o) {}
                    catch (final IllegalStateException o) {}
                }
                catch (final IllegalArgumentException ex2) {}
                catch (final IllegalStateException ex3) {}
                a.m(eeq.a.b(), "Could not configure MediaCodec", '\u048f', (Throwable)o);
                b5 = eeq.f;
            }
            catch (final IOException ex4) {
                a.k(eeq.a.b(), "Could not create MediaCodec of type %s", eeq.d.getString("mime"), '\u0491');
                b5 = eeq.f;
            }
        }
        StereoPanorama result = null;
        Label_0893: {
            if (!b5) {
                a.k(eee.a.b(), "Failed to open video file %s", c.d.b(), '\u0470');
                result = null;
                break Label_0893;
            }
            final edj a2 = c.b.a(c.d.a());
            final OmnistereoRendererImpl omnistereoRendererImpl = (OmnistereoRendererImpl)a2;
            if (omnistereoRendererImpl.b) {
                b.setProgress(0.2f);
                float a3 = 0.0f;
            Label_0765:
                while (true) {
                    while (a3 < 1.0f) {
                        try {
                            if (!eeq.c()) {
                                final boolean b7 = true;
                                break Label_0765;
                            }
                            try {
                                if (!mui.d.tryAcquire(10000L, TimeUnit.MILLISECONDS)) {
                                    final boolean b7 = true;
                                    break Label_0765;
                                }
                                mui.c.updateTexImage();
                                final int name = mui.b.getName();
                                final int integer = eeq.d.getInteger("width");
                                final int integer2 = eeq.d.getInteger("height");
                                if (omnistereoRendererImpl.b) {
                                    omnistereoRendererImpl.nativeApplyTexture(omnistereoRendererImpl.a, name, integer, integer2);
                                    ++omnistereoRendererImpl.a;
                                }
                                b.setProgress(a3 * 0.75f + 0.2f);
                                a3 = eeq.a();
                                continue;
                            }
                            catch (final InterruptedException ex5) {
                                Log.e(mui.a, ex5.getMessage());
                                final boolean b7 = true;
                            }
                        }
                        catch (final IllegalStateException ex6) {
                            a.m(eee.a.b(), "Could not decodeNextFrame", '\u046d', ex6);
                            final boolean b7 = false;
                            break Label_0765;
                        }
                        break;
                        if (eeq.f) {
                            try {
                                eeq.h.stop();
                            }
                            catch (final IllegalStateException ex7) {
                                a.m(eeq.a.b(), "Exception when stopping the decoder", '\u048c', ex7);
                            }
                            eeq.h.release();
                            eeq.c.release();
                            eeq.f = false;
                        }
                        surface.release();
                        mui.c.release();
                        mui.b.delete();
                        boolean b7 = false;
                        if (b7) {
                            result = a2.getResult(c.c);
                        }
                        else {
                            result = null;
                        }
                        b.setProgress(1.0f);
                        omnistereoRendererImpl.nativeRelease();
                        omnistereoRendererImpl.b = false;
                        muf.a();
                        break Label_0893;
                    }
                    final boolean b7 = true;
                    continue Label_0765;
                }
            }
            a.l(eee.a.b(), "Failed to initialize omnistereo renderer", '\u046f');
            result = null;
        }
        a.set(result);
    }
}
