// 
// Decompiled by Procyon v0.6.0
// 

public final class bpd implements gdg
{
    private final boa a;
    private final oey b;
    private final gdg c;
    
    public bpd(final gdg c, final boa a, final oey b) {
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    @Override
    public final gdf a(final gen gen) {
        return new bpc(this.a, this.b, this.c.a(gen));
    }
    
    @Override
    public final gdf b(final gen gen) {
        final gdf b = this.c.b(gen);
        if (b == null) {
            return null;
        }
        return new bpc(this.a, this.b, b);
    }
}
