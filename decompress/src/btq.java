import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btq implements klj, krc
{
    private final krc a;
    private final klj b;
    
    public btq(final klj klj, Executor e) {
        e = ofi.e(e);
        final kkz b = new kkz(klj.aQ());
        this.b = b;
        this.a = klj.a(new gly(b, 1), e);
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        return this.b.a(kri, executor);
    }
    
    @Override
    public final Object aQ() {
        return ((kkz)this.b).d;
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
}
