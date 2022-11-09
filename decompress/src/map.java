// 
// Decompiled by Procyon v0.6.0
// 

public final class map implements Comparable
{
    public static final map a;
    public final int b;
    public final int c;
    
    static {
        new map(2, 0);
        a = new map(3, 0);
        new map(3, 1);
        new map(3, 2);
    }
    
    public map(final int b, final int c) {
        this.b = b;
        this.c = c;
    }
    
    public final int a(final map map) {
        final int b = this.b;
        final int b2 = map.b;
        int n;
        if (b < b2) {
            n = -1;
        }
        else {
            if (b <= b2) {
                return this.c - map.c;
            }
            n = 1;
        }
        return n;
    }
    
    public final boolean b(final map map) {
        return this.a(map) >= 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof map)) {
            return false;
        }
        final map map = (map)o;
        return this.b == map.b && this.c == map.c;
    }
    
    @Override
    public final int hashCode() {
        return this.b * 31 + this.c;
    }
    
    @Override
    public final String toString() {
        final int b = this.b;
        final int c = this.c;
        final StringBuilder sb = new StringBuilder(23);
        sb.append(b);
        sb.append(".");
        sb.append(c);
        return sb.toString();
    }
}
