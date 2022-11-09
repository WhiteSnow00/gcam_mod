import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class pll implements Serializable
{
    public static final pll a;
    
    static {
        a = new pll();
    }
    
    private pll() {
    }
    
    private Object readResolve() {
        return pll.a;
    }
}
