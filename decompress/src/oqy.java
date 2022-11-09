import java.io.IOException;
import java.util.Comparator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oqy
{
    private final Map a;
    
    public oqy() {
        this.a = new HashMap();
    }
    
    public final String a(String s) {
        if (!this.a.containsKey(s.toLowerCase(Locale.US))) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        final Iterator iterator = this.a.get(s.toLowerCase(Locale.US)).iterator();
        int n = 1;
        while (iterator.hasNext()) {
            s = (String)iterator.next();
            if (s != null) {
                if (n == 0) {
                    sb.append(",");
                }
                sb.append(s);
                n = 0;
            }
        }
        return sb.toString();
    }
    
    public final List b(final String s) {
        List l;
        if ((l = this.a.get(s.toLowerCase(Locale.US))) == null) {
            l = nns.l();
        }
        return l;
    }
    
    public final Set c() {
        return Collections.unmodifiableSet(this.a.keySet());
    }
    
    public final void d(String lowerCase, final String s) {
        njo.d(lowerCase.isEmpty() ^ true);
        s.getClass();
        lowerCase = lowerCase.toLowerCase(Locale.US);
        if (!this.a.containsKey(lowerCase)) {
            this.a.put(lowerCase, new ArrayList());
        }
        this.a.get(lowerCase).add(s);
    }
    
    public final void e(String lowerCase, final String s) {
        boolean b = false;
        if (lowerCase != null && !lowerCase.isEmpty()) {
            b = true;
        }
        njo.d(b);
        s.getClass();
        lowerCase = lowerCase.toLowerCase(Locale.US);
        this.a.put(lowerCase, new ArrayList());
        this.a.get(lowerCase).add(s);
    }
    
    public final boolean f(final String s) {
        return this.a.containsKey(s.toLowerCase(Locale.US));
    }
    
    @Override
    public final String toString() {
        final ArrayList list = new ArrayList(this.a.entrySet());
        Collections.sort((List<Object>)list, nvf.a);
        final StringBuilder sb = new StringBuilder("{");
        final Iterator iterator = list.iterator();
        try {
            if (iterator.hasNext()) {
                final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator.next();
                sb.append(nfa.f(entry.getKey()));
                sb.append("=");
                sb.append(nfa.f(entry.getValue()));
                while (iterator.hasNext()) {
                    sb.append(", ");
                    final Map.Entry<Object, V> entry2 = (Map.Entry<Object, V>)iterator.next();
                    sb.append(nfa.f(entry2.getKey()));
                    sb.append("=");
                    sb.append(nfa.f(entry2.getValue()));
                }
            }
            sb.append('}');
            return sb.toString();
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
}
