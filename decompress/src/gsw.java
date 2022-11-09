import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class gsw extends kxc
{
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ int b;
    final /* synthetic */ ofn c;
    final /* synthetic */ glg d;
    
    public gsw(final AtomicInteger a, final int b, final ofn c, final glg d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void b(final ljm ljm) {
        if (this.a.incrementAndGet() == this.b) {
            this.c.o(btv.f);
            this.d.k(this);
        }
    }
}
