// 
// Decompiled by Procyon v0.6.0
// 

public final class mvh extends mzc
{
    public final String a;
    
    public mvh(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof mvh && plr.b(this.a, ((mvh)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("OverriddenObfuscatedGaiaId(obfuscatedGaiaId=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
