import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gku implements klj
{
    public final lit a;
    private final kjm b;
    
    public gku(final lit a) {
        this.a = a;
        this.b = new kjm();
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        final gkq gkq = new gkq(executor, kri);
        this.a.b(gkq);
        this.b.execute(new gks(this, executor, kri));
        return new gkt(this, gkq);
    }
}
