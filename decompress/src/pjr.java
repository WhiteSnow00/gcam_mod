import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pjr implements Serializable, pjq
{
    public static final pjr a;
    private static final long serialVersionUID = 0L;
    
    static {
        a = new pjr();
    }
    
    private pjr() {
    }
    
    private final Object readResolve() {
        return pjr.a;
    }
    
    @Override
    public final Object a(final Object o, final plc plc) {
        return o;
    }
    
    @Override
    public final pjn b(final pjo pjo) {
        return null;
    }
    
    @Override
    public final pjq cg(final pjo pjo) {
        return this;
    }
    
    @Override
    public final pjq ch(final pjq pjq) {
        pjq.getClass();
        return pjq;
    }
    
    @Override
    public final int hashCode() {
        return 0;
    }
    
    @Override
    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
