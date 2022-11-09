import java.util.EnumMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbr implements kow
{
    final Map a;
    public final Object b;
    
    public cbr() {
        this.a = new EnumMap(kov.class);
        this.b = new Object();
    }
    
    @Override
    public final void aU(final kov kov) {
        synchronized (this.b) {
            Integer value;
            if ((value = this.a.get(kov)) == null) {
                value = 0;
            }
            this.a.put(kov, value + 1);
        }
    }
}
