import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class byq
{
    public final String a;
    public final nns b;
    public final bya c;
    
    public byq() {
    }
    
    public byq(final String a, final nns b, final bya c) {
        this.a = a;
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null converter");
    }
    
    public static byq a(final String s, final nns nns, final bya bya) {
        return new byq(s, nns, bya);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof byq) {
            final byq byq = (byq)o;
            if (this.a.equals(byq.a) && nqb.t(this.b, byq.b) && this.c.equals(byq.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(a.length() + 57 + String.valueOf(value).length() + String.valueOf(value2).length());
        sb.append("ExampleStoreTable{tableName=");
        sb.append(a);
        sb.append(", customColumns=");
        sb.append(value);
        sb.append(", converter=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
