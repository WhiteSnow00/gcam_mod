import java.util.Arrays;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nlg extends nqd implements Serializable
{
    private static final long serialVersionUID = 0L;
    final nir a;
    final nqd b;
    
    public nlg(final nir a, final nqd b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        return this.b.compare(this.a.a(o), this.a.a(o2));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof nlg) {
            final nlg nlg = (nlg)o;
            if (this.a.equals(nlg.a) && this.b.equals(nlg.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 13 + String.valueOf(value2).length());
        sb.append(value);
        sb.append(".onResultOf(");
        sb.append(value2);
        sb.append(")");
        return sb.toString();
    }
}
