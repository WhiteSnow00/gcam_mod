// 
// Decompiled by Procyon v0.6.0
// 

final class azp implements azu
{
    int a;
    public Class b;
    private final azq c;
    
    public azp(final azq c) {
        this.c = c;
    }
    
    @Override
    public final void a() {
        this.c.c(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof azp) {
            final azp azp = (azp)o;
            if (this.a == azp.a && this.b == azp.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final Class b = this.b;
        int hashCode;
        if (b != null) {
            hashCode = b.hashCode();
        }
        else {
            hashCode = 0;
        }
        return a * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 27);
        sb.append("Key{size=");
        sb.append(a);
        sb.append("array=");
        sb.append(value);
        sb.append('}');
        return sb.toString();
    }
}
