import java.util.TreeMap;
import java.util.NavigableMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdi
{
    public final NavigableMap a;
    
    public hdi() {
        final TreeMap treeMap = new TreeMap();
        njo.d(treeMap.size() <= 9000);
        this.a = nrr.d(new kqx(treeMap), null);
    }
}
