import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import android.media.MediaMuxer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eem
{
    private static final nsd a;
    private final MediaMuxer b;
    private final int c;
    private final CountDownLatch d;
    private int e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/imax/cyclops/video/MultiTrackMuxer");
    }
    
    public eem(final String s, final int c) {
        this.d = new CountDownLatch(1);
        this.e = 0;
        this.c = c;
        try {
            this.b = new MediaMuxer(s, 0);
        }
        catch (final IOException ex) {
            throw new RuntimeException("MediaMuxer creation failed", ex);
        }
    }
    
    public final int a(final MediaFormat mediaFormat) {
        synchronized (this) {
            if (this.d()) {
                eem.a.b().E(1151).p("addTrack called after muxer was started with %d tracks", this.e);
                return -1;
            }
            final int addTrack = this.b.addTrack(mediaFormat);
            if (++this.e == this.c) {
                this.b.start();
                this.d.countDown();
            }
            return addTrack;
        }
    }
    
    public final void b() {
        monitorenter(this);
        try {
            if (this.e <= 0) {
                a.l(eem.a.b(), "stopTrack called but no tracks were added!", '\u0483');
                monitorexit(this);
                return;
            }
            if (!this.d()) {
                a.l(eem.a.b(), "stopTrack called but the muxer is not started!", '\u0482');
            }
            else if (--this.e <= 0) {
                try {
                    this.b.stop();
                }
                catch (final IllegalStateException ex) {
                    a.n(eem.a.b(), "%s", ex.getMessage(), '\u0481', ex);
                }
                try {
                    this.b.release();
                    monitorexit(this);
                    return;
                }
                catch (final IllegalStateException ex2) {
                    a.n(eem.a.b(), "%s", ex2.getMessage(), '\u0480', ex2);
                    monitorexit(this);
                    return;
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void c(final int n, final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        try {
            this.d.await();
            try {
                this.b.writeSampleData(n, byteBuffer, mediaCodec$BufferInfo);
            }
            catch (final IllegalArgumentException ex) {
                a.n(eem.a.b(), "%s", ex.getMessage(), '\u0484', ex);
            }
        }
        catch (final InterruptedException ex2) {
            a.l(eem.a.b(), "writeSampleData called but muxer was not started!", '\u0485');
        }
    }
    
    public final boolean d() {
        return this.d.getCount() == 0L;
    }
}
