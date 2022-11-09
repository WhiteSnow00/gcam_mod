import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kma implements klj
{
    private final klj a;
    private final kmd b;
    
    public kma(final klj a) {
        this.a = a;
        final kmd b = new kmd(a.aQ());
        this.b = b;
        a.a(new klz(b), odx.a);
    }
    
    @Override
    public final krc a(final kri kri, final Executor executor) {
        return this.b.a(kri, executor);
    }
    
    @Override
    public final Object aQ() {
        return this.b.d;
    }
}
