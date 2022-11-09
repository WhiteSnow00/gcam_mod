import java.util.concurrent.Executor;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nho implements Runnable, Closeable
{
    private nhr a;
    private final boolean b;
    private boolean c;
    private boolean d;
    
    public nho(final nhr a) {
        this.a = a;
        this.b = mrm.f();
    }
    
    private final void b() {
        this.c = true;
        if (this.b && !this.d) {
            mrm.f();
        }
    }
    
    public final void a(final oey oey) {
        if (this.c) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (!this.d) {
            this.d = true;
            oey.d(this, odx.a);
            return;
        }
        throw new IllegalStateException("Signal is already attached to future");
    }
    
    @Override
    public final void close() {
        final nhr a = this.a;
        this.a = null;
        try {
            if (!this.d) {
                if (this.c) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.b();
            }
        }
        finally {
            nhz.e(a);
        }
    }
    
    @Override
    public final void run() {
        if (!this.c && this.d) {
            this.b();
            return;
        }
        mrm.e(iey.l);
    }
}
