import java.util.concurrent.Executor;
import java.util.Set;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

final class gcw implements gdf
{
    private final gdf a;
    private final oey b;
    private final gcy c;
    private final gcz d;
    
    public gcw(final gdf a, final oey b, final gcz d, final gcy c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    @Override
    public final void a(final lju lju, final oey oey) {
        final gcz d = this.d;
        final long d2 = lju.d();
        Object a = d.b.a;
        synchronized (a) {
            final Set d3 = d.a.d;
            final Long value = d2;
            d3.add(value);
            d.b.b.put(value, d.a);
            monitorexit(a);
            if (Arrays.asList(37, 38, 32).contains(lju.a())) {
                a = new lgb(lju, 2);
                this.c.a(new gaa(new lgc((lju)a), oey));
                this.a.a(new lgc((lju)a), oey);
            }
            else if (lju.a() == 35) {
                a = new lgb(lju, 2);
                this.c.d(new gaa(new lgc((lju)a), oey));
                this.a.a(new lgc((lju)a), oey);
            }
            else {
                this.a.a(lju, oey);
            }
            this.c.c(lju.d(), oey);
        }
    }
    
    @Override
    public final void close() {
        this.b.d(new gcv(this.d), odx.a);
        this.a.close();
    }
}
