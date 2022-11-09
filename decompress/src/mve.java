// 
// Decompiled by Procyon v0.6.0
// 

public final class mve extends mzc
{
    public final nwc a;
    
    public mve(final nwc a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof mve && plr.b(this.a, ((mve)o).a));
    }
    
    @Override
    public final int hashCode() {
        final nwc a = this.a;
        if (a != null) {
            return a.hashCode();
        }
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("NonSignedInDataOwner(userHashCode=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
