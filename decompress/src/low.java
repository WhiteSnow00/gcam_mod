// 
// Decompiled by Procyon v0.6.0
// 

public final class low
{
    private final loy a;
    private final loy b;
    private final loy c;
    private final loy d;
    private double e;
    
    public low(final dbn dbn) {
        this.e = -1.0;
        final loy a = new loy();
        (this.a = a).b(70.0, new lov(dbn, 1));
        a.c(new lov(dbn));
        (this.b = new loy()).b(1.1, new lov(dbn, 2));
        final loy c = new loy();
        (this.c = c).b(70.0, new lov(dbn, 3));
        c.c(new lov(dbn, 4));
        final loy d = new loy();
        (this.d = d).b(125.0, new lov(dbn, 5));
        d.c(new lov(dbn, 6));
    }
    
    public final void a(final long n, final long n2) {
        monitorenter(this);
        final double n3 = (double)n;
        Double.isNaN(n3);
        final double e = n3 / 1000000.0;
        try {
            final double e2 = this.e;
            if (e2 > 0.0) {
                final double n4 = e - e2;
                this.a.a(n4);
                final loy b = this.b;
                final double n5 = (double)n2;
                Double.isNaN(n5);
                b.a(n4 / (n5 / 1000000.0));
            }
            this.e = e;
        }
        finally {
            monitorexit(this);
        }
    }
}
