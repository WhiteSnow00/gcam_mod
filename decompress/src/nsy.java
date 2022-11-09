// 
// Decompiled by Procyon v0.6.0
// 

final class nsy implements nsn
{
    private final nsn a;
    private final Object b;
    
    public nsy(final nsn a, final Object b) {
        oce.g(a, "log site key");
        this.a = a;
        oce.g(b, "log site qualifier");
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof nsy)) {
            return false;
        }
        final nsy nsy = (nsy)o;
        return this.a.equals(nsy.a) && this.b.equals(nsy.b);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 50 + String.valueOf(value2).length());
        sb.append("SpecializedLogSiteKey{ delegate='");
        sb.append(value);
        sb.append("', qualifier='");
        sb.append(value2);
        sb.append("' }");
        return sb.toString();
    }
}
