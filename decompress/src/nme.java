import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nme extends nmf implements Serializable
{
    public static final nme a;
    private static final long serialVersionUID = 0L;
    
    static {
        a = new nme();
    }
    
    private Object readResolve() {
        return nme.a;
    }
    
    public final Integer c() {
        return Integer.MAX_VALUE;
    }
    
    public final Integer d() {
        return Integer.MIN_VALUE;
    }
    
    @Override
    public final String toString() {
        return "DiscreteDomain.integers()";
    }
}
