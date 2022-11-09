// 
// Decompiled by Procyon v0.6.0
// 

public final class amj
{
    public final String a;
    public final Long b;
    
    public amj(final String a, final long n) {
        this.a = a;
        this.b = n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof amj)) {
            return false;
        }
        final amj amj = (amj)o;
        return this.a.equals(amj.a) && this.b.equals(amj.b);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
}
