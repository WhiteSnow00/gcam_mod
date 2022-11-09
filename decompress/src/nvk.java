import java.util.List;
import java.util.Collections;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nvk
{
    public static final Comparator a;
    public static final nvk b;
    public final nvi c;
    
    static {
        a = new nvf(1);
        b = new nvk(new nvi(Collections.emptyList()));
    }
    
    private nvk(final nvi c) {
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof nvk && ((nvk)o).c.equals(this.c);
    }
    
    @Override
    public final int hashCode() {
        return ~this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.c.toString();
    }
}
