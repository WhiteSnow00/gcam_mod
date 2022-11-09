// 
// Decompiled by Procyon v0.6.0
// 

public final class ppv
{
    public static final Object a;
    
    static {
        a = new pqe("CONDITION_FALSE");
        new pqe("LIST_EMPTY");
    }
    
    public static final ppw a(final Object o) {
        o.getClass();
        Object o2;
        if (!(o instanceof pqb)) {
            o2 = null;
        }
        else {
            o2 = o;
        }
        final pqb pqb = (pqb)o2;
        if (pqb != null) {
            return pqb.a;
        }
        return (ppw)o;
    }
}
