import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eui implements hze
{
    private final hze a;
    
    public eui(final Executor executor, final cxl cxl, final klv klv, final hzf hzf) {
        if (!cxl.k(cxu.b)) {
            this.a = hyy.a;
            return;
        }
        final hzi a = hzj.a();
        a.c(executor);
        a.a = "LensLite";
        a.d(new dzm(klv, 2));
        a.e(new dzm(klv, 3));
        a.f(hzf);
        this.a = a.a();
    }
    
    @Override
    public final void c(final hzf hzf) {
        synchronized (this) {
            this.a.c(hzf);
        }
    }
}
