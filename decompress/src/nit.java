import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nit implements Serializable, nir
{
    private static final long serialVersionUID = 0L;
    private final nir a;
    private final nir b;
    
    public nit(final nir a, final nir b) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    @Override
    public final Object a(final Object o) {
        return this.a.a(this.b.a(o));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof nit) {
            final nit nit = (nit)o;
            if (this.b.equals(nit.b) && this.a.equals(nit.a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 2 + String.valueOf(value2).length());
        sb.append(value);
        sb.append("(");
        sb.append(value2);
        sb.append(")");
        return sb.toString();
    }
}
