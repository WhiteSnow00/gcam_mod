// 
// Decompiled by Procyon v0.6.0
// 

public final class amy
{
    public String a;
    public int b;
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof amy)) {
            return false;
        }
        final amy amy = (amy)o;
        return this.b == amy.b && this.a.equals(amy.a);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b;
        cwz.g(b);
        return hashCode * 31 + b;
    }
}
