import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzk implements hze
{
    public final klj a;
    private final hze b;
    
    public hzk(final Executor executor, final klv klv, final hzf hzf) {
        this.a = kld.c(klv);
        final hzi a = hzj.a();
        a.c(executor);
        a.a = "PortraitTeleStream";
        a.d(new dzm(klv, 4));
        a.e(new dzm(klv, 5));
        a.f(hzf);
        this.b = a.a();
    }
    
    @Override
    public final void c(final hzf hzf) {
        synchronized (this) {
            this.b.c(hzf);
        }
    }
}
