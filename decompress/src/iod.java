import android.graphics.Rect;
import android.util.Size;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iod
{
    public final Size a;
    public final Rect b;
    public final Rect c;
    private final int d;
    
    public iod() {
    }
    
    public iod(final Size a, final Rect b, final Rect c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static iod a(final Size size, final Rect rect, final Rect rect2, final int n) {
        return new iod(size, rect, rect2, n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof iod) {
            final iod iod = (iod)o;
            if (this.a.equals((Object)iod.a) && this.b.equals((Object)iod.b) && this.c.equals((Object)iod.c) && this.d == iod.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d) * 1000003;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final int d = this.d;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 97 + String.valueOf(value2).length() + String.valueOf(value3).length());
        sb.append("ViewfinderLayoutSpec{size=");
        sb.append(value);
        sb.append(", padding=");
        sb.append(value2);
        sb.append(", margins=");
        sb.append(value3);
        sb.append(", gravity=");
        sb.append(d);
        sb.append(", layoutDirection=0}");
        return sb.toString();
    }
}
