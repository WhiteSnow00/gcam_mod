// 
// Decompiled by Procyon v0.6.0
// 

public final class pqj
{
    public pqj() {
        plv.h();
    }
    
    public static final Object a(final pqc pqc, Object o, final plc plc) {
        pnq pnq;
        try {
            plv.a(plc);
            o = plc.a(o, pqc);
        }
        finally {
            final Throwable t;
            pnq = new pnq(t);
        }
        Object o2;
        if (pnq == pjs.a) {
            o2 = pjs.a;
        }
        else {
            o = pqc.w(pnq);
            if (o == ppc.b) {
                o2 = pjs.a;
            }
            else if (o instanceof pnq) {
                final Throwable b = ((pnq)o).b;
                final pjl e = pqc.e;
                if (pod.b && e instanceof pjz) {
                    throw pqd.a(b, (pjz)e);
                }
                throw b;
            }
            else {
                o2 = ppc.b(o);
            }
        }
        return o2;
    }
    
    public static final long c(final String s, long longValue, final long n, final long n2) {
        final String a = pqg.a(s);
        if (a == null) {
            return longValue;
        }
        final Long g = plr.g(a);
        if (g == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("System property '");
            sb.append(s);
            sb.append("' has unrecognized value '");
            sb.append(a);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        longValue = g;
        if (n <= longValue && n2 >= longValue) {
            return longValue;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("System property '");
        sb2.append(s);
        sb2.append("' should be in range ");
        sb2.append(n);
        sb2.append("..");
        sb2.append(n2);
        sb2.append(", but is '");
        sb2.append(longValue);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }
}
