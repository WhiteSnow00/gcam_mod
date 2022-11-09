import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adb
{
    public static final adb a;
    public final Set b;
    public final ada c;
    public final Map d;
    
    static {
        a = new adb(new HashSet(), new HashMap());
    }
    
    private adb(final Set set, final Map map) {
        this.b = new HashSet(set);
        this.c = null;
        final HashMap d = new HashMap();
        for (final Map.Entry<Class, V> entry : map.entrySet()) {
            d.put(entry.getKey(), new HashSet((Collection<?>)entry.getValue()));
        }
        this.d = d;
    }
}
