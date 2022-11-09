// 
// Decompiled by Procyon v0.6.0
// 

final class nht implements odp
{
    final /* synthetic */ nhr a;
    final /* synthetic */ odp b;
    
    public nht(final nhr a, final odp b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final oey a(final Object o) {
        final nhr c = nhz.c(this.a);
        try {
            return this.b.a(o);
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
