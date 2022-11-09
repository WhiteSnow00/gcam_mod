import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class ayp
{
    final bhp a;
    final Executor b;
    
    public ayp(final bhp a, final Executor b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof ayp && this.a.equals(((ayp)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
