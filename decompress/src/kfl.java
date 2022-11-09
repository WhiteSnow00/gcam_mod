import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfl implements jqn
{
    public static final kfl a;
    
    static {
        a = new kfl();
    }
    
    private kfl() {
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof kfl;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.getClass() });
    }
}
