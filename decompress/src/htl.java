import android.content.pm.ResolveInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class htl
{
    public final ResolveInfo a;
    public final boolean b;
    public final boolean c;
    
    public htl() {
    }
    
    public htl(final ResolveInfo a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static htk a() {
        return new htk();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof htl) {
            final htl htl = (htl)o;
            if (this.a.equals(htl.a) && this.b == htl.b && this.c == htl.c) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final boolean b = this.b;
        int n = 1237;
        int n2;
        if (!b) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.c) {
            n = 1231;
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final boolean b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 67);
        sb.append("SocialQueryingResult{resolveInfo=");
        sb.append(value);
        sb.append(", selected=");
        sb.append(b);
        sb.append(", supported=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
