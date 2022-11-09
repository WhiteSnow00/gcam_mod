import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nis implements Serializable, nir
{
    private static final long serialVersionUID = 0L;
    private final Object a;
    
    public nis() {
        this.a = null;
    }
    
    @Override
    public final Object a(final Object o) {
        return null;
    }
    
    @Override
    public final boolean equals(Object a) {
        if (a instanceof nis) {
            a = ((nis)a).a;
            return nqb.E(null, null);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf((Object)null);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 20);
        sb.append("Functions.constant(");
        sb.append(value);
        sb.append(")");
        return sb.toString();
    }
}
