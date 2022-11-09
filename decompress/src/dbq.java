import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class dbq
{
    public final jbm a;
    public final Map b;
    public int c;
    public final int d;
    private final Map e;
    
    public dbq(final jbm a, final int d) {
        this.b = new HashMap();
        this.e = new HashMap();
        this.a = a;
        this.d = d;
    }
    
    final nzq a() {
        if (this.d == 2) {
            nvb.g(new dbp(this));
        }
        final okt m = nzq.i.m();
        final int t = this.a.t;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzq nzq = (nzq)m.b;
        final int a = nzq.a | 0x1;
        nzq.a = a;
        nzq.b = t;
        nzq.c = this.d - 1;
        final int a2 = a | 0x2;
        nzq.a = a2;
        nzq.d = 1;
        final int a3 = a2 | 0x4;
        nzq.a = a3;
        final int c = this.c;
        final int a4 = a3 | 0x8;
        nzq.a = a4;
        nzq.e = c;
        nzq.a = (a4 | 0x10);
        nzq.h = 1;
        for (final int intValue : this.b.keySet()) {
            final dbo dbo = this.b.get(intValue);
            final okt i = nzo.g.m();
            if (i.c) {
                i.m();
                i.c = false;
            }
            final nzo nzo = (nzo)i.b;
            final int a5 = nzo.a | 0x1;
            nzo.a = a5;
            nzo.b = intValue;
            final int a6 = dbo.a;
            final int a7 = a5 | 0x2;
            nzo.a = a7;
            nzo.c = a6;
            final int b = dbo.b;
            final int a8 = a7 | 0x4;
            nzo.a = a8;
            nzo.d = b;
            final int c2 = dbo.c;
            final int a9 = a8 | 0x8;
            nzo.a = a9;
            nzo.e = c2;
            final int d = dbo.d;
            nzo.a = (a9 | 0x10);
            nzo.f = d;
            final nzo nzo2 = (nzo)i.h();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nzq nzq2 = (nzq)m.b;
            nzo2.getClass();
            final olj f = nzq2.f;
            if (!f.c()) {
                nzq2.f = oky.C(f);
            }
            nzq2.f.add(nzo2);
        }
        for (final int intValue2 : this.e.keySet()) {
            final okt j = nzp.d.m();
            if (j.c) {
                j.m();
                j.c = false;
            }
            final nzp nzp = (nzp)j.b;
            nzp.a |= 0x1;
            nzp.b = intValue2;
            final int intValue3 = this.e.get(intValue2);
            if (j.c) {
                j.m();
                j.c = false;
            }
            final nzp nzp2 = (nzp)j.b;
            nzp2.a |= 0x2;
            nzp2.c = intValue3;
            final nzp nzp3 = (nzp)j.h();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nzq nzq3 = (nzq)m.b;
            nzp3.getClass();
            final olj g = nzq3.g;
            if (!g.c()) {
                nzq3.g = oky.C(g);
            }
            nzq3.g.add(nzp3);
        }
        return (nzq)m.h();
    }
}
