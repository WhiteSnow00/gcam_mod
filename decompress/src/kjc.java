import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kjc implements kri
{
    public final kri a;
    private final Executor b;
    
    public kjc(final kri a, final Executor b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void aR(final Object o) {
        this.b.execute(new kjb(this, o));
    }
}
