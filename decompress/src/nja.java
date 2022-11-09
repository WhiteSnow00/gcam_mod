import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nja implements Serializable
{
    private static final long serialVersionUID = 747826592375603043L;
    public final Object a;
    public final Object b;
    
    protected nja(final Object a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    public static nja a(final Object o, final Object o2) {
        return new nja(o, o2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof nja) {
            final nja nja = (nja)o;
            if (nqb.E(this.a, nja.a) && nqb.E(this.b, nja.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Object b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 4 + String.valueOf(value2).length());
        sb.append("(");
        sb.append(value);
        sb.append(", ");
        sb.append(value2);
        sb.append(")");
        return sb.toString();
    }
}
