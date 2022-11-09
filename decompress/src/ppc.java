// 
// Decompiled by Procyon v0.6.0
// 

public final class ppc
{
    public static final pqe a;
    public static final pqe b;
    public static final pqe c;
    public static final pqe d;
    public static final pqe e;
    public static final pok f;
    
    static {
        a = new pqe("COMPLETING_ALREADY");
        b = new pqe("COMPLETING_WAITING_CHILDREN");
        c = new pqe("COMPLETING_RETRY");
        d = new pqe("TOO_LATE_TO_CANCEL");
        e = new pqe("SEALED");
        new pok(false);
        f = new pok(true);
    }
    
    public static final Object a(final Object o) {
        if (o instanceof por) {
            return new pos((por)o);
        }
        return o;
    }
    
    public static final Object b(final Object o) {
        Object o2;
        if (!(o instanceof pos)) {
            o2 = null;
        }
        else {
            o2 = o;
        }
        final pos pos = (pos)o2;
        if (pos != null) {
            final por a = pos.a;
            if (a != null) {
                return a;
            }
        }
        return o;
    }
}
