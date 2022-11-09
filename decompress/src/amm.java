// 
// Decompiled by Procyon v0.6.0
// 

public final class amm
{
    public final String a;
    public final int b;
    
    public amm(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof amm)) {
            return false;
        }
        final amm amm = (amm)o;
        return this.b == amm.b && this.a.equals(amm.a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }
}
