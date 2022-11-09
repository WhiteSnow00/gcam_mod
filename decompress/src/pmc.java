// 
// Decompiled by Procyon v0.6.0
// 

public final class pmc extends pmb
{
    public static final pmc d;
    
    static {
        d = new pmc(1, 0);
    }
    
    public pmc(final int n, final int n2) {
        super(n, n2, 1);
    }
    
    @Override
    public final boolean b() {
        return super.a > super.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof pmc;
        boolean b2 = true;
        if (b) {
            if (this.b() && ((pmc)o).b()) {
                return b2;
            }
            final int a = super.a;
            final pmc pmc = (pmc)o;
            if (a == pmc.a) {
                if (super.b == pmc.b) {
                    return true;
                }
            }
        }
        b2 = false;
        return b2;
    }
    
    @Override
    public final int hashCode() {
        if (this.b()) {
            return -1;
        }
        return super.a * 31 + super.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.a);
        sb.append("..");
        sb.append(super.b);
        return sb.toString();
    }
}
