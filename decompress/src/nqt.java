import java.util.Iterator;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class nqt extends nqd implements Serializable
{
    static final nqt a;
    private static final long serialVersionUID = 0L;
    
    static {
        a = new nqt();
    }
    
    private nqt() {
    }
    
    private Object readResolve() {
        return nqt.a;
    }
    
    @Override
    public final nqd a() {
        return nqc.a;
    }
    
    @Override
    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
