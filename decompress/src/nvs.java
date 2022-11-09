import java.io.IOException;
import java.util.Formatter;
import java.util.Formattable;
import java.math.BigInteger;
import java.math.BigDecimal;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nvs implements nvo
{
    public int a;
    public int b;
    public final Object[] c;
    public final StringBuilder d;
    public int e;
    private final nul f;
    
    public nvs(final nul f, final Object[] array, final StringBuilder d) {
        this.a = 0;
        this.b = -1;
        oce.g(f, "context");
        this.f = f;
        this.e = 0;
        this.c = (Object[])oce.g(array, "arguments");
        this.d = d;
    }
    
    public static void d(final StringBuilder sb, final Object o, final String s) {
        sb.append("[INVALID: format=");
        sb.append(s);
        sb.append(", type=");
        sb.append(o.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(ntn.b(o));
        sb.append("]");
    }
    
    @Override
    public final void a(Object o, ntg ntg, final nth nth) {
        final int ordinal = ntg.m.ordinal();
        int n = 0;
        int n2 = 1;
        while (true) {
            boolean b = false;
            switch (ordinal) {
                default: {
                    throw null;
                }
                case 4: {
                    b = (o instanceof Double || o instanceof Float || o instanceof BigDecimal);
                    break;
                }
                case 3: {
                    b = (o instanceof Integer || o instanceof Long || o instanceof Byte || o instanceof Short || o instanceof BigInteger);
                    break;
                }
                case 2: {
                    b = (o instanceof Character || ((o instanceof Integer || o instanceof Byte || o instanceof Short) && Character.isValidCodePoint(((Number)o).intValue())));
                    break;
                }
                case 1: {
                    b = (o instanceof Boolean);
                    break;
                }
                case 0: {
                    final StringBuilder d = this.d;
                    switch (ntg.ordinal()) {
                        case 5: {
                            nth a = null;
                            Label_0358: {
                                if (!nth.c()) {
                                    final int b2 = nth.b;
                                    final int n3 = b2 & 0x80;
                                    if (n3 == 0) {
                                        a = nth.a;
                                        break Label_0358;
                                    }
                                    if (n3 != b2 || nth.c != -1 || nth.d != -1) {
                                        a = new nth(n3, -1, -1);
                                        break Label_0358;
                                    }
                                }
                                a = nth;
                            }
                            if (!a.equals(nth)) {
                                break;
                            }
                            final Number n4 = (Number)o;
                            final boolean d2 = nth.d();
                            final long longValue = n4.longValue();
                            if (n4 instanceof Long) {
                                ntn.c(d, longValue, d2);
                                return;
                            }
                            if (n4 instanceof Integer) {
                                ntn.c(d, longValue & 0xFFFFFFFFL, d2);
                                return;
                            }
                            if (n4 instanceof Byte) {
                                ntn.c(d, longValue & 0xFFL, d2);
                                return;
                            }
                            if (n4 instanceof Short) {
                                ntn.c(d, longValue & 0xFFFFL, d2);
                                return;
                            }
                            if (n4 instanceof BigInteger) {
                                String s = ((BigInteger)n4).toString(16);
                                if (d2) {
                                    s = s.toUpperCase(ntn.a);
                                }
                                d.append(s);
                                return;
                            }
                            final String value = String.valueOf(((BigInteger)n4).getClass());
                            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 25);
                            sb.append("unsupported number type: ");
                            sb.append(value);
                            throw new IllegalStateException(sb.toString());
                        }
                        case 2: {
                            if (!nth.c()) {
                                break;
                            }
                            if (o instanceof Character) {
                                d.append(o);
                                return;
                            }
                            final int intValue = ((Number)o).intValue();
                            if (intValue >>> 16 == 0) {
                                d.append((char)intValue);
                                return;
                            }
                            d.append(Character.toChars(intValue));
                            return;
                        }
                        case 1:
                        case 3: {
                            if (nth.c()) {
                                d.append(o);
                                return;
                            }
                            break;
                        }
                        case 0: {
                            if (o instanceof Formattable) {
                                ntg = (ntg)o;
                                final int n5 = nth.b & 0xA2;
                                int n7;
                                if (n5 != 0) {
                                    if ((n5 & 0x20) == 0x0) {
                                        n2 = 0;
                                    }
                                    int n6;
                                    if ((n5 & 0x80) != 0x0) {
                                        n6 = 2;
                                    }
                                    else {
                                        n6 = 0;
                                    }
                                    if ((n5 & 0x2) != 0x0) {
                                        n = 4;
                                    }
                                    n7 = (n2 | n6 | n);
                                }
                                else {
                                    n7 = n5;
                                }
                                final int length = d.length();
                                o = new Formatter(d, ntn.a);
                                try {
                                    ((Formattable)ntg).formatTo((Formatter)o, n7, nth.c, nth.d);
                                    return;
                                }
                                catch (final RuntimeException ex) {
                                    d.setLength(length);
                                    try {
                                        ((Formatter)o).out().append(ntn.a(ntg, ex));
                                        return;
                                    }
                                    catch (final IOException ex2) {
                                        return;
                                    }
                                }
                                break;
                            }
                            if (nth.c()) {
                                d.append(ntn.b(o));
                                return;
                            }
                            break;
                        }
                    }
                    String s2 = ntg.o;
                    if (!nth.c()) {
                        int l;
                        final char c = (char)(l = ntg.l);
                        if (nth.d()) {
                            l = (c & '\uffdf');
                        }
                        final StringBuilder sb2 = new StringBuilder("%");
                        nth.f(sb2);
                        sb2.append((char)l);
                        s2 = sb2.toString();
                    }
                    d.append(String.format(ntn.a, s2, o));
                    return;
                }
            }
            if (b) {
                continue;
            }
            break;
        }
        d(this.d, o, ntg.o);
    }
    
    public final nvt b() {
        return this.f.a;
    }
    
    public final String c() {
        return this.f.b;
    }
}
