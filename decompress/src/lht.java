import j$.util.Objects;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lht
{
    private static final Pattern c;
    public final String a;
    public final Class b;
    
    static {
        c = Pattern.compile("^[A-Za-z_][A-Za-z0-9_]*$");
    }
    
    public lht(final String a, final Class b) {
        njo.d(lht.c.matcher(a).matches());
        this.a = a;
        this.b = b;
    }
    
    public static lht a(final String s) {
        return new lht(s, Integer.class);
    }
    
    public static lht b(final String s) {
        return new lht(s, String.class);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof lht) {
            final lht lht = (lht)o;
            if (this.b == lht.b && this.a.equals(lht.a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b });
    }
    
    @Override
    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
