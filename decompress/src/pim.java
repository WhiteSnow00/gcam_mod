import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pim implements Serializable
{
    public final Object a;
    public final Object b;
    
    public pim(final Object a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof pim) {
                final pim pim = (pim)o;
                if (plr.b(this.a, pim.a) && plr.b(this.b, pim.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Object b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
