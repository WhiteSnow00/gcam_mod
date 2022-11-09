import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aun
{
    public final Map a;
    
    public aun(final aul aul) {
        this.a = Collections.unmodifiableMap((Map<?, ?>)new HashMap<Object, Object>(aul.a));
    }
    
    public final boolean a(final Class clazz) {
        return this.a.containsKey(clazz);
    }
}
