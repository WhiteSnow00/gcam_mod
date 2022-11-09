import java.util.Stack;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lsa
{
    private static final Runtime d;
    public final long a;
    public final Stack b;
    public long c;
    
    static {
        d = Runtime.getRuntime();
    }
    
    public lsa() {
        this.a = Runtime.getRuntime().maxMemory();
        this.b = new Stack();
    }
    
    public static float a() {
        final Runtime d = lsa.d;
        return (d.totalMemory() - d.freeMemory()) / (float)d.maxMemory();
    }
}
