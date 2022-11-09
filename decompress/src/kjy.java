// 
// Decompiled by Procyon v0.6.0
// 

public final class kjy
{
    private static final kjw e;
    public final int a;
    public final String b;
    public final int c;
    public final boolean d;
    private final kjw f;
    
    static {
        e = kjw.a;
    }
    
    public kjy() {
    }
    
    public kjy(final int a, final String b, final int c, final boolean d, final kjw f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
    }
    
    public static kjx a() {
        final kjx kjx = new kjx();
        kjx.c = kjy.e;
        kjx.b(0);
        kjx.b = true;
        return kjx;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof kjy) {
            final kjy kjy = (kjy)o;
            if (this.a == kjy.a && this.b.equals(kjy.b) && this.c == kjy.c && this.d == kjy.d && this.f.equals(kjy.f)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int hashCode = this.b.hashCode();
        final int c = this.c;
        int n;
        if (!this.d) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return ((((a ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ c) * 1000003 ^ n) * 1000003 ^ this.f.hashCode();
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String b = this.b;
        final int c = this.c;
        final boolean d = this.d;
        final String value = String.valueOf(this.f);
        final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 132 + String.valueOf(value).length());
        sb.append("NamedExecutorOptions{threadCount=");
        sb.append(a);
        sb.append(", name=");
        sb.append(b);
        sb.append(", androidThreadPriority=");
        sb.append(c);
        sb.append(", propagateErrors=");
        sb.append(d);
        sb.append(", threadBodyDecorator=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
