import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bts implements klj
{
    private final klj a;
    
    public bts(final klj a) {
        this.a = a;
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        return this.a.a(new btr(kri), executor);
    }
    
    @Override
    public final Object aQ() {
        return this.a.aQ();
    }
}
