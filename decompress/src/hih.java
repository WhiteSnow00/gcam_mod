import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hih
{
    public final long a;
    public final Uri b;
    public final hio c;
    public final boolean d;
    
    public hih() {
    }
    
    public hih(final long a, final Uri b, final hio c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static hig a() {
        final hig hig = new hig();
        hig.b(false);
        return hig;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hih) {
            final hih hih = (hih)o;
            if (this.a == hih.a && this.b.equals((Object)hih.b) && this.c.equals(hih.c) && this.d == hih.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        int n2;
        if (!this.d) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        return n2 ^ (((n ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final boolean d = this.d;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 85 + String.valueOf(value2).length());
        sb.append("MediaStoreRecord{mediaStoreId=");
        sb.append(a);
        sb.append(", uri=");
        sb.append(value);
        sb.append(", sessionType=");
        sb.append(value2);
        sb.append(", secure=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
