import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgg extends jwc implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    
    static {
        CREATOR = (Parcelable$Creator)new kff(8);
    }
    
    public kgg(final String a, final String b, final String c) {
        jvu.a(a);
        this.a = a;
        jvu.a(b);
        this.b = b;
        jvu.a(c);
        this.c = c;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof kgg)) {
            return false;
        }
        final kgg kgg = (kgg)o;
        return this.a.equals(kgg.a) && jvu.m(kgg.b, this.b) && jvu.m(kgg.c, this.c);
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        final char[] charArray = this.a.toCharArray();
        final int length = charArray.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            n += charArray[i];
            ++i;
        }
        String s = this.a.trim();
        final int length2 = s.length();
        if (length2 > 25) {
            final String substring = s.substring(0, 10);
            final String substring2 = s.substring(length2 - 10, length2);
            final StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 16 + String.valueOf(substring2).length());
            sb.append(substring);
            sb.append("...");
            sb.append(substring2);
            sb.append("::");
            sb.append(n);
            s = sb.toString();
        }
        final String b = this.b;
        final String c = this.c;
        final StringBuilder sb2 = new StringBuilder(String.valueOf(s).length() + 31 + b.length() + c.length());
        sb2.append("Channel{token=");
        sb2.append(s);
        sb2.append(", nodeId=");
        sb2.append(b);
        sb2.append(", path=");
        sb2.append(c);
        sb2.append("}");
        return sb2.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.v(parcel, 2, this.a);
        jwn.v(parcel, 3, this.b);
        jwn.v(parcel, 4, this.c);
        jwn.i(parcel, g);
    }
}
