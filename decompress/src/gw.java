import android.graphics.Insets;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gw
{
    public static final gw a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    
    static {
        a = new gw(0, 0, 0, 0);
    }
    
    private gw(final int b, final int c, final int d, final int e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static gw b(final Rect rect) {
        return c(rect.left, rect.top, rect.right, rect.bottom);
    }
    
    public static gw c(int n, int n2, int n3, final int n4) {
        if (n == 0) {
            if (n2 == 0) {
                if (n3 == 0) {
                    if (n4 == 0) {
                        return gw.a;
                    }
                    n = 0;
                    n2 = 0;
                    n3 = 0;
                }
                else {
                    n = 0;
                    n2 = 0;
                }
            }
            else {
                n = 0;
            }
        }
        return new gw(n, n2, n3, n4);
    }
    
    public static gw d(final Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }
    
    public final Insets a() {
        return Insets.of(this.b, this.c, this.d, this.e);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final gw gw = (gw)o;
            return this.e == gw.e && this.b == gw.b && this.d == gw.d && this.c == gw.c;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.b * 31 + this.c) * 31 + this.d) * 31 + this.e;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Insets{left=");
        sb.append(this.b);
        sb.append(", top=");
        sb.append(this.c);
        sb.append(", right=");
        sb.append(this.d);
        sb.append(", bottom=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
