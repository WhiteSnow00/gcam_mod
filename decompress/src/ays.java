import java.security.MessageDigest;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ays implements awc
{
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final awc g;
    private final Map h;
    private final awg i;
    private int j;
    
    public ays(final Object b, final awc g, final int c, final int d, final Map h, final Class e, final Class f, final awg i) {
        bit.a(b);
        this.b = b;
        bit.e(g, "Signature must not be null");
        this.g = g;
        this.c = c;
        this.d = d;
        bit.a(h);
        this.h = h;
        bit.e(e, "Resource class must not be null");
        this.e = e;
        this.f = f;
        bit.a(i);
        this.i = i;
    }
    
    @Override
    public final void a(final MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof ays) {
            final ays ays = (ays)o;
            if (this.b.equals(ays.b) && this.g.equals(ays.g) && this.d == ays.d && this.c == ays.c && this.h.equals(ays.h) && this.e.equals(ays.e) && this.f.equals(ays.f) && this.i.equals(ays.i)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        int j;
        if ((j = this.j) == 0) {
            final int hashCode = this.b.hashCode();
            this.j = hashCode;
            final int i = ((hashCode * 31 + this.g.hashCode()) * 31 + this.c) * 31 + this.d;
            this.j = i;
            final int k = i * 31 + this.h.hashCode();
            this.j = k;
            final int l = k * 31 + this.e.hashCode();
            this.j = l;
            final int m = l * 31 + this.f.hashCode();
            this.j = m;
            j = m * 31 + this.i.hashCode();
            this.j = j;
        }
        return j;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final int c = this.c;
        final int d = this.d;
        final String value2 = String.valueOf(this.e);
        final String value3 = String.valueOf(this.f);
        final String value4 = String.valueOf(this.g);
        final int j = this.j;
        final String value5 = String.valueOf(this.h);
        final String value6 = String.valueOf(this.i);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 151 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length() + String.valueOf(value6).length());
        sb.append("EngineKey{model=");
        sb.append(value);
        sb.append(", width=");
        sb.append(c);
        sb.append(", height=");
        sb.append(d);
        sb.append(", resourceClass=");
        sb.append(value2);
        sb.append(", transcodeClass=");
        sb.append(value3);
        sb.append(", signature=");
        sb.append(value4);
        sb.append(", hashCode=");
        sb.append(j);
        sb.append(", transformations=");
        sb.append(value5);
        sb.append(", options=");
        sb.append(value6);
        sb.append('}');
        return sb.toString();
    }
}
