import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gjm
{
    public final gjo a;
    public final int b;
    public final int c;
    public final nns d;
    
    public gjm() {
    }
    
    public gjm(final gjo a, final int b, final int c, final nns d) {
        if (a == null) {
            throw new NullPointerException("Null category");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null optionSpecs");
    }
    
    public static gjm a(final gjo gjo, final int n, final int n2, final nns nns) {
        return new gjm(gjo, n, n2, nns);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof gjm) {
            final gjm gjm = (gjm)o;
            if (this.a.equals(gjm.a) && this.b == gjm.b && this.c == gjm.c && nqb.t(this.d, gjm.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int b = this.b;
        final int c = this.c;
        final String value2 = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 104 + String.valueOf(value2).length());
        sb.append("ImmutableCategorySpec{category=");
        sb.append(value);
        sb.append(", contentLabel=");
        sb.append(b);
        sb.append(", contentDescription=");
        sb.append(c);
        sb.append(", optionSpecs=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
