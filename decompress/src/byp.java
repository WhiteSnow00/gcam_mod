// 
// Decompiled by Procyon v0.6.0
// 

public final class byp
{
    public final String a;
    public final String b;
    
    public byp() {
    }
    
    public byp(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public static byp a(final String s, final String s2) {
        return new byp(s, s2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof byp) {
            final byp byp = (byp)o;
            if (this.a.equals(byp.a) && this.b.equals(byp.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder(a.length() + 44 + b.length());
        sb.append("ExampleStoreColumn{columnName=");
        sb.append(a);
        sb.append(", columnType=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
