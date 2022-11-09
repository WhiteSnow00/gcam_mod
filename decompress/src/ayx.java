import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ayx
{
    private final Map a;
    private final Map b;
    
    public ayx() {
        this.a = new HashMap();
        this.b = new HashMap();
    }
    
    public final Map a(final boolean b) {
        Map map;
        if (b) {
            map = this.b;
        }
        else {
            map = this.a;
        }
        return map;
    }
    
    final void b(final awc awc, final ayr ayr) {
        final Map a = this.a(ayr.e);
        if (ayr.equals(a.get(awc))) {
            a.remove(awc);
        }
    }
}
