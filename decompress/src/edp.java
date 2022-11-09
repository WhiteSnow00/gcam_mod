import android.media.MediaCodec;
import java.nio.ByteBuffer;
import android.media.AudioRecord;

// 
// Decompiled by Procyon v0.6.0
// 

public final class edp extends Thread
{
    public static final nsd a;
    public boolean b;
    public long c;
    private final AudioRecord d;
    private final edm e;
    private final byte[] f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/imax/cyclops/audio/AudioRecorderThread");
    }
    
    public edp(final edm e, final AudioRecord d) {
        this.f = new byte[2048];
        this.b = false;
        this.c = 0L;
        this.e = e;
        this.d = d;
    }
    
    @Override
    public final void run() {
        final AudioRecord d = this.d;
        if (d == null) {
            this.b = false;
            return;
        }
        this.b = true;
        try {
            d.startRecording();
        }
        catch (final IllegalStateException ex) {
            a.n(edp.a.b(), "%s", ex.getMessage(), '\u0463', ex);
        }
        while (this.b) {
            final int read = this.d.read(this.f, 0, 2048);
            if (read == -3 || read == -2) {
                a.l(edp.a.b(), "Error reading audio", '\u0464');
                break;
            }
            if (this.c == 0L) {
                continue;
            }
            final long n = System.nanoTime() / 1000L;
            final long c = this.c;
            final edm e = this.e;
            final byte[] f = this.f;
            if (!e.d) {
                continue;
            }
            try {
                final ByteBuffer[] inputBuffers = e.b.getInputBuffers();
                final int dequeueInputBuffer = e.b.dequeueInputBuffer(-1L);
                if (dequeueInputBuffer < 0) {
                    a.l(edm.a.b(), "Could not find a valid buffer, will drop frame!", '\u0458');
                }
                else {
                    final ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                    byteBuffer.clear();
                    byteBuffer.put(f);
                    int n2;
                    if (!e.c) {
                        n2 = 0;
                    }
                    else {
                        n2 = 4;
                    }
                    final MediaCodec b = e.b;
                    final int length = f.length;
                    b.queueInputBuffer(dequeueInputBuffer, 0, 2048, n + c, n2);
                    if (!e.c) {
                        continue;
                    }
                    e.d = false;
                    e.c = false;
                }
            }
            catch (final IllegalStateException ex2) {
                a.m(edm.a.b(), "MediaCodec got into an illegal state", '\u0459', ex2);
            }
        }
        try {
            this.d.stop();
        }
        catch (final IllegalStateException ex3) {
            a.n(edp.a.b(), "%s", ex3.getMessage(), '\u0462', ex3);
        }
        this.d.release();
        this.b = false;
    }
}
