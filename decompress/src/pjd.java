// 
// Decompiled by Procyon v0.6.0
// 

public final class pjd
{
    public final int a;
    public final Object b;
    
    public pjd(final int a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof pjd) {
                final pjd pjd = (pjd)o;
                if (this.a == pjd.a && plr.b(this.b, pjd.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final Object b = this.b;
        int hashCode;
        if (b != null) {
            hashCode = b.hashCode();
        }
        else {
            hashCode = 0;
        }
        return a * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("IndexedValue(index=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
