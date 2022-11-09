import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwb implements jqn
{
    public static final jwb a;
    private final String b;
    
    static {
        a = new jwb();
    }
    
    public jwb() {
        this.b = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof jwb)) {
            return false;
        }
        final String b = ((jwb)o).b;
        return jvu.m(null, null);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { null });
    }
}
