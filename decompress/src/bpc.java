// 
// Decompiled by Procyon v0.6.0
// 

final class bpc implements gdf
{
    private final boa a;
    private final oey b;
    private final gdf c;
    private gaa d;
    
    public bpc(final boa a, final oey b, final gdf c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final lju lju, final oey oey) {
        lju lju2 = lju;
        Label_0082: {
            if (lju.a() == 35) {
                if (this.d != null) {
                    lju2 = lju;
                    if (lju.d() <= this.d.d()) {
                        break Label_0082;
                    }
                }
                lju2 = new lgb(lju, 2);
                try (final gaa d = this.d) {}
                this.d = new gaa(new lgc(lju2), oey);
            }
        }
        this.c.a(new lgc(lju2), oey);
    }
    
    @Override
    public final void close() {
        if (this.d != null) {
            final boi boi = (boi)knf.d(this.b);
            if (boi != null) {
                final kra b = kra.b((int)this.a.c().aQ());
                final gya b2 = gyb.b(this.d);
                b2.c = b;
                boi.f(b2.a());
            }
            this.d.close();
        }
        this.c.close();
    }
}
