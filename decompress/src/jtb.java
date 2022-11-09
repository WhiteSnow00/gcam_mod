// 
// Decompiled by Procyon v0.6.0
// 

public final class jtb
{
    private final Object a;
    private final String b;
    
    public jtb(final Object a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jtb)) {
            return false;
        }
        final jtb jtb = (jtb)o;
        return this.a == jtb.a && this.b.equals(jtb.b);
    }
    
    @Override
    public final int hashCode() {
        return System.identityHashCode(this.a) * 31 + this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String b = this.b;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 16 + String.valueOf(b).length());
        sb.append("ListenerKey {");
        sb.append(value);
        sb.append(", ");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
