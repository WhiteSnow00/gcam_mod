import java.util.Iterator;
import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class cul implements cvq
{
    final /* synthetic */ Executor a;
    final /* synthetic */ Set b;
    
    public cul(final Executor a, final Set b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void aZ(final long n, final Map map) {
        this.a.execute(new cuk(this.b, n, map));
    }
    
    @Override
    public final Map ba() {
        final ArrayMap arrayMap = new ArrayMap();
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            for (final Map.Entry<String, V> entry : ((cvq)iterator.next()).ba().entrySet()) {
                final String s = entry.getKey();
                final Float n = (Float)entry.getValue();
                if (!((Map)arrayMap).containsKey(s) || ((Float)((Map)arrayMap).get(s)).compareTo(n) > 0) {
                    ((Map)arrayMap).put(s, n);
                }
            }
        }
        return (Map)arrayMap;
    }
}
