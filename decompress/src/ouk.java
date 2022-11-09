import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class ouk implements oun
{
    public final Map a;
    
    public ouk(final Map map) {
        this.a = Collections.unmodifiableMap((Map<?, ?>)map);
    }
}
