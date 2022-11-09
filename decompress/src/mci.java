import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import android.util.Log;
import java.util.concurrent.Future;
import android.media.MediaFormat;
import java.util.concurrent.Executor;
import android.media.MediaMuxer;
import java.util.concurrent.ConcurrentLinkedDeque;

// 
// Decompiled by Procyon v0.6.0
// 

final class mci implements mcf
{
    public final oey a;
    public final ofn b;
    public final ofn c;
    public final ofn d;
    public final ofn e;
    public final ConcurrentLinkedDeque f;
    public MediaMuxer g;
    private final ofn h;
    private final mcp i;
    private final Object j;
    private long k;
    
    public mci(final oey a, final mcp i) {
        this.b = ofn.f();
        final ofn f = ofn.f();
        this.c = f;
        this.h = ofn.f();
        this.d = ofn.f();
        this.e = ofn.f();
        this.f = new ConcurrentLinkedDeque();
        this.j = new Object();
        this.k = 0L;
        this.i = i;
        (this.a = a).d(new mcg(this), i);
        f.d(new mcg(this), i);
    }
    
    private static boolean c(final MediaFormat mediaFormat, final String s) {
        return mediaFormat.containsKey(s) && mediaFormat.getInteger(s) > 0;
    }
    
    public final void a() {
        try {
            synchronized (this.j) {
                if (this.a.isDone() && !this.a.isCancelled()) {
                    final boolean c = c((MediaFormat)ofi.u(this.a), "oo.muxer.drop_initial_non_keyframes");
                    if (!this.h.isDone()) {
                        if (c) {
                            while (!this.f.isEmpty()) {
                                if ((this.f.getFirst().b.flags & 0x1) != 0x0) {
                                    break;
                                }
                                this.f.removeFirst();
                            }
                        }
                        if (!this.f.isEmpty()) {
                            this.h.o(this.f.getFirst().b.presentationTimeUs);
                        }
                    }
                }
                if (!this.b.isDone()) {
                    final boolean cancelled = this.a.isCancelled();
                    final boolean b = this.a.isDone() && !this.h.isDone() && this.d.isDone();
                    final boolean b2 = !this.h.isDone() && this.f.isEmpty() && this.d.isDone();
                    if (!b && !b2 && !cancelled) {
                        if (this.a.isDone() && !this.a.isCancelled() && this.h.isDone()) {
                            this.b.o(true);
                        }
                    }
                    else {
                        this.b.o(false);
                        this.e.o(null);
                    }
                }
                if (this.c.isDone() && this.a.isDone() && !this.a.isCancelled()) {
                    while (true) {
                        final mca mca = this.f.pollFirst();
                        if (mca == null) {
                            break;
                        }
                        final int intValue = (int)ofi.u(this.c);
                        final MediaMuxer g = this.g;
                        final long presentationTimeUs = mca.b.presentationTimeUs;
                        final long k = this.k;
                        if (c((MediaFormat)ofi.u(this.a), "oo.muxer.force_sequential")) {
                            if (presentationTimeUs < k) {
                                mca.b.presentationTimeUs = this.k;
                            }
                            this.k = mca.b.presentationTimeUs + 100L;
                        }
                        try {
                            if (mca.b.size == 0) {
                                continue;
                            }
                            g.writeSampleData(intValue, mca.a, mca.b);
                        }
                        finally {
                            final Throwable t;
                            Log.w("MuxerTrackStreamImpl", "Exception while trying to write packets", t);
                            this.e.a(t);
                        }
                    }
                    njo.o(this.f.isEmpty());
                    if (this.d.isDone()) {
                        this.e.o(null);
                    }
                }
            }
        }
        catch (final Exception ex) {
            Log.w("MuxerTrackStreamImpl", "Exception while trying to write packets", (Throwable)ex);
            this.e.a(ex);
        }
    }
    
    @Override
    public final void b(ByteBuffer duplicate, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        final MediaCodec$BufferInfo mediaCodec$BufferInfo2 = new MediaCodec$BufferInfo();
        mediaCodec$BufferInfo2.set(0, mediaCodec$BufferInfo.size, mediaCodec$BufferInfo.presentationTimeUs, mediaCodec$BufferInfo.flags);
        duplicate = duplicate.duplicate();
        duplicate.position(mediaCodec$BufferInfo.offset);
        duplicate.limit(mediaCodec$BufferInfo.size + mediaCodec$BufferInfo.offset);
        this.i.execute(new mch(this, new mca(duplicate, mediaCodec$BufferInfo2)));
    }
    
    @Override
    public final void close() {
        this.i.execute(new mcg(this, 1));
    }
}
