import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ggy implements klv
{
    public final fxu a;
    private final boolean b;
    private final ggx c;
    private final ggx d;
    
    public ggy(final klv klv, final klv klv2, final fxu a, final ggv ggv) {
        this.a = a;
        this.c = new ggx(klv, ggv);
        this.d = new ggx(klv2, ggv);
        this.b = a.F();
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        final kjk kjk = new kjk();
        kjk.c(this.c.a(new ggw(this, kri, 1), executor));
        kjk.c(this.d.a(new ggw(this, kri), executor));
        return kjk;
    }
}
