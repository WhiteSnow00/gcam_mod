import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.LinkedHashSet;
import java.util.Collections;
import j$.util.StringJoiner;
import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class byo
{
    private static final String c;
    private static final char[] d;
    public final Map a;
    public final String b;
    private final ArrayList e;
    
    static {
        final String a = a("a", "media_id");
        final String a2 = a("a", "selection_key");
        final String a3 = a("a", "time");
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 12 + String.valueOf(a2).length() + String.valueOf(a3).length());
        sb.append("SELECT ");
        sb.append(a);
        sb.append(",");
        sb.append(a2);
        sb.append(",");
        sb.append(a3);
        sb.append(",%s");
        c = sb.toString();
        d = "bcdefghijklmnopqrstuvwxyz".toCharArray();
    }
    
    public byo(final bza bza, final byx byx, final int n, final Random random) {
        this.a = new HashMap();
        this.e = new ArrayList();
        final StringBuilder sb = new StringBuilder();
        final StringJoiner stringJoiner = new StringJoiner((CharSequence)",");
        final String s = " ";
        final StringJoiner stringJoiner2 = new StringJoiner((CharSequence)" ");
        final String s2 = " AND ";
        final StringJoiner stringJoiner3 = new StringJoiner((CharSequence)" AND ");
        final Iterator<Object> iterator = bza.h.iterator();
        int n2 = 0;
        String s4;
        while (true) {
            final boolean hasNext = iterator.hasNext();
            final String s3 = "selection_key";
            s4 = "media_id";
            if (!hasNext) {
                break;
            }
            final bzc bzc = iterator.next();
            final char c = byo.d[n2];
            final StringBuilder sb2 = new StringBuilder(1);
            sb2.append(c);
            final String string = sb2.toString();
            final String a = bzc.a;
            this.a.put(a, string);
            stringJoiner.add((CharSequence)String.format("%s as %s_%s", a(string, "value"), string, "value"));
            stringJoiner2.add((CharSequence)String.format("LEFT OUTER JOIN %s %s ON %s=%s", a, string, a(string, "media_id"), a("a", "media_id")));
            for (final String s5 : Collections.unmodifiableMap((Map<? extends String, ?>)bzc.b).keySet()) {
                final String a2 = a(string, s5);
                final byu byu = Collections.unmodifiableMap((Map<?, ? extends byu>)bzc.b).get(s5);
                byu.getClass();
                final ArrayList e = this.e;
                byw b;
                if (byu.a == 1) {
                    b = (byw)byu.b;
                }
                else {
                    b = byw.b;
                }
                final olj a3 = b.a;
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(" ( ");
                final Iterator<Object> iterator3 = a3.iterator();
                int n3 = 0;
                while (iterator3.hasNext()) {
                    final byv byv = iterator3.next();
                    if (n3 != 0) {
                        sb3.append(" OR ");
                    }
                    if ((byv.a & 0x1) != 0x0 && byv.c < 100) {
                        sb3.append(" ( ");
                        sb3.append(a2);
                        sb3.append(" = ? AND ((");
                        sb3.append(a("a", s3));
                        sb3.append(" % 100) IN ( ");
                        e.add(Long.toString(byv.b));
                        final LinkedHashSet set = new LinkedHashSet();
                        for (int i = 0; i < byv.c; ++i) {
                            if (i > 0) {
                                sb3.append(" , ");
                            }
                            sb3.append("CAST(? as INTEGER)");
                            Integer n4;
                            for (n4 = random.nextInt(100) + 1; set.contains(n4); n4 = random.nextInt(100) + 1) {}
                            set.add(n4);
                            e.add(String.valueOf(n4));
                        }
                        sb3.append(" ))) ");
                        n3 = 1;
                    }
                    else {
                        sb3.append(a2);
                        sb3.append(" = ? ");
                        e.add(Long.toString(byv.b));
                        n3 = 1;
                    }
                }
                sb3.append(" ) ");
                stringJoiner3.add((CharSequence)sb3.toString());
            }
            ++n2;
        }
        int a4;
        if ((a4 = byz.a(bza.d)) == 0) {
            a4 = 1;
        }
        String s6;
        if (a4 != 2) {
            s6 = s4;
        }
        else {
            s6 = "selection_key";
        }
        final int a5 = byz.a(bza.d);
        long n5 = 0L;
        Label_0828: {
            if (a5 != 0) {
                if (a5 == 2) {
                    if (byx.a == 2) {
                        n5 = (long)byx.b;
                        break Label_0828;
                    }
                    n5 = 0L;
                    break Label_0828;
                }
            }
            if (byx.a == 1) {
                n5 = (long)byx.b;
            }
            else {
                n5 = 0L;
            }
        }
        if (stringJoiner3.length() > 0) {
            sb.append(stringJoiner3);
            sb.append(s2);
        }
        sb.append(a("a", s6));
        final int a6 = byz.a(bza.d);
        Label_0914: {
            if (a6 != 0) {
                if (a6 == 4 && n5 > 0L) {
                    sb.append(" < ?");
                    break Label_0914;
                }
            }
            sb.append(" > ?");
        }
        this.e.add(Long.toString(n5));
        if (bza.a > 0) {
            sb.append(" AND ((");
            sb.append(a("a", "selection_key"));
            sb.append(" % ?) BETWEEN CAST(? as INTEGER) AND CAST(? as INTEGER))");
            this.e.add(String.valueOf(bza.a));
            this.e.add(String.valueOf(bza.b));
            this.e.add(String.valueOf(bza.c));
        }
        oni oni;
        if ((oni = bza.e) == null) {
            oni = oni.c;
        }
        final long a7 = oni.a;
        oni oni2;
        if ((oni2 = bza.f) == null) {
            oni2 = oni.c;
        }
        final long a8 = oni2.a;
        long n6;
        if (a7 == 0L) {
            n6 = 0L;
        }
        else {
            final long millis = TimeUnit.SECONDS.toMillis(a7);
            final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
            oni oni3;
            if ((oni3 = bza.e) == null) {
                oni3 = oni.c;
            }
            n6 = millis + nanoseconds.toMillis(oni3.b);
        }
        long n7;
        if (a8 == 0L) {
            n7 = Long.MAX_VALUE;
        }
        else {
            final long millis2 = TimeUnit.SECONDS.toMillis(a8);
            final TimeUnit nanoseconds2 = TimeUnit.NANOSECONDS;
            oni oni4;
            if ((oni4 = bza.f) == null) {
                oni4 = oni.c;
            }
            n7 = millis2 + nanoseconds2.toMillis(oni4.b);
        }
        sb.append(" AND (");
        sb.append(a("a", "time"));
        sb.append(" BETWEEN CAST(? as INTEGER) AND CAST(? as INTEGER))");
        this.e.add(String.valueOf(n6));
        this.e.add(String.valueOf(n7));
        sb.append(" ORDER BY ");
        sb.append(a("a", s6));
        sb.append(s);
        int a9;
        if ((a9 = byz.a(bza.d)) == 0) {
            a9 = 1;
        }
        String s7;
        if (a9 != 4) {
            s7 = "ASC";
        }
        else {
            s7 = "DESC";
        }
        sb.append(s7);
        sb.append(" LIMIT ?");
        this.e.add(String.valueOf(n));
        this.b = String.format("%s %s %s WHERE %s", String.format(byo.c, stringJoiner), "FROM media_record a", stringJoiner2, sb);
    }
    
    static String a(final String s, final String s2) {
        return String.format("%s.%s", s, s2);
    }
    
    final String[] b() {
        return this.e.toArray(new String[0]);
    }
}
