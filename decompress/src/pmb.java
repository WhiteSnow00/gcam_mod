import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public class pmb implements Iterable
{
    public final int a;
    public final int b;
    public final int c;
    
    public pmb(final int a, final int b, final int c) {
        if (c != 0) {
            this.a = a;
            if (c <= 0) {
                if (c >= 0) {
                    throw new IllegalArgumentException("Step is zero.");
                }
            }
            this.b = b;
            this.c = c;
            return;
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }
    
    public final pje a() {
        return new pje(this.a, this.b, this.c);
    }
    
    public boolean b() {
        if (this.c > 0) {
            if (this.a > this.b) {
                return true;
            }
        }
        else if (this.a < this.b) {
            return true;
        }
        return false;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof pmb;
        boolean b2 = true;
        if (b) {
            if (this.b() && ((pmb)o).b()) {
                return b2;
            }
            final int a = this.a;
            final pmb pmb = (pmb)o;
            if (a == pmb.a && this.b == pmb.b) {
                if (this.c == pmb.c) {
                    return true;
                }
            }
        }
        b2 = false;
        return b2;
    }
    
    @Override
    public int hashCode() {
        if (this.b()) {
            return -1;
        }
        return (this.a * 31 + this.b) * 31 + this.c;
    }
    
    @Override
    public String toString() {
        StringBuilder sb;
        int c;
        if (this.c > 0) {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append("..");
            sb.append(this.b);
            sb.append(" step ");
            c = this.c;
        }
        else {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append(" downTo ");
            sb.append(this.b);
            sb.append(" step ");
            c = -this.c;
        }
        sb.append(c);
        return sb.toString();
    }
}
