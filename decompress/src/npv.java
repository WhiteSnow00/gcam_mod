// 
// Decompiled by Procyon v0.6.0
// 

abstract class npv implements nps
{
    public npv() {
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof nps) {
            final nps nps = (nps)o;
            if (this.a() == nps.a() && nqb.E(this.b(), nps.b())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Object b = this.b();
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        return hashCode ^ this.a();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b());
        final int a = this.a();
        if (a == 1) {
            return value;
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 14);
        sb.append(value);
        sb.append(" x ");
        sb.append(a);
        return sb.toString();
    }
}
