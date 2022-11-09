import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsg implements gsh
{
    public final krc a;
    public kzl b;
    private final Set c;
    
    public gsg(final Map map, final klj klj) {
        final HashSet c = new HashSet();
        this.c = c;
        final HashMap hashMap = new HashMap();
        for (final kzl kzl : map.values()) {
            final lfj i = grd.i(kzl);
            i.getClass();
            hashMap.put(i.a, kzl);
            c.add(kzl.a());
        }
        this.a = klj.a(new gsf(this, hashMap), odx.a);
        final kzl b = map.get(gti.c);
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final klj b() {
        return klq.f(this.c);
    }
    
    public final kzl c() {
        synchronized (this) {
            return this.b;
        }
    }
}
