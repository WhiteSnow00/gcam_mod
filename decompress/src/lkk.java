import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lkk implements Comparable
{
    public static final AtomicInteger a;
    private final int b;
    
    static {
        a = new AtomicInteger(0);
    }
    
    public lkk() {
    }
    
    public lkk(final int b) {
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof lkk && this.b == ((lkk)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        return String.format(Locale.ROOT, "MediaGroup-%d", this.b);
    }
}
