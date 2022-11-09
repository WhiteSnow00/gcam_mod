// 
// Decompiled by Procyon v0.6.0
// 

public final class ahm
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    public ahm(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        final Class<? extends ahm> class1 = this.getClass();
        Object class2;
        if (o == null) {
            class2 = null;
        }
        else {
            class2 = o.getClass();
        }
        if (!plr.b(class1, class2)) {
            return false;
        }
        if (o != null) {
            final ahm ahm = (ahm)o;
            return this.a == ahm.a && this.b == ahm.b && this.c == ahm.c && this.d == ahm.d;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.Bounds");
    }
    
    @Override
    public final int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)ahm.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        sb.append(this.d);
        sb.append("] }");
        return sb.toString();
    }
}
