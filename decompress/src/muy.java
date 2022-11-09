// 
// Decompiled by Procyon v0.6.0
// 

public final class muy extends mzc
{
    private final okj a;
    
    public muy(final okj a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof muy && plr.b(this.a, ((muy)o).a));
    }
    
    @Override
    public final int hashCode() {
        final okj a = this.a;
        final int ay = a.ay;
        if (ay != 0) {
            return ay;
        }
        return a.ay = omr.a.b(a).b(a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("F250Expiry(expiration=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
