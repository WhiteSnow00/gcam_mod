import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import android.media.MediaFormat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lsz implements ljy
{
    public static final nsd a;
    public final ljy b;
    public final Object c;
    public Throwable d;
    public final Object e;
    public final HashMap f;
    private final Executor g;
    private final Runnable h;
    private final boolean i;
    private int j;
    
    static {
        a = nsd.g("com/google/android/libraries/microvideo/gcamuxer/AsyncMediaMuxerWrapper");
    }
    
    public lsz(final ljy b, final ExecutorService executorService) {
        this.c = new Object();
        this.d = null;
        this.e = new Object();
        this.f = new HashMap();
        this.j = 0;
        this.b = b;
        this.g = new lsy(this, ofi.e(executorService));
        executorService.getClass();
        this.h = new lsw(executorService);
        this.i = true;
    }
    
    private final void g() {
        synchronized (this.c) {
            final Throwable d = this.d;
            this.d = null;
            if (d == null) {
                return;
            }
            throw new ltr(d);
        }
    }
    
    private final void j() {
        final ofn f = ofn.f();
        this.g.execute(new lsv(f));
        try {
            f.get(60L, TimeUnit.SECONDS);
            return;
        }
        catch (final TimeoutException f) {}
        catch (final ExecutionException f) {}
        catch (final InterruptedException ex) {}
        a.m(lsz.a.c(), "Waiting for muxer interrupted / timed out", '\u0bf5', (Throwable)f);
        Thread.currentThread().interrupt();
    }
    
    @Override
    public final int a(final MediaFormat mediaFormat) {
        synchronized (this.e) {
            final int n = this.j++;
            this.g.execute(new lsu(this, mediaFormat, n));
            return n;
        }
    }
    
    @Override
    public final void b() {
        this.g.execute(new lsq(this.b, 1));
        this.j();
        if (this.i) {
            this.h.run();
        }
        this.g();
    }
    
    @Override
    public final void c(final float n, final float n2) {
        this.g.execute(new lsr(this, n, n2));
        this.g();
    }
    
    @Override
    public final void d(final int n) {
        this.g.execute(new lss(this, n));
        this.g();
    }
    
    @Override
    public final void e() {
        this.g.execute(new iey(16));
        this.g();
    }
    
    @Override
    public final void f() {
        this.g.execute(new lsq(this.b));
        this.j();
        this.g();
    }
    
    @Override
    public final void h(final int n, final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        this.g();
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
        byteBuffer.rewind();
        allocateDirect.put(byteBuffer).flip();
        this.g.execute(new lst(this, n, allocateDirect, mediaCodec$BufferInfo));
    }
    
    @Override
    public final boolean i() {
        return true;
    }
}
