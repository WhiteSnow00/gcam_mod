// 
// Decompiled by Procyon v0.6.0
// 

public final class hwb
{
    public final String a;
    public final int b;
    public final long c;
    
    public hwb() {
    }
    
    public hwb(final String a, final int b, final long c) {
        if (a != null) {
            this.a = a;
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null name");
    }
    
    public static hwb a(final String s, final int n, final long n2) {
        return new hwb(s, n, n2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hwb) {
            final hwb hwb = (hwb)o;
            if (this.a.equals(hwb.a) && this.b == hwb.b && this.c == hwb.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b;
        final long c = this.c;
        return ((hashCode ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ (int)(c ^ c >>> 32);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final int b = this.b;
        final long c = this.c;
        final StringBuilder sb = new StringBuilder(a.length() + 80);
        sb.append("RecordedCheckpoint{name=");
        sb.append(a);
        sb.append(", ordinal=");
        sb.append(b);
        sb.append(", timingNanos=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
