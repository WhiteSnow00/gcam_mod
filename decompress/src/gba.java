// 
// Decompiled by Procyon v0.6.0
// 

public final class gba implements gdf
{
    public final gwp a;
    public final lkb b;
    public final /* synthetic */ gbb c;
    
    public gba(final gbb c, final hhy hhy) {
        this.c = c;
        final gxy a = new gxy(hhy);
        this.a = a;
        ((hfx)hhy).b.e().a(a);
        final hie g = hhy.g();
        this.b = g.a.d(1, llx.b, "Raw", "dng", g.b);
    }
    
    @Override
    public final void a(final lju lju, final oey oey) {
        throw new RuntimeException("Should not call RawModeImageSaver.addFullSizeImage()");
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        monitorexit(this);
    }
}
