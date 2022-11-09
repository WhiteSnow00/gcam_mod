import java.util.concurrent.atomic.AtomicInteger;
import android.hardware.HardwareBuffer;
import com.google.android.libraries.oliveoil.bufferflinger.BufferFlinger$OnBufferReleasedListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class jfq implements BufferFlinger$OnBufferReleasedListener
{
    public final kvs a;
    public final lju b;
    public final HardwareBuffer c;
    public ksh d;
    final /* synthetic */ jfr e;
    private boolean f;
    private final AtomicInteger g;
    
    public jfq(final jfr e, final kvs a) {
        this.e = e;
        this.g = new AtomicInteger(1);
        e.e.b();
        this.a = a;
        final lju d = a.d(e.i);
        this.b = d;
        HardwareBuffer f;
        if (d != null) {
            f = d.f();
        }
        else {
            f = null;
        }
        this.c = f;
    }
    
    private final void d() {
        if (this.g.decrementAndGet() > 0) {
            return;
        }
        try (final HardwareBuffer c = this.c) {}
        try (final lju b = this.b) {}
        this.a.close();
        this.e.e.a();
        if (!this.f) {
            final long nanoTime = System.nanoTime();
            final long andSet = this.e.l.getAndSet(nanoTime);
            if (andSet != 0L) {
                this.e.f.c((int)(nanoTime - andSet) / 1000000);
            }
        }
        this.e.d.g();
    }
    
    public final HardwareBuffer a() {
        final HardwareBuffer c = this.c;
        nov.z(c);
        return c;
    }
    
    public final void b(final String j) {
        final jfr e = this.e;
        if (!j.equals(e.j)) {
            a.k(jfr.a.c(), "Aborting frame processing:%s", j, '\u0bd1');
            e.j = j;
        }
        this.f = true;
        this.d();
    }
    
    public final void c() {
        njo.e(this.g.getAndIncrement() > 0, "Cannot increase refCount because the frame has been closed");
    }
    
    @Override
    public final void onBufferReleased() {
        final ksh d = this.d;
        if (d != null) {
            d.a();
            this.d = null;
        }
        this.d();
        this.e.g.o(Boolean.TRUE);
    }
}
