// 
// Decompiled by Procyon v0.6.0
// 

public final class mur extends mzc
{
    private final okj a;
    
    public mur(final okj a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof mur && plr.b(this.a, ((mur)o).a));
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
        sb.append("AirlockFileExpiry(expiration=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
