// 
// Decompiled by Procyon v0.6.0
// 

public final class grm
{
    public final boolean a;
    public final boolean b;
    
    public grm() {
    }
    
    public grm(final boolean a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof grm) {
            final grm grm = (grm)o;
            if (this.a == grm.a && this.b == grm.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final boolean a = this.a;
        int n = 1237;
        int n2;
        if (!a) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.b) {
            n = 1231;
        }
        return (n2 ^ 0xF4243) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder(55);
        sb.append("DualEvTrigger{hdrNetEnabled=");
        sb.append(a);
        sb.append(", modeSupported=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
