// 
// Decompiled by Procyon v0.6.0
// 

public class lsb
{
    private static final Runtime a;
    public final long n;
    public final long o;
    public final long p;
    
    static {
        a = Runtime.getRuntime();
    }
    
    public lsb(final long n, final long o, final long p3) {
        this.n = n;
        this.o = o;
        this.p = p3;
    }
    
    public static lsb c() {
        final Runtime a = lsb.a;
        final long totalMemory = a.totalMemory();
        return new lsb(totalMemory - a.freeMemory(), totalMemory, a.maxMemory());
    }
    
    @Override
    public String toString() {
        final long n = this.n;
        final long o = this.o;
        final long p = this.p;
        final StringBuilder sb = new StringBuilder(123);
        sb.append("dalvikHeapAllocatedB: ");
        sb.append(n);
        sb.append(", dalvikHeapSizeB: ");
        sb.append(o);
        sb.append(", dalvikMaxHeapSizeB: ");
        sb.append(p);
        return sb.toString();
    }
}
