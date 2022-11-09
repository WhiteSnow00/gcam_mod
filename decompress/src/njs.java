import java.util.Arrays;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class njs implements Serializable, njp
{
    private static final long serialVersionUID = 0L;
    public final Object a;
    
    public njs(final Object a) {
        this.a = a;
    }
    
    @Override
    public final Object a() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof njs && nqb.E(this.a, ((njs)o).a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a });
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(value);
        sb.append(")");
        return sb.toString();
    }
}
