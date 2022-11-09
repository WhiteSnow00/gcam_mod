// 
// Decompiled by Procyon v0.6.0
// 

final class gai implements gdf
{
    final /* synthetic */ gaj a;
    private final gdf b;
    
    public gai(final gaj a, final gdf b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final lju lju, final oey oey) {
        if (!this.a.a.contains(lju.a())) {
            lju.close();
            return;
        }
        this.b.a(lju, oey);
    }
    
    @Override
    public final void close() {
        this.b.close();
    }
}
