import java.util.Map;
import java.util.Collection;
import java.util.Collections;
import java.util.NavigableMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqx extends kqy
{
    public kqx(final NavigableMap navigableMap) {
        super(navigableMap);
    }
    
    private final Object a() {
        if (this.size() > 9000) {
            return super.remove(Collections.min((Collection<? extends Comparable<?>>)super.navigableKeySet()));
        }
        return null;
    }
    
    @Override
    public final Object put(Object put, final Object o) {
        put = super.put(put, o);
        if (put != null) {
            return put;
        }
        return this.a();
    }
    
    @Override
    public final void putAll(final Map map) {
        super.putAll(map);
        while (this.a() != null) {}
    }
}
