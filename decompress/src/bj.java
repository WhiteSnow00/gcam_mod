import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bj
{
    public final String a;
    public final boolean b;
    public final List c;
    
    public bj(final String a, final boolean b, final List c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bj)) {
            return false;
        }
        final bj bj = (bj)o;
        if (this.b != bj.b) {
            return false;
        }
        if (!this.c.equals(bj.c)) {
            return false;
        }
        if (this.a.startsWith("index_")) {
            return bj.a.startsWith("index_");
        }
        return this.a.equals(bj.a);
    }
    
    @Override
    public final int hashCode() {
        int hashCode;
        if (this.a.startsWith("index_")) {
            hashCode = -1184239155;
        }
        else {
            hashCode = this.a.hashCode();
        }
        return (hashCode * 31 + (this.b ? 1 : 0)) * 31 + this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Index{name='");
        sb.append(this.a);
        sb.append("', unique=");
        sb.append(this.b);
        sb.append(", columns=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
