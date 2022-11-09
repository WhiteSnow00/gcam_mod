import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gaa extends ljr
{
    public final Map a;
    
    public gaa(final lju lju) {
        super(lju);
        this.a = (Map)new ConcurrentHashMap();
    }
    
    public gaa(final lju lju, final oey oey) {
        this(lju);
        if (oey != null) {
            this.a.put(fzz.a, oey);
        }
    }
    
    public final oey k() {
        return (oey)this.l(fzz.a);
    }
    
    public final Object l(final fzy fzy) {
        if (this.a.containsKey(fzy)) {
            return this.a.get(fzy);
        }
        return null;
    }
    
    public final boolean m() {
        return this.a() != -1;
    }
}
