import java.util.Iterator;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.HashMap;
import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.util.WeakHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jsd
{
    public final Map a;
    public final Map b;
    
    public jsd() {
        this.a = DesugarCollections.synchronizedMap((Map)new WeakHashMap());
        this.b = DesugarCollections.synchronizedMap((Map)new WeakHashMap());
    }
    
    public final void a(final boolean b, final Status status) {
        Object o = this.a;
        monitorenter(o);
        try {
            final HashMap hashMap = new HashMap(this.a);
            monitorexit(o);
            Object o2 = this.b;
            synchronized (o2) {
                o = new HashMap<Object, Object>(this.b);
                monitorexit(o2);
                o2 = hashMap.entrySet().iterator();
                while (((Iterator)o2).hasNext()) {
                    final Map.Entry<K, Boolean> entry = (Map.Entry<K, Boolean>)((Iterator)o2).next();
                    if (b || entry.getValue()) {
                        ((BasePendingResult)entry.getKey()).h(status);
                    }
                }
                o = ((Map<Object, Object>)o).entrySet().iterator();
                while (((Iterator)o).hasNext()) {
                    final Map.Entry<K, Boolean> entry2 = (Map.Entry<K, Boolean>)((Iterator)o).next();
                    if (b || entry2.getValue()) {
                        ((kej)entry2.getKey()).c(new jqq(status));
                    }
                }
            }
        }
        finally {
            monitorexit(o);
            while (true) {}
        }
    }
}
