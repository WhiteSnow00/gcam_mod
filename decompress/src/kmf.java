import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class kmf implements klj
{
    final /* synthetic */ klj a;
    final /* synthetic */ kmg b;
    
    public kmf(final kmg b, final klj a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        return this.a.a(new kme(this, kri), executor);
    }
    
    @Override
    public final Object aQ() {
        return this.b.h(this.a.aQ());
    }
}
