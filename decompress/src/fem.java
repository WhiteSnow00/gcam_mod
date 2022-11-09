import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fem implements ljw
{
    private final fev a;
    private final fdx b;
    
    public fem(final fev a, final fdx b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        final long a = this.a.a();
        if (a >= 0L) {
            final fdx b = this.b;
            synchronized (b.e) {
                final long convert = TimeUnit.MICROSECONDS.convert(a, TimeUnit.NANOSECONDS);
                if (convert < b.x) {
                    fdx.a.b().E(1568).u("Out of order timestamp %d came after %d", convert, b.x);
                }
                b.x = Math.max(b.x, convert);
                if (b.y.isEmpty()) {
                    b.j.c(b.x - 1500000L);
                }
            }
        }
    }
}
