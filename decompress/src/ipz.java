import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipz
{
    public final Rect a;
    public final int b;
    
    public ipz() {
    }
    
    public ipz(final Rect a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static ipy a() {
        return new ipy();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ipz) {
            final ipz ipz = (ipz)o;
            if (this.a.equals((Object)ipz.a) && this.b == ipz.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int b = this.b;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 38);
        sb.append("RoundedRect{rect=");
        sb.append(value);
        sb.append(", radius=");
        sb.append(b);
        sb.append("}");
        return sb.toString();
    }
}
