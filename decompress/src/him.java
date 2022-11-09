import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class him implements Comparable, Parcelable
{
    private static final AtomicInteger b;
    public final int a;
    
    static {
        b = new AtomicInteger(0);
    }
    
    public him() {
    }
    
    public him(final int a) {
        this.a = a;
    }
    
    public static him a() {
        return new hil(him.b.getAndIncrement());
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof him && this.a == ((him)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        return String.format(Locale.ROOT, "ShotId-%d", this.a);
    }
}
