import java.util.List;
import java.util.Iterator;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfa
{
    public final fxu a;
    public final Map b;
    
    public cfa(final fxu a, final Map b) {
        this.a = a;
        this.b = b;
        final Iterator iterator = b.keySet().iterator();
        while (iterator.hasNext()) {
            b.get(iterator.next());
        }
    }
    
    public final boolean a(final kmt kmt, final kmv kmv) {
        final List list = this.b.get(kmt);
        list.getClass();
        return list.contains(kmv);
    }
}
