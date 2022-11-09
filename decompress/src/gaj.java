import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gaj implements gdg
{
    public final Set a;
    private final gdg b;
    
    public gaj(final gdg b, final Set a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final gdf a(final gen gen) {
        return new gai(this, this.b.a(gen));
    }
    
    @Override
    public final gdf b(final gen gen) {
        final gdf b = this.b.b(gen);
        if (b == null) {
            return null;
        }
        return new gai(this, b);
    }
}
