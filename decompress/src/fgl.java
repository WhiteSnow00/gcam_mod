import java.util.Iterator;
import java.util.concurrent.Future;
import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class fgl implements lup
{
    public final AtomicInteger a;
    public final ofn b;
    final /* synthetic */ fgm c;
    private final lup d;
    private final AtomicBoolean e;
    
    public fgl(final fgm c, final lup d) {
        this.c = c;
        this.a = new AtomicInteger(0);
        this.e = new AtomicBoolean(false);
        this.b = ofn.f();
        this.d = d;
    }
    
    @Override
    public final void a(final oey oey) {
        this.d.a(oey);
        this.b.e(oey);
    }
    
    @Override
    public final void b(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        try {
            this.d.b(byteBuffer, mediaCodec$BufferInfo);
            this.a.incrementAndGet();
        }
        catch (final CancellationException ex) {}
        finally {
            final Throwable t;
            a.m(fgm.a.c(), "Error occurred while writing", '\u0676', t);
            this.c.b.c();
        }
    }
    
    @Override
    public final void close() {
        this.e.set(true);
        while (true) {
            try {
                final int decrementAndGet = this.c.d.decrementAndGet();
                final fgm c = this.c;
                lup lup;
                if (c.f) {
                    if (c.b.b().isCancelled()) {
                        lup = this.d;
                    }
                    else {
                        Label_0448: {
                            if (decrementAndGet == 0) {
                                synchronized (this.c.e) {
                                    final fgm c2 = this.c;
                                    final ArrayList list = new ArrayList();
                                    Object o = c2.e;
                                    synchronized (o) {
                                        final Iterator iterator = c2.c.iterator();
                                        int value = -1;
                                        while (true) {
                                            final boolean hasNext = iterator.hasNext();
                                            boolean b = false;
                                            if (!hasNext) {
                                                break;
                                            }
                                            final fgl fgl = (fgl)iterator.next();
                                            if (!fgl.b.isDone()) {
                                                if (fgl.a.get() == 0) {
                                                    b = true;
                                                }
                                                njo.o(b);
                                            }
                                            else {
                                                final String string = ((MediaFormat)ofi.u(fgl.b)).getString("mime");
                                                if (lsp.h(string)) {
                                                    list.add(fgl.a.get());
                                                }
                                                else {
                                                    if (!string.equals("application/microvideo-meta-stream")) {
                                                        continue;
                                                    }
                                                    value = fgl.a.get();
                                                }
                                            }
                                        }
                                        monitorexit(o);
                                        if (!list.isEmpty()) {
                                            Label_0401: {
                                                if (value != -1) {
                                                    o = list.iterator();
                                                    while (((Iterator)o).hasNext()) {
                                                        if (Math.abs((int)((Iterator)o).next() - value) < 25) {
                                                            break Label_0401;
                                                        }
                                                    }
                                                    o = new StringBuilder();
                                                    final Iterator iterator2 = list.iterator();
                                                    while (iterator2.hasNext()) {
                                                        ((StringBuilder)o).append((int)iterator2.next());
                                                        ((StringBuilder)o).append(",");
                                                    }
                                                    throw new RuntimeException(String.format("Number of motion and video frames substantially differ (video=%s motion=%d).", o, value));
                                                }
                                            }
                                            this.c.c.clear();
                                            break Label_0448;
                                        }
                                        throw new RuntimeException("No video tracks are being added; aborting microvideo.");
                                    }
                                }
                            }
                        }
                        lup = this.d;
                    }
                }
                else {
                    lup = this.d;
                }
                lup.close();
            }
            catch (final CancellationException ex) {
                final lup lup = this.d;
                continue;
            }
            finally {
                try {
                    final Throwable t;
                    fgm.a.c().h(t).E(1652).o("Error occurred while closing");
                    this.c.b.c();
                    final lup d = this.d;
                }
                finally {
                    this.d.close();
                }
            }
            break;
        }
    }
}
