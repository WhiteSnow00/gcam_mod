import android.util.Size;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ixq
{
    public final Surface a;
    public final int b;
    public final Size c;
    
    public ixq() {
    }
    
    public ixq(final Surface a, final int b, final Size c) {
        if (a != null) {
            this.a = a;
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null surface");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ixq) {
            final ixq ixq = (ixq)o;
            if (this.a.equals(ixq.a) && this.b == ixq.b && this.c.equals((Object)ixq.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int b = this.b;
        final String value2 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 51 + String.valueOf(value2).length());
        sb.append("CreatedSurface{surface=");
        sb.append(value);
        sb.append(", format=");
        sb.append(b);
        sb.append(", size=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
