import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

final class chf implements kvv
{
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ ofn b;
    final /* synthetic */ kvw c;
    final /* synthetic */ chj d;
    
    public chf(final chj d, final AtomicInteger a, final ofn b, final kvw c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final lbe lbe) {
        if (this.a.incrementAndGet() == this.d.e) {
            this.b.o(chj.b);
            this.c.l(this);
        }
    }
}
