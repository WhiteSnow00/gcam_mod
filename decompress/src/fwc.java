// 
// Decompiled by Procyon v0.6.0
// 

public final class fwc
{
    private final fvy a;
    private final fvy b;
    
    public fwc() {
    }
    
    public fwc(final fvy a, final fvy b) {
        if (a == null) {
            throw new NullPointerException("Null prevState");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null curState");
    }
    
    public static fwc a(final fvy fvy, final fvy fvy2) {
        return new fwc(fvy, fvy2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fwc) {
            final fwc fwc = (fwc)o;
            if (this.a.equals(fwc.a) && this.b.equals(fwc.b)) {
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
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 40 + String.valueOf(value2).length());
        sb.append("AeStateTransition{prevState=");
        sb.append(value);
        sb.append(", curState=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
