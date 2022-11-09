import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jng
{
    public final Map a;
    public final long b;
    public final long c;
    public final boolean d;
    private final int e;
    
    public jng(final jmb jmb, final Map map, final long c, final boolean d, final long b, final int e) {
        jvu.a(map);
        this.c = c;
        this.d = d;
        this.b = b;
        this.e = e;
        Collections.emptyList();
        TextUtils.isEmpty((CharSequence)null);
        final HashMap hashMap = new HashMap();
        for (final Map.Entry<Object, V> entry : map.entrySet()) {
            if (c(entry.getKey())) {
                final String a = a(jmb, entry.getKey());
                if (a == null) {
                    continue;
                }
                hashMap.put(a, b(jmb, entry.getValue()));
            }
        }
        for (final Map.Entry<Object, V> entry2 : map.entrySet()) {
            if (!c(entry2.getKey())) {
                final String a2 = a(jmb, entry2.getKey());
                if (a2 == null) {
                    continue;
                }
                hashMap.put(a2, b(jmb, entry2.getValue()));
            }
        }
        if (TextUtils.isEmpty((CharSequence)null)) {
            this.a = Collections.unmodifiableMap((Map<?, ?>)hashMap);
            return;
        }
        throw null;
    }
    
    private static String a(final jmb jmb, final Object o) {
        if (o == null) {
            return null;
        }
        String s2;
        final String s = s2 = o.toString();
        if (s.startsWith("&")) {
            s2 = s.substring(1);
        }
        final int length = s2.length();
        if (length > 256) {
            s2 = s2.substring(0, 256);
            jmb.v("Hit param name is too long and will be trimmed", length, s2);
        }
        if (TextUtils.isEmpty((CharSequence)s2)) {
            return null;
        }
        return s2;
    }
    
    private static String b(final jmb jmb, final Object o) {
        String string;
        if (o == null) {
            string = "";
        }
        else {
            string = o.toString();
        }
        final int length = string.length();
        String substring = string;
        if (length > 8192) {
            substring = string.substring(0, 8192);
            jmb.v("Hit param value is too long and will be trimmed", length, substring);
        }
        return substring;
    }
    
    private static boolean c(final Object o) {
        return o != null && o.toString().startsWith("&");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ht=");
        sb.append(this.c);
        if (this.b != 0L) {
            sb.append(", dbId=");
            sb.append(this.b);
        }
        if (this.e != 0) {
            sb.append(", appUID=");
            sb.append(this.e);
        }
        final ArrayList list = new ArrayList(this.a.keySet());
        Collections.sort((List<Comparable>)list);
        for (int size = list.size(), i = 0; i < size; ++i) {
            final String s = (String)list.get(i);
            sb.append(", ");
            sb.append(s);
            sb.append("=");
            sb.append((String)this.a.get(s));
        }
        return sb.toString();
    }
}
