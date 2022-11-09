import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pdj extends AtomicReference implements Runnable, oye
{
    private static final long serialVersionUID = -4552101107598366241L;
    final pdl a;
    oxp b;
    long c;
    boolean d;
    boolean e;
    
    public pdj(final pdl a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.k(this);
    }
}
