import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nvp extends nvn
{
    private static final Map c;
    private final ntg d;
    
    static {
        final EnumMap enumMap = new EnumMap((Class<K>)ntg.class);
        for (final ntg ntg : ntg.values()) {
            final nvp[] array = new nvp[10];
            for (int j = 0; j < 10; ++j) {
                array[j] = new nvp(j, ntg, nth.a);
            }
            enumMap.put((Object)ntg, array);
        }
        c = Collections.unmodifiableMap((Map<?, ?>)enumMap);
    }
    
    private nvp(int l, final ntg d, final nth nth) {
        super(nth, l);
        oce.g(d, "format char");
        this.d = d;
        if (!nth.c()) {
            final char c = (char)(l = d.l);
            if (nth.d()) {
                l = (c & '\uffdf');
            }
            final StringBuilder sb = new StringBuilder("%");
            nth.f(sb);
            sb.append((char)l);
            sb.toString();
            return;
        }
        final String o = d.o;
    }
    
    public static nvp b(final int n, final ntg ntg, final nth nth) {
        if (n < 10 && nth.c()) {
            return ((nvp[])nvp.c.get(ntg))[n];
        }
        return new nvp(n, ntg, nth);
    }
    
    @Override
    public final void a(final nvo nvo, final Object o) {
        nvo.a(o, this.d, super.b);
    }
}
