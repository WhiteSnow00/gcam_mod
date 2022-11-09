import java.io.IOException;
import android.media.MediaCodec$BufferInfo;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import android.media.MediaExtractor;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eeq
{
    public static final nsd a;
    public final Surface b;
    public final MediaExtractor c;
    public MediaFormat d;
    public long e;
    public boolean f;
    public ByteBuffer[] g;
    public MediaCodec h;
    private final MediaCodec$BufferInfo i;
    private long j;
    private long k;
    private boolean l;
    private boolean m;
    
    static {
        a = nsd.g("com/google/android/apps/camera/imax/cyclops/video/VideoDecoder");
    }
    
    public eeq(final Surface b) {
        this.i = new MediaCodec$BufferInfo();
        this.d = null;
        this.e = 0L;
        this.j = -1L;
        this.k = 0L;
        this.l = false;
        this.m = false;
        this.f = false;
        this.g = null;
        this.h = null;
        this.b = b;
        this.c = new MediaExtractor();
    }
    
    public static MediaFormat b(final MediaExtractor mediaExtractor, final String dataSource) {
        try {
            mediaExtractor.setDataSource(dataSource);
            final int trackCount = mediaExtractor.getTrackCount();
            int i = 0;
            while (true) {
                while (i < trackCount) {
                    final int n = i;
                    if (!mediaExtractor.getTrackFormat(i).getString("mime").startsWith("video/")) {
                        ++i;
                    }
                    else {
                        if (n < 0) {
                            a.k(eeq.a.b(), "No video track found in %s", dataSource, '\u048a');
                            return null;
                        }
                        mediaExtractor.selectTrack(n);
                        return mediaExtractor.getTrackFormat(n);
                    }
                }
                final int n = -1;
                continue;
            }
        }
        catch (final IOException ex) {
            a.k(eeq.a.b(), "Could not open video file %s", dataSource, '\u048b');
            return null;
        }
    }
    
    public final float a() {
        synchronized (this) {
            final long e = this.e;
            if (e == 0L) {
                return 1.0f;
            }
            return this.k / (float)e;
        }
    }
    
    public final boolean c() {
        monitorenter(this);
        boolean b = false;
        while (true) {
            Label_0247: {
                if (b) {
                    break Label_0247;
                }
                try {
                    if (this.m) {
                        monitorexit(this);
                        return false;
                    }
                    if (!this.l) {
                        final int dequeueInputBuffer = this.h.dequeueInputBuffer(1000L);
                        if (dequeueInputBuffer >= 0) {
                            final int sampleData = this.c.readSampleData(this.g[dequeueInputBuffer], 0);
                            if (sampleData < 0) {
                                this.h.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                this.l = true;
                            }
                            else {
                                this.l = false;
                                this.h.queueInputBuffer(dequeueInputBuffer, 0, sampleData, this.c.getSampleTime(), 0);
                                this.c.advance();
                            }
                        }
                    }
                    final int dequeueOutputBuffer = this.h.dequeueOutputBuffer(this.i, 1000L);
                    if (dequeueOutputBuffer >= 0) {
                        this.k = this.i.presentationTimeUs;
                        if ((this.i.flags & 0x4) > 0) {
                            Label_0201: {
                                if (this.i.size > 0) {
                                    final long k = this.k;
                                    if (k > 0L && k < this.e) {
                                        b = true;
                                        break Label_0201;
                                    }
                                }
                                b = false;
                            }
                            this.m = true;
                            this.k = this.e;
                        }
                        else if (this.k >= this.j) {
                            b = true;
                        }
                        this.h.releaseOutputBuffer(dequeueOutputBuffer, b);
                        continue;
                    }
                    continue;
                    this.j = Math.min(this.k + 1L, this.e);
                    monitorexit(this);
                    return true;
                }
                finally {
                    monitorexit(this);
                    while (true) {}
                }
            }
        }
    }
}
