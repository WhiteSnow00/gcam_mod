// 
// Decompiled by Procyon v0.6.0
// 

public final class gcx implements gdg
{
    private final gdg a;
    private final gcy b;
    
    public gcx(final gdg a, final gcy b) {
        this.b = b;
        this.a = a;
    }
    
    private final gdf c(final gdf gdf, final gen gen) {
        final hhy b = gen.b;
        return new gcw(gdf, b.p(), this.b.e(b.s()), this.b);
    }
    
    @Override
    public final gdf a(final gen gen) {
        return this.c(this.a.a(gen), gen);
    }
    
    @Override
    public final gdf b(final gen gen) {
        final gdf b = this.a.b(gen);
        if (b == null) {
            return null;
        }
        return this.c(b, gen);
    }
}
