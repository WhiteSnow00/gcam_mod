// 
// Decompiled by Procyon v0.6.0
// 

final class gag implements gdf
{
    private final lfg a;
    private final boa b;
    private final gdf c;
    private final hdz d;
    private final eaf e;
    
    public gag(final lfg a, final boa b, final gdf c, final hdz d, final eaf e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    @Override
    public final void a(final lju lju, final oey oey) {
        if (lju.a() == 35) {
            if (this.d.c(this.a.l())) {
                hdz.e(lju, this.b.d());
            }
            final eaf e = this.e;
            final boolean b = lju.a() == 35;
            final int a = lju.a();
            final StringBuilder sb = new StringBuilder(48);
            sb.append("Expected image format YUV but found: ");
            sb.append(a);
            njo.e(b, sb.toString());
            e.d.execute(new eae(e, lju));
            this.c.a(lju, oey);
            return;
        }
        lju.close();
    }
    
    @Override
    public final void close() {
        this.c.close();
    }
}
