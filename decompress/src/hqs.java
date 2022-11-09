import android.os.SystemClock;
import java.util.EnumMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqs
{
    public final hkc a;
    public final hkd b;
    public boolean c;
    public final okt d;
    private final eyt e;
    private final klj f;
    private final Map g;
    
    public hqs(final eyt e, final klv f, final hkc a, final hkd b) {
        this.g = new EnumMap(hqr.class);
        this.d = obe.j.m();
        this.e = e;
        this.f = f;
        this.a = a;
        this.b = b;
    }
    
    final void a() {
        this.b();
        this.d(hqr.a);
        this.f(2);
    }
    
    final void b() {
        njo.o(this.c ^ true);
        this.c = true;
        this.g.clear();
        final okt d = this.d;
        d.b = (oky)d.b.H(4);
    }
    
    final void c() {
        njo.o(this.c);
        final okt d = this.d;
        final boolean booleanValue = (boolean)this.a.c(hjq.z);
        if (d.c) {
            d.m();
            d.c = false;
        }
        final obe obe = (obe)d.b;
        final obe j = obe.j;
        obe.a |= 0x40;
        obe.h = booleanValue;
        final okt d2 = this.d;
        final boolean booleanValue2 = (boolean)this.a.c(hjq.y);
        if (d2.c) {
            d2.m();
            d2.c = false;
        }
        final obe obe2 = (obe)d2.b;
        obe2.a |= 0x80;
        obe2.i = booleanValue2;
        Label_0337: {
            Label_0314: {
                if (!((obe)this.d.b).g.isEmpty()) {
                    final int c = oce.c(((obe)this.d.b).d);
                    if (c != 0) {
                        if (c != 1) {
                            break Label_0314;
                        }
                    }
                    final int d3 = oce.d(((obe)this.d.b).c);
                    njo.o((d3 == 0 || d3 == 1) ^ true);
                    final okt d4 = this.d;
                    if (d4.c) {
                        d4.m();
                        d4.c = false;
                    }
                    final obe obe3 = (obe)d4.b;
                    obe3.a |= 0x1;
                    obe3.b = true;
                    final obe obe4 = (obe)this.d.b;
                    final String g = obe4.g;
                    final int c2 = obe4.c;
                    break Label_0337;
                }
            }
            final obe obe5 = (obe)this.d.b;
            final int c3 = obe5.c;
            final int d5 = obe5.d;
        }
        this.e.Q(jbk.f((jbm)this.f.aQ()), null, null, (obe)this.d.h(), null);
        this.c = false;
    }
    
    final void d(final hqr hqr) {
        njo.o(this.c);
        njo.o(this.g.containsKey(hqr) ^ true);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.g.put(hqr, elapsedRealtime);
        final hqr a = hqr.a;
        switch (hqr.ordinal()) {
            default: {
                hqr.name();
                return;
            }
            case 2: {
                final Long n = this.g.get(hqr.b);
                n.getClass();
                final int f = (int)(elapsedRealtime - n);
                final okt d = this.d;
                if (d.c) {
                    d.m();
                    d.c = false;
                }
                final obe obe = (obe)d.b;
                final obe j = obe.j;
                obe.a |= 0x10;
                obe.f = f;
                return;
            }
            case 1: {
                final Long n2 = this.g.get(hqr.a);
                if (n2 != null) {
                    final int e = (int)(elapsedRealtime - n2);
                    final okt d2 = this.d;
                    if (d2.c) {
                        d2.m();
                        d2.c = false;
                    }
                    final obe obe2 = (obe)d2.b;
                    final obe i = obe.j;
                    obe2.a |= 0x8;
                    obe2.e = e;
                }
            }
        }
    }
    
    final void e(final int n) {
        njo.o(this.c);
        final okt d = this.d;
        if (d.c) {
            d.m();
            d.c = false;
        }
        final obe obe = (obe)d.b;
        final obe j = obe.j;
        obe.c = n - 1;
        obe.a |= 0x2;
    }
    
    final void f(final int n) {
        njo.o(this.c);
        final okt d = this.d;
        if (d.c) {
            d.m();
            d.c = false;
        }
        final obe obe = (obe)d.b;
        final obe j = obe.j;
        obe.d = n - 1;
        obe.a |= 0x4;
    }
}
