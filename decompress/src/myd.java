import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myd
{
    public final myc a;
    public final List b;
    
    public myd() {
        this(new myc(null), pja.a);
    }
    
    public myd(final myc a, final List b) {
        a.getClass();
        b.getClass();
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof myd) {
                final myd myd = (myd)o;
                if (plr.b(this.a, myd.a) && plr.b(this.b, myd.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final myc a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final List b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ResourceWithAnnotachments(resource=");
        sb.append(this.a);
        sb.append(", annotachments=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
