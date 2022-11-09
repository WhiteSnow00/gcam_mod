// 
// Decompiled by Procyon v0.6.0
// 

final class gnz extends kwp
{
    final /* synthetic */ kvs a;
    final /* synthetic */ ofn b;
    
    public gnz(final kvs a, final ofn b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void d(final ljm ljm) {
        if (ljm == null) {
            goa.a.c().E(1903).r("Failed to get metadata for frame %s", this.a);
            this.b.a(new kuw());
            return;
        }
        this.b.o(ljm);
    }
}
