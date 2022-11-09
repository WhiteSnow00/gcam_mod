// 
// Decompiled by Procyon v0.6.0
// 

public final class gah implements gdg
{
    private final lfg a;
    private final boa b;
    private final gdg c;
    private final hdz d;
    private final eaf e;
    
    public gah(final lfg a, final boa b, final gdg c, final hdz d, final eaf e) {
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final gdf a(final gen gen) {
        return new gag(this.a, this.b, this.c.a(gen), this.d, this.e);
    }
    
    @Override
    public final gdf b(final gen gen) {
        final gdf b = this.c.b(gen);
        if (b == null) {
            return null;
        }
        return new gag(this.a, this.b, b, this.d, this.e);
    }
}
