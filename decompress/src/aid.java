import java.math.BigInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aid implements Comparable
{
    public static final aid a;
    private static final aid e;
    public final int b;
    public final int c;
    public final int d;
    private final String f;
    private final pik g;
    
    static {
        new aid(0, 0, 0, "");
        new aid(0, 1, 0, "");
        a = (e = new aid(1, 0, 0, ""));
    }
    
    public aid(final int b, final int c, final int d, final String f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.g = pip.c(new aic(this));
    }
    
    private final BigInteger a() {
        final Object a = this.g.a();
        a.getClass();
        return (BigInteger)a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof aid)) {
            return false;
        }
        final int b = this.b;
        final aid aid = (aid)o;
        return b == aid.b && this.c == aid.c && this.d == aid.d;
    }
    
    @Override
    public final int hashCode() {
        return ((this.b + 527) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        String a;
        if (!plr.h(this.f)) {
            a = plr.a("-", this.f);
        }
        else {
            a = "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        sb.append('.');
        sb.append(this.d);
        sb.append(a);
        return sb.toString();
    }
}
