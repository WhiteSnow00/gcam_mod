// 
// Decompiled by Procyon v0.6.0
// 

public final class kud
{
    public final boolean a;
    
    public kud() {
    }
    
    public kud(final boolean a) {
        this.a = a;
    }
    
    public static kud a(final boolean b) {
        return new kud(b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof kud && this.a == ((kud)o).a);
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (!this.a) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (n ^ 0xF4243) * 1000003 ^ 0x3E8;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final StringBuilder sb = new StringBuilder(76);
        sb.append("Config{closeImmediately=");
        sb.append(a);
        sb.append(", foregroundTimeoutMillis=1000}");
        return sb.toString();
    }
}
