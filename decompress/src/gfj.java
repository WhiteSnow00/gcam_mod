import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class gfj implements gff
{
    final /* synthetic */ ofn a;
    final /* synthetic */ gfl b;
    private final AtomicBoolean c;
    
    public gfj(final gfl b, final ofn a) {
        this.b = b;
        this.a = a;
        this.c = new AtomicBoolean(false);
    }
    
    @Override
    public final void close() {
        if (this.c.getAndSet(true)) {
            return;
        }
        final gfl b = this.b;
        b.d.aR(b.e.decrementAndGet() > 0);
        this.b.c.c();
        this.a.o(true);
    }
}
