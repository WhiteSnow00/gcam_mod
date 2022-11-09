import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fuz
{
    private List a;
    private int b;
    
    public fuz() {
        this.b = 1;
    }
    
    public final void a() {
        synchronized (this) {
            final int b = this.b;
            boolean b2 = true;
            if (b != 1) {
                b2 = false;
            }
            njo.o(b2);
            this.b = 4;
        }
    }
    
    public final void b() {
        synchronized (this) {
            final int b = this.b;
            boolean b2 = true;
            if (b != 1) {
                b2 = false;
            }
            njo.o(b2);
            this.b = 3;
        }
    }
    
    public final void c(final nns a) {
        synchronized (this) {
            this.a = a;
        }
    }
    
    public final void d() {
        synchronized (this) {
            final int b = this.b;
            boolean b2 = true;
            if (b != 1) {
                b2 = false;
            }
            njo.o(b2);
            this.b = 2;
        }
    }
    
    public final void e(final okt okt) {
        monitorenter(this);
        try {
            final List a = this.a;
            if (a != null) {
                if (okt.c) {
                    okt.m();
                    okt.c = false;
                }
                final oaf oaf = (oaf)okt.b;
                final oaf m = oaf.m;
                oaf.i = oky.B();
                for (int i = 0; i < a.size(); ++i) {
                    final okt j = oaj.c.m();
                    final Long n = a.get(i);
                    n.getClass();
                    final int b = (int)(long)n;
                    if (j.c) {
                        j.m();
                        j.c = false;
                    }
                    final oaj oaj = (oaj)j.b;
                    oaj.a |= 0x1;
                    oaj.b = b;
                    final oaj oaj2 = (oaj)j.h();
                    if (okt.c) {
                        okt.m();
                        okt.c = false;
                    }
                    final oaf oaf2 = (oaf)okt.b;
                    oaj2.getClass();
                    final olj k = oaf2.i;
                    if (!k.c()) {
                        oaf2.i = oky.C(k);
                    }
                    oaf2.i.add(oaj2);
                }
            }
            final int b2 = this.b;
            if (okt.c) {
                okt.m();
                okt.c = false;
            }
            final oaf oaf3 = (oaf)okt.b;
            final oaf l = oaf.m;
            if (b2 != 0) {
                oaf3.k = b2 - 1;
                oaf3.a |= 0x100;
                monitorexit(this);
                return;
            }
            throw null;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
