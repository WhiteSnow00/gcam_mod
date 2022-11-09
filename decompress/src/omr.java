import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class omr
{
    public static final omr a;
    private final ConcurrentMap b;
    private final omb c;
    
    static {
        a = new omr();
    }
    
    private omr() {
        this.b = (ConcurrentMap)new ConcurrentHashMap();
        this.c = new omb();
    }
    
    public final omy a(final Class clazz) {
        olk.i(clazz, "messageType");
        omy omy = (omy)this.b.get(clazz);
        if (omy == null) {
            final omb c = this.c;
            omz.p(clazz);
            final omg a = c.a.a(clazz);
            if (a.b()) {
                if (oky.class.isAssignableFrom(clazz)) {
                    omy = omm.c(omz.c, oko.a, a.a());
                }
                else {
                    omy = omm.c(omz.a, oko.a(), a.a());
                }
            }
            else if (oky.class.isAssignableFrom(clazz)) {
                if (omb.a(a)) {
                    omy = oml.m(a, omo.b, olx.b, omz.c, oko.a, omf.b);
                }
                else {
                    omy = oml.m(a, omo.b, olx.b, omz.c, null, omf.b);
                }
            }
            else if (omb.a(a)) {
                omy = oml.m(a, omo.a, olx.a, omz.a, oko.a(), omf.a);
            }
            else {
                omy = oml.m(a, omo.a, olx.a, omz.b, null, omf.a);
            }
            olk.i(clazz, "messageType");
            olk.i(omy, "schema");
            final omy omy2 = this.b.putIfAbsent(clazz, omy);
            if (omy2 != null) {
                return omy2;
            }
        }
        return omy;
    }
    
    public final omy b(final Object o) {
        return this.a(o.getClass());
    }
}
