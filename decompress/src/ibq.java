// 
// Decompiled by Procyon v0.6.0
// 

final class ibq implements iep
{
    final /* synthetic */ icy a;
    final /* synthetic */ ibu b;
    
    public ibq(final ibu b, final icy a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a() {
        final ibu b = this.b;
        kjm.a();
        if (((iah)b.j.d).equals(iah.h) || ((iah)b.j.d).equals(iah.g)) {
            b.i(false);
            return;
        }
        if (((iah)b.j.d).equals(iah.e)) {
            b.g();
            return;
        }
        a.k(ibu.a.c(), "Recording state is incorrect. State: %s", ((iah)b.j.d).name(), '\u0a6d');
    }
    
    @Override
    public final void b(final idb idb) {
        final ibu b = this.b;
        final klv t = b.t;
        final Double n = (Double)b.L.c.get(idb);
        n.getClass();
        t.aR(n);
        final nnh c = b.a().c;
        c.getClass();
        double n3;
        try {
            final Double n2 = (Double)c.get(idb);
            n2.getClass();
            n3 = n2;
        }
        catch (final NullPointerException ex) {
            a.l(ibu.a.c(), "Cannot find corresponding capture rate", '\u0a5d');
            n3 = b.a().b();
        }
        Label_0193: {
            if (b.o.k(cyl.d)) {
                final ias p = b.p;
                synchronized (p.s) {
                    if (p.y.e(n3)) {
                        p.d.b(n3);
                    }
                    break Label_0193;
                }
            }
            final iaa n4 = b.n;
            if (n4.K.e(n3)) {
                n4.f.b(n3);
            }
        }
        this.a.e();
    }
}
