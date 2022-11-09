import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hbd implements hze
{
    private final hze a;
    
    public hbd(final Executor executor, final klv klv, final klv klv2, final hzf hzf) {
        final hzi a = hzj.a();
        a.f(hzf);
        a.a = "liveRectiface";
        a.e(new hbc(klv, klv2, 1));
        a.d(new hbc(klv, klv2));
        a.c(executor);
        this.a = a.a();
    }
    
    @Override
    public final void c(final hzf hzf) {
        this.a.c(hzf);
    }
}
