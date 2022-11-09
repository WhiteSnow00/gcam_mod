import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bml
{
    public final int a;
    public final Rect b;
    
    public bml() {
    }
    
    public bml(final int a, final Rect b) {
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null bounds");
    }
    
    public static bml a(final int n, final Rect rect) {
        return new bml(n, rect);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof bml) {
            final bml bml = (bml)o;
            if (this.a == bml.a && this.b.equals((Object)bml.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 38);
        sb.append("SmartAfRegion{id=");
        sb.append(a);
        sb.append(", bounds=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
