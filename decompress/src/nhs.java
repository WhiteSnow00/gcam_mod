// 
// Decompiled by Procyon v0.6.0
// 

final class nhs implements odo
{
    final /* synthetic */ nhr a;
    final /* synthetic */ odo b;
    
    public nhs(final nhr a, final odo b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final oey a() {
        final nhr c = nhz.c(this.a);
        try {
            return this.b.a();
        }
        finally {
            nhz.c(c);
        }
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 14);
        sb.append("propagating=[");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
