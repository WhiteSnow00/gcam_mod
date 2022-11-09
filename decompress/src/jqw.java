import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public class jqw
{
    private static final Set a;
    
    static {
        a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
    }
    
    public static Set a() {
        final Set a = jqw.a;
        synchronized (a) {
            return a;
        }
    }
    
    public void b(final jrs jrs) {
        throw null;
    }
    
    public void c(final jrs jrs) {
        throw null;
    }
}
