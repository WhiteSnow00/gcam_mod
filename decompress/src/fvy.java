// 
// Decompiled by Procyon v0.6.0
// 

public final class fvy
{
    private final gzo a;
    private final gzp b;
    
    public fvy() {
    }
    
    public fvy(final gzo a, final gzp b) {
        this.a = a;
        this.b = b;
    }
    
    public static fvx a() {
        return new fvx();
    }
    
    public static fvy b() {
        final fvx a = a();
        a.b(gzo.a);
        a.c(gzp.a);
        return a.a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof fvy) {
            final fvy fvy = (fvy)o;
            if (this.a.equals(fvy.a) && this.b.equals(fvy.b)) {
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
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 26 + String.valueOf(value2).length());
        sb.append("AeState{aeMode=");
        sb.append(value);
        sb.append(", aeState=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
