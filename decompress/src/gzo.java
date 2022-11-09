import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public enum gzo
{
    a("OFF", 0, 0), 
    b("ON", 1, 1), 
    c("ON_AUTO_FLASH", 2, 2), 
    d("ON_ALWAYS_FLASH", 3, 3), 
    e("ON_AUTO_FLASH_REDEYE", 4, 4), 
    f("CONTROL_AE_MODE_ON_EXTERNAL_FLASH", 5, 5);
    
    public static final Map g;
    private final int i;
    
    static {
        int i = 0;
        g = new HashMap();
        for (gzo[] values = values(); i < values.length; ++i) {
            final gzo gzo = values[i];
            gzo.g.put(gzo.i, gzo);
        }
    }
    
    private gzo(final String s, final int n, final int i) {
        this.i = i;
    }
}
