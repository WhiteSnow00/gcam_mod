import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nqc extends nqd implements Serializable
{
    public static final nqc a;
    private static final long serialVersionUID = 0L;
    
    static {
        a = new nqc();
    }
    
    private nqc() {
    }
    
    private Object readResolve() {
        return nqc.a;
    }
    
    @Override
    public final nqd a() {
        return nqt.a;
    }
    
    @Override
    public final String toString() {
        return "Ordering.natural()";
    }
}
