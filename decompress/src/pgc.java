import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class pgc implements Runnable
{
    final /* synthetic */ pgd a;
    private final oym b;
    private final Runnable c;
    
    public pgc(final pgd a, final oym b, final Runnable c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        oyj.h(this.b, this.a.b(this.c));
    }
}
