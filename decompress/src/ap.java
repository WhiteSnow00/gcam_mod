import android.util.Log;
import java.util.TreeMap;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ap
{
    public final HashMap a;
    
    public ap() {
        this.a = new HashMap();
    }
    
    public final void a(final be... array) {
        for (int i = 0; i <= 0; ++i) {
            final be be = array[i];
            final int a = be.a;
            final int b = be.b;
            final HashMap a2 = this.a;
            final Integer value = a;
            TreeMap<?, ?> treeMap = a2.get(value);
            if (treeMap == null) {
                treeMap = new TreeMap<Object, Object>();
                this.a.put(value, treeMap);
            }
            final Integer value2 = b;
            final be be2 = (be)treeMap.get(value2);
            if (be2 != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Overriding migration ");
                sb.append(be2);
                sb.append(" with ");
                sb.append(be);
                Log.w("ROOM", sb.toString());
            }
            treeMap.put(value2, be);
        }
    }
}
