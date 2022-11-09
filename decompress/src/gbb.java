import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gbb implements gdg
{
    public final Executor a;
    
    public gbb(final Executor a) {
        this.a = a;
    }
    
    @Override
    public final gdf a(final gen gen) {
        return new gba(this, gen.b);
    }
    
    public final gba c(final gen gen) {
        return new gba(this, gen.b);
    }
}
