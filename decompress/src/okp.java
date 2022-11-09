import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class okp
{
    public static final okp a;
    public final ong b;
    public boolean c;
    private boolean d;
    
    static {
        a = new okp(null);
    }
    
    private okp() {
        this.b = ong.b(16);
    }
    
    private okp(final byte[] array) {
        final ong b = ong.b(0);
        this.b = b;
        this.e();
        this.e();
    }
    
    static int a(final onv onv, int n, final Object o) {
        int ab;
        n = (ab = okg.ab(n));
        if (onv == onv.j) {
            olk.j((omj)o);
            ab = n + n;
        }
        final onw a = onw.a;
        final int ordinal = onv.ordinal();
        n = 4;
        switch (ordinal) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 17: {
                n = okg.Y((long)o);
                break;
            }
            case 16: {
                n = okg.W((int)o);
                break;
            }
            case 15: {
                ((Long)o).longValue();
                n = 8;
                break;
            }
            case 14: {
                ((Integer)o).intValue();
                break;
            }
            case 13: {
                if (o instanceof olb) {
                    n = okg.N(((olb)o).a());
                    break;
                }
                n = okg.N((int)o);
                break;
            }
            case 12: {
                n = okg.ad((int)o);
                break;
            }
            case 11: {
                if (o instanceof ojw) {
                    n = okg.I((ojw)o);
                    break;
                }
                n = okg.G((byte[])o);
                break;
            }
            case 10: {
                if (o instanceof olr) {
                    n = okg.Q((ols)o);
                    break;
                }
                n = okg.S((omj)o);
                break;
            }
            case 9: {
                n = okg.L((omj)o);
                break;
            }
            case 8: {
                if (o instanceof ojw) {
                    n = okg.I((ojw)o);
                    break;
                }
                n = okg.aa((String)o);
                break;
            }
            case 7: {
                ((Boolean)o).booleanValue();
                n = 1;
                break;
            }
            case 6: {
                ((Integer)o).intValue();
                break;
            }
            case 5: {
                ((Long)o).longValue();
                n = 8;
                break;
            }
            case 4: {
                n = okg.N((int)o);
                break;
            }
            case 3: {
                n = okg.af((long)o);
                break;
            }
            case 2: {
                n = okg.af((long)o);
                break;
            }
            case 1: {
                ((Float)o).floatValue();
                break;
            }
            case 0: {
                ((Double)o).doubleValue();
                n = 8;
                break;
            }
        }
        return ab + n;
    }
    
    static void g(final okg okg, final onv onv, final int n, final Object o) {
        if (onv == onv.j) {
            final omj omj = (omj)o;
            olk.j(omj);
            okg.A(n, 3);
            okg.aq(omj);
            okg.A(n, 4);
            return;
        }
        okg.A(n, onv.t);
        final onw a = onw.a;
        switch (onv.ordinal()) {
            default: {
                return;
            }
            case 17: {
                okg.au((long)o);
                return;
            }
            case 16: {
                okg.as((int)o);
                return;
            }
            case 15: {
                okg.r((long)o);
                return;
            }
            case 14: {
                okg.p((int)o);
                return;
            }
            case 13: {
                if (o instanceof olb) {
                    okg.t(((olb)o).a());
                    return;
                }
                okg.t((int)o);
                return;
            }
            case 12: {
                okg.C((int)o);
                return;
            }
            case 11: {
                if (o instanceof ojw) {
                    okg.n((ojw)o);
                    return;
                }
                final byte[] array = (byte[])o;
                okg.F(array, array.length);
                return;
            }
            case 10: {
                okg.v((omj)o);
                return;
            }
            case 9: {
                okg.aq((omj)o);
                return;
            }
            case 8: {
                if (o instanceof ojw) {
                    okg.n((ojw)o);
                    return;
                }
                okg.z((String)o);
                return;
            }
            case 7: {
                okg.j((byte)(((boolean)o) ? 1 : 0));
                return;
            }
            case 6: {
                okg.p((int)o);
                return;
            }
            case 5: {
                okg.r((long)o);
                return;
            }
            case 4: {
                okg.t((int)o);
                return;
            }
            case 3: {
                okg.E((long)o);
                return;
            }
            case 2: {
                okg.E((long)o);
                return;
            }
            case 1: {
                okg.ap((float)o);
                return;
            }
            case 0: {
                okg.an((double)o);
            }
        }
    }
    
    public static int j(final okx okx, final Object o) {
        return a(okx.c, okx.b, o);
    }
    
    private static Object m(final Object o) {
        if (o instanceof omn) {
            return ((omn)o).c();
        }
        if (o instanceof byte[]) {
            final byte[] array = (byte[])o;
            final int length = array.length;
            final byte[] array2 = new byte[length];
            System.arraycopy(array, 0, array2, 0, length);
            return array2;
        }
        return o;
    }
    
    private static boolean n(final Map.Entry entry) {
        if (entry.getKey().a() == onw.i) {
            final V value = entry.getValue();
            if (value instanceof omj) {
                if (!((omj)value).n()) {
                    return false;
                }
            }
            else {
                if (value instanceof olr) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }
    
    public final int b(final Map.Entry entry) {
        final okx okx = entry.getKey();
        final V value = entry.getValue();
        if (okx.a() != onw.i) {
            return j(okx, value);
        }
        if (value instanceof olr) {
            final int b = entry.getKey().b;
            final olr olr = (olr)value;
            final int ab = okg.ab(1);
            return ab + ab + okg.ac(2, b) + okg.P(3, olr);
        }
        final int b2 = entry.getKey().b;
        final omj omj = (omj)value;
        final int ab2 = okg.ab(1);
        return ab2 + ab2 + okg.ac(2, b2) + (okg.ab(3) + okg.S(omj));
    }
    
    public final okp c() {
        final okp okp = new okp();
        for (int i = 0; i < this.b.a(); ++i) {
            final Map.Entry f = this.b.f(i);
            okp.l((okx)f.getKey(), f.getValue());
        }
        for (final Map.Entry<okx, V> entry : this.b.c()) {
            okp.l(entry.getKey(), entry.getValue());
        }
        okp.d = this.d;
        return okp;
    }
    
    public final Iterator d() {
        if (this.d) {
            return new olq(this.b.entrySet().iterator());
        }
        return this.b.entrySet().iterator();
    }
    
    public final void e() {
        if (this.c) {
            return;
        }
        final ong b = this.b;
        if (!b.c) {
            for (int i = 0; i < b.a(); ++i) {
                final okx okx = b.f(i).getKey();
            }
            final Iterator iterator = b.c().iterator();
            while (iterator.hasNext()) {
                final okx okx2 = ((Map.Entry<okx, V>)iterator.next()).getKey();
            }
        }
        if (!b.c) {
            Map<Object, Object> b2;
            if (b.b.isEmpty()) {
                b2 = Collections.emptyMap();
            }
            else {
                b2 = Collections.unmodifiableMap((Map<?, ?>)b.b);
            }
            b.b = b2;
            Map<Object, Object> d;
            if (b.d.isEmpty()) {
                d = Collections.emptyMap();
            }
            else {
                d = Collections.unmodifiableMap((Map<?, ?>)b.d);
            }
            b.d = d;
            b.c = true;
        }
        this.c = true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof okp && this.b.equals(((okp)o).b));
    }
    
    public final void f(final Map.Entry entry) {
        final okx okx = entry.getKey();
        final V value = entry.getValue();
        if (value instanceof olr) {
            final olr olr = (olr)value;
            throw null;
        }
        if (okx.a() != onw.i) {
            this.b.d(okx, m(value));
            return;
        }
        final Object k = this.k(okx);
        if (k == null) {
            this.b.d(okx, m(value));
            return;
        }
        if (!(k instanceof omn)) {
            final omi bh = ((omj)k).bH();
            ((okt)bh).o((oky)value);
            this.b.d(okx, bh.j());
            return;
        }
        final omn omn = (omn)k;
        final omn omn2 = (omn)value;
        throw new UnsupportedOperationException();
    }
    
    final boolean h() {
        return this.b.isEmpty();
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
    
    public final boolean i() {
        for (int i = 0; i < this.b.a(); ++i) {
            if (!n(this.b.f(i))) {
                return false;
            }
        }
        final Iterator iterator = this.b.c().iterator();
        while (iterator.hasNext()) {
            if (!n((Map.Entry)iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public final Object k(final okx okx) {
        final Object value = this.b.get(okx);
        if (!(value instanceof olr)) {
            return value;
        }
        final olr olr = (olr)value;
        throw null;
    }
    
    public final void l(final okx okx, final Object o) {
        final onv c = okx.c;
        olk.h(o);
        final onv a = onv.a;
        final onw a2 = onw.a;
        Label_0186: {
            boolean b = false;
            switch (c.s.ordinal()) {
                default: {
                    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", okx.b, okx.c.s, o.getClass().getName()));
                }
                case 8: {
                    if (o instanceof omj) {
                        break Label_0186;
                    }
                    if (o instanceof olr) {
                        break Label_0186;
                    }
                    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", okx.b, okx.c.s, o.getClass().getName()));
                }
                case 7: {
                    if (o instanceof Integer) {
                        break Label_0186;
                    }
                    if (o instanceof olb) {
                        break Label_0186;
                    }
                    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", okx.b, okx.c.s, o.getClass().getName()));
                }
                case 6: {
                    if (o instanceof ojw) {
                        break Label_0186;
                    }
                    if (o instanceof byte[]) {
                        break Label_0186;
                    }
                    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", okx.b, okx.c.s, o.getClass().getName()));
                }
                case 5: {
                    b = (o instanceof String);
                    break;
                }
                case 4: {
                    b = (o instanceof Boolean);
                    break;
                }
                case 3: {
                    b = (o instanceof Double);
                    break;
                }
                case 2: {
                    b = (o instanceof Float);
                    break;
                }
                case 1: {
                    b = (o instanceof Long);
                    break;
                }
                case 0: {
                    b = (o instanceof Integer);
                    break;
                }
            }
            if (!b) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", okx.b, okx.c.s, o.getClass().getName()));
            }
        }
        if (o instanceof olr) {
            this.d = true;
        }
        this.b.d(okx, o);
    }
}
