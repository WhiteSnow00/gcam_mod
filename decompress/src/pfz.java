import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pfz implements Runnable
{
    final /* synthetic */ pge a;
    private final pga b;
    
    public pfz(final pge a, final pga b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final pga b = this.b;
        oyj.h(b.b, this.a.d(b));
    }
}
